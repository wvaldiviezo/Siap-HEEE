package com.heee.bean.model.jpa;

import com.heee.bean.model.dao.MarcadoresEHDAO;
import com.heee.bean.model.entity.Marcadoreseh;

public class JPAMarcadoresEHDAO extends JPAGenericDAO<Marcadoreseh, Integer> implements MarcadoresEHDAO {

    public JPAMarcadoresEHDAO() {
        super(Marcadoreseh.class);
    }
}
