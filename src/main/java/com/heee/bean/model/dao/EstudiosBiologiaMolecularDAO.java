package com.heee.bean.model.dao;

import com.heee.bean.model.entity.Biologiamolecular;
import com.heee.bean.model.entity.Estudiosamputaciones;
public interface EstudiosBiologiaMolecularDAO extends GenericDAO<Biologiamolecular, Integer>{
    
   Biologiamolecular filtrarBiologiaMolecular(int idCabecera);
}
