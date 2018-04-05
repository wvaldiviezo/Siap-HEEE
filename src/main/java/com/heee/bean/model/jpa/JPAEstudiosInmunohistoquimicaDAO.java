package com.heee.bean.model.jpa;

import com.heee.bean.model.entity.Estudiosinmunohistoquimica;
import com.heee.bean.model.dao.EstudiosInmunohistoquimicaDAO;

public class JPAEstudiosInmunohistoquimicaDAO extends JPAGenericDAO<Estudiosinmunohistoquimica, Integer> implements EstudiosInmunohistoquimicaDAO {

    public JPAEstudiosInmunohistoquimicaDAO() {
        super(Estudiosinmunohistoquimica.class);
    }

}
