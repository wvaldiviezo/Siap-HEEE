package com.heee.bean.model.jpa;

import com.heee.bean.model.entity.Estudioshistoquimica;
import com.heee.bean.model.dao.EstudiosHistoquimicaDAO;
import java.util.List;
import javax.persistence.Query;

public class JPAEstudiosHistoquimicaDAO extends JPAGenericDAO<Estudioshistoquimica, Integer> implements EstudiosHistoquimicaDAO {

    public JPAEstudiosHistoquimicaDAO() {
        super(Estudioshistoquimica.class);
    }

    @Override
    public Estudioshistoquimica filtrarEstudioHistoquimica(int idCabecera) {
        List<Estudioshistoquimica> estudiosHistoquimica = null;
        Estudioshistoquimica estudioHistoquimica = null;
        try {
            String consulta = "select * from estudioshistoquimica where idcabecerarecepcionmuestraeh=" + idCabecera;
            Query query = em.createNativeQuery(consulta, Estudioshistoquimica.class);
            estudiosHistoquimica = query.getResultList();
            estudioHistoquimica = estudiosHistoquimica.get(0);
        } catch (Exception e) {
            System.out.println("error en la consulta SQL en histoquimica marcador");
        }
        return estudioHistoquimica;
    }

}
