/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heee.bean.model.jpa;

import com.heee.bean.model.dao.EHistMarcadorDAO;
import com.heee.bean.model.entity.EHistMarcador;

/**
 *
 * @author wilmer.valdiviezo
 */
public class JPAEHistMarcadorDAO extends JPAGenericDAO<EHistMarcador, Integer> implements EHistMarcadorDAO{
    public JPAEHistMarcadorDAO() {
        super(EHistMarcador.class);
    }
    
}
