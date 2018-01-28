package com.heee.bean.model.jpa;

import com.heee.bean.model.dao.DetallerecepcionmuestraDAO;
import com.heee.bean.model.entity.Detallerecepcionmuestra;
import java.util.List;
import javax.persistence.Query;

public class JPADetallerecepcionmuestraDAO extends JPAGenericDAO<Detallerecepcionmuestra, Integer> implements DetallerecepcionmuestraDAO{ 
    
    public JPADetallerecepcionmuestraDAO() {
        super(Detallerecepcionmuestra.class);
    }
    
   
}
