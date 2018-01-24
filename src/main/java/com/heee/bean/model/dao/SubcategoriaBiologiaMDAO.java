package com.heee.bean.model.dao;

import com.heee.bean.model.entity.Subcategoriabm;
import java.util.List;
/*                                              Nombre de la TABLA, atributo incrementable*/
public interface SubcategoriaBiologiaMDAO extends GenericDAO<Subcategoriabm, Integer>{
    List<Subcategoriabm> buscarSubcategoriaBiologiaMPorId(String idCategoria);
    
}
