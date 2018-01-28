package com.heee.bean.model.entity;

import com.heee.bean.model.entity.Organossistemas;
import com.heee.bean.model.entity.Subtipo;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2018-01-27T17:46:36")
@StaticMetamodel(Estudiosrevision.class)
public class Estudiosrevision_ { 

    public static volatile SingularAttribute<Estudiosrevision, Integer> idusuariocreaer;
    public static volatile SingularAttribute<Estudiosrevision, Date> fechaactualizaer;
    public static volatile SingularAttribute<Estudiosrevision, Integer> ider;
    public static volatile SingularAttribute<Estudiosrevision, Integer> idcabecerarecepcionmuestraer;
    public static volatile SingularAttribute<Estudiosrevision, Date> fechacreaer;
    public static volatile SingularAttribute<Estudiosrevision, String> descripcionsubtipoer;
    public static volatile SingularAttribute<Estudiosrevision, String> descripcionrevisioner;
    public static volatile SingularAttribute<Estudiosrevision, Subtipo> idsubtipo;
    public static volatile SingularAttribute<Estudiosrevision, Integer> idusuarioactualizaer;
    public static volatile SingularAttribute<Estudiosrevision, Organossistemas> idos;

}