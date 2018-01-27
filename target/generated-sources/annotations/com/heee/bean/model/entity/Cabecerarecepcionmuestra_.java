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

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2018-01-25T20:30:08")
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