package com.heee.bean.model.dao;

import com.heee.bean.model.entity.Marcadorsubcategoriabm;
import java.util.List;
/*                                              Nombre de la TABLA, atributo incrementable*/
public interface MarcadorSubcategoriaBiologiaMDAO extends GenericDAO<Marcadorsubcategoriabm, Integer>{
    List<Marcadorsubcategoriabm> buscarMarcadorSubcategoriaBiologiaMPorId(String idSubCategoria);
    
}
