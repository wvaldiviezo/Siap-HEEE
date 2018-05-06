package com.heee.bean.estudiosSecretaria;

import com.heee.bean.model.entity.Cabecerarecepcionmuestra;
import com.heee.bean.model.entity.Doctor;
import com.heee.bean.model.entity.Estudiosamputaciones;
import com.heee.bean.model.entity.Hospital;
import com.heee.bean.model.entity.Paciente;
import com.heee.bean.model.entity.Tipoestudio;
import com.heee.bean.model.jpa.JPAFactoryDAO;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;

@ManagedBean(name = "verEstudio")
//@ViewScoped
@SessionScoped
public class VerEstudios implements Serializable {

    private Paciente paciente;
    private Doctor doctor;
    private Hospital hospital;
    private Tipoestudio tipoEstudio;
    private Cabecerarecepcionmuestra estudioCRM;
    private Estudiosamputaciones estudioAmputaciones;

    public VerEstudios() {
        this.paciente = new Paciente();
        this.doctor = new Doctor();
        this.hospital = new Hospital();
        this.tipoEstudio = new Tipoestudio();
        this.estudioCRM = new Cabecerarecepcionmuestra();
        this.estudioAmputaciones = new Estudiosamputaciones();
    }

    //Método para guardar los cambios realizados en la información del estudio seleccionado en la vista actualizarEstudio
    public String guardar() {
        try {
            JPAFactoryDAO.getFactory().getCabecerarecepcionmuestraDAO().update(this.estudioCRM);

            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Aviso", "Información actualizada con éxito"));
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Aviso", "Actualización fallida !!!"));
        }
        return "/principal/secretaria/buscarEstudios.HeeSiap";
    }
    
    //Método para cancelar la edición de la información del estudio
    public String cancelar() {
        return "/principal/secretaria/buscarEstudios.HeeSiap";
    }
    
     //Getters & Setters
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
        return this.estudioCRM;
    }

    public void setEstudioCRM(Cabecerarecepcionmuestra estudioCRM) {
        this.estudioCRM = estudioCRM;
    }

    public Estudiosamputaciones getEstudioAmputaciones() {
        return estudioAmputaciones;
    }

    public void setEstudioAmputaciones(Estudiosamputaciones estudioAmputaciones) {
        this.estudioAmputaciones = estudioAmputaciones;
    }
    
    
}
