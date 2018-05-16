
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
        for(Cabecerarecepcionmuestra cabecera: cabeceraEnBase){
            System.out.println("id cabeceras:"+cabecera.getIdte().getIdte());
        }
        this.tipoEstudio.setIdte(cabeceraEnBase.get(cabeceraEnBase.size() - 1).getIdte().getIdte());
        System.out.println("ID tipo de estudio"+cabeceraEnBase.get(cabeceraEnBase.size() - 1).getIdte().getIdte());
        this.contadorEstudio.setIdte(this.tipoEstudio);
        this.contadorEstudio.setAnioctea(new SimpleDateFormat("yyyy").format(fecha));
        contadoresEnBase = JPAFactoryDAO.getFactory().getContadoresTipoEstudioAnioDAO().find();

        for (int i = 1; i <= contadoresEnBase.size(); i++) {
            if (contadorEstudio.getAnioctea().equals(contadoresEnBase.get(i - 1).getAnioctea()) && contadorEstudio.getIdte().equals(contadoresEnBase.get(i - 1).getIdte())) {
                System.out.println("Cumplio condicion de if");
                System.out.println("tipo de estudio"+this.contadorEstudio.getIdte().getNombrete());
                System.out.println("ID tipo de estudio"+cabeceraEnBase.get(cabeceraEnBase.size() - 1).getIdte().getIdte());
                this.tipoEstudio.setIdte(cabeceraEnBase.get(cabeceraEnBase.size() - 1).getIdte().getIdte());
                this.contadorEstudio.setIdte(this.tipoEstudio);
                this.contadorEstudio.setIdctea(contadoresEnBase.get(i - 1).getIdctea());
                this.contadorEstudio.setNumtipoestudio(contadoresEnBase.get(i - 1).getNumtipoestudio() + 1);
                this.contadorEstudio.setFechacreacion(fecha);
                JPAFactoryDAO.getFactory().getContadoresTipoEstudioAnioDAO().update(this.contadorEstudio);
            } else if (i == contadoresEnBase.size()) {
                this.tipoEstudio.setIdte(cabeceraEnBase.get(cabeceraEnBase.size() - 1).getIdte().getIdte());
                this.contadorEstudio.setIdte(this.tipoEstudio);
                System.out.println("Cumplio condicion de else if");
                System.out.println("***tipo de estudio"+this.contadorEstudio.getIdte().getNombrete());
                System.out.println("**ID tipo de estudio"+cabeceraEnBase.get(cabeceraEnBase.size() - 1).getIdte().getIdte());
//                contadorEstudio.setIdctea(null);
                this.contadorEstudio.setNumtipoestudio(1);
                this.contadorEstudio.setFechacreacion(fecha);
                JPAFactoryDAO.getFactory().getContadoresTipoEstudioAnioDAO().create(this.contadorEstudio);
            }
        }

//        for( Contadorestipoestudioanio contadores : contadoresEnBase ){
//            contadores.getIdte();
//            if(contadores.getIdte().getIdte().equals(cabeceraEnBase.get(cabeceraEnBase.size()-1).getIdte().getIdte()) && contadores.getAnioctea().equals(this.contadorEstudio.getAnioctea()) ){
//            contadorEstudio.setNumtipoestudio(contadores.getNumtipoestudio()+1);
//            contadorEstudio.setIdctea(contadores.getIdctea());
//            JPAFactoryDAO.getFactory().getContadoresTipoEstudioAnioDAO().update(this.contadorEstudio);
//            break;
//            }              
//        }
//        contadorEstudio.setIdctea(null);
//        contadorEstudio.setNumtipoestudio(1);
//        contadorEstudio.setFechacreacion(fecha);
//        JPAFactoryDAO.getFactory().getContadoresTipoEstudioAnioDAO().create(this.contadorEstudio);
//        contador+=1;
//        System.out.println("Total de estudios:"+contador);
//        contadorEstudio.setNumtipoestudio(contador);
//        contadorEstudio.setFechacreacion(fecha);
//        
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
