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
@Table(name = "subtipo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Subtipo.findAll", query = "SELECT s FROM Subtipo s"),
    @NamedQuery(name = "Subtipo.findByIdsubtipo", query = "SELECT s FROM Subtipo s WHERE s.idsubtipo = :idsubtipo"),
    @NamedQuery(name = "Subtipo.findByDescripcionmarcadorsubtipo", query = "SELECT s FROM Subtipo s WHERE s.descripcionmarcadorsubtipo = :descripcionmarcadorsubtipo")})
public class Subtipo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idsubtipo")
    private Integer idsubtipo;
    @Size(max = 50)
    @Column(name = "descripcionmarcadorsubtipo")
    private String descripcionmarcadorsubtipo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idsubtipo")
    private List<Estudiosquirurgicos> estudiosquirurgicosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idsubtipo")
    private List<Estudiosrevision> estudiosrevisionList;

    public Subtipo() {
    }

    public Subtipo(Integer idsubtipo) {
        this.idsubtipo = idsubtipo;
    }

    public Integer getIdsubtipo() {
        return idsubtipo;
    }

    public void setIdsubtipo(Integer idsubtipo) {
        this.idsubtipo = idsubtipo;
    }

    public String getDescripcionmarcadorsubtipo() {
        return descripcionmarcadorsubtipo;
    }

    public void setDescripcionmarcadorsubtipo(String descripcionmarcadorsubtipo) {
        this.descripcionmarcadorsubtipo = descripcionmarcadorsubtipo;
    }

    @XmlTransient
    public List<Estudiosquirurgicos> getEstudiosquirurgicosList() {
        return estudiosquirurgicosList;
    }

    public void setEstudiosquirurgicosList(List<Estudiosquirurgicos> estudiosquirurgicosList) {
        this.estudiosquirurgicosList = estudiosquirurgicosList;
    }

    @XmlTransient
    public List<Estudiosrevision> getEstudiosrevisionList() {
        return estudiosrevisionList;
    }

    public void setEstudiosrevisionList(List<Estudiosrevision> estudiosrevisionList) {
        this.estudiosrevisionList = estudiosrevisionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsubtipo != null ? idsubtipo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Subtipo)) {
            return false;
        }
        Subtipo other = (Subtipo) object;
        if ((this.idsubtipo == null && other.idsubtipo != null) || (this.idsubtipo != null && !this.idsubtipo.equals(other.idsubtipo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.heee.bean.model.entity.Subtipo[ idsubtipo=" + idsubtipo + " ]";
    }
    
}
