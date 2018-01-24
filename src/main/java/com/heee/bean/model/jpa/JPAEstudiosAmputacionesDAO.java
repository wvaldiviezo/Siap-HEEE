package com.heee.bean.model.jpa;

import com.heee.bean.model.dao.EstudiosAmputacionesDAO;
import com.heee.bean.model.entity.Estudiosamputaciones;

public class JPAEstudiosAmputacionesDAO extends JPAGenericDAO <Estudiosamputaciones, Integer> implements EstudiosAmputacionesDAO {

    public JPAEstudiosAmputacionesDAO() {
        super(Estudiosamputaciones.class);
    }
}
