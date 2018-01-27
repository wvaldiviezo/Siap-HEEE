package com.heee.bean.model.entity;

import com.heee.bean.model.entity.ECitologicoSubcategoria;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2018-01-25T20:30:08")
@StaticMetamodel(Estudiocitologico.class)
public class Estudiocitologico_ { 

    public static volatile SingularAttribute<Estudiocitologico, Integer> idcec;
    public static volatile ListAttribute<Estudiocitologico, ECitologicoSubcategoria> eCitologicoSubcategoriaList;
    public static volatile SingularAttribute<Estudiocitologico, Integer> idusuariocrea;
    public static volatile SingularAttribute<Estudiocitologico, Date> fechaactualizaec;
    public static volatile SingularAttribute<Estudiocitologico, Integer> idcabeceracepcionmuestracec;
    public static volatile SingularAttribute<Estudiocitologico, String> descripcioncitologicocec;
    public static volatile SingularAttribute<Estudiocitologico, Date> fechacreaec;
    public static volatile SingularAttribute<Estudiocitologico, Integer> idusuarioactualizaec;

}