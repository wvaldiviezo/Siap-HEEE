package com.heee.bean.model.jpa;


import com.heee.bean.model.dao.ExtremidadDAO;
import com.heee.bean.model.entity.Extremidades;

public class JPAExtremidadDAO extends JPAGenericDAO<Extremidades, Integer> implements ExtremidadDAO {

    public JPAExtremidadDAO() {
        super(Extremidades.class);
    }
   
}
