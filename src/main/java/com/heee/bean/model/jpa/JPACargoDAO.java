/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heee.bean.model.jpa;

import com.heee.bean.model.dao.CargoDAO;
import com.heee.bean.model.entity.Cargo;

/**
 *
 * @author wilmer.valdiviezo
 */
public class JPACargoDAO extends JPAGenericDAO<Cargo, Integer> implements CargoDAO{
    
    public JPACargoDAO() {
        super(Cargo.class);
    }
    
}
