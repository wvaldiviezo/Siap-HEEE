package com.heee.bean.model.entity;

import com.heee.bean.model.entity.BiomoleCarcadorSub;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2018-01-25T20:30:08")
@StaticMetamodel(Biologiamolecular.class)
public class Biologiamolecular_ { 

    public static volatile SingularAttribute<Biologiamolecular, String> caracteristicamuestra;
    public static volatile SingularAttribute<Biologiamolecular, String> motivocaracteristica;
    public static volatile SingularAttribute<Biologiamolecular, Integer> idbiologiamolecular;
    public static volatile SingularAttribute<Biologiamolecular, Integer> cesareas;
    public static volatile SingularAttribute<Biologiamolecular, Boolean> iniciovidasexual;
    public static volatile SingularAttribute<Biologiamolecular, Integer> idcabecerarecepcionmuestrabm;
    public static volatile SingularAttribute<Biologiamolecular, Integer> valornegativo;
    public static volatile SingularAttribute<Biologiamolecular, Boolean> muestrarepetida;
    public static volatile SingularAttribute<Biologiamolecular, Integer> idsuarioactualiza;
    public static volatile SingularAttribute<Biologiamolecular, String> responsabletomacitologica;
    public static volatile SingularAttribute<Biologiamolecular, Integer> idusuariocreabm;
    public static volatile SingularAttribute<Biologiamolecular, Date> fechaactualizabm;
    public static volatile SingularAttribute<Biologiamolecular, Integer> valorpositivo;
    public static volatile SingularAttribute<Biologiamolecular, Boolean> repetirestudio;
    public static volatile SingularAttribute<Biologiamolecular, Boolean> revisadoporpatologo;
    public static volatile SingularAttribute<Biologiamolecular, String> codigocitologicoanterior;
    public static volatile ListAttribute<Biologiamolecular, BiomoleCarcadorSub> biomoleCarcadorSubList;
    public static volatile SingularAttribute<Biologiamolecular, Integer> gestas;
    public static volatile SingularAttribute<Biologiamolecular, Integer> menarca;
    public static volatile SingularAttribute<Biologiamolecular, String> recomendaciopatologo;
    public static volatile SingularAttribute<Biologiamolecular, Date> fechaultimamestruacion;
    public static volatile SingularAttribute<Biologiamolecular, Integer> partos;
    public static volatile SingularAttribute<Biologiamolecular, Integer> abortos;
    public static volatile SingularAttribute<Biologiamolecular, Date> fechacreabm;

}