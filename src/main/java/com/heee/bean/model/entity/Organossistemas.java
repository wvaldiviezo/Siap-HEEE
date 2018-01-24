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
@Table(name = "organossistemas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Organossistemas.findAll", query = "SELECT o FROM Organossistemas o"),
    @NamedQuery(name = "Organossistemas.findByIdos", query = "SELECT o FROM Organossistemas o WHERE o.idos = :idos"),
    @NamedQuery(name = "Organossistemas.findByDescripcionmarcadoros", query = "SELECT o FROM Organossistemas o WHERE o.descripcionmarcadoros = :descripcionmarcadoros")})
public class Organossistemas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idos")
    private Integer idos;
    @Size(max = 30)
    @Column(name = "descripcionmarcadoros")
    private String descripcionmarcadoros;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idos")
    private List<Estudiosquirurgicos> estudiosquirurgicosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idos")
    private List<Estudiosrevision> estudiosrevisionList;

    public Organossistemas() {
    }

    public Organossistemas(Integer idos) {
        this.idos = idos;
    }

    public Integer getIdos() {
        return idos;
    }

    public void setIdos(Integer idos) {
        this.idos = idos;
    }

    public String getDescripcionmarcadoros() {
        return descripcionmarcadoros;
    }

    public void setDescripcionmarcadoros(String descripcionmarcadoros) {
        this.descripcionmarcadoros = descripcionmarcadoros;
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
        hash += (idos != null ? idos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Organossistemas)) {
            return false;
        }
        Organossistemas other = (Organossistemas) object;
        if ((this.idos == null && other.idos != null) || (this.idos != null && !this.idos.equals(other.idos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.heee.bean.model.entity.Organossistemas[ idos=" + idos + " ]";
    }
    
}
