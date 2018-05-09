package com.heee.bean.model.dao;

import com.heee.bean.model.entity.Biologiamolecular;

public interface EstudiosBiologiaMolecularDAO extends GenericDAO<Biologiamolecular, Integer>{
    
  public  Biologiamolecular filtrarBiologiaMolecular(int idCabecera);
}
