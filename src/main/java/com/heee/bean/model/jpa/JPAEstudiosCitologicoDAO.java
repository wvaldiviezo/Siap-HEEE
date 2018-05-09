package com.heee.bean.model.jpa;
import com.heee.bean.model.entity.Estudiocitologico;
import com.heee.bean.model.dao.EstudiosCitologicoDAO;
import java.util.List;
import javax.persistence.Query;


public class JPAEstudiosCitologicoDAO extends JPAGenericDAO <Estudiocitologico, Integer> implements EstudiosCitologicoDAO{
    
    public JPAEstudiosCitologicoDAO(){
        super(Estudiocitologico.class);
    }  
   
    @Override
    public Estudiocitologico filtrarEstudiocitologico(int idCabecera) {
          List<Estudiocitologico> estudiosCitologicos =null;
        Estudiocitologico estudioCitologico=null;
        try {
            String consulta = "select * from estudiocitologico where idcabeceracepcionmuestracec=" + idCabecera;
            Query query = em.createNativeQuery(consulta, Estudiocitologico.class);
            estudiosCitologicos = query.getResultList();
            estudioCitologico=estudiosCitologicos.get(0);
        } catch (Exception e) {
            System.out.println("error en la consulta SQL en amputacion");
        }
        return estudioCitologico;
    }
}
