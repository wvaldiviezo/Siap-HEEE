package com.heee.bean.model.dao;

import com.heee.bean.model.entity.Estudiosinmunohistoquimica;
public interface EstudiosInmunohistoquimicaDAO extends GenericDAO<Estudiosinmunohistoquimica, Integer>{
    
    public Estudiosinmunohistoquimica filtrarEstudiosInmunohistoquimica(int idCabecera);
}
