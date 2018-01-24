package com.heee.bean.model.dao;


import com.heee.bean.model.entity.Partes;
import java.util.List;



/*                                              Nombre de la TABLA, atributo incrementable*/
public interface ParteDAO extends GenericDAO<Partes, Integer>{
    
    public List<Partes> buscarPartePorExtremidad(String idExtremidad);
    
}
