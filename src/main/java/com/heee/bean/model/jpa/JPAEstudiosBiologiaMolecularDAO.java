package com.heee.bean.model.jpa;

import com.heee.bean.model.entity.Biologiamolecular;
import com.heee.bean.model.dao.EstudiosBiologiaMolecularDAO;
import java.util.List;
import javax.persistence.Query;

public class JPAEstudiosBiologiaMolecularDAO extends JPAGenericDAO<Biologiamolecular, Integer> implements EstudiosBiologiaMolecularDAO {

    public JPAEstudiosBiologiaMolecularDAO() {
        super(Biologiamolecular.class);
    }

    @Override
    public Biologiamolecular filtrarBiologiaMolecular(int idCabecera) {
        List<Biologiamolecular> estudiosBiologiaMolecular =null;
        Biologiamolecular estudioBiologiaMolecular=null;
        try {
            String consulta = "select * from biologiamolecular where idcabecerarecepcionmuestrabm=" + idCabecera;
            Query query = em.createNativeQuery(consulta, Biologiamolecular.class);
            estudiosBiologiaMolecular = query.getResultList();
            estudioBiologiaMolecular=estudiosBiologiaMolecular.get(0);
        } catch (Exception e) {
            System.out.println("error en la consulta SQL en biologia molecular");
        }
        return estudioBiologiaMolecular;
    }

}
