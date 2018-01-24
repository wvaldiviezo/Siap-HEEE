/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heee.bean.amputaciones;

import com.heee.bean.contadorEstudios.contadorEstudioCrear;
import com.heee.bean.model.entity.Cabecerarecepcionmuestra;
import com.heee.bean.model.entity.Doctor;
import com.heee.bean.model.entity.Estudiosamputaciones;
import com.heee.bean.model.entity.Hospital;
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

@ManagedBean(name = "amputacionesCrear")
@ViewScoped
@RequestScoped
public class AmputacionesCrear implements Serializable {

    private static final long serialVersionUID = 1L;
    private List<Hospital> hospitalesEnBase;
    private List<Doctor> doctoresEnBase;
    private List<Paciente> pacientesEnBase;
    private List<Tipoestudio> tiposEstudiosEnBase;
    private List<Cabecerarecepcionmuestra> cabecerasEnBase;
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
    private Estudiosamputaciones estudioAmputaciones;
    private contadorEstudioCrear contadorEstudio;
    
    private Date fechaCreacion = new Date();

    public AmputacionesCrear() {
        doctoresEnBase = null;
        pacientesEnBase = null;
        hospitalesEnBase = null;
        tiposEstudiosEnBase = null;
        cabecerasEnBase = null;
        this.cabecera = new Cabecerarecepcionmuestra();
        this.doctor = new Doctor();
        this.partes = new Partes();
        this.paciente = new Paciente();
        this.hospital = new Hospital();
        this.parroquia = new Parroquia();
        this.contadorEstudio = new contadorEstudioCrear();
        parroquiaID = 0;
        partesID = 0;
        numeroEstudio = 0;
        nombreEstudio = "";
        this.estudioAmputaciones = new Estudiosamputaciones();

    }

    public void registrarAmputaciones() {
        System.out.println("guardar");

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
        this.cabecera.setFechacreacrm(this.fechaCreacion);
        String[] atributo = {"nombrete"};
        String[] valor = {nombreEstudio};
        tiposEstudiosEnBase = JPAFactoryDAO.getFactory().getTipoEstudioDAO().find(atributo, valor);
        this.cabecera.setIdte(tiposEstudiosEnBase.get(tiposEstudiosEnBase.size() - 1));
        JPAFactoryDAO.getFactory().getCabecerarecepcionmuestraDAO().create(cabecera);

        cabecerasEnBase = JPAFactoryDAO.getFactory().getCabecerarecepcionmuestraDAO().find();
        this.estudioAmputaciones.setIdcabecerarecepcionmuestraea(cabecerasEnBase.get(cabecerasEnBase.size() - 1).getIdcrm());

        this.partes.setIdpartes(partesID);
        this.estudioAmputaciones.setIdpartes(partes);
        JPAFactoryDAO.getFactory().getEstudiosAmputacionesDAO().create(estudioAmputaciones);
        contadorEstudio.contarEstudio();
        // System.out.println("codigo:" + cabecera.getCodigoestudio());

    }

    //getter and setter
    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
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

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Cabecerarecepcionmuestra getCabecera() {
        return cabecera;
    }

    public void setCabecera(Cabecerarecepcionmuestra cabecera) {
        this.cabecera = cabecera;
    }

    public int getPartesID() {
        return partesID;
    }

    public void setPartesID(int partesID) {
        this.partesID = partesID;
    }

    public Partes getPartes() {
        return partes;
    }

    public void setPartes(Partes partes) {
        this.partes = partes;
    }

    public Estudiosamputaciones getEstudioAmputaciones() {
        return estudioAmputaciones;
    }

    public void setEstudioAmputaciones(Estudiosamputaciones estudioAmputaciones) {
        this.estudioAmputaciones = estudioAmputaciones;
    }

    public String getNombreEstudio() {
        return nombreEstudio;
    }

    public void setNombreEstudio(String nombreEstudio) {
        this.nombreEstudio = nombreEstudio;
    }

    public contadorEstudioCrear getContadorEstudio() {
        return contadorEstudio;
    }

    public void setContadorEstudio(contadorEstudioCrear contadorEstudio) {
        this.contadorEstudio = contadorEstudio;
    }
    
    public Date getFechaCreacion() {
        return this.fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

}
