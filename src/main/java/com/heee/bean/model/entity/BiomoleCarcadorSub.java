/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heee.bean.model.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author EPN
 */
@Entity
@Table(name = "biomole_carcador_sub")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BiomoleCarcadorSub.findAll", query = "SELECT b FROM BiomoleCarcadorSub b"),
    @NamedQuery(name = "BiomoleCarcadorSub.findByIdbiomsubcat", query = "SELECT b FROM BiomoleCarcadorSub b WHERE b.idbiomsubcat = :idbiomsubcat"),
    @NamedQuery(name = "BiomoleCarcadorSub.findByDescripcionmarcador", query = "SELECT b FROM BiomoleCarcadorSub b WHERE b.descripcionmarcador = :descripcionmarcador")})
public class BiomoleCarcadorSub implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idbiomsubcat")
    private Integer idbiomsubcat;
    @Size(max = 100)
    @Column(name = "descripcionmarcador")
    private String descripcionmarcador;
    @JoinColumn(name = "idbiologiamolecular", referencedColumnName = "idbiologiamolecular")
    @ManyToOne(optional = false)
    private Biologiamolecular idbiologiamolecular;
    @JoinColumn(name = "idmarcadorsubcategoriabm", referencedColumnName = "idmarcadorsubcategoriabm")
    @ManyToOne(optional = false)
    private Marcadorsubcategoriabm idmarcadorsubcategoriabm;

    public BiomoleCarcadorSub() {
    }

    public BiomoleCarcadorSub(Integer idbiomsubcat) {
        this.idbiomsubcat = idbiomsubcat;
    }

    public Integer getIdbiomsubcat() {
        return idbiomsubcat;
    }

    public void setIdbiomsubcat(Integer idbiomsubcat) {
        this.idbiomsubcat = idbiomsubcat;
    }

    public String getDescripcionmarcador() {
        return descripcionmarcador;
    }

    public void setDescripcionmarcador(String descripcionmarcador) {
        this.descripcionmarcador = descripcionmarcador;
    }

    public Biologiamolecular getIdbiologiamolecular() {
        return idbiologiamolecular;
    }

    public void setIdbiologiamolecular(Biologiamolecular idbiologiamolecular) {
        this.idbiologiamolecular = idbiologiamolecular;
    }

    public Marcadorsubcategoriabm getIdmarcadorsubcategoriabm() {
        return idmarcadorsubcategoriabm;
    }

    public void setIdmarcadorsubcategoriabm(Marcadorsubcategoriabm idmarcadorsubcategoriabm) {
        this.idmarcadorsubcategoriabm = idmarcadorsubcategoriabm;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idbiomsubcat != null ? idbiomsubcat.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BiomoleCarcadorSub)) {
            return false;
        }
        BiomoleCarcadorSub other = (BiomoleCarcadorSub) object;
        if ((this.idbiomsubcat == null && other.idbiomsubcat != null) || (this.idbiomsubcat != null && !this.idbiomsubcat.equals(other.idbiomsubcat))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.heee.bean.model.entity.BiomoleCarcadorSub[ idbiomsubcat=" + idbiomsubcat + " ]";
    }
    
}
