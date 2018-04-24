package com.heee.bean.estudiosTecnico;

import com.heee.bean.model.entity.Cabecerarecepcionmuestra;
import com.heee.bean.model.entity.Detallerecepcionmuestra;
import com.heee.bean.model.jpa.JPAFactoryDAO;
import java.io.Serializable;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "registrarEstudioTE")
@SessionScoped
public class RegistrarEstudioTE implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private Cabecerarecepcionmuestra cabeceraRM;
    private Detallerecepcionmuestra detalleRM;
    
    private int numeroPlacas;
    private String tincionEspecial;
    private String observacionTE;
    private Date fechaCreaAreaTecnicaE = new Date();
    
    
    public RegistrarEstudioTE (){
        this.cabeceraRM = new Cabecerarecepcionmuestra();
        this.detalleRM = new Detallerecepcionmuestra ();
        this.numeroPlacas = 0;
        this.tincionEspecial = "";
        this.observacionTE = "";
    }
    
    /*Metodo para registrar la descripción del técnico normal del estudio seleccionado*/
    public void registrarDesripcionTE() {
        //Obtener el id del estudio para poder actualizarlo
        //detalleRM.setIddrm(this.detalleRM.getIddrm());
        
        ////detalleRM.setNumerohedrm(this.numeroCortes);
        detalleRM.setNumeroplacasdrm(this.numeroPlacas);
        detalleRM.setTincionespecial(this.tincionEspecial);
        detalleRM.setObservaciontespecial(this.observacionTE);

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
