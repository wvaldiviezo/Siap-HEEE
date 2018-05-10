package com.heee.bean.inmunohistoquimica;

import com.heee.bean.contadorEstudios.contadorEstudioCrear;
import com.heee.bean.model.entity.Cabecerarecepcionmuestra;
import com.heee.bean.model.entity.Doctor;
import com.heee.bean.model.entity.EinhMarcadores;
import com.heee.bean.model.entity.Estudiosinmunohistoquimica;
import com.heee.bean.model.entity.Hospital;
import com.heee.bean.model.entity.Marcadoreseihq;
import com.heee.bean.model.entity.Paciente;
import com.heee.bean.model.entity.Parroquia;
import com.heee.bean.model.entity.Partes;
import com.heee.bean.model.entity.Tipoestudio;
import com.heee.bean.model.jpa.JPAFactoryDAO;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "inmunohistoquimicaCrear")
@ViewScoped
@RequestScoped

public class InmunoHistoquimicaCrear implements Serializable {

    private List<Hospital> hospitalesEnBase;
    private List<Estudiosinmunohistoquimica> estudiosInmunohistoquimicaEnBase;
    private List<Cabecerarecepcionmuestra> cabecerasEnBase;
    private List<Doctor> doctoresEnBase;
    private List<Paciente> pacientesEnBase;
    private List<Tipoestudio> tiposEstudiosEnBase;
    private String[] marcadoresSeleccionados;
    private Cabecerarecepcionmuestra cabecera;
    private Doctor doctor;
    private Paciente paciente;
    private Parroquia parroquia;
    private int parroquiaID;
    private Hospital hospital;
    private int partesID;
    private int numeroEstudio;
    private String nombreEstudio;
    private Partes partes;
    private Estudiosinmunohistoquimica estudioInmunohistoquimica;
    private contadorEstudioCrear contadorEstudio;
    private EinhMarcadores marcadorInmunohistoquimicaSeleccionado;
    private Marcadoreseihq marcadorInmMarcadoreseihq;
    private Date fechaCreacion = new Date();

    public InmunoHistoquimicaCrear() {
        doctoresEnBase = null;
        pacientesEnBase = null;
        hospitalesEnBase = null;
        tiposEstudiosEnBase = null;
        estudiosInmunohistoquimicaEnBase = null;
        cabecerasEnBase = null;
        marcadoresSeleccionados = null;

        this.cabecera = new Cabecerarecepcionmuestra();
        this.cabecera.setEstadoestudiocrm("Tecnico Especial");
        this.doctor = new Doctor();
        this.partes = new Partes();
        this.paciente = new Paciente();
        this.hospital = new Hospital();
        this.parroquia = new Parroquia();
        this.contadorEstudio = new contadorEstudioCrear();
        this.estudioInmunohistoquimica = new Estudiosinmunohistoquimica();
        this.marcadorInmunohistoquimicaSeleccionado = new EinhMarcadores();
        this.marcadorInmMarcadoreseihq = new Marcadoreseihq();
        parroquiaID = 0;
        partesID = 0;
        numeroEstudio = 0;
        nombreEstudio = "";

    }

