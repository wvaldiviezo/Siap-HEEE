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
 * @author MPCS
 */
@Entity
@Table(name = "marcadorsubcategoriabm")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Marcadorsubcategoriabm.findAll", query = "SELECT m FROM Marcadorsubcategoriabm m")
    , @NamedQuery(name = "Marcadorsubcategoriabm.findByIdmarcadorsubcategoriabm", query = "SELECT m FROM Marcadorsubcategoriabm m WHERE m.idmarcadorsubcategoriabm = :idmarcadorsubcategoriabm")
    , @NamedQuery(name = "Marcadorsubcategoriabm.findByNombremaradorbm", query = "SELECT m FROM Marcadorsubcategoriabm m WHERE m.nombremaradorbm = :nombremaradorbm")})
public class Marcadorsubcategoriabm implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idmarcadorsubcategoriabm")
    private Integer idmarcadorsubcategoriabm;
    @Size(max = 250)
    @Column(name = "nombremaradorbm")
    private String nombremaradorbm;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idmarcadorsubcategoriabm")
    private List<MarcadorBio> marcadorBioList;
    @JoinColumn(name = "idsubcategoriabm", referencedColumnName = "idsubcategoriabm")
    @ManyToOne(optional = false)
    private Subcategoriabm idsubcategoriabm;

    public Marcadorsubcategoriabm() {
    }

    public Marcadorsubcategoriabm(Integer idmarcadorsubcategoriabm) {
        this.idmarcadorsubcategoriabm = idmarcadorsubcategoriabm;
    }

    public Integer getIdmarcadorsubcategoriabm() {
        return idmarcadorsubcategoriabm;
    }

    public void setIdmarcadorsubcategoriabm(Integer idmarcadorsubcategoriabm) {
        this.idmarcadorsubcategoriabm = idmarcadorsubcategoriabm;
    }

    public String getNombremaradorbm() {
        return nombremaradorbm;
    }

    public void setNombremaradorbm(String nombremaradorbm) {
        this.nombremaradorbm = nombremaradorbm;
    }

    @XmlTransient
    public List<MarcadorBio> getMarcadorBioList() {
        return marcadorBioList;
    }

    public void setMarcadorBioList(List<MarcadorBio> marcadorBioList) {
        this.marcadorBioList = marcadorBioList;
    }

    public Subcategoriabm getIdsubcategoriabm() {
        return idsubcategoriabm;
    }

    public void setIdsubcategoriabm(Subcategoriabm idsubcategoriabm) {
        this.idsubcategoriabm = idsubcategoriabm;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmarcadorsubcategoriabm != null ? idmarcadorsubcategoriabm.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Marcadorsubcategoriabm)) {
            return false;
        }
        Marcadorsubcategoriabm other = (Marcadorsubcategoriabm) object;
        if ((this.idmarcadorsubcategoriabm == null && other.idmarcadorsubcategoriabm != null) || (this.idmarcadorsubcategoriabm != null && !this.idmarcadorsubcategoriabm.equals(other.idmarcadorsubcategoriabm))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.heee.bean.model.entity.Marcadorsubcategoriabm[ idmarcadorsubcategoriabm=" + idmarcadorsubcategoriabm + " ]";
    }
    
}
