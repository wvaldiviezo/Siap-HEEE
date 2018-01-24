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
@Table(name = "e_citologico_subcategoria")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ECitologicoSubcategoria.findAll", query = "SELECT e FROM ECitologicoSubcategoria e"),
    @NamedQuery(name = "ECitologicoSubcategoria.findByIdecsubcat", query = "SELECT e FROM ECitologicoSubcategoria e WHERE e.idecsubcat = :idecsubcat"),
    @NamedQuery(name = "ECitologicoSubcategoria.findByDescripcionsubcategoria", query = "SELECT e FROM ECitologicoSubcategoria e WHERE e.descripcionsubcategoria = :descripcionsubcategoria")})
public class ECitologicoSubcategoria implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idecsubcat")
    private Integer idecsubcat;
    @Size(max = 250)
    @Column(name = "descripcionsubcategoria")
    private String descripcionsubcategoria;
    @JoinColumn(name = "idcec", referencedColumnName = "idcec")
    @ManyToOne(optional = false)
    private Estudiocitologico idcec;
    @JoinColumn(name = "idsubcategoria", referencedColumnName = "idsubcategoria")
    @ManyToOne(optional = false)
    private Subcategoriacitologico idsubcategoria;

    public ECitologicoSubcategoria() {
    }

    public ECitologicoSubcategoria(Integer idecsubcat) {
        this.idecsubcat = idecsubcat;
    }

    public Integer getIdecsubcat() {
        return idecsubcat;
    }

    public void setIdecsubcat(Integer idecsubcat) {
        this.idecsubcat = idecsubcat;
    }

    public String getDescripcionsubcategoria() {
        return descripcionsubcategoria;
    }

    public void setDescripcionsubcategoria(String descripcionsubcategoria) {
        this.descripcionsubcategoria = descripcionsubcategoria;
    }

    public Estudiocitologico getIdcec() {
        return idcec;
    }

    public void setIdcec(Estudiocitologico idcec) {
        this.idcec = idcec;
    }

    public Subcategoriacitologico getIdsubcategoria() {
        return idsubcategoria;
    }

    public void setIdsubcategoria(Subcategoriacitologico idsubcategoria) {
        this.idsubcategoria = idsubcategoria;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idecsubcat != null ? idecsubcat.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ECitologicoSubcategoria)) {
            return false;
        }
        ECitologicoSubcategoria other = (ECitologicoSubcategoria) object;
        if ((this.idecsubcat == null && other.idecsubcat != null) || (this.idecsubcat != null && !this.idecsubcat.equals(other.idecsubcat))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.heee.bean.model.entity.ECitologicoSubcategoria[ idecsubcat=" + idecsubcat + " ]";
    }
    
}
