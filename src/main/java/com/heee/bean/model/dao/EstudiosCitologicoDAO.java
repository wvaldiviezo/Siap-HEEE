package com.heee.bean.model.dao;

import com.heee.bean.model.entity.Estudiocitologico;

public interface EstudiosCitologicoDAO extends GenericDAO<Estudiocitologico, Integer>{
    
    public Estudiocitologico filtrarEstudiocitologico(int idCabecera);
}
