package com.heee.bean.model.entity;

import com.heee.bean.model.entity.Categoriacitologico;
import com.heee.bean.model.entity.ECitologicoSubcategoria;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2018-01-27T17:46:36")
@StaticMetamodel(Subcategoriacitologico.class)
public class Subcategoriacitologico_ { 

    public static volatile ListAttribute<Subcategoriacitologico, ECitologicoSubcategoria> eCitologicoSubcategoriaList;
    public static volatile SingularAttribute<Subcategoriacitologico, Integer> idsubcategoria;
    public static volatile SingularAttribute<Subcategoriacitologico, String> nombresubcategoria;
    public static volatile SingularAttribute<Subcategoriacitologico, Categoriacitologico> idcategoria;

}