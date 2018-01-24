/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heee.bean.model.entity;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author EPN
 */
@Entity
@Table(name = "estudiosrevision")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Estudiosrevision.findAll", query = "SELECT e FROM Estudiosrevision e"),
    @NamedQuery(name = "Estudiosrevision.findByIder", query = "SELECT e FROM Estudiosrevision e WHERE e.ider = :ider"),
    @NamedQuery(name = "Estudiosrevision.findByDescripcionsubtipoer", query = "SELECT e FROM Estudiosrevision e WHERE e.descripcionsubtipoer = :descripcionsubtipoer"),
    @NamedQuery(name = "Estudiosrevision.findByDescripcionrevisioner", query = "SELECT e FROM Estudiosrevision e WHERE e.descripcionrevisioner = :descripcionrevisioner"),
    @NamedQuery(name = "Estudiosrevision.findByIdcabecerarecepcionmuestraer", query = "SELECT e FROM Estudiosrevision e WHERE e.idcabecerarecepcionmuestraer = :idcabecerarecepcionmuestraer"),
    @NamedQuery(name = "Estudiosrevision.findByIdusuariocreaer", query = "SELECT e FROM Estudiosrevision e WHERE e.idusuariocreaer = :idusuariocreaer"),
    @NamedQuery(name = "Estudiosrevision.findByFechacreaer", query = "SELECT e FROM Estudiosrevision e WHERE e.fechacreaer = :fechacreaer"),
    @NamedQuery(name = "Estudiosrevision.findByIdusuarioactualizaer", query = "SELECT e FROM Estudiosrevision e WHERE e.idusuarioactualizaer = :idusuarioactualizaer"),
    @NamedQuery(name = "Estudiosrevision.findByFechaactualizaer", query = "SELECT e FROM Estudiosrevision e WHERE e.fechaactualizaer = :fechaactualizaer")})
public class Estudiosrevision implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ider")
    private Integer ider;
    @Size(max = 200)
    @Column(name = "descripcionsubtipoer")
    private String descripcionsubtipoer;
    @Size(max = 200)
    @Column(name = "descripcionrevisioner")
    private String descripcionrevisioner;
    @Column(name = "idcabecerarecepcionmuestraer")
    private Integer idcabecerarecepcionmuestraer;
    @Column(name = "idusuariocreaer")
    private Integer idusuariocreaer;
    @Column(name = "fechacreaer")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechacreaer;
    @Column(name = "idusuarioactualizaer")
    private Integer idusuarioactualizaer;
    @Column(name = "fechaactualizaer")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaactualizaer;
    @JoinColumn(name = "idos", referencedColumnName = "idos")
    @ManyToOne(optional = false)
    private Organossistemas idos;
    @JoinColumn(name = "idsubtipo", referencedColumnName = "idsubtipo")
    @ManyToOne(optional = false)
    private Subtipo idsubtipo;

    public Estudiosrevision() {
    }

    public Estudiosrevision(Integer ider) {
        this.ider = ider;
    }

    public Integer getIder() {
        return ider;
    }

    public void setIder(Integer ider) {
        this.ider = ider;
    }

    public String getDescripcionsubtipoer() {
        return descripcionsubtipoer;
    }

    public void setDescripcionsubtipoer(String descripcionsubtipoer) {
        this.descripcionsubtipoer = descripcionsubtipoer;
    }

    public String getDescripcionrevisioner() {
        return descripcionrevisioner;
    }

    public void setDescripcionrevisioner(String descripcionrevisioner) {
        this.descripcionrevisioner = descripcionrevisioner;
    }

    public Integer getIdcabecerarecepcionmuestraer() {
        return idcabecerarecepcionmuestraer;
    }

    public void setIdcabecerarecepcionmuestraer(Integer idcabecerarecepcionmuestraer) {
        this.idcabecerarecepcionmuestraer = idcabecerarecepcionmuestraer;
    }

    public Integer getIdusuariocreaer() {
        return idusuariocreaer;
    }

    public void setIdusuariocreaer(Integer idusuariocreaer) {
        this.idusuariocreaer = idusuariocreaer;
    }

    public Date getFechacreaer() {
        return fechacreaer;
    }

    public void setFechacreaer(Date fechacreaer) {
        this.fechacreaer = fechacreaer;
    }

    public Integer getIdusuarioactualizaer() {
        return idusuarioactualizaer;
    }

    public void setIdusuarioactualizaer(Integer idusuarioactualizaer) {
        this.idusuarioactualizaer = idusuarioactualizaer;
    }

    public Date getFechaactualizaer() {
        return fechaactualizaer;
    }

    public void setFechaactualizaer(Date fechaactualizaer) {
        this.fechaactualizaer = fechaactualizaer;
    }

    public Organossistemas getIdos() {
        return idos;
    }

    public void setIdos(Organossistemas idos) {
        this.idos = idos;
    }

    public Subtipo getIdsubtipo() {
        return idsubtipo;
    }

    public void setIdsubtipo(Subtipo idsubtipo) {
        this.idsubtipo = idsubtipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ider != null ? ider.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estudiosrevision)) {
            return false;
        }
        Estudiosrevision other = (Estudiosrevision) object;
        if ((this.ider == null && other.ider != null) || (this.ider != null && !this.ider.equals(other.ider))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.heee.bean.model.entity.Estudiosrevision[ ider=" + ider + " ]";
    }
    
}
