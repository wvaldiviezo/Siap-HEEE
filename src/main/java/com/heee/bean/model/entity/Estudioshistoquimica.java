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
@Table(name = "estudioshistoquimica")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Estudioshistoquimica.findAll", query = "SELECT e FROM Estudioshistoquimica e"),
    @NamedQuery(name = "Estudioshistoquimica.findByIdeh", query = "SELECT e FROM Estudioshistoquimica e WHERE e.ideh = :ideh"),
    @NamedQuery(name = "Estudioshistoquimica.findByDescripcioneh", query = "SELECT e FROM Estudioshistoquimica e WHERE e.descripcioneh = :descripcioneh"),
    @NamedQuery(name = "Estudioshistoquimica.findByIdcabecerarecepcionmuestraeh", query = "SELECT e FROM Estudioshistoquimica e WHERE e.idcabecerarecepcionmuestraeh = :idcabecerarecepcionmuestraeh"),
    @NamedQuery(name = "Estudioshistoquimica.findByIdusuariocreaeh", query = "SELECT e FROM Estudioshistoquimica e WHERE e.idusuariocreaeh = :idusuariocreaeh"),
    @NamedQuery(name = "Estudioshistoquimica.findByFechacreaeh", query = "SELECT e FROM Estudioshistoquimica e WHERE e.fechacreaeh = :fechacreaeh"),
    @NamedQuery(name = "Estudioshistoquimica.findByIdusuarioactualizaeh", query = "SELECT e FROM Estudioshistoquimica e WHERE e.idusuarioactualizaeh = :idusuarioactualizaeh"),
    @NamedQuery(name = "Estudioshistoquimica.findByFechaactualizaeh", query = "SELECT e FROM Estudioshistoquimica e WHERE e.fechaactualizaeh = :fechaactualizaeh")})
public class Estudioshistoquimica implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ideh")
    private Integer ideh;
    @Size(max = 100)
    @Column(name = "descripcioneh")
    private String descripcioneh;
    @Column(name = "idcabecerarecepcionmuestraeh")
    private Integer idcabecerarecepcionmuestraeh;
    @Column(name = "idusuariocreaeh")
    private Integer idusuariocreaeh;
    @Column(name = "fechacreaeh")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechacreaeh;
    @Column(name = "idusuarioactualizaeh")
    private Integer idusuarioactualizaeh;
    @Column(name = "fechaactualizaeh")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaactualizaeh;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ideh")
    private List<EHistMarcador> eHistMarcadorList;

    public Estudioshistoquimica() {
    }

    public Estudioshistoquimica(Integer ideh) {
        this.ideh = ideh;
    }

    public Integer getIdeh() {
        return ideh;
    }

    public void setIdeh(Integer ideh) {
        this.ideh = ideh;
    }

    public String getDescripcioneh() {
        return descripcioneh;
    }

    public void setDescripcioneh(String descripcioneh) {
        this.descripcioneh = descripcioneh;
    }

    public Integer getIdcabecerarecepcionmuestraeh() {
        return idcabecerarecepcionmuestraeh;
    }

    public void setIdcabecerarecepcionmuestraeh(Integer idcabecerarecepcionmuestraeh) {
        this.idcabecerarecepcionmuestraeh = idcabecerarecepcionmuestraeh;
    }

    public Integer getIdusuariocreaeh() {
        return idusuariocreaeh;
    }

    public void setIdusuariocreaeh(Integer idusuariocreaeh) {
        this.idusuariocreaeh = idusuariocreaeh;
    }

    public Date getFechacreaeh() {
        return fechacreaeh;
    }

    public void setFechacreaeh(Date fechacreaeh) {
        this.fechacreaeh = fechacreaeh;
    }

    public Integer getIdusuarioactualizaeh() {
        return idusuarioactualizaeh;
    }

    public void setIdusuarioactualizaeh(Integer idusuarioactualizaeh) {
        this.idusuarioactualizaeh = idusuarioactualizaeh;
    }

    public Date getFechaactualizaeh() {
        return fechaactualizaeh;
    }

    public void setFechaactualizaeh(Date fechaactualizaeh) {
        this.fechaactualizaeh = fechaactualizaeh;
    }

    @XmlTransient
    public List<EHistMarcador> getEHistMarcadorList() {
        return eHistMarcadorList;
    }

    public void setEHistMarcadorList(List<EHistMarcador> eHistMarcadorList) {
        this.eHistMarcadorList = eHistMarcadorList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ideh != null ? ideh.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estudioshistoquimica)) {
            return false;
        }
        Estudioshistoquimica other = (Estudioshistoquimica) object;
        if ((this.ideh == null && other.ideh != null) || (this.ideh != null && !this.ideh.equals(other.ideh))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.heee.bean.model.entity.Estudioshistoquimica[ ideh=" + ideh + " ]";
    }
    
}
