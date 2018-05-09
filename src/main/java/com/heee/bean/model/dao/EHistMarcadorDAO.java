
package com.heee.bean.model.dao;

import com.heee.bean.model.entity.EHistMarcador;
import com.heee.bean.model.entity.Estudioshistoquimica;
import java.util.List;


public interface EHistMarcadorDAO extends GenericDAO<EHistMarcador, Integer>{
 
    public List<EHistMarcador> marcadorHistoquimicaPorEstudio(Estudioshistoquimica estudioHistoquimica);
}
