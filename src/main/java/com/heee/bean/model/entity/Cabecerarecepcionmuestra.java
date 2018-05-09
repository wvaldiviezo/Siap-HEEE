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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "cabecerarecepcionmuestra")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cabecerarecepcionmuestra.findAll", query = "SELECT c FROM Cabecerarecepcionmuestra c"),
    @NamedQuery(name = "Cabecerarecepcionmuestra.findByIdcrm", query = "SELECT c FROM Cabecerarecepcionmuestra c WHERE c.idcrm = :idcrm"),
    @NamedQuery(name = "Cabecerarecepcionmuestra.findByFechatomamuestracrm", query = "SELECT c FROM Cabecerarecepcionmuestra c WHERE c.fechatomamuestracrm = :fechatomamuestracrm"),
    @NamedQuery(name = "Cabecerarecepcionmuestra.findByHoratomamuestracrm", query = "SELECT c FROM Cabecerarecepcionmuestra c WHERE c.horatomamuestracrm = :horatomamuestracrm"),
    @NamedQuery(name = "Cabecerarecepcionmuestra.findByTiposervicio", query = "SELECT c FROM Cabecerarecepcionmuestra c WHERE c.tiposervicio = :tiposervicio"),
    @NamedQuery(name = "Cabecerarecepcionmuestra.findByDescriptiposerviciocrm", query = "SELECT c FROM Cabecerarecepcionmuestra c WHERE c.descriptiposerviciocrm = :descriptiposerviciocrm"),
    @NamedQuery(name = "Cabecerarecepcionmuestra.findByTratamientopacientecrm", query = "SELECT c FROM Cabecerarecepcionmuestra c WHERE c.tratamientopacientecrm = :tratamientopacientecrm"),
    @NamedQuery(name = "Cabecerarecepcionmuestra.findByServiciocrm", query = "SELECT c FROM Cabecerarecepcionmuestra c WHERE c.serviciocrm = :serviciocrm"),
    @NamedQuery(name = "Cabecerarecepcionmuestra.findBySalacrm", query = "SELECT c FROM Cabecerarecepcionmuestra c WHERE c.salacrm = :salacrm"),
    @NamedQuery(name = "Cabecerarecepcionmuestra.findByCamacrm", query = "SELECT c FROM Cabecerarecepcionmuestra c WHERE c.camacrm = :camacrm"),
    @NamedQuery(name = "Cabecerarecepcionmuestra.findByPrioridad", query = "SELECT c FROM Cabecerarecepcionmuestra c WHERE c.prioridad = :prioridad"),
    @NamedQuery(name = "Cabecerarecepcionmuestra.findByDiagnosticopresunticocrm", query = "SELECT c FROM Cabecerarecepcionmuestra c WHERE c.diagnosticopresunticocrm = :diagnosticopresunticocrm"),
    @NamedQuery(name = "Cabecerarecepcionmuestra.findByResumenclinicocrm", query = "SELECT c FROM Cabecerarecepcionmuestra c WHERE c.resumenclinicocrm = :resumenclinicocrm"),
    @NamedQuery(name = "Cabecerarecepcionmuestra.findByMuestrapiezacrm", query = "SELECT c FROM Cabecerarecepcionmuestra c WHERE c.muestrapiezacrm = :muestrapiezacrm"),
    @NamedQuery(name = "Cabecerarecepcionmuestra.findByNumbloquescrm", query = "SELECT c FROM Cabecerarecepcionmuestra c WHERE c.numbloquescrm = :numbloquescrm"),
    @NamedQuery(name = "Cabecerarecepcionmuestra.findByNumplacascrm", query = "SELECT c FROM Cabecerarecepcionmuestra c WHERE c.numplacascrm = :numplacascrm"),
    @NamedQuery(name = "Cabecerarecepcionmuestra.findByRefrigeracionmuestra", query = "SELECT c FROM Cabecerarecepcionmuestra c WHERE c.refrigeracionmuestra = :refrigeracionmuestra"),
    @NamedQuery(name = "Cabecerarecepcionmuestra.findByTempambientemuestra", query = "SELECT c FROM Cabecerarecepcionmuestra c WHERE c.tempambientemuestra = :tempambientemuestra"),
    @NamedQuery(name = "Cabecerarecepcionmuestra.findByCodigoestudiocrm", query = "SELECT c FROM Cabecerarecepcionmuestra c WHERE c.codigoestudiocrm = :codigoestudiocrm"),
    @NamedQuery(name = "Cabecerarecepcionmuestra.findByEstadoestudiocrm", query = "SELECT c FROM Cabecerarecepcionmuestra c WHERE c.estadoestudiocrm = :estadoestudiocrm"),
    @NamedQuery(name = "Cabecerarecepcionmuestra.findByRazonrechazocrm", query = "SELECT c FROM Cabecerarecepcionmuestra c WHERE c.razonrechazocrm = :razonrechazocrm"),
    @NamedQuery(name = "Cabecerarecepcionmuestra.findByFechacreacrm", query = "SELECT c FROM Cabecerarecepcionmuestra c WHERE c.fechacreacrm = :fechacreacrm"),
    @NamedQuery(name = "Cabecerarecepcionmuestra.findByIdusuariocreacrm", query = "SELECT c FROM Cabecerarecepcionmuestra c WHERE c.idusuariocreacrm = :idusuariocreacrm"),
    @NamedQuery(name = "Cabecerarecepcionmuestra.findByFechaactualizacrm", query = "SELECT c FROM Cabecerarecepcionmuestra c WHERE c.fechaactualizacrm = :fechaactualizacrm"),
    @NamedQuery(name = "Cabecerarecepcionmuestra.findByIdusuarioactualizacrm", query = "SELECT c FROM Cabecerarecepcionmuestra c WHERE c.idusuarioactualizacrm = :idusuarioactualizacrm")})