    public void regristrarHistoquimica() {

        this.parroquia.setIdparroquia(this.parroquiaID);
        this.hospital.setIdparroquia(parroquia);
        JPAFactoryDAO.getFactory().getHospitalDAO().create(hospital);

        JPAFactoryDAO.getFactory().getDoctorDAO().create(doctor);
        JPAFactoryDAO.getFactory().getPacienteDAO().create(paciente);

        hospitalesEnBase = JPAFactoryDAO.getFactory().getHospitalDAO().find();
        this.cabecera.setIdhospital(hospitalesEnBase.get(hospitalesEnBase.size() - 1));
        doctoresEnBase = JPAFactoryDAO.getFactory().getDoctorDAO().find();
        this.cabecera.setIddoctor(doctoresEnBase.get(doctoresEnBase.size() - 1));
        pacientesEnBase = JPAFactoryDAO.getFactory().getPacienteDAO().find();
        this.cabecera.setIdpaciente(pacientesEnBase.get(pacientesEnBase.size() - 1));
        this.cabecera.setFechacreacrm(fechaCreacion);
        this.cabecera.setFechaactualizacrm(this.fechaCreacion);
        String[] atributo = {"nombrete"};
        String[] valor = {nombreEstudio};
        tiposEstudiosEnBase = JPAFactoryDAO.getFactory().getTipoEstudioDAO().find(atributo, valor);
        this.cabecera.setIdte(tiposEstudiosEnBase.get(tiposEstudiosEnBase.size() - 1));
        JPAFactoryDAO.getFactory().getCabecerarecepcionmuestraDAO().create(cabecera);

        cabecerasEnBase = JPAFactoryDAO.getFactory().getCabecerarecepcionmuestraDAO().find();
        estudioInmunohistoquimica.setIdcabecerarecepcionmuestraeihq(cabecerasEnBase.get(cabecerasEnBase.size() - 1).getIdcrm());
        JPAFactoryDAO.getFactory().getEstudiosInmunohistoquimicaDAO().create(estudioInmunohistoquimica);
        System.out.println("termino de guardar");
        estudiosInmunohistoquimicaEnBase = JPAFactoryDAO.getFactory().getEstudiosInmunohistoquimicaDAO().find();
        contadorEstudio.contarEstudio();

        for (String marcador : marcadoresSeleccionados) {

            marcadorInmunohistoquimicaSeleccionado.setIdeihq(estudiosInmunohistoquimicaEnBase.get(estudiosInmunohistoquimicaEnBase.size() - 1));
            marcadorInmMarcadoreseihq.setIdmarcadorihq(Integer.parseInt(marcador));
            marcadorInmunohistoquimicaSeleccionado.setIdmarcadorihq(marcadorInmMarcadoreseihq);
            marcadorInmunohistoquimicaSeleccionado.setIdeihq(estudioInmunohistoquimica);
            JPAFactoryDAO.getFactory().getEInHistMarcadorDAO().create(marcadorInmunohistoquimicaSeleccionado);
        }

    }

    public String[] getMarcadoresSeleccionados() {
        return marcadoresSeleccionados;
    }

    public void setMarcadoresSeleccionados(String[] marcadoresSeleccionados) {
        this.marcadoresSeleccionados = marcadoresSeleccionados;
    }

    public Cabecerarecepcionmuestra getCabecera() {
        return cabecera;
    }

    public void setCabecera(Cabecerarecepcionmuestra cabecera) {
        this.cabecera = cabecera;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getNombreEstudio() {
        return nombreEstudio;
    }

    public void setNombreEstudio(String nombreEstudio) {
        this.nombreEstudio = nombreEstudio;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Parroquia getParroquia() {
        return parroquia;
    }

    public void setParroquia(Parroquia parroquia) {
        this.parroquia = parroquia;
    }

    public int getParroquiaID() {
        return parroquiaID;
    }

    public void setParroquiaID(int parroquiaID) {
        this.parroquiaID = parroquiaID;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public int getPartesID() {
        return partesID;
    }

    public void setPartesID(int partesID) {
        this.partesID = partesID;
    }

    public int getNumeroEstudio() {
        return numeroEstudio;
    }

    public void setNumeroEstudio(int numeroEstudio) {
        this.numeroEstudio = numeroEstudio;
    }

    public Partes getPartes() {
        return partes;
    }

    public void setPartes(Partes partes) {
        this.partes = partes;
    }

    public Estudiosinmunohistoquimica getEstudioInmunohistoquimica() {
        return estudioInmunohistoquimica;
    }

    public void setEstudioInmunohistoquimica(Estudiosinmunohistoquimica estudioInmunohistoquimica) {
        this.estudioInmunohistoquimica = estudioInmunohistoquimica;
    }

}
