package com.heee.bean.model.jpa;

import com.heee.bean.model.dao.MarcadorBioDAO;
import com.heee.bean.model.entity.Biologiamolecular;
import com.heee.bean.model.entity.MarcadorBio;
import java.util.List;
import javax.persistence.Query;

public class JPAMarcadorBioDAO extends JPAGenericDAO<MarcadorBio, Integer> implements MarcadorBioDAO {

    public JPAMarcadorBioDAO() {
        super(MarcadorBio.class);
    }

    @Override
    public List<MarcadorBio> marcadoresEstudioBiologiaMolecular(Biologiamolecular estudioBiologiaMolecular) {
       int idEstudio=estudioBiologiaMolecular.getIdbiologiamolecular();
        
        List<MarcadorBio> marcadoresEstudioBiologiaMolecular =null;
        
        try {
            String consulta = "select * from marcador_bio where idbiologiamolecular=" + idEstudio;
            Query query = em.createNativeQuery(consulta, MarcadorBio.class);
            marcadoresEstudioBiologiaMolecular = query.getResultList();
            
        } catch (Exception e) {
            System.out.println("error en la consulta SQL en amputacion");
        }
        return marcadoresEstudioBiologiaMolecular;
    }
}
