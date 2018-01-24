package com.heee.bean.model.dao;

import com.heee.bean.model.entity.Subcategoriacitologico;
import java.util.List;
/*                                              Nombre de la TABLA, atributo incrementable*/
public interface SubcategoriaCitologicoDAO extends GenericDAO<Subcategoriacitologico, Integer>{
    List<Subcategoriacitologico> buscarSubcategoriaPorID(String idCategoria);
    
}
