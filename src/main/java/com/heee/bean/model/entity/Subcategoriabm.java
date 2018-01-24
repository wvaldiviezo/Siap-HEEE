/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heee.bean.model.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author EPN
 */
@Entity
@Table(name = "subcategoriabm")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Subcategoriabm.findAll", query = "SELECT s FROM Subcategoriabm s"),
    @NamedQuery(name = "Subcategoriabm.findByIdsubcategoriabm", query = "SELECT s FROM Subcategoriabm s WHERE s.idsubcategoriabm = :idsubcategoriabm"),
    @NamedQuery(name = "Subcategoriabm.findByNombresubcategoriabm", query = "SELECT s FROM Subcategoriabm s WHERE s.nombresubcategoriabm = :nombresubcategoriabm")})
public class Subcategoriabm implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idsubcategoriabm")
    private Integer idsubcategoriabm;
    @Size(max = 250)
    @Column(name = "nombresubcategoriabm")
    private String nombresubcategoriabm;
    @JoinColumn(name = "idcategoriabm", referencedColumnName = "idcategoriabm")
    @ManyToOne(optional = false)
    private Categoriabm idcategoriabm;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idsubcategoriabm")
    private List<Marcadorsubcategoriabm> marcadorsubcategoriabmList;

    public Subcategoriabm() {
    }

    public Subcategoriabm(Integer idsubcategoriabm) {
        this.idsubcategoriabm = idsubcategoriabm;
    }

    public Integer getIdsubcategoriabm() {
        return idsubcategoriabm;
    }

    public void setIdsubcategoriabm(Integer idsubcategoriabm) {
        this.idsubcategoriabm = idsubcategoriabm;
    }

    public String getNombresubcategoriabm() {
        return nombresubcategoriabm;
    }

    public void setNombresubcategoriabm(String nombresubcategoriabm) {
        this.nombresubcategoriabm = nombresubcategoriabm;
    }

    public Categoriabm getIdcategoriabm() {
        return idcategoriabm;
    }

    public void setIdcategoriabm(Categoriabm idcategoriabm) {
        this.idcategoriabm = idcategoriabm;
    }

    @XmlTransient
    public List<Marcadorsubcategoriabm> getMarcadorsubcategoriabmList() {
        return marcadorsubcategoriabmList;
    }

    public void setMarcadorsubcategoriabmList(List<Marcadorsubcategoriabm> marcadorsubcategoriabmList) {
        this.marcadorsubcategoriabmList = marcadorsubcategoriabmList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsubcategoriabm != null ? idsubcategoriabm.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Subcategoriabm)) {
            return false;
        }
        Subcategoriabm other = (Subcategoriabm) object;
        if ((this.idsubcategoriabm == null && other.idsubcategoriabm != null) || (this.idsubcategoriabm != null && !this.idsubcategoriabm.equals(other.idsubcategoriabm))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.heee.bean.model.entity.Subcategoriabm[ idsubcategoriabm=" + idsubcategoriabm + " ]";
    }
    
}
