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
@Table(name = "tipoestudio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipoestudio.findAll", query = "SELECT t FROM Tipoestudio t"),
    @NamedQuery(name = "Tipoestudio.findByIdte", query = "SELECT t FROM Tipoestudio t WHERE t.idte = :idte"),
    @NamedQuery(name = "Tipoestudio.findByNombrete", query = "SELECT t FROM Tipoestudio t WHERE t.nombrete = :nombrete")})
public class Tipoestudio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idte")
    private Integer idte;
    @Size(max = 25)
    @Column(name = "nombrete")
    private String nombrete;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idte")
    private List<Cabecerarecepcionmuestra> cabecerarecepcionmuestraList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idte")
    private List<Contadorestipoestudioanio> contadorestipoestudioanioList;

    public Tipoestudio() {
    }

    public Tipoestudio(Integer idte) {
        this.idte = idte;
    }

    public Integer getIdte() {
        return idte;
    }

    public void setIdte(Integer idte) {
        this.idte = idte;
    }

    public String getNombrete() {
        return nombrete;
    }

    public void setNombrete(String nombrete) {
        this.nombrete = nombrete;
    }

    @XmlTransient
    public List<Cabecerarecepcionmuestra> getCabecerarecepcionmuestraList() {
        return cabecerarecepcionmuestraList;
    }

    public void setCabecerarecepcionmuestraList(List<Cabecerarecepcionmuestra> cabecerarecepcionmuestraList) {
        this.cabecerarecepcionmuestraList = cabecerarecepcionmuestraList;
    }

    @XmlTransient
    public List<Contadorestipoestudioanio> getContadorestipoestudioanioList() {
        return contadorestipoestudioanioList;
    }

    public void setContadorestipoestudioanioList(List<Contadorestipoestudioanio> contadorestipoestudioanioList) {
        this.contadorestipoestudioanioList = contadorestipoestudioanioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idte != null ? idte.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipoestudio)) {
            return false;
        }
        Tipoestudio other = (Tipoestudio) object;
        if ((this.idte == null && other.idte != null) || (this.idte != null && !this.idte.equals(other.idte))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.heee.bean.model.entity.Tipoestudio[ idte=" + idte + " ]";
    }
    
}
