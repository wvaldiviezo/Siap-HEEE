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
@Table(name = "estudiosquirurgicos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Estudiosquirurgicos.findAll", query = "SELECT e FROM Estudiosquirurgicos e"),
    @NamedQuery(name = "Estudiosquirurgicos.findByIdeq", query = "SELECT e FROM Estudiosquirurgicos e WHERE e.ideq = :ideq"),
    @NamedQuery(name = "Estudiosquirurgicos.findByDescripcionsubtipoeq", query = "SELECT e FROM Estudiosquirurgicos e WHERE e.descripcionsubtipoeq = :descripcionsubtipoeq"),
    @NamedQuery(name = "Estudiosquirurgicos.findByDescripcionquirurgicoeq", query = "SELECT e FROM Estudiosquirurgicos e WHERE e.descripcionquirurgicoeq = :descripcionquirurgicoeq"),
    @NamedQuery(name = "Estudiosquirurgicos.findByIdcabeceracepcionmuestraeq", query = "SELECT e FROM Estudiosquirurgicos e WHERE e.idcabeceracepcionmuestraeq = :idcabeceracepcionmuestraeq"),
    @NamedQuery(name = "Estudiosquirurgicos.findByIdusuariocreaeq", query = "SELECT e FROM Estudiosquirurgicos e WHERE e.idusuariocreaeq = :idusuariocreaeq"),
    @NamedQuery(name = "Estudiosquirurgicos.findByFechacreaeq", query = "SELECT e FROM Estudiosquirurgicos e WHERE e.fechacreaeq = :fechacreaeq"),
    @NamedQuery(name = "Estudiosquirurgicos.findByIdusuarioactualizaeq", query = "SELECT e FROM Estudiosquirurgicos e WHERE e.idusuarioactualizaeq = :idusuarioactualizaeq"),
    @NamedQuery(name = "Estudiosquirurgicos.findByFechaactualizaeq", query = "SELECT e FROM Estudiosquirurgicos e WHERE e.fechaactualizaeq = :fechaactualizaeq")})
public class Estudiosquirurgicos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ideq")
    private Integer ideq;
    @Size(max = 500)
    @Column(name = "descripcionsubtipoeq")
    private String descripcionsubtipoeq;
    @Size(max = 500)
    @Column(name = "descripcionquirurgicoeq")
    private String descripcionquirurgicoeq;
    @Column(name = "idcabeceracepcionmuestraeq")
    private Integer idcabeceracepcionmuestraeq;
    @Column(name = "idusuariocreaeq")
    private Integer idusuariocreaeq;
    @Column(name = "fechacreaeq")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechacreaeq;
    @Column(name = "idusuarioactualizaeq")
    private Integer idusuarioactualizaeq;
    @Column(name = "fechaactualizaeq")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaactualizaeq;
    @JoinColumn(name = "idos", referencedColumnName = "idos")
    @ManyToOne(optional = false)
    private Organossistemas idos;
    @JoinColumn(name = "idsubtipo", referencedColumnName = "idsubtipo")
    @ManyToOne(optional = false)
    private Subtipo idsubtipo;

    public Estudiosquirurgicos() {
    }

    public Estudiosquirurgicos(Integer ideq) {
        this.ideq = ideq;
    }

    public Integer getIdeq() {
        return ideq;
    }

    public void setIdeq(Integer ideq) {
        this.ideq = ideq;
    }

    public String getDescripcionsubtipoeq() {
        return descripcionsubtipoeq;
    }

    public void setDescripcionsubtipoeq(String descripcionsubtipoeq) {
        this.descripcionsubtipoeq = descripcionsubtipoeq;
    }

    public String getDescripcionquirurgicoeq() {
        return descripcionquirurgicoeq;
    }

    public void setDescripcionquirurgicoeq(String descripcionquirurgicoeq) {
        this.descripcionquirurgicoeq = descripcionquirurgicoeq;
    }

    public Integer getIdcabeceracepcionmuestraeq() {
        return idcabeceracepcionmuestraeq;
    }

    public void setIdcabeceracepcionmuestraeq(Integer idcabeceracepcionmuestraeq) {
        this.idcabeceracepcionmuestraeq = idcabeceracepcionmuestraeq;
    }

    public Integer getIdusuariocreaeq() {
        return idusuariocreaeq;
    }

    public void setIdusuariocreaeq(Integer idusuariocreaeq) {
        this.idusuariocreaeq = idusuariocreaeq;
    }

    public Date getFechacreaeq() {
        return fechacreaeq;
    }

    public void setFechacreaeq(Date fechacreaeq) {
        this.fechacreaeq = fechacreaeq;
    }

    public Integer getIdusuarioactualizaeq() {
        return idusuarioactualizaeq;
    }

    public void setIdusuarioactualizaeq(Integer idusuarioactualizaeq) {
        this.idusuarioactualizaeq = idusuarioactualizaeq;
    }

    public Date getFechaactualizaeq() {
        return fechaactualizaeq;
    }

    public void setFechaactualizaeq(Date fechaactualizaeq) {
        this.fechaactualizaeq = fechaactualizaeq;
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
        hash += (ideq != null ? ideq.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estudiosquirurgicos)) {
            return false;
        }
        Estudiosquirurgicos other = (Estudiosquirurgicos) object;
        if ((this.ideq == null && other.ideq != null) || (this.ideq != null && !this.ideq.equals(other.ideq))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.heee.bean.model.entity.Estudiosquirurgicos[ ideq=" + ideq + " ]";
    }
    
}
