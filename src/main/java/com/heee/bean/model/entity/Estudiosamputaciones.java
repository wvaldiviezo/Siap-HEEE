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
@Table(name = "estudiosamputaciones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Estudiosamputaciones.findAll", query = "SELECT e FROM Estudiosamputaciones e"),
    @NamedQuery(name = "Estudiosamputaciones.findByIdea", query = "SELECT e FROM Estudiosamputaciones e WHERE e.idea = :idea"),
    @NamedQuery(name = "Estudiosamputaciones.findByDescripcionamputacionea", query = "SELECT e FROM Estudiosamputaciones e WHERE e.descripcionamputacionea = :descripcionamputacionea"),
    @NamedQuery(name = "Estudiosamputaciones.findByIdcabecerarecepcionmuestraea", query = "SELECT e FROM Estudiosamputaciones e WHERE e.idcabecerarecepcionmuestraea = :idcabecerarecepcionmuestraea"),
    @NamedQuery(name = "Estudiosamputaciones.findByIdusuariocreaea", query = "SELECT e FROM Estudiosamputaciones e WHERE e.idusuariocreaea = :idusuariocreaea"),
    @NamedQuery(name = "Estudiosamputaciones.findByFechacreaea", query = "SELECT e FROM Estudiosamputaciones e WHERE e.fechacreaea = :fechacreaea"),
    @NamedQuery(name = "Estudiosamputaciones.findByIdusuarioactualizaea", query = "SELECT e FROM Estudiosamputaciones e WHERE e.idusuarioactualizaea = :idusuarioactualizaea"),
    @NamedQuery(name = "Estudiosamputaciones.findByFechaactualizaea", query = "SELECT e FROM Estudiosamputaciones e WHERE e.fechaactualizaea = :fechaactualizaea")})
public class Estudiosamputaciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idea")
    private Integer idea;
    @Size(max = 200)
    @Column(name = "descripcionamputacionea")
    private String descripcionamputacionea;
    @Column(name = "idcabecerarecepcionmuestraea")
    private Integer idcabecerarecepcionmuestraea;
    @Column(name = "idusuariocreaea")
    private Integer idusuariocreaea;
    @Column(name = "fechacreaea")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechacreaea;
    @Column(name = "idusuarioactualizaea")
    private Integer idusuarioactualizaea;
    @Column(name = "fechaactualizaea")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaactualizaea;
    @JoinColumn(name = "idpartes", referencedColumnName = "idpartes")
    @ManyToOne(optional = false)
    private Partes idpartes;

    public Estudiosamputaciones() {
    }

    public Estudiosamputaciones(Integer idea) {
        this.idea = idea;
    }

    public Integer getIdea() {
        return idea;
    }

    public void setIdea(Integer idea) {
        this.idea = idea;
    }

    public String getDescripcionamputacionea() {
        return descripcionamputacionea;
    }

    public void setDescripcionamputacionea(String descripcionamputacionea) {
        this.descripcionamputacionea = descripcionamputacionea;
    }

    public Integer getIdcabecerarecepcionmuestraea() {
        return idcabecerarecepcionmuestraea;
    }

    public void setIdcabecerarecepcionmuestraea(Integer idcabecerarecepcionmuestraea) {
        this.idcabecerarecepcionmuestraea = idcabecerarecepcionmuestraea;
    }

    public Integer getIdusuariocreaea() {
        return idusuariocreaea;
    }

    public void setIdusuariocreaea(Integer idusuariocreaea) {
        this.idusuariocreaea = idusuariocreaea;
    }

    public Date getFechacreaea() {
        return fechacreaea;
    }

    public void setFechacreaea(Date fechacreaea) {
        this.fechacreaea = fechacreaea;
    }

    public Integer getIdusuarioactualizaea() {
        return idusuarioactualizaea;
    }

    public void setIdusuarioactualizaea(Integer idusuarioactualizaea) {
        this.idusuarioactualizaea = idusuarioactualizaea;
    }

    public Date getFechaactualizaea() {
        return fechaactualizaea;
    }

    public void setFechaactualizaea(Date fechaactualizaea) {
        this.fechaactualizaea = fechaactualizaea;
    }

    public Partes getIdpartes() {
        return idpartes;
    }

    public void setIdpartes(Partes idpartes) {
        this.idpartes = idpartes;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idea != null ? idea.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estudiosamputaciones)) {
            return false;
        }
        Estudiosamputaciones other = (Estudiosamputaciones) object;
        if ((this.idea == null && other.idea != null) || (this.idea != null && !this.idea.equals(other.idea))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.heee.bean.model.entity.Estudiosamputaciones[ idea=" + idea + " ]";
    }
    
}
