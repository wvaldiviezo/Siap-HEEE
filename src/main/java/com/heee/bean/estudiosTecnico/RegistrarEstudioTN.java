package com.heee.bean.estudiosTecnico;

import com.heee.bean.model.entity.Cabecerarecepcionmuestra;
//import com.heee.bean.model.entity.Detallerecepcionmuestra;
import com.heee.bean.model.entity.Empleado;
import com.heee.bean.model.jpa.JPAFactoryDAO;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
//import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.view.ViewScoped;

@ManagedBean(name = "registrarEstudioTN")
//@RequestScoped
@ViewScoped
@SessionScoped
public class RegistrarEstudioTN implements Serializable {

    private static final long serialVersionUID = 1L;

    private Cabecerarecepcionmuestra cabeceraRM;
    private Cabecerarecepcionmuestra cabeceraRMfecha;
    //private Detallerecepcionmuestra detalleRM;

    private Empleado empleado;
    private int empladoID;
    List<Empleado> ltsEmpleados;

    private int numeroHE;
    private int numeroGiemsas;
    private int numeroPlacas;
    private int numeroCasetas;
    private int numeroFragmentos;
    private int numeroPAP;
    private String observacionTN;
    private Date fechaCreaAreaTecnica = new Date();
    private String patologoAsignado;

    public RegistrarEstudioTN() {
        //this.cabeceraRM = new Cabecerarecepcionmuestra();
        //this.detalleRM = new Detallerecepcionmuestra ();
        this.empladoID = 0;
        this.empleado = new Empleado();
        this.ltsEmpleados = null;
        numeroHE = 0;
        numeroGiemsas = 0;
        numeroCasetas = 0;
        numeroFragmentos = 0;
        numeroPAP = 0;
        observacionTN = "";

    }

    /*Metodo para registrar la descripción del técnico normal del estudio seleccionado*/
    public void registrarDesripcionTN() {
        cabeceraRM.setEstadoestudiocrm("Microscopia");
        cabeceraRM.setPatologoasignado(patologoAsignado);
        JPAFactoryDAO.getFactory().getCabecerarecepcionmuestraDAO().update(this.cabeceraRM);

    }

    //Getters & Setters
    public Cabecerarecepcionmuestra getCabeceraRM() {
        return cabeceraRM;
    }

    public void setCabeceraRM(Cabecerarecepcionmuestra cabeceraRM) {
        this.cabeceraRM = cabeceraRM;
    }

//    public Detallerecepcionmuestra getDetalleRM() {
//        return detalleRM;
//    }
//
//    public void setDetalleRM(Detallerecepcionmuestra detalleRM) {
//        this.detalleRM = detalleRM;
//    }
    public int getNumeroHE() {
        return numeroHE;
    }

    public void setNumeroHE(int numeroHE) {
        this.numeroHE = numeroHE;
    }

    public int getNumeroGiemsas() {
        return numeroGiemsas;
    }

    public void setNumeroGiemsas(int numeroGiemsas) {
        this.numeroGiemsas = numeroGiemsas;
    }

    public int getNumeroPlacas() {
        return numeroPlacas;
    }

    public void setNumeroPlacas(int numeroPlacas) {
        this.numeroPlacas = numeroPlacas;
    }

    public int getNumeroCasetas() {
        return numeroCasetas;
    }

    public void setNumeroCasetas(int numeroCasetas) {
        this.numeroCasetas = numeroCasetas;
    }

    public int getNumeroFragmentos() {
        return numeroFragmentos;
    }

    public void setNumeroFragmentos(int numeroFragmentos) {
        this.numeroFragmentos = numeroFragmentos;
    }

    public int getNumeroPAP() {
        return numeroPAP;
    }

    public void setNumeroPAP(int numeroPAP) {
        this.numeroPAP = numeroPAP;
    }

    public String getObservacionTN() {
        return observacionTN;
    }

    public void setObservacionTN(String observacionTN) {
        this.observacionTN = observacionTN;
    }

    public Date getFechaCreaAreaTecnica() {
        return fechaCreaAreaTecnica;
    }

    public void setFechaCreaAreaTecnica(Date fechaCreaAreaTecnica) {
        this.fechaCreaAreaTecnica = fechaCreaAreaTecnica;
    }

    public String getPatologoAsignado() {
        return patologoAsignado;
    }

    public void setPatologoAsignado(String patologoAsignado) {
        this.patologoAsignado = patologoAsignado;
    }

    public Cabecerarecepcionmuestra getCabeceraRMfecha() {
        return cabeceraRMfecha;
    }

    public void setCabeceraRMfecha(Cabecerarecepcionmuestra cabeceraRMfecha) {
        this.cabeceraRMfecha = cabeceraRMfecha;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public int getEmpladoID() {
        return empladoID;
    }

    public void setEmpladoID(int empladoID) {
        this.empladoID = empladoID;
    }

    public List<Empleado> getLtsEmpleados() {
        ltsEmpleados = JPAFactoryDAO.getFactory().getEmpleadoDAO().find();
        return ltsEmpleados;
    }

    public void setLtsEmpleados(List<Empleado> ltsEmpleados) {
        this.ltsEmpleados = ltsEmpleados;
    }

}
