/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heee.bean.model.dao;

import com.heee.bean.model.entity.EinhMarcadores;
import com.heee.bean.model.entity.Estudiosinmunohistoquimica;
import java.util.List;

/**
 *
 * @author wilmer.valdiviezo
 */
public interface EInHistMarcadorDAO extends GenericDAO<EinhMarcadores, Integer>{
  public List<EinhMarcadores> marcadorInmunohistoquimicaPorEstudio(Estudiosinmunohistoquimica estudioInmunohistoquimica);
    
}
