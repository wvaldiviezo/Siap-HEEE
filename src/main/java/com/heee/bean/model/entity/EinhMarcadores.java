/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heee.bean.model.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author EPN
 */
@Entity
@Table(name = "einh_marcadores")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EinhMarcadores.findAll", query = "SELECT e FROM EinhMarcadores e"),
    @NamedQuery(name = "EinhMarcadores.findByIdeihmarcador", query = "SELECT e FROM EinhMarcadores e WHERE e.ideihmarcador = :ideihmarcador")})
public class EinhMarcadores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ideihmarcador")
    private Integer ideihmarcador;
    @JoinColumn(name = "ideihq", referencedColumnName = "ideihq")
    @ManyToOne(optional = false)
    private Estudiosinmunohistoquimica ideihq;
    @JoinColumn(name = "idmarcadorihq", referencedColumnName = "idmarcadorihq")
    @ManyToOne(optional = false)
    private Marcadoreseihq idmarcadorihq;

    public EinhMarcadores() {
    }

    public EinhMarcadores(Integer ideihmarcador) {
        this.ideihmarcador = ideihmarcador;
    }

    public Integer getIdeihmarcador() {
        return ideihmarcador;
    }

    public void setIdeihmarcador(Integer ideihmarcador) {
        this.ideihmarcador = ideihmarcador;
    }

    public Estudiosinmunohistoquimica getIdeihq() {
        return ideihq;
    }

    public void setIdeihq(Estudiosinmunohistoquimica ideihq) {
        this.ideihq = ideihq;
    }

    public Marcadoreseihq getIdmarcadorihq() {
        return idmarcadorihq;
    }

    public void setIdmarcadorihq(Marcadoreseihq idmarcadorihq) {
        this.idmarcadorihq = idmarcadorihq;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ideihmarcador != null ? ideihmarcador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EinhMarcadores)) {
            return false;
        }
        EinhMarcadores other = (EinhMarcadores) object;
        if ((this.ideihmarcador == null && other.ideihmarcador != null) || (this.ideihmarcador != null && !this.ideihmarcador.equals(other.ideihmarcador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.heee.bean.model.entity.EinhMarcadores[ ideihmarcador=" + ideihmarcador + " ]";
    }
    
}
