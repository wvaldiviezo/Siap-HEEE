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
@Table(name = "hospital")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Hospital.findAll", query = "SELECT h FROM Hospital h"),
    @NamedQuery(name = "Hospital.findByIdhospital", query = "SELECT h FROM Hospital h WHERE h.idhospital = :idhospital"),
    @NamedQuery(name = "Hospital.findByUnidadoperativa", query = "SELECT h FROM Hospital h WHERE h.unidadoperativa = :unidadoperativa"),
    @NamedQuery(name = "Hospital.findByInstituciondelsistema", query = "SELECT h FROM Hospital h WHERE h.instituciondelsistema = :instituciondelsistema"),
    @NamedQuery(name = "Hospital.findByCodigouo", query = "SELECT h FROM Hospital h WHERE h.codigouo = :codigouo")})
public class Hospital implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idhospital")
    private Integer idhospital;
    @Size(max = 100)
    @Column(name = "unidadoperativa")
    private String unidadoperativa;
    @Size(max = 50)
    @Column(name = "instituciondelsistema")
    private String instituciondelsistema;
    @Column(name = "codigouo")
    private Integer codigouo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idhospital")
    private List<Cabecerarecepcionmuestra> cabecerarecepcionmuestraList;
    @JoinColumn(name = "idparroquia", referencedColumnName = "idparroquia")
    @ManyToOne(optional = false)
    private Parroquia idparroquia;

    public Hospital() {
    }

    public Hospital(Integer idhospital) {
        this.idhospital = idhospital;
    }

    public Integer getIdhospital() {
        return idhospital;
    }

    public void setIdhospital(Integer idhospital) {
        this.idhospital = idhospital;
    }

    public String getUnidadoperativa() {
        return unidadoperativa;
    }

    public void setUnidadoperativa(String unidadoperativa) {
        this.unidadoperativa = unidadoperativa;
    }

    public String getInstituciondelsistema() {
        return instituciondelsistema;
    }

    public void setInstituciondelsistema(String instituciondelsistema) {
        this.instituciondelsistema = instituciondelsistema;
    }

    public Integer getCodigouo() {
        return codigouo;
    }

    public void setCodigouo(Integer codigouo) {
        this.codigouo = codigouo;
    }

    @XmlTransient
    public List<Cabecerarecepcionmuestra> getCabecerarecepcionmuestraList() {
        return cabecerarecepcionmuestraList;
    }

    public void setCabecerarecepcionmuestraList(List<Cabecerarecepcionmuestra> cabecerarecepcionmuestraList) {
        this.cabecerarecepcionmuestraList = cabecerarecepcionmuestraList;
    }

    public Parroquia getIdparroquia() {
        return idparroquia;
    }

    public void setIdparroquia(Parroquia idparroquia) {
        this.idparroquia = idparroquia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idhospital != null ? idhospital.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Hospital)) {
            return false;
        }
        Hospital other = (Hospital) object;
        if ((this.idhospital == null && other.idhospital != null) || (this.idhospital != null && !this.idhospital.equals(other.idhospital))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.heee.bean.model.entity.Hospital[ idhospital=" + idhospital + " ]";
    }
    
}
