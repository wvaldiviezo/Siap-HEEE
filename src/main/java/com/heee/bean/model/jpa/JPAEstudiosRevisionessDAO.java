package com.heee.bean.model.jpa;

import com.heee.bean.model.dao.EstudiosRevisionDAO;
import com.heee.bean.model.entity.Estudiosrevision;

public class JPAEstudiosRevisionessDAO extends JPAGenericDAO <Estudiosrevision, Integer> implements EstudiosRevisionDAO{
    
    public JPAEstudiosRevisionessDAO(){
        super(Estudiosrevision.class);
    }
}
