package com.heee.bean.model.jpa;

import com.heee.bean.model.dao.HospitalDAO;
import com.heee.bean.model.entity.Hospital;

public class JPAHospitalDAO extends JPAGenericDAO<Hospital, Integer> implements HospitalDAO{
    
    public JPAHospitalDAO(){
        super(Hospital.class);
    }
    
}
