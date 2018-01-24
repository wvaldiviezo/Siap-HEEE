package com.heee.bean.model.jpa;


import com.heee.bean.model.dao.ParteDAO;
import com.heee.bean.model.entity.Partes;
import java.util.List;
import javax.persistence.Query;

public class JPAParteDAO extends JPAGenericDAO<Partes, Integer> implements ParteDAO {

    public JPAParteDAO() {
        super(Partes.class);
    }
   
    @Override
	public List<Partes> buscarPartePorExtremidad(String idExtremidad){
	List cantonSeleccionado=null;
        try{
        String consulta="select * from partes where idextremidades="+idExtremidad;
        Query query = em.createNativeQuery(consulta, Partes.class);
        cantonSeleccionado=query.getResultList();
            }catch(Exception e){
        System.out.println("error en la consulta SQL en partes");
            }
            return cantonSeleccionado;		
	}

   
}
