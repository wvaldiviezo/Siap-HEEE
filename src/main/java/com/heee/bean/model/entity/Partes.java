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
@Table(name = "partes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Partes.findAll", query = "SELECT p FROM Partes p"),
    @NamedQuery(name = "Partes.findByIdpartes", query = "SELECT p FROM Partes p WHERE p.idpartes = :idpartes"),
    @NamedQuery(name = "Partes.findByNombrepartes", query = "SELECT p FROM Partes p WHERE p.nombrepartes = :nombrepartes")})
public class Partes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpartes")
    private Integer idpartes;
    @Size(max = 30)
    @Column(name = "nombrepartes")
    private String nombrepartes;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idpartes")
    private List<Estudiosamputaciones> estudiosamputacionesList;
    @JoinColumn(name = "idextremidades", referencedColumnName = "idextremidades")
    @ManyToOne(optional = false)
    private Extremidades idextremidades;

    public Partes() {
    }

    public Partes(Integer idpartes) {
        this.idpartes = idpartes;
    }

    public Integer getIdpartes() {
        return idpartes;
    }

    public void setIdpartes(Integer idpartes) {
        this.idpartes = idpartes;
    }

    public String getNombrepartes() {
        return nombrepartes;
    }

    public void setNombrepartes(String nombrepartes) {
        this.nombrepartes = nombrepartes;
    }

    @XmlTransient
    public List<Estudiosamputaciones> getEstudiosamputacionesList() {
        return estudiosamputacionesList;
    }

    public void setEstudiosamputacionesList(List<Estudiosamputaciones> estudiosamputacionesList) {
        this.estudiosamputacionesList = estudiosamputacionesList;
    }

    public Extremidades getIdextremidades() {
        return idextremidades;
    }

    public void setIdextremidades(Extremidades idextremidades) {
        this.idextremidades = idextremidades;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpartes != null ? idpartes.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Partes)) {
            return false;
        }
        Partes other = (Partes) object;
        if ((this.idpartes == null && other.idpartes != null) || (this.idpartes != null && !this.idpartes.equals(other.idpartes))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.heee.bean.model.entity.Partes[ idpartes=" + idpartes + " ]";
    }
    
}
