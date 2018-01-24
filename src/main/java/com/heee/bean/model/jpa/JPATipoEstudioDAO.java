package com.heee.bean.model.jpa;

import com.heee.bean.model.dao.TipoEstudioDAO;
import com.heee.bean.model.entity.Tipoestudio;

public class JPATipoEstudioDAO extends JPAGenericDAO<Tipoestudio, Integer> implements TipoEstudioDAO {

    public JPATipoEstudioDAO() {
        super(Tipoestudio.class);
    }
}
