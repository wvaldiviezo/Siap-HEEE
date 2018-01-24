/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heee.bean.ubicacion;

import com.heee.bean.model.entity.Canton;
import com.heee.bean.model.entity.Parroquia;
import com.heee.bean.model.entity.Provincia;
import com.heee.bean.model.jpa.JPAFactoryDAO;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author mpcs
 */
@ManagedBean(name = "ubicacionListar")
@SessionScoped
public class UbicacionListar implements Serializable {

    String provinciaID;
    String cantonID;
    String parroquiaID;

    List<Provincia> provincias;
    List<Canton> cantones;
    List<Parroquia> parroquias;

    public UbicacionListar() {
        provinciaID = "0";
        cantonID = "0";
        parroquiaID = "0";
        provincias = null;
        cantones = null;
        parroquias = null;

        listarProvincia();

    }

    //Metodo para listar todas las provincias
    public void listarProvincia() {
        provincias = JPAFactoryDAO.getFactory().getProvinciaDAO().find();
//    for(int i=0;i<provincias.size();i++ ){
//    System.out.println("lista:"+provincias.get(i).getNombreprovincia());
//    }
    }
    

    public void resetCombo() {
        System.out.println("resetear ubicacion");
        provinciaID = "";
        cantonID = "";
        parroquiaID = "";
        cantones = null;
        parroquias = null;
        listarProvincia();
    }
    //getter and setter

    public String getParroquiaID() {
        return parroquiaID;
    }

    public void setParroquiaID(String parroquiaID) {
        this.parroquiaID = parroquiaID;
    }

    public String getProvinciaID() {
        return provinciaID;
    }

    public void setProvinciaID(String provinciaID) {
        this.provinciaID = provinciaID;
    }

    public String getCantonID() {
        return cantonID;
    }

    public void setCantonID(String cantonID) {
        this.cantonID = cantonID;
    }

    public List<Provincia> getProvincias() {
        return provincias;
    }

    public void setProvincias(List<Provincia> provincias) {
        this.provincias = provincias;
    }

    public List<Canton> getCantones() {
        System.out.println("informacion de provincia:" + provinciaID);
        cantones = JPAFactoryDAO.getFactory().getCantonDAO().buscarCantonPorProvincia(provinciaID);
        return cantones;
    }

    public void setCantones(List<Canton> cantones) {
        this.cantones = cantones;
    }

    public List<Parroquia> getParroquias() {

        System.out.println("informacion de canton:" + cantonID);
        System.out.println("informacion de parrroquia:" + parroquiaID);
        parroquias = JPAFactoryDAO.getFactory().getParroquiaDAO().buscarParroquiaPorCanton(cantonID);
        return parroquias;
    }

    public void setParroquias(List<Parroquia> parroquias) {
        this.parroquias = parroquias;
    }

}
