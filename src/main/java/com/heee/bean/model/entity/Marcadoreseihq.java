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
@Table(name = "marcadoreseihq")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Marcadoreseihq.findAll", query = "SELECT m FROM Marcadoreseihq m"),
    @NamedQuery(name = "Marcadoreseihq.findByIdmarcadorihq", query = "SELECT m FROM Marcadoreseihq m WHERE m.idmarcadorihq = :idmarcadorihq"),
    @NamedQuery(name = "Marcadoreseihq.findByDetallemarcadorihq", query = "SELECT m FROM Marcadoreseihq m WHERE m.detallemarcadorihq = :detallemarcadorihq")})
public class Marcadoreseihq implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idmarcadorihq")
    private Integer idmarcadorihq;
    @Size(max = 100)
    @Column(name = "detallemarcadorihq")
    private String detallemarcadorihq;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idmarcadorihq")
    private List<EinhMarcadores> einhMarcadoresList;

    public Marcadoreseihq() {
    }

    public Marcadoreseihq(Integer idmarcadorihq) {
        this.idmarcadorihq = idmarcadorihq;
    }

    public Integer getIdmarcadorihq() {
        return idmarcadorihq;
    }

    public void setIdmarcadorihq(Integer idmarcadorihq) {
        this.idmarcadorihq = idmarcadorihq;
    }

    public String getDetallemarcadorihq() {
        return detallemarcadorihq;
    }

    public void setDetallemarcadorihq(String detallemarcadorihq) {
        this.detallemarcadorihq = detallemarcadorihq;
    }

    @XmlTransient
    public List<EinhMarcadores> getEinhMarcadoresList() {
        return einhMarcadoresList;
    }

    public void setEinhMarcadoresList(List<EinhMarcadores> einhMarcadoresList) {
        this.einhMarcadoresList = einhMarcadoresList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmarcadorihq != null ? idmarcadorihq.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Marcadoreseihq)) {
            return false;
        }
        Marcadoreseihq other = (Marcadoreseihq) object;
        if ((this.idmarcadorihq == null && other.idmarcadorihq != null) || (this.idmarcadorihq != null && !this.idmarcadorihq.equals(other.idmarcadorihq))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.heee.bean.model.entity.Marcadoreseihq[ idmarcadorihq=" + idmarcadorihq + " ]";
    }
    
}
