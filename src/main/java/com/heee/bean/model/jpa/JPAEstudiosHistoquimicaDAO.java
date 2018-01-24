package com.heee.bean.model.jpa;

import com.heee.bean.model.entity.Estudioshistoquimica;
import com.heee.bean.model.dao.EstudiosHistoquimicaDAO;

public class JPAEstudiosHistoquimicaDAO extends JPAGenericDAO<Estudioshistoquimica, Integer> implements EstudiosHistoquimicaDAO {

    public JPAEstudiosHistoquimicaDAO() {
        super(Estudioshistoquimica.class);
    }

}
