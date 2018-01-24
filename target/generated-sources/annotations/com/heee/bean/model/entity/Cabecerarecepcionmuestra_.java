package com.heee.bean.model.entity;

import com.heee.bean.model.entity.Detallerecepcionmuestra;
import com.heee.bean.model.entity.Doctor;
import com.heee.bean.model.entity.Hospital;
import com.heee.bean.model.entity.Paciente;
import com.heee.bean.model.entity.Tipoestudio;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2018-01-13T12:07:28")
=======
@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2018-01-11T20:09:36")
>>>>>>> c4ebea6ba75110bfb8b1b1bec6a98e5dce50489c
=======
@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2018-01-13T13:10:27")
>>>>>>> wil
=======
@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2018-01-13T13:09:45")
>>>>>>> 76f0bc6f9af0d67686f86e97f4c8102d369319c2
=======
@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2018-01-15T23:17:35")
>>>>>>> wil
=======
@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2018-01-21T11:16:40")
>>>>>>> wil
=======
@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2018-01-22T00:58:23")
>>>>>>> wil
=======
@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2018-01-22T14:20:52")
>>>>>>> 2f4c74da8b55e75707d52cbda08c95db825b0c5a
=======
@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2018-01-22T20:35:15")
>>>>>>> wil
@StaticMetamodel(Cabecerarecepcionmuestra.class)
public class Cabecerarecepcionmuestra_ { 

    public static volatile SingularAttribute<Cabecerarecepcionmuestra, Integer> numplacascrm;
    public static volatile SingularAttribute<Cabecerarecepcionmuestra, String> estadoestudiocrm;
    public static volatile SingularAttribute<Cabecerarecepcionmuestra, Date> fechacreacrm;
    public static volatile SingularAttribute<Cabecerarecepcionmuestra, Doctor> iddoctor;
    public static volatile SingularAttribute<Cabecerarecepcionmuestra, String> tratamientopacientecrm;
    public static volatile ListAttribute<Cabecerarecepcionmuestra, Detallerecepcionmuestra> detallerecepcionmuestraList;
    public static volatile SingularAttribute<Cabecerarecepcionmuestra, String> tiposervicio;
    public static volatile SingularAttribute<Cabecerarecepcionmuestra, Integer> numbloquescrm;
    public static volatile SingularAttribute<Cabecerarecepcionmuestra, Paciente> idpaciente;
    public static volatile SingularAttribute<Cabecerarecepcionmuestra, String> prioridad;
    public static volatile SingularAttribute<Cabecerarecepcionmuestra, String> diagnosticopresunticocrm;
    public static volatile SingularAttribute<Cabecerarecepcionmuestra, String> camacrm;
    public static volatile SingularAttribute<Cabecerarecepcionmuestra, Hospital> idhospital;
    public static volatile SingularAttribute<Cabecerarecepcionmuestra, Integer> idcrm;
    public static volatile SingularAttribute<Cabecerarecepcionmuestra, String> razonrechazocrm;
    public static volatile SingularAttribute<Cabecerarecepcionmuestra, Double> tempambientemuestra;
    public static volatile SingularAttribute<Cabecerarecepcionmuestra, String> serviciocrm;
    public static volatile SingularAttribute<Cabecerarecepcionmuestra, Integer> idusuarioactualizacrm;
    public static volatile SingularAttribute<Cabecerarecepcionmuestra, String> descriptiposerviciocrm;
    public static volatile SingularAttribute<Cabecerarecepcionmuestra, String> muestrapiezacrm;
    public static volatile SingularAttribute<Cabecerarecepcionmuestra, Date> horatomamuestracrm;
    public static volatile SingularAttribute<Cabecerarecepcionmuestra, String> salacrm;
    public static volatile SingularAttribute<Cabecerarecepcionmuestra, Date> fechatomamuestracrm;
    public static volatile SingularAttribute<Cabecerarecepcionmuestra, Integer> idusuariocreacrm;
    public static volatile SingularAttribute<Cabecerarecepcionmuestra, Double> refrigeracionmuestra;
    public static volatile SingularAttribute<Cabecerarecepcionmuestra, String> codigoestudiocrm;
    public static volatile SingularAttribute<Cabecerarecepcionmuestra, Tipoestudio> idte;
    public static volatile SingularAttribute<Cabecerarecepcionmuestra, String> resumenclinicocrm;
    public static volatile SingularAttribute<Cabecerarecepcionmuestra, Date> fechaactualizacrm;

}