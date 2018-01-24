package com.heee.bean.model.jpa;

import com.heee.bean.model.dao.EstudiosQuirurgicosDAO;
import com.heee.bean.model.entity.Estudiosquirurgicos;

public class JPAEstudiosQuirurgicosDAO extends JPAGenericDAO <Estudiosquirurgicos, Integer> implements EstudiosQuirurgicosDAO{
    
    public JPAEstudiosQuirurgicosDAO(){
        super(Estudiosquirurgicos.class);
    }
}
