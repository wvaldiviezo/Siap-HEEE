/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heee.bean.codigoBarras;

import com.heee.bean.model.entity.Contadorestipoestudioanio;
import com.heee.bean.model.entity.Tipoestudio;
import com.heee.bean.model.jpa.JPAFactoryDAO;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "codigoEstudioListar")

public class CodigoEstudioListar implements Serializable {

    /**
     * Creates a new instance of CodigoEstudioListar
     */
    private String codigo;
    private String codigoBase;
    private String nombreEstudio;
    private String anioDigitos;
    private Date fecha;
    private int numeroEstudios;
    private int idTipoEstudio;
    private String anio;
    private List<Contadorestipoestudioanio> EstudiosPorIdTipo;
    List<Tipoestudio> TiposEstudioporNombre;

    public CodigoEstudioListar() {
        numeroEstudios = 0;
        codigo = "";
        fecha = new Date();
        anioDigitos = new SimpleDateFormat("yy").format(fecha);
        nombreEstudio = "";
        idTipoEstudio = 0;
        EstudiosPorIdTipo = null;
        TiposEstudioporNombre = null;

    }

    public void totalEstudios() {

    }

    public String getCodigoBase() {
        return codigoBase;
    }

//    public String codigoFormado() {
////         System.out.println("**********variable estudio:"+nombreEstudio);
//        String[] campoTipo = {"nombrete"};
//        String[] valorCampoTipo = {nombreEstudio};
//        TiposEstudioporNombre = JPAFactoryDAO.getFactory().getTipoEstudioDAO().find(campoTipo, valorCampoTipo);
//
//        //sacar el id unicamente del estudio que esta en la coleccion anterior
//        idTipoEstudio = TiposEstudioporNombre.get(0).getIdte();
//
//        EstudiosPorIdTipo = JPAFactoryDAO.getFactory().getContadoresTipoEstudioAnioDAO().find();
//
//        for (Contadorestipoestudioanio obj : EstudiosPorIdTipo) {
//            if (obj.getIdte().getIdte() == idTipoEstudio) {
//                numeroEstudios += 1;
//            }
//        }
////        para sacar el numero del estudio que se esta ingresando en este momento
//        numeroEstudios += 1;
//
//        switch (nombreEstudio) {
//            case "AMPUTACION":
//                codigo = nombreEstudio = "AMP" + "-" + anioDigitos + "-" + String.valueOf(numeroEstudios);
//                break;
//            case "BIOLOGIA MOLECULAR":
//                codigo = nombreEstudio = "BM" + "-" + anioDigitos + "-" + String.valueOf(numeroEstudios);
//                break;
//            case "INMUNO HISTOQUIMICA":
//                codigo = nombreEstudio = "IHQ" + "-" + anioDigitos + "-" + String.valueOf(numeroEstudios);
//                break;
//            default:
//                codigo = nombreEstudio.charAt(0) + "-" + anioDigitos + "-" + String.valueOf(numeroEstudios);
//                break;
//
//        }
//
//        return codigo;
//
//    }
    //getter and setter
    public void setCodigoBase(String codigoBase) {
        this.codigoBase = codigoBase;
    }

    public String getCodigo() {
        String[] campoTipo = {"nombrete"};
        String[] valorCampoTipo = {nombreEstudio};
        System.out.println("nombre de estudio" + nombreEstudio);
        TiposEstudioporNombre = JPAFactoryDAO.getFactory().getTipoEstudioDAO().find(campoTipo, valorCampoTipo);

        //sacar el id unicamente del estudio que esta en la coleccion anterior
        idTipoEstudio = TiposEstudioporNombre.get(0).getIdte();
        anio = new SimpleDateFormat("yyyy").format(fecha);
        EstudiosPorIdTipo = JPAFactoryDAO.getFactory().getContadoresTipoEstudioAnioDAO().find();

        for (Contadorestipoestudioanio obj : EstudiosPorIdTipo) {

            System.out.println("**sentencia:" + (obj.getIdte().getIdte().equals(idTipoEstudio)) +" Y "+(obj.getAnioctea().equals(anio)));

            if ((obj.getIdte().getIdte().equals(idTipoEstudio)) && (obj.getAnioctea().equals(anio))) {
                System.out.println("paso if desde codigo estudio");
                numeroEstudios = obj.getNumtipoestudio();
            }
        }
//        para sacar el numero del estudio que se esta ingresando en este momento
        numeroEstudios += 1;

        switch (nombreEstudio) {
            case "AMPUTACIÓN":
                codigo = nombreEstudio = "AMP" + "-" + anioDigitos + "-" + String.valueOf(numeroEstudios);
                break;
            case "BIOLOGÍA MOLECULAR":
                codigo = nombreEstudio = "BM" + "-" + anioDigitos + "-" + String.valueOf(numeroEstudios);
                break;
            case "INMUNO HISTOQUIMICA":
                codigo = nombreEstudio = "IHQ" + "-" + anioDigitos + "-" + String.valueOf(numeroEstudios);
                break;
            default:
                codigo = nombreEstudio.charAt(0) + "-" + anioDigitos + "-" + String.valueOf(numeroEstudios);
                break;

        }
        codigoBase = codigo;
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreEstudio() {
        return nombreEstudio;
    }

    public void setNombreEstudio(String nombreEstudio) {
        this.nombreEstudio = nombreEstudio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEstudioInicial() {
        return nombreEstudio;
    }

    public void setEstudioInicial(String estudioInicial) {
        this.nombreEstudio = estudioInicial;
    }

    public String getAnioDigitos() {
        return anioDigitos;
    }

    public void setAnioDigitos(String anioDigitos) {
        this.anioDigitos = anioDigitos;
    }

    public int getOrdinal() {
        return numeroEstudios;
    }

    public void setOrdinal(int ordinal) {
        this.numeroEstudios = ordinal;
    }

}
