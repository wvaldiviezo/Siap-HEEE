package com.heee.bean.estudiosTecnico;

import com.heee.bean.model.entity.Cabecerarecepcionmuestra;
import com.heee.bean.model.entity.Detallerecepcionmuestra;
import com.heee.bean.model.jpa.JPAFactoryDAO;
import java.io.Serializable;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "registrarEstudioTN")
//@RequestScoped
@SessionScoped
public class RegistrarEstudioTN implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private Cabecerarecepcionmuestra cabeceraRM;
    private Detallerecepcionmuestra detalleRM;
    
    private int numeroHE;
    private int numeroGiemsas;
    private int numeroPlacas;
    private int numeroCasetas;
    private int numeroFragmentos;
    private int numeroPAP;
    private String observacionTN;
    private Date fechaCreaAreaTecnica = new Date();
    
    
    public RegistrarEstudioTN (){
        this.cabeceraRM = new Cabecerarecepcionmuestra();
        this.detalleRM = new Detallerecepcionmuestra ();
        this.numeroHE = 0;
        this.numeroGiemsas = 0;
        this.numeroPlacas = 0;
        this.numeroCasetas = 0;
        this.numeroFragmentos = 0;
        this.numeroPAP = 0;
        this.observacionTN = "";
    }
    
    /*Metodo para registrar la descripción del técnico normal del estudio seleccionado*/
    public void registrarDesripcionTN() {
        //Obtener el id del estudio para poder actualizarlo
        //detalleRM.setIddrm(this.detalleRM.getIddrm());
        System.out.println("****cabeecera:"+cabeceraRM.getCodigoestudiocrm());
        System.out.println("****cabeecera:"+cabeceraRM.getIdcrm());
        detalleRM.setIdcrm(cabeceraRM);
        detalleRM.setNumerohedrm(this.numeroHE);
        detalleRM.setNumerogiemsasdrm(this.numeroGiemsas);
        detalleRM.setNumeroplacasdrm(this.numeroPlacas);
        detalleRM.setNumerocasetasdrm(this.numeroCasetas);
        detalleRM.setNumerofragmentosdrm(this.numeroFragmentos);
        detalleRM.setNumeroplacasdrm(this.numeroPlacas);
        detalleRM.setDiagnosticotecnormaldrm(observacionTN);
        detalleRM.setFechacreaareatecnica(this.fechaCreaAreaTecnica);
        //Falta setear el ESTADO para que vaya hacia el tecnico que se requiere
        
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
    
    
}
