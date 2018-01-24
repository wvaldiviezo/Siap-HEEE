package com.heee.bean.model.jpa;

import com.heee.bean.model.dao.MarcadorSubcategoriaBiologiaMDAO;
import java.util.List;
import javax.persistence.Query;
import com.heee.bean.model.entity.Marcadorsubcategoriabm;
import com.heee.bean.model.entity.Subcategoriabm;

public class JPAMarcadorSubcategoriaBiologiaMDAO extends JPAGenericDAO<Marcadorsubcategoriabm, Integer> implements MarcadorSubcategoriaBiologiaMDAO {

    public JPAMarcadorSubcategoriaBiologiaMDAO() {
        super(Marcadorsubcategoriabm.class);
    }

    @Override
    public List<Marcadorsubcategoriabm> buscarMarcadorSubcategoriaBiologiaMPorId(String idSubCategoria) {
          
          List subcategoriaSeleccionada = null;
        try {
            String consulta = "SELECT * FROM marcadorsubcategoriabm where idsubcategoriabm =" + idSubCategoria;
            Query query = em.createNativeQuery(consulta, Marcadorsubcategoriabm.class);
            subcategoriaSeleccionada = query.getResultList();
        } catch (Exception e) {
            System.out.println("ERROR en la consulta SQL en Marcador Subcategoria");
        }
        return subcategoriaSeleccionada;
    
    }

  
  
}
    