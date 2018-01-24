package com.heee.bean.model.dao;

import com.heee.bean.model.entity.Categoriacitologico;
import java.util.List;
/*                                              Nombre de la TABLA, atributo incrementable*/
public interface CategoriaCitologicoDAO extends GenericDAO<Categoriacitologico, Integer>{
    
    List<Categoriacitologico> buscarCategoriaPorID(String idTec);
}
