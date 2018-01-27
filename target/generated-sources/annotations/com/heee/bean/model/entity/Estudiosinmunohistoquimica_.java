package com.heee.bean.model.entity;

import com.heee.bean.model.entity.EinhMarcadores;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2018-01-25T20:30:08")
@StaticMetamodel(Estudiosinmunohistoquimica.class)
public class Estudiosinmunohistoquimica_ { 

    public static volatile SingularAttribute<Estudiosinmunohistoquimica, Integer> idusuarioactualizaihq;
    public static volatile SingularAttribute<Estudiosinmunohistoquimica, Integer> ideihq;
    public static volatile SingularAttribute<Estudiosinmunohistoquimica, Integer> idusuariocreaihq;
    public static volatile SingularAttribute<Estudiosinmunohistoquimica, String> descripcionestudioeihq;
    public static volatile ListAttribute<Estudiosinmunohistoquimica, EinhMarcadores> einhMarcadoresList;
    public static volatile SingularAttribute<Estudiosinmunohistoquimica, Integer> idcabecerarecepcionmuestraeihq;
    public static volatile SingularAttribute<Estudiosinmunohistoquimica, Date> fechaactualizaihq;
    public static volatile SingularAttribute<Estudiosinmunohistoquimica, Date> fechacreaihq;

}