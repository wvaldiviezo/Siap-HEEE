package com.heee.bean.model.jpa;

import com.heee.bean.model.dao.ContadoresTipoEstudioAnioDAO;
import com.heee.bean.model.entity.Contadorestipoestudioanio;

public class JPAContadoresTipoEstudioAnioDAO extends JPAGenericDAO<Contadorestipoestudioanio, Integer> implements ContadoresTipoEstudioAnioDAO {

    public JPAContadoresTipoEstudioAnioDAO() {
        super(Contadorestipoestudioanio.class);
    }
}
