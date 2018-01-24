/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heee.bean.model.jpa;

import com.heee.bean.model.dao.ECitologicoSubcategoriaDAO;
import com.heee.bean.model.entity.ECitologicoSubcategoria;

/**
 *
 * @author wilmer.valdiviezo
 */
public class JPAECitologicoSubcategoriaDAO extends JPAGenericDAO<ECitologicoSubcategoria, Integer> implements ECitologicoSubcategoriaDAO{
    public JPAECitologicoSubcategoriaDAO() {
        super(ECitologicoSubcategoria.class);
    }
    
}
