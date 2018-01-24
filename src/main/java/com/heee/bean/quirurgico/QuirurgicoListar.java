package com.heee.bean.quirurgico;

import com.heee.bean.menu.Navegar;
import com.heee.bean.ubicacion.UbicacionListar;
import com.heee.bean.model.entity.Organossistemas;
import com.heee.bean.model.entity.Subtipo;
import com.heee.bean.model.jpa.JPAFactoryDAO;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;

@ManagedBean(name = "quirurgicoListar")
@ViewScoped
@SessionScoped
public class QuirurgicoListar implements Serializable {

    private UbicacionListar ubicacionListar;
    private Navegar navegar;
    private String organosSistemasID;
    private String subtipoID;
    
    List<Organossistemas> listaOrganosSistemas;
    List<Subtipo> listaSubtipo;

    /*Método Constructor*/
    public QuirurgicoListar() {
        ubicacionListar = new UbicacionListar();
        navegar = new Navegar();
        organosSistemasID = "0";
        subtipoID = "0";
        listaOrganosSistemas = null;
        listaSubtipo = null;
        listarOrganosSistemas();
        listarSubtipo();
    }

    public void listarOrganosSistemas() {
        listaOrganosSistemas = JPAFactoryDAO.getFactory().getOrganosSistemasDAO().find();
    }

    public void listarSubtipo() {
        listaSubtipo = JPAFactoryDAO.getFactory().getSubtipoDAO().find();
    }
    
    public void resetCombo(){
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,"Mensaje:", "Ingrese los nuevos datos del estudio");
        FacesContext.getCurrentInstance().addMessage(null, message);
        
        organosSistemasID = "0";
        subtipoID = "0";
        
        listaOrganosSistemas = null;
        listaSubtipo = null;
        
        listarOrganosSistemas();
        listarSubtipo();
        
        ubicacionListar.resetCombo();
    }

    //getter and setter

    public UbicacionListar getUbicacionListar() {
        return ubicacionListar;
    }

    public void setUbicacionListar(UbicacionListar ubicacionListar) {
        this.ubicacionListar = ubicacionListar;
    }

    public Navegar getNavegar() {
        return navegar;
    }

    public void setNavegar(Navegar navegar) {
        this.navegar = navegar;
    }

    public String getOrganosSistemasID() {
        return organosSistemasID;
    }

    public void setOrganosSistemasID(String organosSistemasID) {
        this.organosSistemasID = organosSistemasID;
    }

    public String getSubtipoID() {
        return subtipoID;
    }

    public void setSubtipoID(String subtipoID) {
        this.subtipoID = subtipoID;
    }

    public List<Organossistemas> getListaOrganosSistemas() {
        return listaOrganosSistemas;
    }

    public void setListaOrganosSistemas(List<Organossistemas> listaOrganosSistemas) {
        this.listaOrganosSistemas = listaOrganosSistemas;
    }

    public List<Subtipo> getListaSubtipo() {
        return listaSubtipo;
    }

    public void setListaSubtipo(List<Subtipo> listaSubtipo) {
        this.listaSubtipo = listaSubtipo;
    }

}
