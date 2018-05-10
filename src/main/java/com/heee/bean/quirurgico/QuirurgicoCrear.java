package com.heee.bean.quirurgico;

import com.heee.bean.codigoBarras.CodigoEstudioListar;
import com.heee.bean.contadorEstudios.contadorEstudioCrear;
import com.heee.bean.menu.SessionBean;
import com.heee.bean.model.entity.Cabecerarecepcionmuestra;
import com.heee.bean.model.entity.Doctor;
import com.heee.bean.model.entity.Estudiosquirurgicos;
import com.heee.bean.model.entity.Hospital;
import com.heee.bean.model.entity.Organossistemas;
import com.heee.bean.model.entity.Paciente;
import com.heee.bean.model.entity.Parroquia;
import com.heee.bean.model.entity.Subtipo;
import com.heee.bean.model.entity.Tipoestudio;
import com.heee.bean.model.jpa.JPAFactoryDAO;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.primefaces.event.FlowEvent;
import java.util.Date;

@ManagedBean(name = "quirurgicoCrear")
@ViewScoped
//@RequestScoped
public class QuirurgicoCrear implements Serializable {

    private static final long serialVersionUID = 1L;
    private List<Hospital> hospitalesEnBase;
    private List<Doctor> doctoresEnBase;
    private List<Paciente> pacientesEnBase;
    private List<Tipoestudio> tiposEstudioEnBase;
    private List<Cabecerarecepcionmuestra> cabecerasEnBase;
    private Cabecerarecepcionmuestra cabecera;
    private Doctor doctor;
    private Paciente paciente;
    private Parroquia parroquia;
    private Hospital hospital;
    private Estudiosquirurgicos estudioQuirurgico;
    private int parroquiaID;
    private int numeroEstudio;
    private String nombreEstudio;

    private Organossistemas organosSistemas;
    private Subtipo subtipo;
    private contadorEstudioCrear contadorEstudio;

    private int organosSistemaID;
    private int subtipoID;

    private boolean skip;

    private Date fechaCreacion = new Date();

    /*Método Constructor*/
    public QuirurgicoCrear() {

        System.out.println("Entro al metodo QuirurgicoCrear");

        doctoresEnBase = null;
        pacientesEnBase = null;
        hospitalesEnBase = null;
        tiposEstudioEnBase = null;
        cabecerasEnBase = null;
        this.cabecera = new Cabecerarecepcionmuestra();
        this.cabecera.setEstadoestudiocrm("Macroscopia");
        this.paciente = new Paciente();
        this.doctor = new Doctor();
        this.hospital = new Hospital();
        this.parroquia = new Parroquia();
        parroquiaID = 0;
        numeroEstudio = 0;
        organosSistemaID = 0;
        subtipoID = 0;
        nombreEstudio = "";

        this.organosSistemas = new Organossistemas();
        this.subtipo = new Subtipo();
        this.estudioQuirurgico = new Estudiosquirurgicos();
        this.contadorEstudio = new contadorEstudioCrear();

        System.out.println("Salio del metodo QuirurgicoCrear");
    }

