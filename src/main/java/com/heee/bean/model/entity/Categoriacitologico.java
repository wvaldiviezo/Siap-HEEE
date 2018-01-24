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
@Table(name = "categoriacitologico")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Categoriacitologico.findAll", query = "SELECT c FROM Categoriacitologico c"),
    @NamedQuery(name = "Categoriacitologico.findByIdcategoria", query = "SELECT c FROM Categoriacitologico c WHERE c.idcategoria = :idcategoria"),
    @NamedQuery(name = "Categoriacitologico.findByDescripcionmarcadorcategoria", query = "SELECT c FROM Categoriacitologico c WHERE c.descripcionmarcadorcategoria = :descripcionmarcadorcategoria")})
public class Categoriacitologico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcategoria")
    private Integer idcategoria;
    @Size(max = 50)
    @Column(name = "descripcionmarcadorcategoria")
    private String descripcionmarcadorcategoria;
    @JoinColumn(name = "idtec", referencedColumnName = "idtec")
    @ManyToOne(optional = false)
    private Tipoestudiocitologico idtec;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idcategoria")
    private List<Subcategoriacitologico> subcategoriacitologicoList;

    public Categoriacitologico() {
    }

    public Categoriacitologico(Integer idcategoria) {
        this.idcategoria = idcategoria;
    }

    public Integer getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(Integer idcategoria) {
        this.idcategoria = idcategoria;
    }

    public String getDescripcionmarcadorcategoria() {
        return descripcionmarcadorcategoria;
    }

    public void setDescripcionmarcadorcategoria(String descripcionmarcadorcategoria) {
        this.descripcionmarcadorcategoria = descripcionmarcadorcategoria;
    }

    public Tipoestudiocitologico getIdtec() {
        return idtec;
    }

    public void setIdtec(Tipoestudiocitologico idtec) {
        this.idtec = idtec;
    }

    @XmlTransient
    public List<Subcategoriacitologico> getSubcategoriacitologicoList() {
        return subcategoriacitologicoList;
    }

    public void setSubcategoriacitologicoList(List<Subcategoriacitologico> subcategoriacitologicoList) {
        this.subcategoriacitologicoList = subcategoriacitologicoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcategoria != null ? idcategoria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Categoriacitologico)) {
            return false;
        }
        Categoriacitologico other = (Categoriacitologico) object;
        if ((this.idcategoria == null && other.idcategoria != null) || (this.idcategoria != null && !this.idcategoria.equals(other.idcategoria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.heee.bean.model.entity.Categoriacitologico[ idcategoria=" + idcategoria + " ]";
    }
    
}
