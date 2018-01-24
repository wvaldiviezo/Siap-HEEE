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
@Table(name = "canton")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Canton.findAll", query = "SELECT c FROM Canton c"),
    @NamedQuery(name = "Canton.findByIdcanton", query = "SELECT c FROM Canton c WHERE c.idcanton = :idcanton"),
    @NamedQuery(name = "Canton.findByCodcanton", query = "SELECT c FROM Canton c WHERE c.codcanton = :codcanton"),
    @NamedQuery(name = "Canton.findByNombrecanton", query = "SELECT c FROM Canton c WHERE c.nombrecanton = :nombrecanton")})
public class Canton implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcanton")
    private Integer idcanton;
    @Column(name = "codcanton")
    private Integer codcanton;
    @Size(max = 50)
    @Column(name = "nombrecanton")
    private String nombrecanton;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idcanton")
    private List<Parroquia> parroquiaList;
    @JoinColumn(name = "idprovincia", referencedColumnName = "idprovincia")
    @ManyToOne(optional = false)
    private Provincia idprovincia;

    public Canton() {
    }

    public Canton(Integer idcanton) {
        this.idcanton = idcanton;
    }

    public Integer getIdcanton() {
        return idcanton;
    }

    public void setIdcanton(Integer idcanton) {
        this.idcanton = idcanton;
    }

    public Integer getCodcanton() {
        return codcanton;
    }

    public void setCodcanton(Integer codcanton) {
        this.codcanton = codcanton;
    }

    public String getNombrecanton() {
        return nombrecanton;
    }

    public void setNombrecanton(String nombrecanton) {
        this.nombrecanton = nombrecanton;
    }

    @XmlTransient
    public List<Parroquia> getParroquiaList() {
        return parroquiaList;
    }

    public void setParroquiaList(List<Parroquia> parroquiaList) {
        this.parroquiaList = parroquiaList;
    }

    public Provincia getIdprovincia() {
        return idprovincia;
    }

    public void setIdprovincia(Provincia idprovincia) {
        this.idprovincia = idprovincia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcanton != null ? idcanton.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Canton)) {
            return false;
        }
        Canton other = (Canton) object;
        if ((this.idcanton == null && other.idcanton != null) || (this.idcanton != null && !this.idcanton.equals(other.idcanton))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.heee.bean.model.entity.Canton[ idcanton=" + idcanton + " ]";
    }
    
}
