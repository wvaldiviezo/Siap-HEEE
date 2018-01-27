package com.heee.bean.model.entity;

import com.heee.bean.model.entity.Categoriacitologico;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2018-01-25T20:30:08")
@StaticMetamodel(Tipoestudiocitologico.class)
public class Tipoestudiocitologico_ { 

    public static volatile SingularAttribute<Tipoestudiocitologico, Integer> idtec;
    public static volatile SingularAttribute<Tipoestudiocitologico, String> descripcionmarcadortec;
    public static volatile ListAttribute<Tipoestudiocitologico, Categoriacitologico> categoriacitologicoList;

}