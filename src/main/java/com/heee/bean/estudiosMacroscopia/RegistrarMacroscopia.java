package com.heee.bean.estudiosMacroscopia;

import com.heee.bean.model.entity.Cabecerarecepcionmuestra;
import com.heee.bean.model.entity.Detallerecepcionmuestra;
import com.heee.bean.model.entity.Tipoestudio;
import com.heee.bean.model.jpa.JPAFactoryDAO;
import com.heee.bean.model.jpa.JPATipoEstudioDAO;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "registrarMacroscopia")
@SessionScoped
public class RegistrarMacroscopia implements Serializable {

    private static final long serialVersionUID = 1L;

    private Cabecerarecepcionmuestra cabeceraRM;
    private Detallerecepcionmuestra detalleRM;

    private int numeroCasetas;
    private String detalleCaseta;
    private String descripcionMacroscopia;

    /*Método constructor*/
    public RegistrarMacroscopia() {
        this.detalleRM = new Detallerecepcionmuestra();
        this.numeroCasetas = 0;
        this.detalleCaseta = "";
        this.descripcionMacroscopia = "";
    }

    /*Metodo para registrar la macroscopía del estudio seleccionado*/
    public void registrarMacro() {
        detalleRM.setIdcrm(this.cabeceraRM);
        detalleRM.setNumerocasetas(this.numeroCasetas);
        detalleRM.setDetallecaseta(this.detalleCaseta);
        detalleRM.setDiagnosticomacrosdrm(this.descripcionMacroscopia);
        
        JPAFactoryDAO.getFactory().getDetallerecepcionmuestraDAO().create(this.detalleRM);
        cabeceraRM.setEstadoestudiocrm("Tecnico");
        JPAFactoryDAO.getFactory().getCabecerarecepcionmuestraDAO().update(this.cabeceraRM);
        
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

    public int getNumeroCasetas() {
        return numeroCasetas;
    }

    public void setNumeroCasetas(int numeroCasetas) {
        this.numeroCasetas = numeroCasetas;
    }

    public String getDetalleCaseta() {
        return detalleCaseta;
    }

    public void setDetalleCaseta(String detalleCaseta) {
        this.detalleCaseta = detalleCaseta;
    }

    public String getDescripcionMacroscopia() {
        return descripcionMacroscopia;
    }

    public void setDescripcionMacroscopia(String descripcionMacroscopia) {
        this.descripcionMacroscopia = descripcionMacroscopia;
    }

}
