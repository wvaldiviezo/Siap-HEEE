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
 * @author MPCS
 */
@Entity
@Table(name = "detallerecepcionmuestra")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Detallerecepcionmuestra.findAll", query = "SELECT d FROM Detallerecepcionmuestra d")
    , @NamedQuery(name = "Detallerecepcionmuestra.findByIddrm", query = "SELECT d FROM Detallerecepcionmuestra d WHERE d.iddrm = :iddrm")
																																		
    , @NamedQuery(name = "Detallerecepcionmuestra.findByCodigobarras", query = "SELECT d FROM Detallerecepcionmuestra d WHERE d.codigobarras = :codigobarras")
    , @NamedQuery(name = "Detallerecepcionmuestra.findByDiagnosticomacrosdrm", query = "SELECT d FROM Detallerecepcionmuestra d WHERE d.diagnosticomacrosdrm = :diagnosticomacrosdrm")
    , @NamedQuery(name = "Detallerecepcionmuestra.findByNumerocasetas", query = "SELECT d FROM Detallerecepcionmuestra d WHERE d.numerocasetas = :numerocasetas")
    , @NamedQuery(name = "Detallerecepcionmuestra.findByDetallecaseta", query = "SELECT d FROM Detallerecepcionmuestra d WHERE d.detallecaseta = :detallecaseta")
    , @NamedQuery(name = "Detallerecepcionmuestra.findByDiagnosticotecnormaldrm", query = "SELECT d FROM Detallerecepcionmuestra d WHERE d.diagnosticotecnormaldrm = :diagnosticotecnormaldrm")
    , @NamedQuery(name = "Detallerecepcionmuestra.findByCalidadmuestradrm", query = "SELECT d FROM Detallerecepcionmuestra d WHERE d.calidadmuestradrm = :calidadmuestradrm")
    , @NamedQuery(name = "Detallerecepcionmuestra.findByMotivocalidadmuestradrm", query = "SELECT d FROM Detallerecepcionmuestra d WHERE d.motivocalidadmuestradrm = :motivocalidadmuestradrm")
    , @NamedQuery(name = "Detallerecepcionmuestra.findByDiagnosticomicrosdrm", query = "SELECT d FROM Detallerecepcionmuestra d WHERE d.diagnosticomicrosdrm = :diagnosticomicrosdrm")
    , @NamedQuery(name = "Detallerecepcionmuestra.findByOpcionsolicnuevcortesdrm", query = "SELECT d FROM Detallerecepcionmuestra d WHERE d.opcionsolicnuevcortesdrm = :opcionsolicnuevcortesdrm")
    , @NamedQuery(name = "Detallerecepcionmuestra.findByRealizarnuevoscortes", query = "SELECT d FROM Detallerecepcionmuestra d WHERE d.realizarnuevoscortes = :realizarnuevoscortes")
    , @NamedQuery(name = "Detallerecepcionmuestra.findByNumcortesdrm", query = "SELECT d FROM Detallerecepcionmuestra d WHERE d.numcortesdrm = :numcortesdrm")
    , @NamedQuery(name = "Detallerecepcionmuestra.findByObservacionsolicnuevcortesdrm", query = "SELECT d FROM Detallerecepcionmuestra d WHERE d.observacionsolicnuevcortesdrm = :observacionsolicnuevcortesdrm")
    , @NamedQuery(name = "Detallerecepcionmuestra.findByConclusiondiagnosticadrm", query = "SELECT d FROM Detallerecepcionmuestra d WHERE d.conclusiondiagnosticadrm = :conclusiondiagnosticadrm")
    , @NamedQuery(name = "Detallerecepcionmuestra.findByEstudioespecialdrm", query = "SELECT d FROM Detallerecepcionmuestra d WHERE d.estudioespecialdrm = :estudioespecialdrm")
    , @NamedQuery(name = "Detallerecepcionmuestra.findByObservacionestudioespecialdrm", query = "SELECT d FROM Detallerecepcionmuestra d WHERE d.observacionestudioespecialdrm = :observacionestudioespecialdrm")
    , @NamedQuery(name = "Detallerecepcionmuestra.findByEstadoestudiodrm", query = "SELECT d FROM Detallerecepcionmuestra d WHERE d.estadoestudiodrm = :estadoestudiodrm")
    , @NamedQuery(name = "Detallerecepcionmuestra.findByFechacreadrm", query = "SELECT d FROM Detallerecepcionmuestra d WHERE d.fechacreadrm = :fechacreadrm")
    , @NamedQuery(name = "Detallerecepcionmuestra.findByIdusuariocreadrm", query = "SELECT d FROM Detallerecepcionmuestra d WHERE d.idusuariocreadrm = :idusuariocreadrm")
    , @NamedQuery(name = "Detallerecepcionmuestra.findByFechaactualizadrm", query = "SELECT d FROM Detallerecepcionmuestra d WHERE d.fechaactualizadrm = :fechaactualizadrm")
    , @NamedQuery(name = "Detallerecepcionmuestra.findByIdusuarioactualizadrm", query = "SELECT d FROM Detallerecepcionmuestra d WHERE d.idusuarioactualizadrm = :idusuarioactualizadrm")
    , @NamedQuery(name = "Detallerecepcionmuestra.findByFechacreamacroscopia", query = "SELECT d FROM Detallerecepcionmuestra d WHERE d.fechacreamacroscopia = :fechacreamacroscopia")
    , @NamedQuery(name = "Detallerecepcionmuestra.findByUsuaruicreamacroscopia", query = "SELECT d FROM Detallerecepcionmuestra d WHERE d.usuaruicreamacroscopia = :usuaruicreamacroscopia")
    , @NamedQuery(name = "Detallerecepcionmuestra.findByFechacreaareatecnica", query = "SELECT d FROM Detallerecepcionmuestra d WHERE d.fechacreaareatecnica = :fechacreaareatecnica")
    , @NamedQuery(name = "Detallerecepcionmuestra.findByUsuariocreaareatecnica", query = "SELECT d FROM Detallerecepcionmuestra d WHERE d.usuariocreaareatecnica = :usuariocreaareatecnica")
    , @NamedQuery(name = "Detallerecepcionmuestra.findByFechacreapatologo", query = "SELECT d FROM Detallerecepcionmuestra d WHERE d.fechacreapatologo = :fechacreapatologo")
    , @NamedQuery(name = "Detallerecepcionmuestra.findByUsuariocreapatologo", query = "SELECT d FROM Detallerecepcionmuestra d WHERE d.usuariocreapatologo = :usuariocreapatologo")
    , @NamedQuery(name = "Detallerecepcionmuestra.findByNumerohedrm", query = "SELECT d FROM Detallerecepcionmuestra d WHERE d.numerohedrm = :numerohedrm")
    , @NamedQuery(name = "Detallerecepcionmuestra.findByNumerogiemsasdrm", query = "SELECT d FROM Detallerecepcionmuestra d WHERE d.numerogiemsasdrm = :numerogiemsasdrm")
    , @NamedQuery(name = "Detallerecepcionmuestra.findByNumeroplacasdrm", query = "SELECT d FROM Detallerecepcionmuestra d WHERE d.numeroplacasdrm = :numeroplacasdrm")
    , @NamedQuery(name = "Detallerecepcionmuestra.findByNumerocasetasdrm", query = "SELECT d FROM Detallerecepcionmuestra d WHERE d.numerocasetasdrm = :numerocasetasdrm")
    , @NamedQuery(name = "Detallerecepcionmuestra.findByNumerofragmentosdrm", query = "SELECT d FROM Detallerecepcionmuestra d WHERE d.numerofragmentosdrm = :numerofragmentosdrm")
    , @NamedQuery(name = "Detallerecepcionmuestra.findByNumeropapdrm", query = "SELECT d FROM Detallerecepcionmuestra d WHERE d.numeropapdrm = :numeropapdrm")
    , @NamedQuery(name = "Detallerecepcionmuestra.findByObservaciontnormaldrm", query = "SELECT d FROM Detallerecepcionmuestra d WHERE d.observaciontnormaldrm = :observaciontnormaldrm")
    , @NamedQuery(name = "Detallerecepcionmuestra.findByNumeroplacastespecial", query = "SELECT d FROM Detallerecepcionmuestra d WHERE d.numeroplacastespecial = :numeroplacastespecial")
    , @NamedQuery(name = "Detallerecepcionmuestra.findByTincionespecial", query = "SELECT d FROM Detallerecepcionmuestra d WHERE d.tincionespecial = :tincionespecial")
    , @NamedQuery(name = "Detallerecepcionmuestra.findByObservaciontespecial", query = "SELECT d FROM Detallerecepcionmuestra d WHERE d.observaciontespecial = :observaciontespecial")
    , @NamedQuery(name = "Detallerecepcionmuestra.findByPatologoasignado", query = "SELECT d FROM Detallerecepcionmuestra d WHERE d.patologoasignado = :patologoasignado")})
