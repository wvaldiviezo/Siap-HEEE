package com.heee.bean.model.jpa;

import java.util.List;
import javax.persistence.Query;
import com.heee.bean.model.dao.SubcategoriaBiologiaMDAO;
import com.heee.bean.model.entity.Subcategoriabm;

public class JPASubcategoriaBiologiaMDAO extends JPAGenericDAO<Subcategoriabm, Integer> implements SubcategoriaBiologiaMDAO {

    public JPASubcategoriaBiologiaMDAO() {
        super(Subcategoriabm.class);
    }

    @Override
    public List<Subcategoriabm> buscarSubcategoriaBiologiaMPorId(String idCategoria) {
          List subcategoriaSeleccionada = null;
        try {
            String consulta = "SELECT * FROM subcategoriabm where idcategoriabm =" + idCategoria;
            Query query = em.createNativeQuery(consulta, Subcategoriabm.class);
            subcategoriaSeleccionada = query.getResultList();
        } catch (Exception e) {
            System.out.println("ERROR en la consulta SQL en subcategoria");
        }
        return subcategoriaSeleccionada;
    }
  
}
    