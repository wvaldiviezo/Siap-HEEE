/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heee.bean.model.entity;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author EPN
 */
@Entity
@Table(name = "estudiosinmunohistoquimica")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Estudiosinmunohistoquimica.findAll", query = "SELECT e FROM Estudiosinmunohistoquimica e"),
    @NamedQuery(name = "Estudiosinmunohistoquimica.findByIdeihq", query = "SELECT e FROM Estudiosinmunohistoquimica e WHERE e.ideihq = :ideihq"),
    @NamedQuery(name = "Estudiosinmunohistoquimica.findByDescripcionestudioeihq", query = "SELECT e FROM Estudiosinmunohistoquimica e WHERE e.descripcionestudioeihq = :descripcionestudioeihq"),
    @NamedQuery(name = "Estudiosinmunohistoquimica.findByIdcabecerarecepcionmuestraeihq", query = "SELECT e FROM Estudiosinmunohistoquimica e WHERE e.idcabecerarecepcionmuestraeihq = :idcabecerarecepcionmuestraeihq"),
    @NamedQuery(name = "Estudiosinmunohistoquimica.findByIdusuariocreaihq", query = "SELECT e FROM Estudiosinmunohistoquimica e WHERE e.idusuariocreaihq = :idusuariocreaihq"),
    @NamedQuery(name = "Estudiosinmunohistoquimica.findByFechacreaihq", query = "SELECT e FROM Estudiosinmunohistoquimica e WHERE e.fechacreaihq = :fechacreaihq"),
    @NamedQuery(name = "Estudiosinmunohistoquimica.findByIdusuarioactualizaihq", query = "SELECT e FROM Estudiosinmunohistoquimica e WHERE e.idusuarioactualizaihq = :idusuarioactualizaihq"),
    @NamedQuery(name = "Estudiosinmunohistoquimica.findByFechaactualizaihq", query = "SELECT e FROM Estudiosinmunohistoquimica e WHERE e.fechaactualizaihq = :fechaactualizaihq")})
public class Estudiosinmunohistoquimica implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ideihq")
    private Integer ideihq;
    @Size(max = 100)
    @Column(name = "descripcionestudioeihq")
    private String descripcionestudioeihq;
    @Column(name = "idcabecerarecepcionmuestraeihq")
    private Integer idcabecerarecepcionmuestraeihq;
    @Column(name = "idusuariocreaihq")
    private Integer idusuariocreaihq;
    @Column(name = "fechacreaihq")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechacreaihq;
    @Column(name = "idusuarioactualizaihq")
    private Integer idusuarioactualizaihq;
    @Column(name = "fechaactualizaihq")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaactualizaihq;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ideihq")
    private List<EinhMarcadores> einhMarcadoresList;

    public Estudiosinmunohistoquimica() {
    }

    public Estudiosinmunohistoquimica(Integer ideihq) {
        this.ideihq = ideihq;
    }

    public Integer getIdeihq() {
        return ideihq;
    }

    public void setIdeihq(Integer ideihq) {
        this.ideihq = ideihq;
    }

    public String getDescripcionestudioeihq() {
        return descripcionestudioeihq;
    }

    public void setDescripcionestudioeihq(String descripcionestudioeihq) {
        this.descripcionestudioeihq = descripcionestudioeihq;
    }

    public Integer getIdcabecerarecepcionmuestraeihq() {
        return idcabecerarecepcionmuestraeihq;
    }

    public void setIdcabecerarecepcionmuestraeihq(Integer idcabecerarecepcionmuestraeihq) {
        this.idcabecerarecepcionmuestraeihq = idcabecerarecepcionmuestraeihq;
    }

    public Integer getIdusuariocreaihq() {
        return idusuariocreaihq;
    }

    public void setIdusuariocreaihq(Integer idusuariocreaihq) {
        this.idusuariocreaihq = idusuariocreaihq;
    }

    public Date getFechacreaihq() {
        return fechacreaihq;
    }

    public void setFechacreaihq(Date fechacreaihq) {
        this.fechacreaihq = fechacreaihq;
    }

    public Integer getIdusuarioactualizaihq() {
        return idusuarioactualizaihq;
    }

    public void setIdusuarioactualizaihq(Integer idusuarioactualizaihq) {
        this.idusuarioactualizaihq = idusuarioactualizaihq;
    }

    public Date getFechaactualizaihq() {
        return fechaactualizaihq;
    }

    public void setFechaactualizaihq(Date fechaactualizaihq) {
        this.fechaactualizaihq = fechaactualizaihq;
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
        hash += (ideihq != null ? ideihq.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estudiosinmunohistoquimica)) {
            return false;
        }
        Estudiosinmunohistoquimica other = (Estudiosinmunohistoquimica) object;
        if ((this.ideihq == null && other.ideihq != null) || (this.ideihq != null && !this.ideihq.equals(other.ideihq))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.heee.bean.model.entity.Estudiosinmunohistoquimica[ ideihq=" + ideihq + " ]";
    }
    
}
