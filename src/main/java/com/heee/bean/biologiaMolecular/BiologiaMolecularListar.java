/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heee.bean.biologiaMolecular;

import com.heee.bean.citologico.*;
import com.heee.bean.model.entity.Categoriacitologico;
import com.heee.bean.model.entity.Marcadorsubcategoriabm;
import com.heee.bean.model.entity.Subcategoriabm;

import com.heee.bean.model.jpa.JPAFactoryDAO;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import javax.faces.application.FacesMessage;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;




@ManagedBean(name = "biologiaMolecularListar")
@ViewScoped
public class BiologiaMolecularListar implements Serializable {

    private String[] categoriasID;

    private List<Subcategoriabm> subcategoria;
    private List<Marcadorsubcategoriabm> MarcadorSubcategoria;

    /**
     * Creates a new instance of NewJSFManagedBean
     */
    public BiologiaMolecularListar() {
        MarcadorSubcategoria = null;
        subcategoria = null;
        categoriasID =null;
        

    }



    public List<Subcategoriabm> listarSubcategoria(String idTec) {
        subcategoria = JPAFactoryDAO.getFactory().getSubcategoriaBiologiaMDAO().buscarSubcategoriaBiologiaMPorId(idTec);
        return subcategoria;
    }

    public List<Marcadorsubcategoriabm> listarMarcadorSubcategoria(String idCategoria) {
        MarcadorSubcategoria = JPAFactoryDAO.getFactory().getMarcadorSubcategoriaBiologiaMDAO().buscarMarcadorSubcategoriaBiologiaMPorId(idCategoria);
//        Collections.reverse(MarcadorSubcategoria);
        return MarcadorSubcategoria;
    }

    public String[] getCategoriasID() {
        return categoriasID;
    }

    public void setCategoriasID(String[] categoriasID) {
        this.categoriasID = categoriasID;
    }

    public List<Subcategoriabm> getSubcategoria() {
        return subcategoria;
    }

    public void setSubcategoria(List<Subcategoriabm> subcategoria) {
        this.subcategoria = subcategoria;
    }

    public List<Marcadorsubcategoriabm> getMarcadorSubcategoria() {
        return MarcadorSubcategoria;
    }

    public void setMarcadorSubcategoria(List<Marcadorsubcategoriabm> MarcadorSubcategoria) {
        this.MarcadorSubcategoria = MarcadorSubcategoria;
    }


}
