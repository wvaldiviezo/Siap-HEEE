package com.heee.bean.model.entity;

import com.heee.bean.model.entity.Empleado;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2018-01-25T20:30:08")
@StaticMetamodel(Area.class)
public class Area_ { 

    public static volatile SingularAttribute<Area, Integer> idarea;
    public static volatile SingularAttribute<Area, String> nombrearea;
    public static volatile ListAttribute<Area, Empleado> empleadoList;

}