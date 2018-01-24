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
@Table(name = "subcategoriacitologico")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Subcategoriacitologico.findAll", query = "SELECT s FROM Subcategoriacitologico s"),
    @NamedQuery(name = "Subcategoriacitologico.findByIdsubcategoria", query = "SELECT s FROM Subcategoriacitologico s WHERE s.idsubcategoria = :idsubcategoria"),
    @NamedQuery(name = "Subcategoriacitologico.findByNombresubcategoria", query = "SELECT s FROM Subcategoriacitologico s WHERE s.nombresubcategoria = :nombresubcategoria")})
public class Subcategoriacitologico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idsubcategoria")
    private Integer idsubcategoria;
    @Size(max = 50)
    @Column(name = "nombresubcategoria")
    private String nombresubcategoria;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idsubcategoria")
    private List<ECitologicoSubcategoria> eCitologicoSubcategoriaList;
    @JoinColumn(name = "idcategoria", referencedColumnName = "idcategoria")
    @ManyToOne(optional = false)
    private Categoriacitologico idcategoria;

    public Subcategoriacitologico() {
    }

    public Subcategoriacitologico(Integer idsubcategoria) {
        this.idsubcategoria = idsubcategoria;
    }

    public Integer getIdsubcategoria() {
        return idsubcategoria;
    }

    public void setIdsubcategoria(Integer idsubcategoria) {
        this.idsubcategoria = idsubcategoria;
    }

    public String getNombresubcategoria() {
        return nombresubcategoria;
    }

    public void setNombresubcategoria(String nombresubcategoria) {
        this.nombresubcategoria = nombresubcategoria;
    }

    @XmlTransient
    public List<ECitologicoSubcategoria> getECitologicoSubcategoriaList() {
        return eCitologicoSubcategoriaList;
    }

    public void setECitologicoSubcategoriaList(List<ECitologicoSubcategoria> eCitologicoSubcategoriaList) {
        this.eCitologicoSubcategoriaList = eCitologicoSubcategoriaList;
    }

    public Categoriacitologico getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(Categoriacitologico idcategoria) {
        this.idcategoria = idcategoria;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsubcategoria != null ? idsubcategoria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Subcategoriacitologico)) {
            return false;
        }
        Subcategoriacitologico other = (Subcategoriacitologico) object;
        if ((this.idsubcategoria == null && other.idsubcategoria != null) || (this.idsubcategoria != null && !this.idsubcategoria.equals(other.idsubcategoria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.heee.bean.model.entity.Subcategoriacitologico[ idsubcategoria=" + idsubcategoria + " ]";
    }
    
}
