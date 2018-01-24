/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heee.bean.model.entity;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author EPN
 */
@Entity
@Table(name = "estudiocitologico")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Estudiocitologico.findAll", query = "SELECT e FROM Estudiocitologico e"),
    @NamedQuery(name = "Estudiocitologico.findByIdcec", query = "SELECT e FROM Estudiocitologico e WHERE e.idcec = :idcec"),
    @NamedQuery(name = "Estudiocitologico.findByDescripcioncitologicocec", query = "SELECT e FROM Estudiocitologico e WHERE e.descripcioncitologicocec = :descripcioncitologicocec"),
    @NamedQuery(name = "Estudiocitologico.findByIdcabeceracepcionmuestracec", query = "SELECT e FROM Estudiocitologico e WHERE e.idcabeceracepcionmuestracec = :idcabeceracepcionmuestracec"),
    @NamedQuery(name = "Estudiocitologico.findByIdusuariocrea", query = "SELECT e FROM Estudiocitologico e WHERE e.idusuariocrea = :idusuariocrea"),
    @NamedQuery(name = "Estudiocitologico.findByFechacreaec", query = "SELECT e FROM Estudiocitologico e WHERE e.fechacreaec = :fechacreaec"),
    @NamedQuery(name = "Estudiocitologico.findByIdusuarioactualizaec", query = "SELECT e FROM Estudiocitologico e WHERE e.idusuarioactualizaec = :idusuarioactualizaec"),
    @NamedQuery(name = "Estudiocitologico.findByFechaactualizaec", query = "SELECT e FROM Estudiocitologico e WHERE e.fechaactualizaec = :fechaactualizaec")})
public class Estudiocitologico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcec")
    private Integer idcec;
    @Size(max = 200)
    @Column(name = "descripcioncitologicocec")
    private String descripcioncitologicocec;
    @Column(name = "idcabeceracepcionmuestracec")
    private Integer idcabeceracepcionmuestracec;
    @Column(name = "idusuariocrea")
    private Integer idusuariocrea;
    @Column(name = "fechacreaec")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechacreaec;
    @Column(name = "idusuarioactualizaec")
    private Integer idusuarioactualizaec;
    @Column(name = "fechaactualizaec")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaactualizaec;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idcec")
    private List<ECitologicoSubcategoria> eCitologicoSubcategoriaList;

    public Estudiocitologico() {
    }

    public Estudiocitologico(Integer idcec) {
        this.idcec = idcec;
    }

    public Integer getIdcec() {
        return idcec;
    }

    public void setIdcec(Integer idcec) {
        this.idcec = idcec;
    }

    public String getDescripcioncitologicocec() {
        return descripcioncitologicocec;
    }

    public void setDescripcioncitologicocec(String descripcioncitologicocec) {
        this.descripcioncitologicocec = descripcioncitologicocec;
    }

    public Integer getIdcabeceracepcionmuestracec() {
        return idcabeceracepcionmuestracec;
    }

    public void setIdcabeceracepcionmuestracec(Integer idcabeceracepcionmuestracec) {
        this.idcabeceracepcionmuestracec = idcabeceracepcionmuestracec;
    }

    public Integer getIdusuariocrea() {
        return idusuariocrea;
    }

    public void setIdusuariocrea(Integer idusuariocrea) {
        this.idusuariocrea = idusuariocrea;
    }

    public Date getFechacreaec() {
        return fechacreaec;
    }

    public void setFechacreaec(Date fechacreaec) {
        this.fechacreaec = fechacreaec;
    }

    public Integer getIdusuarioactualizaec() {
        return idusuarioactualizaec;
    }

    public void setIdusuarioactualizaec(Integer idusuarioactualizaec) {
        this.idusuarioactualizaec = idusuarioactualizaec;
    }

    public Date getFechaactualizaec() {
        return fechaactualizaec;
    }

    public void setFechaactualizaec(Date fechaactualizaec) {
        this.fechaactualizaec = fechaactualizaec;
    }

    @XmlTransient
    public List<ECitologicoSubcategoria> getECitologicoSubcategoriaList() {
        return eCitologicoSubcategoriaList;
    }

    public void setECitologicoSubcategoriaList(List<ECitologicoSubcategoria> eCitologicoSubcategoriaList) {
        this.eCitologicoSubcategoriaList = eCitologicoSubcategoriaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcec != null ? idcec.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estudiocitologico)) {
            return false;
        }
        Estudiocitologico other = (Estudiocitologico) object;
        if ((this.idcec == null && other.idcec != null) || (this.idcec != null && !this.idcec.equals(other.idcec))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.heee.bean.model.entity.Estudiocitologico[ idcec=" + idcec + " ]";
    }
    
}
