package com.heee.bean.model.dao;

import com.heee.bean.model.entity.ECitologicoSubcategoria;
import com.heee.bean.model.entity.Estudiocitologico;
import java.util.List;
/*                                              Nombre de la TABLA, atributo incrementable*/
public interface ECitologicoSubcategoriaDAO extends GenericDAO<ECitologicoSubcategoria, Integer>{
    
   public List<ECitologicoSubcategoria> marcadorEstudioCitologicoPorEstudio(Estudiocitologico estudioCitologico);
}
