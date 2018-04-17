package com.heee.bean.model.jpa;

import com.heee.bean.model.entity.Biologiamolecular;
import com.heee.bean.model.dao.EstudiosBiologiaMolecularDAO;

public class JPAEstudiosBiologiaMolecularDAO extends JPAGenericDAO<Biologiamolecular, Integer> implements EstudiosBiologiaMolecularDAO {

    public JPAEstudiosBiologiaMolecularDAO() {
        super(Biologiamolecular.class);
    }

}