public class Cabecerarecepcionmuestra implements Serializable {

    @Size(max = 250)
    @Column(name = "diagnosticomacrosdrm")
    private String diagnosticomacrosdrm;
    @Column(name = "numerocasetas")
    private Integer numerocasetas;
    @Size(max = 250)
    @Column(name = "detallecaseta")
    private String detallecaseta;
    @Size(max = 250)
    @Column(name = "diagnosticotecnormaldrm")
    private String diagnosticotecnormaldrm;
    @Column(name = "opcionsolicnuevcortesdrm")
    private Boolean opcionsolicnuevcortesdrm;
    @Size(max = 200)
    @Column(name = "realizarnuevoscortes")
    private String realizarnuevoscortes;
    @Column(name = "numcortesdrm")
    private Integer numcortesdrm;
    @Size(max = 250)
    @Column(name = "observacionsolicnuevcortesdrm")
    private String observacionsolicnuevcortesdrm;
    @Size(max = 200)
    @Column(name = "estudioespecialdrm")
    private String estudioespecialdrm;
    @Size(max = 250)
    @Column(name = "observacionestudioespecialdrm")
    private String observacionestudioespecialdrm;
    @Column(name = "numerohedrm")
    private Integer numerohedrm;
    @Column(name = "numerogiemsasdrm")
    private Integer numerogiemsasdrm;
    @Column(name = "numeroplacasdrm")
    private Integer numeroplacasdrm;
    @Column(name = "numerocasetasdrm")
    private Integer numerocasetasdrm;
    @Column(name = "numerofragmentosdrm")
    private Integer numerofragmentosdrm;
    @Column(name = "numeropapdrm")
    private Integer numeropapdrm;
    @Size(max = 250)
    @Column(name = "observaciontnormaldrm")
    private String observaciontnormaldrm;
    @Column(name = "numeroplacastespecial")
    private Integer numeroplacastespecial;
    @Size(max = 150)
    @Column(name = "tincionespecial")
    private String tincionespecial;
    @Size(max = 250)
    @Column(name = "observaciontespecial")
    private String observaciontespecial;
    @Size(max = 100)
    @Column(name = "patologoasignado")
    private String patologoasignado;
    @Size(max = 20)
    @Column(name = "calidadmuestradrm")
    private String calidadmuestradrm;
    @Size(max = 150)
    @Column(name = "motivocalidadmuestradrm")
    private String motivocalidadmuestradrm;
    @Size(max = 250)
    @Column(name = "diagnosticomicrosdrm")
    private String diagnosticomicrosdrm;
    @Size(max = 250)
    @Column(name = "conclusiondiagnosticadrm")
    private String conclusiondiagnosticadrm;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcrm")
    private Integer idcrm;
    @Column(name = "fechatomamuestracrm")
    @Temporal(TemporalType.DATE)
    private Date fechatomamuestracrm;
    @Column(name = "horatomamuestracrm")
    @Temporal(TemporalType.TIME)
    private Date horatomamuestracrm;
    @Size(max = 50)
    @Column(name = "tiposervicio")
    private String tiposervicio;
    @Size(max = 17)
    @Column(name = "descriptiposerviciocrm")
    private String descriptiposerviciocrm;
    @Size(max = 200)
    @Column(name = "tratamientopacientecrm")
    private String tratamientopacientecrm;
    @Size(max = 30)
    @Column(name = "serviciocrm")
    private String serviciocrm;
    @Size(max = 30)
    @Column(name = "salacrm")
    private String salacrm;
    @Size(max = 5)
    @Column(name = "camacrm")
    private String camacrm;
    @Size(max = 50)
    @Column(name = "prioridad")
    private String prioridad;
    @Size(max = 250)
    @Column(name = "diagnosticopresunticocrm")
    private String diagnosticopresunticocrm;
    @Size(max = 250)
    @Column(name = "resumenclinicocrm")
    private String resumenclinicocrm;
    @Size(max = 250)
    @Column(name = "muestrapiezacrm")
    private String muestrapiezacrm;
    @Column(name = "numbloquescrm")
    private Integer numbloquescrm;
    @Column(name = "numplacascrm")
    private Integer numplacascrm;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "refrigeracionmuestra")
    private Double refrigeracionmuestra;
    @Column(name = "tempambientemuestra")
    private Double tempambientemuestra;
    @Size(max = 20)
    @Column(name = "codigoestudiocrm")
    private String codigoestudiocrm;
    @Size(max = 20)
    @Column(name = "estadoestudiocrm")
    private String estadoestudiocrm;
    @Size(max = 254)
    @Column(name = "razonrechazocrm")
    private String razonrechazocrm;
    @Column(name = "fechacreacrm")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechacreacrm;
    @Column(name = "idusuariocreacrm")
    private Integer idusuariocreacrm;
    @Column(name = "fechaactualizacrm")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaactualizacrm;
    @Column(name = "idusuarioactualizacrm")
    private Integer idusuarioactualizacrm;
    @JoinColumn(name = "iddoctor", referencedColumnName = "iddoctor")
    @ManyToOne(optional = false)
    private Doctor iddoctor;
    @JoinColumn(name = "idhospital", referencedColumnName = "idhospital")
    @ManyToOne(optional = false)
    private Hospital idhospital;
    @JoinColumn(name = "idpaciente", referencedColumnName = "idpaciente")
    @ManyToOne(optional = false)
    private Paciente idpaciente;
    @JoinColumn(name = "idte", referencedColumnName = "idte")
    @ManyToOne(optional = false)
    private Tipoestudio idte;

    public Cabecerarecepcionmuestra() {
    }

    public Cabecerarecepcionmuestra(Integer idcrm) {
        this.idcrm = idcrm;
    }

    public Integer getIdcrm() {
        return idcrm;
    }

    public void setIdcrm(Integer idcrm) {
        this.idcrm = idcrm;
    }

    public Date getFechatomamuestracrm() {
        return fechatomamuestracrm;
    }

    public void setFechatomamuestracrm(Date fechatomamuestracrm) {
        this.fechatomamuestracrm = fechatomamuestracrm;
    }

    public Date getHoratomamuestracrm() {
        return horatomamuestracrm;
    }

    public void setHoratomamuestracrm(Date horatomamuestracrm) {
        this.horatomamuestracrm = horatomamuestracrm;
    }

    public String getTiposervicio() {
        return tiposervicio;
    }

    public void setTiposervicio(String tiposervicio) {
        this.tiposervicio = tiposervicio;
    }

    public String getDescriptiposerviciocrm() {
        return descriptiposerviciocrm;
    }

    public void setDescriptiposerviciocrm(String descriptiposerviciocrm) {
        this.descriptiposerviciocrm = descriptiposerviciocrm;
    }

    public String getTratamientopacientecrm() {
        return tratamientopacientecrm;
    }

    public void setTratamientopacientecrm(String tratamientopacientecrm) {
        this.tratamientopacientecrm = tratamientopacientecrm;
    }

    public String getServiciocrm() {
        return serviciocrm;
    }

    public void setServiciocrm(String serviciocrm) {
        this.serviciocrm = serviciocrm;
    }

    public String getSalacrm() {
        return salacrm;
    }

    public void setSalacrm(String salacrm) {
        this.salacrm = salacrm;
    }

    public String getCamacrm() {
        return camacrm;
    }

    public void setCamacrm(String camacrm) {
        this.camacrm = camacrm;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getDiagnosticopresunticocrm() {
        return diagnosticopresunticocrm;
    }

    public void setDiagnosticopresunticocrm(String diagnosticopresunticocrm) {
        this.diagnosticopresunticocrm = diagnosticopresunticocrm;
    }

    public String getResumenclinicocrm() {
        return resumenclinicocrm;
    }

    public void setResumenclinicocrm(String resumenclinicocrm) {
        this.resumenclinicocrm = resumenclinicocrm;
    }

    public String getMuestrapiezacrm() {
        return muestrapiezacrm;
    }

    public void setMuestrapiezacrm(String muestrapiezacrm) {
        this.muestrapiezacrm = muestrapiezacrm;
    }

    public Integer getNumbloquescrm() {
        return numbloquescrm;
    }

    public void setNumbloquescrm(Integer numbloquescrm) {
        this.numbloquescrm = numbloquescrm;
    }

    public Integer getNumplacascrm() {
        return numplacascrm;
    }

    public void setNumplacascrm(Integer numplacascrm) {
        this.numplacascrm = numplacascrm;
    }

    public Double getRefrigeracionmuestra() {
        return refrigeracionmuestra;
    }

    public void setRefrigeracionmuestra(Double refrigeracionmuestra) {
        this.refrigeracionmuestra = refrigeracionmuestra;
    }

    public Double getTempambientemuestra() {
        return tempambientemuestra;
    }

    public void setTempambientemuestra(Double tempambientemuestra) {
        this.tempambientemuestra = tempambientemuestra;
    }

    public String getCodigoestudiocrm() {
        return codigoestudiocrm;
    }

    public void setCodigoestudiocrm(String codigoestudiocrm) {
        this.codigoestudiocrm = codigoestudiocrm;
    }

    public String getEstadoestudiocrm() {
        return estadoestudiocrm;
    }

    public void setEstadoestudiocrm(String estadoestudiocrm) {
        this.estadoestudiocrm = estadoestudiocrm;
    }

    public String getRazonrechazocrm() {
        return razonrechazocrm;
    }

    public void setRazonrechazocrm(String razonrechazocrm) {
        this.razonrechazocrm = razonrechazocrm;
    }

    public Date getFechacreacrm() {
        return fechacreacrm;
    }

    public void setFechacreacrm(Date fechacreacrm) {
        this.fechacreacrm = fechacreacrm;
    }

    public Integer getIdusuariocreacrm() {
        return idusuariocreacrm;
    }

    public void setIdusuariocreacrm(Integer idusuariocreacrm) {
        this.idusuariocreacrm = idusuariocreacrm;
    }

    public Date getFechaactualizacrm() {
        return fechaactualizacrm;
    }

    public void setFechaactualizacrm(Date fechaactualizacrm) {
        this.fechaactualizacrm = fechaactualizacrm;
    }

    public Integer getIdusuarioactualizacrm() {
        return idusuarioactualizacrm;
    }

    public void setIdusuarioactualizacrm(Integer idusuarioactualizacrm) {
        this.idusuarioactualizacrm = idusuarioactualizacrm;
    }

    public Doctor getIddoctor() {
        return iddoctor;
    }

    public void setIddoctor(Doctor iddoctor) {
        this.iddoctor = iddoctor;
    }

    public Hospital getIdhospital() {
        return idhospital;
    }

    public void setIdhospital(Hospital idhospital) {
        this.idhospital = idhospital;
    }

    public Paciente getIdpaciente() {
        return idpaciente;
    }

    public void setIdpaciente(Paciente idpaciente) {
        this.idpaciente = idpaciente;
    }

    public Tipoestudio getIdte() {
        return idte;
    }

    public void setIdte(Tipoestudio idte) {
        this.idte = idte;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcrm != null ? idcrm.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cabecerarecepcionmuestra)) {
            return false;
        }
        Cabecerarecepcionmuestra other = (Cabecerarecepcionmuestra) object;
        if ((this.idcrm == null && other.idcrm != null) || (this.idcrm != null && !this.idcrm.equals(other.idcrm))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.heee.bean.model.entity.Cabecerarecepcionmuestra[ idcrm=" + idcrm + " ]";
    }

    public String getDiagnosticomacrosdrm() {
        return diagnosticomacrosdrm;
    }

    public void setDiagnosticomacrosdrm(String diagnosticomacrosdrm) {
        this.diagnosticomacrosdrm = diagnosticomacrosdrm;
    }

    public Integer getNumerocasetas() {
        return numerocasetas;
    }

    public void setNumerocasetas(Integer numerocasetas) {
        this.numerocasetas = numerocasetas;
    }

    public String getDetallecaseta() {
        return detallecaseta;
    }

    public void setDetallecaseta(String detallecaseta) {
        this.detallecaseta = detallecaseta;
    }

    public String getDiagnosticotecnormaldrm() {
        return diagnosticotecnormaldrm;
    }

    public void setDiagnosticotecnormaldrm(String diagnosticotecnormaldrm) {
        this.diagnosticotecnormaldrm = diagnosticotecnormaldrm;
    }

    public Boolean getOpcionsolicnuevcortesdrm() {
        return opcionsolicnuevcortesdrm;
    }

    public void setOpcionsolicnuevcortesdrm(Boolean opcionsolicnuevcortesdrm) {
        this.opcionsolicnuevcortesdrm = opcionsolicnuevcortesdrm;
    }

    public String getRealizarnuevoscortes() {
        return realizarnuevoscortes;
    }

    public void setRealizarnuevoscortes(String realizarnuevoscortes) {
        this.realizarnuevoscortes = realizarnuevoscortes;
    }

    public Integer getNumcortesdrm() {
        return numcortesdrm;
    }

    public void setNumcortesdrm(Integer numcortesdrm) {
        this.numcortesdrm = numcortesdrm;
    }

    public String getObservacionsolicnuevcortesdrm() {
        return observacionsolicnuevcortesdrm;
    }

    public void setObservacionsolicnuevcortesdrm(String observacionsolicnuevcortesdrm) {
        this.observacionsolicnuevcortesdrm = observacionsolicnuevcortesdrm;
    }

    public String getEstudioespecialdrm() {
        return estudioespecialdrm;
    }

    public void setEstudioespecialdrm(String estudioespecialdrm) {
        this.estudioespecialdrm = estudioespecialdrm;
    }

    public String getObservacionestudioespecialdrm() {
        return observacionestudioespecialdrm;
    }

    public void setObservacionestudioespecialdrm(String observacionestudioespecialdrm) {
        this.observacionestudioespecialdrm = observacionestudioespecialdrm;
    }

    public Integer getNumerohedrm() {
        return numerohedrm;
    }

    public void setNumerohedrm(Integer numerohedrm) {
        this.numerohedrm = numerohedrm;
    }

    public Integer getNumerogiemsasdrm() {
        return numerogiemsasdrm;
    }

    public void setNumerogiemsasdrm(Integer numerogiemsasdrm) {
        this.numerogiemsasdrm = numerogiemsasdrm;
    }

    public Integer getNumeroplacasdrm() {
        return numeroplacasdrm;
    }

    public void setNumeroplacasdrm(Integer numeroplacasdrm) {
        this.numeroplacasdrm = numeroplacasdrm;
    }

    public Integer getNumerocasetasdrm() {
        return numerocasetasdrm;
    }

    public void setNumerocasetasdrm(Integer numerocasetasdrm) {
        this.numerocasetasdrm = numerocasetasdrm;
    }

    public Integer getNumerofragmentosdrm() {
        return numerofragmentosdrm;
    }

    public void setNumerofragmentosdrm(Integer numerofragmentosdrm) {
        this.numerofragmentosdrm = numerofragmentosdrm;
    }

    public Integer getNumeropapdrm() {
        return numeropapdrm;
    }

    public void setNumeropapdrm(Integer numeropapdrm) {
        this.numeropapdrm = numeropapdrm;
    }

    public String getObservaciontnormaldrm() {
        return observaciontnormaldrm;
    }

    public void setObservaciontnormaldrm(String observaciontnormaldrm) {
        this.observaciontnormaldrm = observaciontnormaldrm;
    }

    public Integer getNumeroplacastespecial() {
        return numeroplacastespecial;
    }

    public void setNumeroplacastespecial(Integer numeroplacastespecial) {
        this.numeroplacastespecial = numeroplacastespecial;
    }

    public String getTincionespecial() {
        return tincionespecial;
    }

    public void setTincionespecial(String tincionespecial) {
        this.tincionespecial = tincionespecial;
    }

    public String getObservaciontespecial() {
        return observaciontespecial;
    }

    public void setObservaciontespecial(String observaciontespecial) {
        this.observaciontespecial = observaciontespecial;
    }

    public String getPatologoasignado() {
        return patologoasignado;
    }

    public void setPatologoasignado(String patologoasignado) {
        this.patologoasignado = patologoasignado;
    }

    public String getCalidadmuestradrm() {
        return calidadmuestradrm;
    }

    public void setCalidadmuestradrm(String calidadmuestradrm) {
        this.calidadmuestradrm = calidadmuestradrm;
    }

    public String getMotivocalidadmuestradrm() {
        return motivocalidadmuestradrm;
    }

    public void setMotivocalidadmuestradrm(String motivocalidadmuestradrm) {
        this.motivocalidadmuestradrm = motivocalidadmuestradrm;
    }

    public String getDiagnosticomicrosdrm() {
        return diagnosticomicrosdrm;
    }

    public void setDiagnosticomicrosdrm(String diagnosticomicrosdrm) {
        this.diagnosticomicrosdrm = diagnosticomicrosdrm;
    }

    public String getConclusiondiagnosticadrm() {
        return conclusiondiagnosticadrm;
    }

    public void setConclusiondiagnosticadrm(String conclusiondiagnosticadrm) {
        this.conclusiondiagnosticadrm = conclusiondiagnosticadrm;
    }

    public void setPatologoasignado(int empladoID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
