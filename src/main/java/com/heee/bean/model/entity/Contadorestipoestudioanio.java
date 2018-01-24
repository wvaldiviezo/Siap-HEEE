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
@Table(name = "contadorestipoestudioanio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Contadorestipoestudioanio.findAll", query = "SELECT c FROM Contadorestipoestudioanio c"),
    @NamedQuery(name = "Contadorestipoestudioanio.findByIdctea", query = "SELECT c FROM Contadorestipoestudioanio c WHERE c.idctea = :idctea"),
    @NamedQuery(name = "Contadorestipoestudioanio.findByAnioctea", query = "SELECT c FROM Contadorestipoestudioanio c WHERE c.anioctea = :anioctea"),
    @NamedQuery(name = "Contadorestipoestudioanio.findByNumtipoestudio", query = "SELECT c FROM Contadorestipoestudioanio c WHERE c.numtipoestudio = :numtipoestudio"),
    @NamedQuery(name = "Contadorestipoestudioanio.findByFechacreacion", query = "SELECT c FROM Contadorestipoestudioanio c WHERE c.fechacreacion = :fechacreacion")})
public class Contadorestipoestudioanio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idctea")
    private Integer idctea;
    @Size(max = 4)
    @Column(name = "anioctea")
    private String anioctea;
    @Column(name = "numtipoestudio")
    private Integer numtipoestudio;
    @Column(name = "fechacreacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechacreacion;
    @JoinColumn(name = "idte", referencedColumnName = "idte")
    @ManyToOne(optional = false)
    private Tipoestudio idte;

    public Contadorestipoestudioanio() {
    }

    public Contadorestipoestudioanio(Integer idctea) {
        this.idctea = idctea;
    }

    public Integer getIdctea() {
        return idctea;
    }

    public void setIdctea(Integer idctea) {
        this.idctea = idctea;
    }

    public String getAnioctea() {
        return anioctea;
    }

    public void setAnioctea(String anioctea) {
        this.anioctea = anioctea;
    }

    public Integer getNumtipoestudio() {
        return numtipoestudio;
    }

    public void setNumtipoestudio(Integer numtipoestudio) {
        this.numtipoestudio = numtipoestudio;
    }

    public Date getFechacreacion() {
        return fechacreacion;
    }

    public void setFechacreacion(Date fechacreacion) {
        this.fechacreacion = fechacreacion;
    }

    public Tipoestudio getIdte() {
        return idte;
    }

    public void setIdte(Tipoestudio idte) {
        this.idte = idte;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idctea != null ? idctea.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contadorestipoestudioanio)) {
            return false;
        }
        Contadorestipoestudioanio other = (Contadorestipoestudioanio) object;
        if ((this.idctea == null && other.idctea != null) || (this.idctea != null && !this.idctea.equals(other.idctea))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.heee.bean.model.entity.Contadorestipoestudioanio[ idctea=" + idctea + " ]";
    }
    
}
