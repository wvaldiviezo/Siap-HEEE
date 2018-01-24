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
@Table(name = "marcadoreseh")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Marcadoreseh.findAll", query = "SELECT m FROM Marcadoreseh m"),
    @NamedQuery(name = "Marcadoreseh.findByIdmarcadoreh", query = "SELECT m FROM Marcadoreseh m WHERE m.idmarcadoreh = :idmarcadoreh"),
    @NamedQuery(name = "Marcadoreseh.findByDetallemarcadoreh", query = "SELECT m FROM Marcadoreseh m WHERE m.detallemarcadoreh = :detallemarcadoreh")})
public class Marcadoreseh implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idmarcadoreh")
    private Integer idmarcadoreh;
    @Size(max = 70)
    @Column(name = "detallemarcadoreh")
    private String detallemarcadoreh;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idmarcadoreh")
    private List<EHistMarcador> eHistMarcadorList;

    public Marcadoreseh() {
    }

    public Marcadoreseh(Integer idmarcadoreh) {
        this.idmarcadoreh = idmarcadoreh;
    }

    public Integer getIdmarcadoreh() {
        return idmarcadoreh;
    }

    public void setIdmarcadoreh(Integer idmarcadoreh) {
        this.idmarcadoreh = idmarcadoreh;
    }

    public String getDetallemarcadoreh() {
        return detallemarcadoreh;
    }

    public void setDetallemarcadoreh(String detallemarcadoreh) {
        this.detallemarcadoreh = detallemarcadoreh;
    }

    @XmlTransient
    public List<EHistMarcador> getEHistMarcadorList() {
        return eHistMarcadorList;
    }

    public void setEHistMarcadorList(List<EHistMarcador> eHistMarcadorList) {
        this.eHistMarcadorList = eHistMarcadorList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmarcadoreh != null ? idmarcadoreh.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Marcadoreseh)) {
            return false;
        }
        Marcadoreseh other = (Marcadoreseh) object;
        if ((this.idmarcadoreh == null && other.idmarcadoreh != null) || (this.idmarcadoreh != null && !this.idmarcadoreh.equals(other.idmarcadoreh))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.heee.bean.model.entity.Marcadoreseh[ idmarcadoreh=" + idmarcadoreh + " ]";
    }
    
}
