package com.heee.bean.model.jpa;

import com.heee.bean.model.dao.EstudiosAmputacionesDAO;
import com.heee.bean.model.entity.Estudiosamputaciones;
import com.heee.bean.model.entity.Parroquia;
import java.util.List;
import javax.persistence.Query;

public class JPAEstudiosAmputacionesDAO extends JPAGenericDAO <Estudiosamputaciones, Integer> implements EstudiosAmputacionesDAO {

    public JPAEstudiosAmputacionesDAO() {
        super(Estudiosamputaciones.class);
    }

    @Override
    public Estudiosamputaciones filtrarAmputacion(int idCabecera) {
        
        List<Estudiosamputaciones> estudiosAmputaciones =null;
        Estudiosamputaciones estudioAmputacion=null;
        try {
            String consulta = "select * from estudiosamputaciones where idcabecerarecepcionmuestraea=" + idCabecera;
            Query query = em.createNativeQuery(consulta, Estudiosamputaciones.class);
            estudiosAmputaciones = query.getResultList();
            estudioAmputacion=estudiosAmputaciones.get(0);
        } catch (Exception e) {
            System.out.println("error en la consulta SQL en amputacion");
        }
        return estudioAmputacion;
    }
}
