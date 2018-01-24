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
@Table(name = "categoriabm")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Categoriabm.findAll", query = "SELECT c FROM Categoriabm c"),
    @NamedQuery(name = "Categoriabm.findByIdcategoriabm", query = "SELECT c FROM Categoriabm c WHERE c.idcategoriabm = :idcategoriabm"),
    @NamedQuery(name = "Categoriabm.findByNombrecategoriabm", query = "SELECT c FROM Categoriabm c WHERE c.nombrecategoriabm = :nombrecategoriabm")})
public class Categoriabm implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcategoriabm")
    private Integer idcategoriabm;
    @Size(max = 250)
    @Column(name = "nombrecategoriabm")
    private String nombrecategoriabm;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idcategoriabm")
    private List<Subcategoriabm> subcategoriabmList;

    public Categoriabm() {
    }

    public Categoriabm(Integer idcategoriabm) {
        this.idcategoriabm = idcategoriabm;
    }

    public Integer getIdcategoriabm() {
        return idcategoriabm;
    }

    public void setIdcategoriabm(Integer idcategoriabm) {
        this.idcategoriabm = idcategoriabm;
    }

    public String getNombrecategoriabm() {
        return nombrecategoriabm;
    }

    public void setNombrecategoriabm(String nombrecategoriabm) {
        this.nombrecategoriabm = nombrecategoriabm;
    }

    @XmlTransient
    public List<Subcategoriabm> getSubcategoriabmList() {
        return subcategoriabmList;
    }

    public void setSubcategoriabmList(List<Subcategoriabm> subcategoriabmList) {
        this.subcategoriabmList = subcategoriabmList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcategoriabm != null ? idcategoriabm.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Categoriabm)) {
            return false;
        }
        Categoriabm other = (Categoriabm) object;
        if ((this.idcategoriabm == null && other.idcategoriabm != null) || (this.idcategoriabm != null && !this.idcategoriabm.equals(other.idcategoriabm))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.heee.bean.model.entity.Categoriabm[ idcategoriabm=" + idcategoriabm + " ]";
    }
    
}
