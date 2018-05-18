
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heee.bean.contadorEstudios;

import com.heee.bean.codigoBarras.*;
import com.heee.bean.menu.MenuController;
import com.heee.bean.model.entity.Cabecerarecepcionmuestra;
import com.heee.bean.model.entity.Contadorestipoestudioanio;
import com.heee.bean.model.entity.Tipoestudio;
import com.heee.bean.model.jpa.JPAFactoryDAO;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

//
//@ManagedBean(name = "contadorEstudiosCrear", eager=true )
//@SessionScoped
//@RequestScoped
public class contadorEstudioCrear implements Serializable {

    private List<Cabecerarecepcionmuestra> cabeceraEnBase;
    private Contadorestipoestudioanio contadorEstudio;
    private Tipoestudio tipoEstudio;
    private CodigoEstudioListar codigoEstudioListar;
    private Date fecha;
    private Tipoestudio tTipoestudioipoEstudio;
    private List<Tipoestudio> TiposEstudioporNombre;
    private List<Contadorestipoestudioanio> contadoresEnBase;
    private List<Contadorestipoestudioanio> estudiosPorAnio;
    private String anio;

    public contadorEstudioCrear() {

        cabeceraEnBase = null;
        this.contadorEstudio = new Contadorestipoestudioanio();
        this.contadoresEnBase = null;
        this.contadorEstudio = new Contadorestipoestudioanio();
        this.codigoEstudioListar = new CodigoEstudioListar();
        this.fecha = new Date();
        this.TiposEstudioporNombre = null;
        tipoEstudio = new Tipoestudio();
    }

    public void contarEstudio() {
        int contador = 0;
        System.out.println("*****entro a crear estudio en contador de estudio");
        cabeceraEnBase = JPAFactoryDAO.getFactory().getCabecerarecepcionmuestraDAO().find();
        for (Cabecerarecepcionmuestra cabecera : cabeceraEnBase) {
            System.out.println("id cabeceras:" + cabecera.getIdte().getIdte());
        }
        this.tipoEstudio.setIdte(cabeceraEnBase.get(cabeceraEnBase.size() - 1).getIdte().getIdte());
        System.out.println("ID tipo de estudio" + cabeceraEnBase.get(cabeceraEnBase.size() - 1).getIdte().getIdte());
        this.contadorEstudio.setIdte(this.tipoEstudio);
        this.contadorEstudio.setAnioctea(new SimpleDateFormat("yyyy").format(fecha));
        contadoresEnBase = JPAFactoryDAO.getFactory().getContadoresTipoEstudioAnioDAO().find();

        anio = new SimpleDateFormat("yyyy").format(fecha);
        System.out.println("an;o" + anio);
//        cantidadEstudios = JPAFactoryDAO.getFactory().getContadoresTipoEstudioAnioDAO().find();
        String[] atributo = {"anioctea"};
        String[] valor = {anio};
        estudiosPorAnio = JPAFactoryDAO.getFactory().getContadoresTipoEstudioAnioDAO().find(atributo, valor);

        if (contadoresEnBase.isEmpty()) {

            System.out.println("entro a empty ");
            this.tipoEstudio.setIdte(cabeceraEnBase.get(cabeceraEnBase.size() - 1).getIdte().getIdte());
            this.contadorEstudio.setIdte(this.tipoEstudio);
            this.contadorEstudio.setNumtipoestudio(1);
            this.contadorEstudio.setFechacreacion(fecha);
            JPAFactoryDAO.getFactory().getContadoresTipoEstudioAnioDAO().create(this.contadorEstudio);
            this.contadorEstudio=null;
        } else {
            for (Contadorestipoestudioanio contadorActual : estudiosPorAnio) {
                if (contadorActual.getIdte().getIdte().equals(cabeceraEnBase.get(cabeceraEnBase.size() - 1).getIdte().getIdte())) {
                    
                    this.contadorEstudio = contadorActual;
                    this.contadorEstudio.setNumtipoestudio(contadorActual.getNumtipoestudio() + 1);
                    this.contadorEstudio.setFechacreacion(fecha);
                    JPAFactoryDAO.getFactory().getContadoresTipoEstudioAnioDAO().update(this.contadorEstudio);
                    this.contadorEstudio=null;
                } else if (contadorActual.equals(estudiosPorAnio.get(estudiosPorAnio.size() - 1))) {
                    
                    this.contadorEstudio.setIdctea(null);
                    this.tipoEstudio.setIdte(cabeceraEnBase.get(cabeceraEnBase.size() - 1).getIdte().getIdte());
                    this.contadorEstudio.setIdte(this.tipoEstudio);
                    this.contadorEstudio.setNumtipoestudio(1);
                    this.contadorEstudio.setFechacreacion(fecha);
                    JPAFactoryDAO.getFactory().getContadoresTipoEstudioAnioDAO().create(this.contadorEstudio);
                    this.contadorEstudio=null;
                }
            }
        }

    }
    //getter and setter

    public List<Cabecerarecepcionmuestra> getCabeceraEnBase() {
        return cabeceraEnBase;
    }

    public void setCabeceraEnBase(List<Cabecerarecepcionmuestra> cabeceraEnBase) {
        this.cabeceraEnBase = cabeceraEnBase;
    }

    public Contadorestipoestudioanio getContadorEstudio() {
        return contadorEstudio;
    }

    public void setContadorEstudio(Contadorestipoestudioanio contadorEstudio) {
        this.contadorEstudio = contadorEstudio;
    }

    public CodigoEstudioListar getCodigoEstudioListar() {
        return codigoEstudioListar;
    }

    public void setCodigoEstudioListar(CodigoEstudioListar codigoEstudioListar) {
        this.codigoEstudioListar = codigoEstudioListar;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Tipoestudio getTipoEstudio() {
        return tipoEstudio;
    }

    public void setTipoEstudio(Tipoestudio tipoEstudio) {
        this.tipoEstudio = tipoEstudio;
    }

    public List<Tipoestudio> getTiposEstudioporNombre() {
        return TiposEstudioporNombre;
    }

    public void setTiposEstudioporNombre(List<Tipoestudio> TiposEstudioporNombre) {
        this.TiposEstudioporNombre = TiposEstudioporNombre;
    }

}
