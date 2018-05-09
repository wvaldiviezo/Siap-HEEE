package com.heee.bean.model.jpa;

import com.heee.bean.model.dao.EstudiosQuirurgicosDAO;
import com.heee.bean.model.entity.Estudiosquirurgicos;
import java.util.List;
import javax.persistence.Query;

public class JPAEstudiosQuirurgicosDAO extends JPAGenericDAO<Estudiosquirurgicos, Integer> implements EstudiosQuirurgicosDAO {

    public JPAEstudiosQuirurgicosDAO() {
        super(Estudiosquirurgicos.class);
    }

    @Override
    public Estudiosquirurgicos filtraEstudioQuirurgico(int idCabecera) {
        List<Estudiosquirurgicos> estudiosQuirurgicos = null;
        Estudiosquirurgicos estudioQuirurgico = null;
        try {
            String consulta = "select * from estudiosquirurgicos where idcabeceracepcionmuestraeq=" + idCabecera;
            Query query = em.createNativeQuery(consulta, Estudiosquirurgicos.class);
            estudiosQuirurgicos = query.getResultList();
            estudioQuirurgico = estudiosQuirurgicos.get(0);
        } catch (Exception e) {
            System.out.println("error en la consulta SQL en histoquimica marcador");
        }
        return estudioQuirurgico;
    }
}
