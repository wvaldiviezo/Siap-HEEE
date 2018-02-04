/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heee.bean.estudiosTecnico;

import com.heee.bean.model.entity.Cabecerarecepcionmuestra;
import com.heee.bean.model.entity.Detallerecepcionmuestra;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author EPN
 */
@ManagedBean(name = "registrarEstudioTN")
@SessionScoped
public class RegistrarEstudioTN implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private Cabecerarecepcionmuestra cabeceraRM;
    private Detallerecepcionmuestra detalleRM;
    
    public RegistrarEstudioTN (){
        this.cabeceraRM = new Cabecerarecepcionmuestra();
        this.detalleRM = new Detallerecepcionmuestra ();
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
