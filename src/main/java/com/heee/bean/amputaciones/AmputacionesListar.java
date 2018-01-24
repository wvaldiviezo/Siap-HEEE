/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heee.bean.amputaciones;

import com.heee.bean.menu.Navegar;
import com.heee.bean.ubicacion.UbicacionListar;
import com.heee.bean.model.entity.Extremidades;
import com.heee.bean.model.entity.Partes;
import com.heee.bean.model.jpa.JPAFactoryDAO;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;

/**
 *
 * @author mpcs
 */
@ManagedBean(name = "amputacionesListar")
@ViewScoped
@SessionScoped
public class AmputacionesListar implements Serializable {

    private UbicacionListar ubicacionListar;
    private Navegar navegar;
    private String extremidadesID;
    private String parteID;

    List<Extremidades> listaExtremidades;
    List<Partes> listaPartes;

    /**
     * Creates a new instance of AmputacionesListar
     */
    public AmputacionesListar() {
        ubicacionListar = new UbicacionListar();
        navegar = new Navegar();
        extremidadesID = "0";
        parteID= "0";
        listaExtremidades = null;
        listaExtremidades = null;
        listarExtremidades();
    }

    public void listarExtremidades() {

        listaExtremidades = JPAFactoryDAO.getFactory().getExtremidadDAO().find();

    }

    public void resetCombo() {
//        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "Ingrese los datos del nuevo estudio."));
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,"Mensaje:", "Ingrese los nuevos datos del estudio");
        FacesContext.getCurrentInstance().addMessage(null, message);

        extremidadesID = "0";
        parteID="0";
        listaExtremidades = null;
        listarExtremidades();
        
        
        ubicacionListar.resetCombo();
    
    }

    public String getParteID() {
        return parteID;
    }

    //getter and setter
    public void setParteID(String parteID) {
        this.parteID = parteID;
    }

    public String getExtremidadesID() {
        return extremidadesID;
    }

    public void setExtremidadesID(String extremidadesID) {
        this.extremidadesID = extremidadesID;
    }

    public List<Extremidades> getListaExtremidades() {
        return listaExtremidades;
    }

    public void setListaExtremidades(List<Extremidades> listaExtremidades) {
        this.listaExtremidades = listaExtremidades;
    }

    public List<Partes> getListaPartes() {
        listaPartes = JPAFactoryDAO.getFactory().getParteDAO().buscarPartePorExtremidad(extremidadesID);
        System.out.println("informacion de extremidadID:" + extremidadesID);
      
        return listaPartes;
    }

    public void setListaPartes(List<Partes> listaPartes) {
        this.listaPartes = listaPartes;
    }

}
