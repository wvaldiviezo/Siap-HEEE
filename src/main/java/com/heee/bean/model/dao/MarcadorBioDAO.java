package com.heee.bean.model.dao;

import com.heee.bean.model.entity.Biologiamolecular;
import com.heee.bean.model.entity.MarcadorBio;
import java.util.List;


public interface MarcadorBioDAO extends GenericDAO<MarcadorBio, Integer>{

     List<MarcadorBio> marcadoresEstudioBiologiaMolecular( Biologiamolecular estudioBiologiaMolecular);
}
