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
@Table(name = "tipoestudiocitologico")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipoestudiocitologico.findAll", query = "SELECT t FROM Tipoestudiocitologico t"),
    @NamedQuery(name = "Tipoestudiocitologico.findByIdtec", query = "SELECT t FROM Tipoestudiocitologico t WHERE t.idtec = :idtec"),
    @NamedQuery(name = "Tipoestudiocitologico.findByDescripcionmarcadortec", query = "SELECT t FROM Tipoestudiocitologico t WHERE t.descripcionmarcadortec = :descripcionmarcadortec")})
public class Tipoestudiocitologico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtec")
    private Integer idtec;
    @Size(max = 50)
    @Column(name = "descripcionmarcadortec")
    private String descripcionmarcadortec;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idtec")
    private List<Categoriacitologico> categoriacitologicoList;

    public Tipoestudiocitologico() {
    }

    public Tipoestudiocitologico(Integer idtec) {
        this.idtec = idtec;
    }

    public Integer getIdtec() {
        return idtec;
    }

    public void setIdtec(Integer idtec) {
        this.idtec = idtec;
    }

    public String getDescripcionmarcadortec() {
        return descripcionmarcadortec;
    }

    public void setDescripcionmarcadortec(String descripcionmarcadortec) {
        this.descripcionmarcadortec = descripcionmarcadortec;
    }

    @XmlTransient
    public List<Categoriacitologico> getCategoriacitologicoList() {
        return categoriacitologicoList;
    }

    public void setCategoriacitologicoList(List<Categoriacitologico> categoriacitologicoList) {
        this.categoriacitologicoList = categoriacitologicoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtec != null ? idtec.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipoestudiocitologico)) {
            return false;
        }
        Tipoestudiocitologico other = (Tipoestudiocitologico) object;
        if ((this.idtec == null && other.idtec != null) || (this.idtec != null && !this.idtec.equals(other.idtec))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.heee.bean.model.entity.Tipoestudiocitologico[ idtec=" + idtec + " ]";
    }
    
}
