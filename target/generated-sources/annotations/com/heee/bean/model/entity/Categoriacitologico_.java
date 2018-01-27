package com.heee.bean.model.entity;

import com.heee.bean.model.entity.Subcategoriacitologico;
import com.heee.bean.model.entity.Tipoestudiocitologico;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2018-01-25T20:30:08")
@StaticMetamodel(Categoriacitologico.class)
public class Categoriacitologico_ { 

    public static volatile ListAttribute<Categoriacitologico, Subcategoriacitologico> subcategoriacitologicoList;
    public static volatile SingularAttribute<Categoriacitologico, Tipoestudiocitologico> idtec;
    public static volatile SingularAttribute<Categoriacitologico, String> descripcionmarcadorcategoria;
    public static volatile SingularAttribute<Categoriacitologico, Integer> idcategoria;

}