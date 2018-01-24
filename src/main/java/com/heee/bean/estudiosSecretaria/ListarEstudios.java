/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heee.bean.estudiosSecretaria;

import com.heee.bean.model.entity.Cabecerarecepcionmuestra;
import com.heee.bean.model.entity.Doctor;
import com.heee.bean.model.entity.Hospital;
import com.heee.bean.model.entity.Paciente;
import com.heee.bean.model.entity.Tipoestudio;
import com.heee.bean.model.jpa.JPAFactoryDAO;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author wilmer.valdiviezo
 */
@ManagedBean(name = "estudiosListar")
@ViewScoped
public class ListarEstudios implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<Paciente> pacientes;
    private List<Doctor> doctores;
    private List<Hospital> hospitales;
    private List<Tipoestudio> tiposEstudios;

    private List<Cabecerarecepcionmuestra> estudioLista;
    private List<Cabecerarecepcionmuestra> estudioFiltrado;

    private Paciente paciente;
    private Doctor doctor;
    private Hospital hospital;
    private Tipoestudio tipoEstudio;
    private Cabecerarecepcionmuestra estudioCRM;
    
    //Actualizar información del Empleado
    @ManagedProperty("#{verEstudio}")
    private VerEstudios ctrVerEstudio;

    public ListarEstudios() {
        pacientes = null;
        doctores = null;
        hospitales = null;
        tiposEstudios = null;
        estudioLista = null;
        estudioFiltrado = null;
    }
    
    //Método invocado por la acción del botón editar en la vista buscarEstudios.
     public String actualizarAtributosEstudios(int idCrm){
        Cabecerarecepcionmuestra ecrm = (Cabecerarecepcionmuestra)JPAFactoryDAO.getFactory().getCabecerarecepcionmuestraDAO().read(Integer.valueOf(idCrm));
        getCtrVerEstudio().setEstudioCRM(ecrm);
        return "/principal/secretaria/verEstudio.HeeSiap";
    }

//Getter and Setter
    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public List<Doctor> getDoctores() {
        return doctores;
    }

    public void setDoctores(List<Doctor> doctores) {
        this.doctores = doctores;
    }

    public List<Hospital> getHospitales() {
        return hospitales;
    }

    public void setHospitales(List<Hospital> hospitales) {
        this.hospitales = hospitales;
    }

    public List<Tipoestudio> getTiposEstudios() {
        return tiposEstudios;
    }

    public void setTiposEstudios(List<Tipoestudio> tiposEstudios) {
        this.tiposEstudios = tiposEstudios;
    }

    //Metodo para listar en la vista
    public List<Cabecerarecepcionmuestra> getEstudioLista() {
        this.estudioLista = null;
        if (this.estudioLista == null) {
            this.estudioLista = JPAFactoryDAO.getFactory().getCabecerarecepcionmuestraDAO().find();
        }
        return this.estudioLista;
    }

    public void setEstudioLista(List<Cabecerarecepcionmuestra> estudioLista) {
        this.estudioLista = estudioLista;
    }

    public List<Cabecerarecepcionmuestra> getEstudioFiltrado() {
        return estudioFiltrado;
    }

    public void setEstudioFiltrado(List<Cabecerarecepcionmuestra> estudioFiltrado) {
        this.estudioFiltrado = estudioFiltrado;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

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

    public Tipoestudio getTipoEstudio() {
        return tipoEstudio;
    }

    public void setTipoEstudio(Tipoestudio tipoEstudio) {
        this.tipoEstudio = tipoEstudio;
    }

    public Cabecerarecepcionmuestra getEstudioCRM() {
        return estudioCRM;
    }

    public void setEstudioCRM(Cabecerarecepcionmuestra estudioCRM) {
        this.estudioCRM = estudioCRM;
    }

    public VerEstudios getCtrVerEstudio() {
        return this.ctrVerEstudio;
    }

    public void setCtrVerEstudio(VerEstudios ctrVerEstudio) {
        this.ctrVerEstudio = ctrVerEstudio;
    }

}
