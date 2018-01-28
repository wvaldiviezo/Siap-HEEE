package com.heee.bean.model.entity;

import com.heee.bean.model.entity.Area;
import com.heee.bean.model.entity.Cargo;
import com.heee.bean.model.entity.Especialidad;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2018-01-27T17:46:36")
@StaticMetamodel(Empleado.class)
public class Empleado_ { 

    public static volatile SingularAttribute<Empleado, Date> fechanacimientoempleado;
    public static volatile SingularAttribute<Empleado, Date> fecharegistroempleado;
    public static volatile SingularAttribute<Empleado, Especialidad> idespecialidad;
    public static volatile SingularAttribute<Empleado, String> telefonoempleado;
    public static volatile SingularAttribute<Empleado, Cargo> idcargo;
    public static volatile SingularAttribute<Empleado, Area> idarea;
    public static volatile SingularAttribute<Empleado, String> direccionempleado;
    public static volatile SingularAttribute<Empleado, String> cedulaempleado;
    public static volatile SingularAttribute<Empleado, String> sexo;
    public static volatile SingularAttribute<Empleado, String> apellidosempleado;
    public static volatile SingularAttribute<Empleado, Integer> idempleado;
    public static volatile SingularAttribute<Empleado, String> nombresempleado;
    public static volatile SingularAttribute<Empleado, String> emailempleado;

}