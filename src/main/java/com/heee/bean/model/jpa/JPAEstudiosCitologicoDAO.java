package com.heee.bean.model.jpa;
import com.heee.bean.model.entity.Estudiocitologico;
import com.heee.bean.model.dao.EstudiosCitologicoDAO;


public class JPAEstudiosCitologicoDAO extends JPAGenericDAO <Estudiocitologico, Integer> implements EstudiosCitologicoDAO{
    
    public JPAEstudiosCitologicoDAO(){
        super(Estudiocitologico.class);
    }
}
