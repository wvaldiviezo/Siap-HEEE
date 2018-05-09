package com.heee.bean.model.dao;

import com.heee.bean.model.entity.Estudiosrevision;
/*                                              Nombre de la TABLA, atributo incrementable*/
public interface EstudiosRevisionDAO extends GenericDAO<Estudiosrevision, Integer>{
    
    public Estudiosrevision filtrarEstudioRevision(int idCabecera);
    
}
