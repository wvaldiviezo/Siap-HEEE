package com.heee.bean.model.jpa;

import java.util.List;
import javax.persistence.Query;
import com.heee.bean.model.dao.SubcategoriaCitologicoDAO;
import com.heee.bean.model.entity.Subcategoriacitologico;

public class JPASubcategoriaCitologicoDAO extends JPAGenericDAO<Subcategoriacitologico, Integer> implements SubcategoriaCitologicoDAO {

    public JPASubcategoriaCitologicoDAO() {
        super(Subcategoriacitologico.class);
    }

    @Override
    public List<Subcategoriacitologico> buscarSubcategoriaPorID(String idCategoria) {
          List subcategoriaSeleccionada = null;
        try {
            String consulta = "select * from subcategoriacitologico where idcategoria=" + idCategoria;
            Query query = em.createNativeQuery(consulta, Subcategoriacitologico.class);
            subcategoriaSeleccionada = query.getResultList();
        } catch (Exception e) {
            System.out.println("error en la consulta SQL en subcategoria");
        }
        return subcategoriaSeleccionada;
    }
}
    