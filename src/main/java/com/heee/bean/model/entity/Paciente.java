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
@Table(name = "paciente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Paciente.findAll", query = "SELECT p FROM Paciente p"),
    @NamedQuery(name = "Paciente.findByIdpaciente", query = "SELECT p FROM Paciente p WHERE p.idpaciente = :idpaciente"),
    @NamedQuery(name = "Paciente.findByNumhistclinpaciente", query = "SELECT p FROM Paciente p WHERE p.numhistclinpaciente = :numhistclinpaciente"),
    @NamedQuery(name = "Paciente.findByNombrepaciente", query = "SELECT p FROM Paciente p WHERE p.nombrepaciente = :nombrepaciente"),
    @NamedQuery(name = "Paciente.findByApellidopaciente", query = "SELECT p FROM Paciente p WHERE p.apellidopaciente = :apellidopaciente"),
    @NamedQuery(name = "Paciente.findByEdadpaciente", query = "SELECT p FROM Paciente p WHERE p.edadpaciente = :edadpaciente"),
    @NamedQuery(name = "Paciente.findByCeduidenpaciente", query = "SELECT p FROM Paciente p WHERE p.ceduidenpaciente = :ceduidenpaciente"),
    @NamedQuery(name = "Paciente.findByGeneropaciente", query = "SELECT p FROM Paciente p WHERE p.generopaciente = :generopaciente")})
public class Paciente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpaciente")
    private Integer idpaciente;
    @Column(name = "numhistclinpaciente")
    private Integer numhistclinpaciente;
    @Size(max = 50)
    @Column(name = "nombrepaciente")
    private String nombrepaciente;
    @Size(max = 50)
    @Column(name = "apellidopaciente")
    private String apellidopaciente;
    @Column(name = "edadpaciente")
    private Short edadpaciente;
    @Size(max = 10)
    @Column(name = "ceduidenpaciente")
    private String ceduidenpaciente;
    @Size(max = 9)
    @Column(name = "generopaciente")
    private String generopaciente;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idpaciente")
    private List<Cabecerarecepcionmuestra> cabecerarecepcionmuestraList;

    public Paciente() {
    }

    public Paciente(Integer idpaciente) {
        this.idpaciente = idpaciente;
    }

    public Integer getIdpaciente() {
        return idpaciente;
    }

    public void setIdpaciente(Integer idpaciente) {
        this.idpaciente = idpaciente;
    }

    public Integer getNumhistclinpaciente() {
        return numhistclinpaciente;
    }

    public void setNumhistclinpaciente(Integer numhistclinpaciente) {
        this.numhistclinpaciente = numhistclinpaciente;
    }

    public String getNombrepaciente() {
        return nombrepaciente;
    }

    public void setNombrepaciente(String nombrepaciente) {
        this.nombrepaciente = nombrepaciente;
    }

    public String getApellidopaciente() {
        return apellidopaciente;
    }

    public void setApellidopaciente(String apellidopaciente) {
        this.apellidopaciente = apellidopaciente;
    }

    public Short getEdadpaciente() {
        return edadpaciente;
    }

    public void setEdadpaciente(Short edadpaciente) {
        this.edadpaciente = edadpaciente;
    }

    public String getCeduidenpaciente() {
        return ceduidenpaciente;
    }

    public void setCeduidenpaciente(String ceduidenpaciente) {
        this.ceduidenpaciente = ceduidenpaciente;
    }

    public String getGeneropaciente() {
        return generopaciente;
    }

    public void setGeneropaciente(String generopaciente) {
        this.generopaciente = generopaciente;
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
        hash += (idpaciente != null ? idpaciente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Paciente)) {
            return false;
        }
        Paciente other = (Paciente) object;
        if ((this.idpaciente == null && other.idpaciente != null) || (this.idpaciente != null && !this.idpaciente.equals(other.idpaciente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.heee.bean.model.entity.Paciente[ idpaciente=" + idpaciente + " ]";
    }
    
}
