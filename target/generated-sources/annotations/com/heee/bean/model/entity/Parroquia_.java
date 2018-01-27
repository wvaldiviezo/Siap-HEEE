package com.heee.bean.model.entity;

import com.heee.bean.model.entity.Canton;
import com.heee.bean.model.entity.Hospital;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2018-01-25T20:30:08")
@StaticMetamodel(Parroquia.class)
public class Parroquia_ { 

    public static volatile SingularAttribute<Parroquia, String> nombreparroquia;
    public static volatile ListAttribute<Parroquia, Hospital> hospitalList;
    public static volatile SingularAttribute<Parroquia, Canton> idcanton;
    public static volatile SingularAttribute<Parroquia, Integer> codparroquia;
    public static volatile SingularAttribute<Parroquia, Integer> idparroquia;

}