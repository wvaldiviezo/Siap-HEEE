/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heee.bean.citologico;

import com.heee.bean.model.entity.Categoriacitologico;
import com.heee.bean.model.entity.Subcategoriacitologico;
import com.heee.bean.model.jpa.JPAFactoryDAO;
import java.util.Collections;
import java.util.List;
import javax.faces.application.FacesMessage;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;




@ManagedBean(name = "citologicoListar")

@ViewScoped
public class CitologicoListar {

    private String[] categoriasID;

    
   

    private List<Categoriacitologico> categorias;
    private List<Subcategoriacitologico> subcategorias;

    /**
     * Creates a new instance of NewJSFManagedBean
     */
    public CitologicoListar() {
        subcategorias = null;
        categorias = null;
        categoriasID =null;
        

    }

    public void resetCombo() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "Ingrese los datos del nuevo estudio."));
        categorias = null;
        subcategorias = null;

    }

    public List<Categoriacitologico> listarCategoria(String idTec) {
        categorias = JPAFactoryDAO.getFactory().getCategoriaDAO().buscarCategoriaPorID(idTec);
        return categorias;
    }

    public List<Subcategoriacitologico> listarSubcategoria(String categoriaID) {
        subcategorias = JPAFactoryDAO.getFactory().getSubcategoriaDAO().buscarSubcategoriaPorID(categoriaID);
//        Collections.reverse(subcategorias);
        return subcategorias;
    }

    public String[] getCategoriasID() {
        return categoriasID;
    }

    public void setCategoriasID(String[] categoriasID) {
        this.categoriasID = categoriasID;
    }

    public List<Subcategoriacitologico> getSubcategorias() {
        return subcategorias;
    }

    public void setSubcategorias(List<Subcategoriacitologico> subcategorias) {
        this.subcategorias = subcategorias;
    }

}
