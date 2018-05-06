/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heee.bean.estudiosMicroscopia;

import com.heee.bean.model.entity.Cabecerarecepcionmuestra;
import com.heee.bean.model.entity.Detallerecepcionmuestra;
import com.heee.bean.model.jpa.JPAFactoryDAO;
import java.io.Serializable;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "registrarMicroscopia")
@SessionScoped
public class RegistrarMicroscopia implements Serializable {

    private static final long serialVersionUID = 1L;

    private Cabecerarecepcionmuestra cabeceraRM;
    private Detallerecepcionmuestra detalleRM;

    private String calidadMuestra;
    private String ObservacionMuestra;
    private String descripcionMicroscopia;
    private String conclusionDiagnostica;

    private Date fechaCreacionMicro = new Date();

    /*Método constructor*/
    public RegistrarMicroscopia() {
        this.cabeceraRM = new Cabecerarecepcionmuestra();
        this.detalleRM = new Detallerecepcionmuestra();
        this.calidadMuestra = "";
        this.ObservacionMuestra = "";
        this.descripcionMicroscopia = "";
        this.conclusionDiagnostica = "";
    }
    
    /*Metodo para registrar la microscopía del estudio seleccionado*/
    public void registrarMicro(){
        //detalleRM.setIddrm(this.detalleRM);
        detalleRM.setIdcrm(cabeceraRM);
        detalleRM.setCalidadmuestradrm(this.calidadMuestra);
        detalleRM.setMotivocalidadmuestradrm(this.ObservacionMuestra);//Observación
        detalleRM.setDiagnosticomicrosdrm(this.descripcionMicroscopia);
        detalleRM.setConclusiondiagnosticadrm(this.conclusionDiagnostica);
        detalleRM.setFechacreapatologo(this.fechaCreacionMicro);
        
        JPAFactoryDAO.getFactory().getDetallerecepcionmuestraDAO().create(this.detalleRM);
        cabeceraRM.setEstadoestudiocrm("Liberado");
        cabeceraRM.setFechaactualizacrm(this.fechaCreacionMicro);
        JPAFactoryDAO.getFactory().getDetallerecepcionmuestraDAO().update(this.detalleRM);
        
        
    }
    
    //Getters & Setters

    public Cabecerarecepcionmuestra getCabeceraRM() {
        return cabeceraRM;
    }

    public void setCabeceraRM(Cabecerarecepcionmuestra cabeceraRM) {
        this.cabeceraRM = cabeceraRM;
    }

    public Detallerecepcionmuestra getDetalleRM() {
        return detalleRM;
    }

    public void setDetalleRM(Detallerecepcionmuestra detalleRM) {
        this.detalleRM = detalleRM;
    }

    public String getCalidadMuestra() {
        return calidadMuestra;
    }

    public void setCalidadMuestra(String calidadMuestra) {
        this.calidadMuestra = calidadMuestra;
    }

    public String getObservacionMuestra() {
        return ObservacionMuestra;
    }

    public void setObservacionMuestra(String ObservacionMuestra) {
        this.ObservacionMuestra = ObservacionMuestra;
    }

    public String getDescripcionMicroscopia() {
        return descripcionMicroscopia;
    }

    public void setDescripcionMicroscopia(String descripcionMicroscopia) {
        this.descripcionMicroscopia = descripcionMicroscopia;
    }

    public String getConclusionDiagnostica() {
        return conclusionDiagnostica;
    }

    public void setConclusionDiagnostica(String conclusionDiagnostica) {
        this.conclusionDiagnostica = conclusionDiagnostica;
    }

    public Date getFechaCreacionMicro() {
        return fechaCreacionMicro;
    }

    public void setFechaCreacionMicro(Date fechaCreacionMicro) {
        this.fechaCreacionMicro = fechaCreacionMicro;
    }
    
    
}
