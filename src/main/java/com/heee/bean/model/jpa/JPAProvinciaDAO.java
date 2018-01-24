package com.heee.bean.model.jpa;

import com.heee.bean.model.dao.ProvinciaDAO;
import com.heee.bean.model.entity.Provincia;

public class JPAProvinciaDAO extends JPAGenericDAO<Provincia, Integer> implements ProvinciaDAO {

    public JPAProvinciaDAO() {
        super(Provincia.class);
    }
}
