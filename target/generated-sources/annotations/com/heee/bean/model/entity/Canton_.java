package com.heee.bean.model.entity;

import com.heee.bean.model.entity.Parroquia;
import com.heee.bean.model.entity.Provincia;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2018-01-25T20:30:08")
@StaticMetamodel(Canton.class)
public class Canton_ { 

    public static volatile SingularAttribute<Canton, String> nombrecanton;
    public static volatile ListAttribute<Canton, Parroquia> parroquiaList;
    public static volatile SingularAttribute<Canton, Integer> codcanton;
    public static volatile SingularAttribute<Canton, Integer> idcanton;
    public static volatile SingularAttribute<Canton, Provincia> idprovincia;

}