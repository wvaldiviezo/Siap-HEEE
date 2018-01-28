package com.heee.bean.model.entity;

import com.heee.bean.model.entity.Empleado;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2018-01-27T17:46:36")
@StaticMetamodel(Cargo.class)
public class Cargo_ { 

    public static volatile SingularAttribute<Cargo, String> descripcioncargo;
    public static volatile SingularAttribute<Cargo, Integer> idcargo;
    public static volatile ListAttribute<Cargo, Empleado> empleadoList;

}