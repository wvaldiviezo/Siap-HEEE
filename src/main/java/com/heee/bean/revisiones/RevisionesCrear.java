/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heee.bean.revisiones;

import com.heee.bean.contadorEstudios.contadorEstudioCrear;
import com.heee.bean.menu.MenuController;
//import com.heee.bean.menu.usuario;
import com.heee.bean.model.entity.Cabecerarecepcionmuestra;
import com.heee.bean.model.entity.Doctor;
import com.heee.bean.model.entity.Hospital;
import com.heee.bean.model.entity.Paciente;
import com.heee.bean.model.entity.Parroquia;
import com.heee.bean.model.entity.Estudiosrevision;
import com.heee.bean.model.entity.Organossistemas;
import com.heee.bean.model.entity.Subtipo;
import com.heee.bean.model.entity.Tipoestudio;
import com.heee.bean.model.entity.Usuario;
import com.heee.bean.model.jpa.JPAFactoryDAO;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "revisionesCrear")
@ViewScoped

public class RevisionesCrear implements Serializable {

    private contadorEstudioCrear contadorEstudioCrear;
//    private usuario usuario;
    private String nombreEstudio;
    private static final long serialVersionUID = 1L;
    private List<Tipoestudio> tiposEstudioEnBase;
    private List<Usuario> usuariosEnBase;
    private List<Hospital> hospitalesEnBase;
    private List<Doctor> doctoresEnBase;
    private List<Paciente> pacientesEnBase;
    private List<Cabecerarecepcionmuestra> cabecerasEnBase;
    private Cabecerarecepcionmuestra cabecera;
    private Doctor doctor;

    private Paciente paciente;
    private Parroquia parroquia;
    private Hospital hospital;
    private Estudiosrevision estudioRevision;
    private Organossistemas organosSistemas;
    private Subtipo subtipo;

    private int parroquiaID;
    private int numeroEstudio;

    private int organosSistemaID;
    private int subtipoID;
    private int usuarioID;

    private boolean skip;

    private Date fechaCreacion = new Date();

    public RevisionesCrear() {
        nombreEstudio = "";
        usuariosEnBase = null;
        doctoresEnBase = null;
        pacientesEnBase = null;
        hospitalesEnBase = null;
        tiposEstudioEnBase = null;
        cabecerasEnBase = null;

        this.cabecera = new Cabecerarecepcionmuestra();
        this.paciente = new Paciente();
        this.doctor = new Doctor();
        this.hospital = new Hospital();
        this.parroquia = new Parroquia();

        this.contadorEstudioCrear = new contadorEstudioCrear();
        this.organosSistemas = new Organossistemas();
        this.subtipo = new Subtipo();
//        this.usuario = new usuario();
        parroquiaID = 0;
        numeroEstudio = 0;
        organosSistemaID = 0;
        subtipoID = 0;
        usuarioID = 0;
        this.estudioRevision = new Estudiosrevision();

    }

    public void registrarRevisiones() {
        System.out.println("Entro a guardar revisiones");
        System.out.println("Nombre estudio:" + nombreEstudio);

//     usuariosEnBase=JPAFactoryDAO.getFactory().getUsuarioDAO().find();
//     Usuario us = (Usuario) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("empleado");
//     System.out.println("ide usuario:"+us.toString());
//     for(Usuario usuario:usuariosEnBase ){
//            
//            System.out.println("usuario logueado"+usuario.getUsuariousuario());
//            
//             
//             System.out.println("nombre del usuario:"+usuario.getUsuariousuario());
//             System.out.println("contrasenia:"+usuario.getClaveusuario());
//             System.out.println("id:"+usuario.getIdusuario().toString());
//         
//     }
        this.parroquia.setIdparroquia(this.parroquiaID);
        this.hospital.setIdparroquia(parroquia);
        JPAFactoryDAO.getFactory().getHospitalDAO().create(hospital);
        JPAFactoryDAO.getFactory().getDoctorDAO().create(doctor);
        JPAFactoryDAO.getFactory().getPacienteDAO().create(paciente);
//        asignacion FK a cabecera
        hospitalesEnBase = JPAFactoryDAO.getFactory().getHospitalDAO().find();
        this.cabecera.setIdhospital(hospitalesEnBase.get(hospitalesEnBase.size() - 1));
        doctoresEnBase = JPAFactoryDAO.getFactory().getDoctorDAO().find();
        this.cabecera.setIddoctor(doctoresEnBase.get(doctoresEnBase.size() - 1));
        pacientesEnBase = JPAFactoryDAO.getFactory().getPacienteDAO().find();
        this.cabecera.setIdpaciente(pacientesEnBase.get(pacientesEnBase.size() - 1));
        this.cabecera.setFechacreacrm(this.fechaCreacion);
        String[] campoTipo = {"nombrete"};
        String[] valorCampoTipo = {nombreEstudio};
        tiposEstudioEnBase = JPAFactoryDAO.getFactory().getTipoEstudioDAO().find(campoTipo, valorCampoTipo);
        this.cabecera.setIdte(tiposEstudioEnBase.get(tiposEstudioEnBase.size() - 1));
//            cabecera.setUsuariocreacrm(usuario.mostrarUsuarioLogueado());
        JPAFactoryDAO.getFactory().getCabecerarecepcionmuestraDAO().create(cabecera);

        cabecerasEnBase = JPAFactoryDAO.getFactory().getCabecerarecepcionmuestraDAO().find();
        this.estudioRevision.setIdcabecerarecepcionmuestraer(cabecerasEnBase.get(cabecerasEnBase.size() - 1).getIdcrm());
        this.organosSistemas.setIdos(organosSistemaID);
        this.estudioRevision.setIdos(organosSistemas);
        this.subtipo.setIdsubtipo(subtipoID);
        this.estudioRevision.setIdsubtipo(subtipo);

        JPAFactoryDAO.getFactory().getEstudiosRevisionDAO().create(estudioRevision);

        contadorEstudioCrear.contarEstudio();
    }

    public int getSubtipoID() {
        return subtipoID;
    }

    public void setSubtipoID(int subtipoID) {
        this.subtipoID = subtipoID;
    }

    public Estudiosrevision getEstudioRevision() {
        return estudioRevision;
    }

    public void setEstudioRevision(Estudiosrevision estudioRevision) {
        this.estudioRevision = estudioRevision;
    }

    public int getOrganosSistemaID() {
        return organosSistemaID;
    }

    public void setOrganosSistemaID(int organosSistemaID) {
        this.organosSistemaID = organosSistemaID;
    }

    public String getNombreEstudio() {
        return nombreEstudio;
    }

    public void setNombreEstudio(String nombreEstudio) {
        this.nombreEstudio = nombreEstudio;
    }

    public List<Paciente> getPacientesEnBase() {
        return pacientesEnBase;
    }

    public void setPacientesEnBase(List<Paciente> pacientesEnBase) {
        this.pacientesEnBase = pacientesEnBase;
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

    public int getNumeroEstudio() {
        return numeroEstudio;
    }

    public void setNumeroEstudio(int numeroEstudio) {
        this.numeroEstudio = numeroEstudio;
    }

    public Date getFechaCreacion() {
        return this.fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

}
