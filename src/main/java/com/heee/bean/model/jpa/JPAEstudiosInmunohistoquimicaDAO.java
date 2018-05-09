package com.heee.bean.model.jpa;

import com.heee.bean.model.entity.Estudiosinmunohistoquimica;
import com.heee.bean.model.dao.EstudiosInmunohistoquimicaDAO;
import java.util.List;
import javax.persistence.Query;

public class JPAEstudiosInmunohistoquimicaDAO extends JPAGenericDAO<Estudiosinmunohistoquimica, Integer> implements EstudiosInmunohistoquimicaDAO {

    public JPAEstudiosInmunohistoquimicaDAO() {
        super(Estudiosinmunohistoquimica.class);
    }

    @Override
    public Estudiosinmunohistoquimica filtrarEstudiosInmunohistoquimica(int idCabecera) {
        List<Estudiosinmunohistoquimica> estudiosInmunohistoquimica = null;
        Estudiosinmunohistoquimica estudioInmunohistoquimica = null;
        try {
            String consulta = "select * from estudiosinmunohistoquimica where idcabecerarecepcionmuestraeihq=" + idCabecera;
            Query query = em.createNativeQuery(consulta, Estudiosinmunohistoquimica.class);
            estudiosInmunohistoquimica = query.getResultList();
            estudioInmunohistoquimica = estudiosInmunohistoquimica.get(0);
        } catch (Exception e) {
            System.out.println("error en la consulta SQL en histoquimica marcador");
        }
        return estudioInmunohistoquimica;
    }

}