    /*Método para hacer el registro del examen Qx en el módulo de la Secretaria*/
    public void registrarQuirurgico() {

        System.out.println("Entro al metodo registrarQuirurgico");

        this.parroquia.setIdparroquia(this.parroquiaID);
        this.hospital.setIdparroquia(parroquia);
        JPAFactoryDAO.getFactory().getHospitalDAO().create(hospital);
        JPAFactoryDAO.getFactory().getDoctorDAO().create(doctor);
        JPAFactoryDAO.getFactory().getPacienteDAO().create(paciente);

        //asignacion FK a cabecera
        hospitalesEnBase = JPAFactoryDAO.getFactory().getHospitalDAO().find();
        this.cabecera.setIdhospital(hospitalesEnBase.get(hospitalesEnBase.size() - 1));
        doctoresEnBase = JPAFactoryDAO.getFactory().getDoctorDAO().find();
        this.cabecera.setIddoctor(doctoresEnBase.get(doctoresEnBase.size() - 1));
        pacientesEnBase = JPAFactoryDAO.getFactory().getPacienteDAO().find();
        this.cabecera.setIdpaciente(pacientesEnBase.get(pacientesEnBase.size() - 1));
        this.cabecera.setFechacreacrm(this.fechaCreacion);
        this.cabecera.setFechaactualizacrm(this.fechaCreacion);
        System.out.println("Fecha de Registro del Estudio "+this.fechaCreacion);
        String[] campoTipo = {"nombrete"};
        String[] valorCampoTipo = {nombreEstudio};
        tiposEstudioEnBase = JPAFactoryDAO.getFactory().getTipoEstudioDAO().find(campoTipo, valorCampoTipo);
        this.cabecera.setIdte(tiposEstudioEnBase.get(tiposEstudioEnBase.size() - 1));
        JPAFactoryDAO.getFactory().getCabecerarecepcionmuestraDAO().create(cabecera);

        cabecerasEnBase = JPAFactoryDAO.getFactory().getCabecerarecepcionmuestraDAO().find();
        this.estudioQuirurgico.setIdcabeceracepcionmuestraeq(cabecerasEnBase.get(cabecerasEnBase.size() - 1).getIdcrm());
        this.organosSistemas.setIdos(organosSistemaID);
        this.estudioQuirurgico.setIdos(organosSistemas);
        this.subtipo.setIdsubtipo(subtipoID);
        this.estudioQuirurgico.setIdsubtipo(subtipo);
        JPAFactoryDAO.getFactory().getEstudiosQuirurgicosDAO().create(estudioQuirurgico);
        contadorEstudio.contarEstudio();
        System.out.println("Salio del metodo registrarQuirurgico");
    }

    /*Getters & Setters*/
    public List<Hospital> getHospitalesEnBase() {
        return hospitalesEnBase;
    }

    public void setHospitalesEnBase(List<Hospital> hospitalesEnBase) {
        this.hospitalesEnBase = hospitalesEnBase;
    }

    public List<Doctor> getDoctoresEnBase() {
        return doctoresEnBase;
    }

    public void setDoctoresEnBase(List<Doctor> doctoresEnBase) {
        this.doctoresEnBase = doctoresEnBase;
    }

    public List<Paciente> getPacientesEnBase() {
        return pacientesEnBase;
    }

    public void setPacientesEnBase(List<Paciente> pacientesEnBase) {
        this.pacientesEnBase = pacientesEnBase;
    }

    public Cabecerarecepcionmuestra getCabecera() {
//        cabecera.setEstadoestudiocrm("Macroscopia");
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

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public int getParroquiaID() {
        return parroquiaID;
    }

    public void setParroquiaID(int parroquiaID) {
        this.parroquiaID = parroquiaID;
    }

    public int getNumeroEstudio() {
        return numeroEstudio;
    }

    public void setNumeroEstudio(int numeroEstudio) {
        this.numeroEstudio = numeroEstudio;
    }

    public Organossistemas getOrganosSistemas() {
        return organosSistemas;
    }

    public void setOrganosSistemas(Organossistemas organosSistemas) {
        this.organosSistemas = organosSistemas;
    }

    public Subtipo getSubtipo() {
        return subtipo;
    }

    public void setSubtipo(Subtipo subtipo) {
        this.subtipo = subtipo;
    }

    public Estudiosquirurgicos getEstudioQuirurgico() {
        return estudioQuirurgico;
    }

    public void setEstudioQuirurgico(Estudiosquirurgicos estudioQuirurgico) {
        this.estudioQuirurgico = estudioQuirurgico;
    }

    public int getOrganosSistemaID() {
        return organosSistemaID;
    }

    public void setOrganosSistemaID(int organosSistemaID) {
        this.organosSistemaID = organosSistemaID;
    }

    public int getSubtipoID() {
        return subtipoID;
    }

    public void setSubtipoID(int subtipoID) {
        this.subtipoID = subtipoID;
    }

    public boolean isSkip() {
        return skip;
    }

    public void setSkip(boolean skip) {
        this.skip = skip;
    }

    public String getNombreEstudio() {
        return nombreEstudio;
    }

    public void setNombreEstudio(String nombreEstudio) {
        this.nombreEstudio = nombreEstudio;
    }

    public Date getFechaCreacion() {
        return this.fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

}