public class Detallerecepcionmuestra implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iddrm")
    private Integer iddrm;
							
			
						   
					  
    @Size(max = 13)
    @Column(name = "codigobarras")
    private String codigobarras;
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
    @Size(max = 20)
    @Column(name = "calidadmuestradrm")
    private String calidadmuestradrm;
    @Size(max = 150)
    @Column(name = "motivocalidadmuestradrm")
    private String motivocalidadmuestradrm;
    @Size(max = 250)
    @Column(name = "diagnosticomicrosdrm")
    private String diagnosticomicrosdrm;
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
    @Size(max = 250)
    @Column(name = "conclusiondiagnosticadrm")
    private String conclusiondiagnosticadrm;
    @Size(max = 200)
    @Column(name = "estudioespecialdrm")
    private String estudioespecialdrm;
    @Size(max = 250)
    @Column(name = "observacionestudioespecialdrm")
    private String observacionestudioespecialdrm;
    @Column(name = "estadoestudiodrm")
    private Boolean estadoestudiodrm;
    @Column(name = "fechacreadrm")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechacreadrm;
    @Column(name = "idusuariocreadrm")
    private Integer idusuariocreadrm;
    @Column(name = "fechaactualizadrm")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaactualizadrm;
    @Column(name = "idusuarioactualizadrm")
    private Integer idusuarioactualizadrm;
    @Column(name = "fechacreamacroscopia")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechacreamacroscopia;
    @Column(name = "usuaruicreamacroscopia")
    private Integer usuaruicreamacroscopia;
    @Column(name = "fechacreaareatecnica")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechacreaareatecnica;
    @Column(name = "usuariocreaareatecnica")
    private Integer usuariocreaareatecnica;
    @Column(name = "fechacreapatologo")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechacreapatologo;
    @Column(name = "usuariocreapatologo")
    private Integer usuariocreapatologo;
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
    @JoinColumn(name = "idcrm", referencedColumnName = "idcrm")
    @ManyToOne(optional = false)
    private Cabecerarecepcionmuestra idcrm;

    public Detallerecepcionmuestra() {
    }

    public Detallerecepcionmuestra(Integer iddrm) {
        this.iddrm = iddrm;
    }

															  
						   
						   
	 

    public Integer getIddrm() {
        return iddrm;
    }

    public void setIddrm(Integer iddrm) {
        this.iddrm = iddrm;
    }

						   
					 
	 

									 
						   
	 

    public String getCodigobarras() {
        return codigobarras;
    }

    public void setCodigobarras(String codigobarras) {
        this.codigobarras = codigobarras;
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

    public String getConclusiondiagnosticadrm() {
        return conclusiondiagnosticadrm;
    }

    public void setConclusiondiagnosticadrm(String conclusiondiagnosticadrm) {
        this.conclusiondiagnosticadrm = conclusiondiagnosticadrm;
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

    public Boolean getEstadoestudiodrm() {
        return estadoestudiodrm;
    }

    public void setEstadoestudiodrm(Boolean estadoestudiodrm) {
        this.estadoestudiodrm = estadoestudiodrm;
    }

    public Date getFechacreadrm() {
        return fechacreadrm;
    }

    public void setFechacreadrm(Date fechacreadrm) {
        this.fechacreadrm = fechacreadrm;
    }

    public Integer getIdusuariocreadrm() {
        return idusuariocreadrm;
    }

    public void setIdusuariocreadrm(Integer idusuariocreadrm) {
        this.idusuariocreadrm = idusuariocreadrm;
    }

    public Date getFechaactualizadrm() {
        return fechaactualizadrm;
    }

    public void setFechaactualizadrm(Date fechaactualizadrm) {
        this.fechaactualizadrm = fechaactualizadrm;
    }

    public Integer getIdusuarioactualizadrm() {
        return idusuarioactualizadrm;
    }

    public void setIdusuarioactualizadrm(Integer idusuarioactualizadrm) {
        this.idusuarioactualizadrm = idusuarioactualizadrm;
    }

    public Date getFechacreamacroscopia() {
        return fechacreamacroscopia;
    }

    public void setFechacreamacroscopia(Date fechacreamacroscopia) {
        this.fechacreamacroscopia = fechacreamacroscopia;
    }

    public Integer getUsuaruicreamacroscopia() {
        return usuaruicreamacroscopia;
    }

    public void setUsuaruicreamacroscopia(Integer usuaruicreamacroscopia) {
        this.usuaruicreamacroscopia = usuaruicreamacroscopia;
    }

    public Date getFechacreaareatecnica() {
        return fechacreaareatecnica;
    }

    public void setFechacreaareatecnica(Date fechacreaareatecnica) {
        this.fechacreaareatecnica = fechacreaareatecnica;
    }

    public Integer getUsuariocreaareatecnica() {
        return usuariocreaareatecnica;
    }

    public void setUsuariocreaareatecnica(Integer usuariocreaareatecnica) {
        this.usuariocreaareatecnica = usuariocreaareatecnica;
    }

    public Date getFechacreapatologo() {
        return fechacreapatologo;
    }

    public void setFechacreapatologo(Date fechacreapatologo) {
        this.fechacreapatologo = fechacreapatologo;
    }

    public Integer getUsuariocreapatologo() {
        return usuariocreapatologo;
    }

    public void setUsuariocreapatologo(Integer usuariocreapatologo) {
        this.usuariocreapatologo = usuariocreapatologo;
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

    public Cabecerarecepcionmuestra getIdcrm() {
        return idcrm;
    }

    public void setIdcrm(Cabecerarecepcionmuestra idcrm) {
        this.idcrm = idcrm;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddrm != null ? iddrm.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detallerecepcionmuestra)) {
            return false;
        }
        Detallerecepcionmuestra other = (Detallerecepcionmuestra) object;
        if ((this.iddrm == null && other.iddrm != null) || (this.iddrm != null && !this.iddrm.equals(other.iddrm))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.heee.bean.model.entity.Detallerecepcionmuestra[ iddrm=" + iddrm + " ]";
    }

															   
																																	   
	 
    
}
