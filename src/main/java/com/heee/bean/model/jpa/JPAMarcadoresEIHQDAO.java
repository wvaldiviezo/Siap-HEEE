package com.heee.bean.model.jpa;

import com.heee.bean.model.dao.MarcadoresEIHQDAO;
import com.heee.bean.model.dao.ProvinciaDAO;
import com.heee.bean.model.entity.Marcadoreseihq;

public class JPAMarcadoresEIHQDAO extends JPAGenericDAO<Marcadoreseihq, Integer> implements MarcadoresEIHQDAO {

    public JPAMarcadoresEIHQDAO() {
        super(Marcadoreseihq.class);
    }
}
