/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heee.bean.model.jpa;

import com.heee.bean.model.dao.AreaDAO;
import com.heee.bean.model.entity.Area;

/**
 *
 * @author wilmer.valdiviezo
 */
public class JPAAreaDAO extends JPAGenericDAO<Area, Integer> implements AreaDAO{
    public JPAAreaDAO() {
        super(Area.class);
    }
    
}
