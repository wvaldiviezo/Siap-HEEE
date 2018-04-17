package com.heee.bean.model.jpa;

import com.heee.bean.model.dao.MarcadorBioDAO;
import com.heee.bean.model.entity.MarcadorBio;

public class JPAMarcadorBioDAO extends JPAGenericDAO<MarcadorBio, Integer> implements MarcadorBioDAO {

    public JPAMarcadorBioDAO() {
        super(MarcadorBio.class);
    }
}
