/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heee.bean.model.jpa;

import com.heee.bean.model.dao.EspecialidadDAO;
import com.heee.bean.model.entity.Especialidad;

/**
 *
 * @author wilmer.valdiviezo
 */
public class JPAEspecialidadDAO extends JPAGenericDAO<Especialidad, Integer> implements EspecialidadDAO{
    
    public JPAEspecialidadDAO() {
        super(Especialidad.class);
    }
    
}
