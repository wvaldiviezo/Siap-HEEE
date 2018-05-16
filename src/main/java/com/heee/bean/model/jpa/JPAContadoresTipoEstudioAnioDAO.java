package com.heee.bean.model.jpa;

import com.heee.bean.model.dao.ContadoresTipoEstudioAnioDAO;
import com.heee.bean.model.entity.Contadorestipoestudioanio;
import java.util.List;
import javax.persistence.Query;

public class JPAContadoresTipoEstudioAnioDAO extends JPAGenericDAO<Contadorestipoestudioanio, Integer> implements ContadoresTipoEstudioAnioDAO {

    public JPAContadoresTipoEstudioAnioDAO() {
        super(Contadorestipoestudioanio.class);
    }

}
