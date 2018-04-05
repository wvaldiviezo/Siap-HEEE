/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heee.bean.model.jpa;

import com.heee.bean.model.dao.EInHistMarcadorDAO;
import com.heee.bean.model.entity.EinhMarcadores;

/**
 *
 * @author wilmer.valdiviezo
 */
public class JPAEInHistMarcadorDAO extends JPAGenericDAO<EinhMarcadores, Integer> implements EInHistMarcadorDAO{
    public JPAEInHistMarcadorDAO() {
        super(EinhMarcadores.class);
    }
    
}
