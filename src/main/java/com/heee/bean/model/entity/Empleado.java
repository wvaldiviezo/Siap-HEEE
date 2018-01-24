/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heee.bean.model.entity;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author EPN
 */
@Entity
@Table(name = "empleado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empleado.findAll", query = "SELECT e FROM Empleado e"),
    @NamedQuery(name = "Empleado.findByIdempleado", query = "SELECT e FROM Empleado e WHERE e.idempleado = :idempleado"),
    @NamedQuery(name = "Empleado.findByNombresempleado", query = "SELECT e FROM Empleado e WHERE e.nombresempleado = :nombresempleado"),
    @NamedQuery(name = "Empleado.findByApellidosempleado", query = "SELECT e FROM Empleado e WHERE e.apellidosempleado = :apellidosempleado"),
    @NamedQuery(name = "Empleado.findBySexo", query = "SELECT e FROM Empleado e WHERE e.sexo = :sexo"),
    @NamedQuery(name = "Empleado.findByFechanacimientoempleado", query = "SELECT e FROM Empleado e WHERE e.fechanacimientoempleado = :fechanacimientoempleado"),
    @NamedQuery(name = "Empleado.findByCedulaempleado", query = "SELECT e FROM Empleado e WHERE e.cedulaempleado = :cedulaempleado"),
    @NamedQuery(name = "Empleado.findByDireccionempleado", query = "SELECT e FROM Empleado e WHERE e.direccionempleado = :direccionempleado"),
    @NamedQuery(name = "Empleado.findByTelefonoempleado", query = "SELECT e FROM Empleado e WHERE e.telefonoempleado = :telefonoempleado"),
    @NamedQuery(name = "Empleado.findByEmailempleado", query = "SELECT e FROM Empleado e WHERE e.emailempleado = :emailempleado"),
    @NamedQuery(name = "Empleado.findByFecharegistroempleado", query = "SELECT e FROM Empleado e WHERE e.fecharegistroempleado = :fecharegistroempleado")})
public class Empleado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idempleado")
    private Integer idempleado;
    @Size(max = 50)
    @Column(name = "nombresempleado")
    private String nombresempleado;
    @Size(max = 50)
    @Column(name = "apellidosempleado")
    private String apellidosempleado;
    @Size(max = 1)
    @Column(name = "sexo")
    private String sexo;
    @Column(name = "fechanacimientoempleado")
    @Temporal(TemporalType.DATE)
    private Date fechanacimientoempleado;
    @Size(max = 10)
    @Column(name = "cedulaempleado")
    private String cedulaempleado;
    @Size(max = 50)
    @Column(name = "direccionempleado")
    private String direccionempleado;
    @Size(max = 20)
    @Column(name = "telefonoempleado")
    private String telefonoempleado;
    @Size(max = 50)
    @Column(name = "emailempleado")
    private String emailempleado;
    @Column(name = "fecharegistroempleado")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecharegistroempleado;
    @JoinColumn(name = "idarea", referencedColumnName = "idarea")
    @ManyToOne(optional = false)
    private Area idarea;
    @JoinColumn(name = "idcargo", referencedColumnName = "idcargo")
    @ManyToOne(optional = false)
    private Cargo idcargo;
    @JoinColumn(name = "idespecialidad", referencedColumnName = "idespecialidad")
    @ManyToOne(optional = false)
    private Especialidad idespecialidad;

    public Empleado() {
    }

    public Empleado(Integer idempleado) {
        this.idempleado = idempleado;
    }

    public Integer getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(Integer idempleado) {
        this.idempleado = idempleado;
    }

    public String getNombresempleado() {
        return nombresempleado;
    }

    public void setNombresempleado(String nombresempleado) {
        this.nombresempleado = nombresempleado;
    }

    public String getApellidosempleado() {
        return apellidosempleado;
    }

    public void setApellidosempleado(String apellidosempleado) {
        this.apellidosempleado = apellidosempleado;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getFechanacimientoempleado() {
        return fechanacimientoempleado;
    }

    public void setFechanacimientoempleado(Date fechanacimientoempleado) {
        this.fechanacimientoempleado = fechanacimientoempleado;
    }

    public String getCedulaempleado() {
        return cedulaempleado;
    }

    public void setCedulaempleado(String cedulaempleado) {
        this.cedulaempleado = cedulaempleado;
    }

    public String getDireccionempleado() {
        return direccionempleado;
    }

    public void setDireccionempleado(String direccionempleado) {
        this.direccionempleado = direccionempleado;
    }

    public String getTelefonoempleado() {
        return telefonoempleado;
    }

    public void setTelefonoempleado(String telefonoempleado) {
        this.telefonoempleado = telefonoempleado;
    }

    public String getEmailempleado() {
        return emailempleado;
    }

    public void setEmailempleado(String emailempleado) {
        this.emailempleado = emailempleado;
    }

    public Date getFecharegistroempleado() {
        return fecharegistroempleado;
    }

    public void setFecharegistroempleado(Date fecharegistroempleado) {
        this.fecharegistroempleado = fecharegistroempleado;
    }

    public Area getIdarea() {
        return idarea;
    }

    public void setIdarea(Area idarea) {
        this.idarea = idarea;
    }

    public Cargo getIdcargo() {
        return idcargo;
    }

    public void setIdcargo(Cargo idcargo) {
        this.idcargo = idcargo;
    }

    public Especialidad getIdespecialidad() {
        return idespecialidad;
    }

    public void setIdespecialidad(Especialidad idespecialidad) {
        this.idespecialidad = idespecialidad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idempleado != null ? idempleado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empleado)) {
            return false;
        }
        Empleado other = (Empleado) object;
        if ((this.idempleado == null && other.idempleado != null) || (this.idempleado != null && !this.idempleado.equals(other.idempleado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.heee.bean.model.entity.Empleado[ idempleado=" + idempleado + " ]";
    }
    
}
