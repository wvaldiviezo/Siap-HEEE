package com.heee.bean.model.jpa;

import com.heee.bean.model.dao.EstudiosRevisionDAO;
import com.heee.bean.model.entity.Estudiosrevision;
import java.util.List;
import javax.persistence.Query;

public class JPAEstudiosRevisionessDAO extends JPAGenericDAO <Estudiosrevision, Integer> implements EstudiosRevisionDAO{
    
    public JPAEstudiosRevisionessDAO(){
        super(Estudiosrevision.class);
    }

    @Override
    public Estudiosrevision filtrarEstudioRevision(int idCabecera) {
        List<Estudiosrevision> estudiosRevision = null;
        Estudiosrevision estudioRevision = null;
        try {
            String consulta = "select * from estudiosrevision where idcabecerarecepcionmuestraer=" + idCabecera;
            Query query = em.createNativeQuery(consulta, Estudiosrevision.class);
            estudiosRevision = query.getResultList();
            estudioRevision = estudiosRevision.get(0);
        } catch (Exception e) {
            System.out.println("error en la consulta SQL en histoquimica marcador");
        }
        return estudioRevision;
    }
}
