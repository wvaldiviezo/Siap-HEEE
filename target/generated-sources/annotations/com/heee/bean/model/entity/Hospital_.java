package com.heee.bean.model.entity;

import com.heee.bean.model.entity.Cabecerarecepcionmuestra;
import com.heee.bean.model.entity.Parroquia;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2018-01-27T17:46:36")
@StaticMetamodel(Hospital.class)
public class Hospital_ { 

    public static volatile SingularAttribute<Hospital, Integer> idhospital;
    public static volatile SingularAttribute<Hospital, String> unidadoperativa;
    public static volatile SingularAttribute<Hospital, Integer> codigouo;
    public static volatile ListAttribute<Hospital, Cabecerarecepcionmuestra> cabecerarecepcionmuestraList;
    public static volatile SingularAttribute<Hospital, String> instituciondelsistema;
    public static volatile SingularAttribute<Hospital, Parroquia> idparroquia;

}