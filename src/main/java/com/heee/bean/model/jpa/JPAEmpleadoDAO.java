package com.heee.bean.model.jpa;

import com.heee.bean.model.dao.EmpleadoDAO;
import com.heee.bean.model.entity.Empleado;

public class JPAEmpleadoDAO extends JPAGenericDAO<Empleado, Integer> implements EmpleadoDAO {

    public JPAEmpleadoDAO() {
        super(Empleado.class);
    }
}
