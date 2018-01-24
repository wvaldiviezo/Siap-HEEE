package com.heee.bean.model.jpa;

import com.heee.bean.model.dao.DoctorDAO;
import com.heee.bean.model.entity.Doctor;

public class JPADoctorDAO extends JPAGenericDAO<Doctor, Integer> implements DoctorDAO {

    public JPADoctorDAO() {
        super(Doctor.class);
    }
    
}
