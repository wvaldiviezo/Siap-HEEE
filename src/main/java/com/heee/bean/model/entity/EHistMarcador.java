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
@Table(name = "e_hist_marcador")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EHistMarcador.findAll", query = "SELECT e FROM EHistMarcador e"),
    @NamedQuery(name = "EHistMarcador.findByIdehistmarcador", query = "SELECT e FROM EHistMarcador e WHERE e.idehistmarcador = :idehistmarcador")})
public class EHistMarcador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idehistmarcador")
    private Integer idehistmarcador;
    @JoinColumn(name = "ideh", referencedColumnName = "ideh")
    @ManyToOne(optional = false)
    private Estudioshistoquimica ideh;
    @JoinColumn(name = "idmarcadoreh", referencedColumnName = "idmarcadoreh")
    @ManyToOne(optional = false)
    private Marcadoreseh idmarcadoreh;

    public EHistMarcador() {
    }

    public EHistMarcador(Integer idehistmarcador) {
        this.idehistmarcador = idehistmarcador;
    }

    public Integer getIdehistmarcador() {
        return idehistmarcador;
    }

    public void setIdehistmarcador(Integer idehistmarcador) {
        this.idehistmarcador = idehistmarcador;
    }

    public Estudioshistoquimica getIdeh() {
        return ideh;
    }

    public void setIdeh(Estudioshistoquimica ideh) {
        this.ideh = ideh;
    }

    public Marcadoreseh getIdmarcadoreh() {
        return idmarcadoreh;
    }

    public void setIdmarcadoreh(Marcadoreseh idmarcadoreh) {
        this.idmarcadoreh = idmarcadoreh;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idehistmarcador != null ? idehistmarcador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EHistMarcador)) {
            return false;
        }
        EHistMarcador other = (EHistMarcador) object;
        if ((this.idehistmarcador == null && other.idehistmarcador != null) || (this.idehistmarcador != null && !this.idehistmarcador.equals(other.idehistmarcador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.heee.bean.model.entity.EHistMarcador[ idehistmarcador=" + idehistmarcador + " ]";
    }
    
}
