package com.heee.bean.model.dao;

import com.heee.bean.model.entity.Estudioshistoquimica;
public interface EstudiosHistoquimicaDAO extends GenericDAO<Estudioshistoquimica, Integer>{
    
    public Estudioshistoquimica filtrarEstudioHistoquimica(int idCabecera);
}
