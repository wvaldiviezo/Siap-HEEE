package com.heee.bean.model.entity;

import com.heee.bean.model.entity.Estudiosquirurgicos;
import com.heee.bean.model.entity.Estudiosrevision;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2018-01-25T20:30:08")
@StaticMetamodel(Subtipo.class)
public class Subtipo_ { 

    public static volatile ListAttribute<Subtipo, Estudiosrevision> estudiosrevisionList;
    public static volatile ListAttribute<Subtipo, Estudiosquirurgicos> estudiosquirurgicosList;
    public static volatile SingularAttribute<Subtipo, String> descripcionmarcadorsubtipo;
    public static volatile SingularAttribute<Subtipo, Integer> idsubtipo;

}