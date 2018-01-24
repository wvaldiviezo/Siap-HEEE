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
@Table(name = "extremidades")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Extremidades.findAll", query = "SELECT e FROM Extremidades e"),
    @NamedQuery(name = "Extremidades.findByIdextremidades", query = "SELECT e FROM Extremidades e WHERE e.idextremidades = :idextremidades"),
    @NamedQuery(name = "Extremidades.findByNombreextremidades", query = "SELECT e FROM Extremidades e WHERE e.nombreextremidades = :nombreextremidades")})
public class Extremidades implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idextremidades")
    private Integer idextremidades;
    @Size(max = 30)
    @Column(name = "nombreextremidades")
    private String nombreextremidades;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idextremidades")
    private List<Partes> partesList;

    public Extremidades() {
    }

    public Extremidades(Integer idextremidades) {
        this.idextremidades = idextremidades;
    }

    public Integer getIdextremidades() {
        return idextremidades;
    }

    public void setIdextremidades(Integer idextremidades) {
        this.idextremidades = idextremidades;
    }

    public String getNombreextremidades() {
        return nombreextremidades;
    }

    public void setNombreextremidades(String nombreextremidades) {
        this.nombreextremidades = nombreextremidades;
    }

    @XmlTransient
    public List<Partes> getPartesList() {
        return partesList;
    }

    public void setPartesList(List<Partes> partesList) {
        this.partesList = partesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idextremidades != null ? idextremidades.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Extremidades)) {
            return false;
        }
        Extremidades other = (Extremidades) object;
        if ((this.idextremidades == null && other.idextremidades != null) || (this.idextremidades != null && !this.idextremidades.equals(other.idextremidades))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.heee.bean.model.entity.Extremidades[ idextremidades=" + idextremidades + " ]";
    }
    
}
