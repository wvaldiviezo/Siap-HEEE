package com.heee.bean.model.dao;

import com.heee.bean.model.entity.Canton;
import java.util.List;
/*                                              Nombre de la TABLA, atributo incrementable*/
public interface CantonDAO extends GenericDAO<Canton, Integer>{
    
    List<Canton> buscarCantonPorProvincia(String idProvincia);
    
}
