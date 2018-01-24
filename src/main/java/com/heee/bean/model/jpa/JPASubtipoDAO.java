package com.heee.bean.model.jpa;

import com.heee.bean.model.dao.SubtipoDAO;
import com.heee.bean.model.entity.Subtipo;

public class JPASubtipoDAO extends JPAGenericDAO<Subtipo, Integer> implements SubtipoDAO {

    public JPASubtipoDAO() {
        super(Subtipo.class);
    }
}
