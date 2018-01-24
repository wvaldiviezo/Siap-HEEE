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
@Table(name = "doctor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Doctor.findAll", query = "SELECT d FROM Doctor d"),
    @NamedQuery(name = "Doctor.findByIddoctor", query = "SELECT d FROM Doctor d WHERE d.iddoctor = :iddoctor"),
    @NamedQuery(name = "Doctor.findByNombresdoctor", query = "SELECT d FROM Doctor d WHERE d.nombresdoctor = :nombresdoctor"),
    @NamedQuery(name = "Doctor.findByApellidosdoctor", query = "SELECT d FROM Doctor d WHERE d.apellidosdoctor = :apellidosdoctor"),
    @NamedQuery(name = "Doctor.findByEmaildoctor", query = "SELECT d FROM Doctor d WHERE d.emaildoctor = :emaildoctor"),
    @NamedQuery(name = "Doctor.findByTelefonodoctor", query = "SELECT d FROM Doctor d WHERE d.telefonodoctor = :telefonodoctor")})
public class Doctor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iddoctor")
    private Integer iddoctor;
    @Size(max = 50)
    @Column(name = "nombresdoctor")
    private String nombresdoctor;
    @Size(max = 50)
    @Column(name = "apellidosdoctor")
    private String apellidosdoctor;
    @Size(max = 50)
    @Column(name = "emaildoctor")
    private String emaildoctor;
    @Size(max = 20)
    @Column(name = "telefonodoctor")
    private String telefonodoctor;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iddoctor")
    private List<Cabecerarecepcionmuestra> cabecerarecepcionmuestraList;

    public Doctor() {
    }

    public Doctor(Integer iddoctor) {
        this.iddoctor = iddoctor;
    }

    public Integer getIddoctor() {
        return iddoctor;
    }

    public void setIddoctor(Integer iddoctor) {
        this.iddoctor = iddoctor;
    }

    public String getNombresdoctor() {
        return nombresdoctor;
    }

    public void setNombresdoctor(String nombresdoctor) {
        this.nombresdoctor = nombresdoctor;
    }

    public String getApellidosdoctor() {
        return apellidosdoctor;
    }

    public void setApellidosdoctor(String apellidosdoctor) {
        this.apellidosdoctor = apellidosdoctor;
    }

    public String getEmaildoctor() {
        return emaildoctor;
    }

    public void setEmaildoctor(String emaildoctor) {
        this.emaildoctor = emaildoctor;
    }

    public String getTelefonodoctor() {
        return telefonodoctor;
    }

    public void setTelefonodoctor(String telefonodoctor) {
        this.telefonodoctor = telefonodoctor;
    }

    @XmlTransient
    public List<Cabecerarecepcionmuestra> getCabecerarecepcionmuestraList() {
        return cabecerarecepcionmuestraList;
    }

    public void setCabecerarecepcionmuestraList(List<Cabecerarecepcionmuestra> cabecerarecepcionmuestraList) {
        this.cabecerarecepcionmuestraList = cabecerarecepcionmuestraList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddoctor != null ? iddoctor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Doctor)) {
            return false;
        }
        Doctor other = (Doctor) object;
        if ((this.iddoctor == null && other.iddoctor != null) || (this.iddoctor != null && !this.iddoctor.equals(other.iddoctor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.heee.bean.model.entity.Doctor[ iddoctor=" + iddoctor + " ]";
    }
    
}
