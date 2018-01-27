package com.heee.bean.model.entity;

import com.heee.bean.model.entity.Cabecerarecepcionmuestra;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2018-01-25T20:30:08")
@StaticMetamodel(Doctor.class)
public class Doctor_ { 

    public static volatile SingularAttribute<Doctor, Integer> iddoctor;
    public static volatile SingularAttribute<Doctor, String> emaildoctor;
    public static volatile SingularAttribute<Doctor, String> telefonodoctor;
    public static volatile SingularAttribute<Doctor, String> nombresdoctor;
    public static volatile SingularAttribute<Doctor, String> apellidosdoctor;
    public static volatile ListAttribute<Doctor, Cabecerarecepcionmuestra> cabecerarecepcionmuestraList;

}