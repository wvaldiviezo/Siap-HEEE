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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author MPCS
 */
@Entity
@Table(name = "biologiamolecular")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Biologiamolecular.findAll", query = "SELECT b FROM Biologiamolecular b")
    , @NamedQuery(name = "Biologiamolecular.findByIdbiologiamolecular", query = "SELECT b FROM Biologiamolecular b WHERE b.idbiologiamolecular = :idbiologiamolecular")
    , @NamedQuery(name = "Biologiamolecular.findByIdcabecerarecepcionmuestrabm", query = "SELECT b FROM Biologiamolecular b WHERE b.idcabecerarecepcionmuestrabm = :idcabecerarecepcionmuestrabm")
    , @NamedQuery(name = "Biologiamolecular.findByFechacreabm", query = "SELECT b FROM Biologiamolecular b WHERE b.fechacreabm = :fechacreabm")
    , @NamedQuery(name = "Biologiamolecular.findByIdusuariocreabm", query = "SELECT b FROM Biologiamolecular b WHERE b.idusuariocreabm = :idusuariocreabm")
    , @NamedQuery(name = "Biologiamolecular.findByFechaactualizabm", query = "SELECT b FROM Biologiamolecular b WHERE b.fechaactualizabm = :fechaactualizabm")
    , @NamedQuery(name = "Biologiamolecular.findByIdsuarioactualiza", query = "SELECT b FROM Biologiamolecular b WHERE b.idsuarioactualiza = :idsuarioactualiza")})
public class Biologiamolecular implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idbiologiamolecular")
    private Integer idbiologiamolecular;
    @Column(name = "idcabecerarecepcionmuestrabm")
    private Integer idcabecerarecepcionmuestrabm;
    @Column(name = "fechacreabm")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechacreabm;
    @Column(name = "idusuariocreabm")
    private Integer idusuariocreabm;
    @Column(name = "fechaactualizabm")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaactualizabm;
    @Column(name = "idsuarioactualiza")
    private Integer idsuarioactualiza;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idbiologiamolecular")
    private List<MarcadorBio> marcadorBioList;

    public Biologiamolecular() {
    }

    public Biologiamolecular(Integer idbiologiamolecular) {
        this.idbiologiamolecular = idbiologiamolecular;
    }

    public Integer getIdbiologiamolecular() {
        return idbiologiamolecular;
    }

    public void setIdbiologiamolecular(Integer idbiologiamolecular) {
        this.idbiologiamolecular = idbiologiamolecular;
    }

    public Integer getIdcabecerarecepcionmuestrabm() {
        return idcabecerarecepcionmuestrabm;
    }

    public void setIdcabecerarecepcionmuestrabm(Integer idcabecerarecepcionmuestrabm) {
        this.idcabecerarecepcionmuestrabm = idcabecerarecepcionmuestrabm;
    }

    public Date getFechacreabm() {
        return fechacreabm;
    }

    public void setFechacreabm(Date fechacreabm) {
        this.fechacreabm = fechacreabm;
    }

    public Integer getIdusuariocreabm() {
        return idusuariocreabm;
    }

    public void setIdusuariocreabm(Integer idusuariocreabm) {
        this.idusuariocreabm = idusuariocreabm;
    }

    public Date getFechaactualizabm() {
        return fechaactualizabm;
    }

    public void setFechaactualizabm(Date fechaactualizabm) {
        this.fechaactualizabm = fechaactualizabm;
    }

    public Integer getIdsuarioactualiza() {
        return idsuarioactualiza;
    }

    public void setIdsuarioactualiza(Integer idsuarioactualiza) {
        this.idsuarioactualiza = idsuarioactualiza;
    }

    @XmlTransient
    public List<MarcadorBio> getMarcadorBioList() {
        return marcadorBioList;
    }

    public void setMarcadorBioList(List<MarcadorBio> marcadorBioList) {
        this.marcadorBioList = marcadorBioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idbiologiamolecular != null ? idbiologiamolecular.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Biologiamolecular)) {
            return false;
        }
        Biologiamolecular other = (Biologiamolecular) object;
        if ((this.idbiologiamolecular == null && other.idbiologiamolecular != null) || (this.idbiologiamolecular != null && !this.idbiologiamolecular.equals(other.idbiologiamolecular))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.heee.bean.model.entity.Biologiamolecular[ idbiologiamolecular=" + idbiologiamolecular + " ]";
    }
    
}
