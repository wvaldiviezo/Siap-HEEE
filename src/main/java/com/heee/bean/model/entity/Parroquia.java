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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "parroquia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Parroquia.findAll", query = "SELECT p FROM Parroquia p"),
    @NamedQuery(name = "Parroquia.findByIdparroquia", query = "SELECT p FROM Parroquia p WHERE p.idparroquia = :idparroquia"),
    @NamedQuery(name = "Parroquia.findByCodparroquia", query = "SELECT p FROM Parroquia p WHERE p.codparroquia = :codparroquia"),
    @NamedQuery(name = "Parroquia.findByNombreparroquia", query = "SELECT p FROM Parroquia p WHERE p.nombreparroquia = :nombreparroquia")})
public class Parroquia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idparroquia")
    private Integer idparroquia;
    @Column(name = "codparroquia")
    private Integer codparroquia;
    @Size(max = 50)
    @Column(name = "nombreparroquia")
    private String nombreparroquia;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idparroquia")
    private List<Hospital> hospitalList;
    @JoinColumn(name = "idcanton", referencedColumnName = "idcanton")
    @ManyToOne(optional = false)
    private Canton idcanton;

    public Parroquia() {
    }

    public Parroquia(Integer idparroquia) {
        this.idparroquia = idparroquia;
    }

    public Integer getIdparroquia() {
        return idparroquia;
    }

    public void setIdparroquia(Integer idparroquia) {
        this.idparroquia = idparroquia;
    }

    public Integer getCodparroquia() {
        return codparroquia;
    }

    public void setCodparroquia(Integer codparroquia) {
        this.codparroquia = codparroquia;
    }

    public String getNombreparroquia() {
        return nombreparroquia;
    }

    public void setNombreparroquia(String nombreparroquia) {
        this.nombreparroquia = nombreparroquia;
    }

    @XmlTransient
    public List<Hospital> getHospitalList() {
        return hospitalList;
    }

    public void setHospitalList(List<Hospital> hospitalList) {
        this.hospitalList = hospitalList;
    }

    public Canton getIdcanton() {
        return idcanton;
    }

    public void setIdcanton(Canton idcanton) {
        this.idcanton = idcanton;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idparroquia != null ? idparroquia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Parroquia)) {
            return false;
        }
        Parroquia other = (Parroquia) object;
        if ((this.idparroquia == null && other.idparroquia != null) || (this.idparroquia != null && !this.idparroquia.equals(other.idparroquia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.heee.bean.model.entity.Parroquia[ idparroquia=" + idparroquia + " ]";
    }
    
}
