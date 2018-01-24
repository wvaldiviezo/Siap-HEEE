/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heee.bean.inmunohistoquimica;

import com.heee.bean.menu.Navegar;
import com.heee.bean.model.entity.Marcadoreseihq;
import com.heee.bean.model.jpa.JPAFactoryDAO;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;


@ManagedBean(name = "inmunohistoquimicaListar")
@RequestScoped
public class InmunohistoquimicaListar {

    private List<Marcadoreseihq>  marcadores;
    private String[] marcadoresSeleccionados;
    private Navegar navegar;

    
    public InmunohistoquimicaListar() {
        marcadores=null;
        marcadoresSeleccionados=null;
        navegar = new Navegar();
    }

    
    public List<Marcadoreseihq> getMarcadores() {
        marcadores=JPAFactoryDAO.getFactory().getMarcadoresEIHQDAO().find();
        return marcadores;
    }

       public void volver(){
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,"Mensaje:", "Hasta pronto");
        FacesContext.getCurrentInstance().addMessage(null, message);
        
        navegar.direccionarInicio();
        System.out.println("paso del metodo de navegar");
    }
    public void setMarcadores(List<Marcadoreseihq> marcadores) {
        this.marcadores = marcadores;
    }

    public String[] getMarcadoresSeleccionados() {
        return marcadoresSeleccionados;
    }

    public void setMarcadoresSeleccionados(String[] marcadoresSeleccionados) {
        this.marcadoresSeleccionados = marcadoresSeleccionados;
    }

  
    
}
