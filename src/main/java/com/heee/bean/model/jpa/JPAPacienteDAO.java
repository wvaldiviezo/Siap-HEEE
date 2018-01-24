package com.heee.bean.model.jpa;

import com.heee.bean.model.dao.PacienteDAO;
import com.heee.bean.model.entity.Paciente;

public class JPAPacienteDAO extends JPAGenericDAO<Paciente, Integer> implements PacienteDAO{
    
    public JPAPacienteDAO(){
        super(Paciente.class);
    }
}
