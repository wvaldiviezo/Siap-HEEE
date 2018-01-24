package com.heee.bean.model.jpa;

import java.util.List;
import javax.persistence.Query;
import com.heee.bean.model.dao.CategoriaCitologicoDAO;
import com.heee.bean.model.entity.Categoriacitologico;

public class JPACategoriaCitologicoDAO extends JPAGenericDAO<Categoriacitologico, Integer> implements CategoriaCitologicoDAO {

    public JPACategoriaCitologicoDAO() {
        super(Categoriacitologico.class);
    }

    @Override
    public List<Categoriacitologico> buscarCategoriaPorID(String idTec) {
             List categoriaSeleccionada = null;
        try {
            String consulta = "select * from categoria where idtec=" + idTec;
            Query query = em.createNativeQuery(consulta, Categoriacitologico.class);
            categoriaSeleccionada = query.getResultList();
        } catch (Exception e) {
            System.out.println("error en la consulta SQL en categoria");
        }
        return categoriaSeleccionada;
    }
    
}
