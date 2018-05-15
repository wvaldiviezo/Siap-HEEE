package com.heee.bean.estudiosSecretaria;

import com.heee.bean.model.entity.Biologiamolecular;
import com.heee.bean.model.entity.Cabecerarecepcionmuestra;
import com.heee.bean.model.entity.Doctor;
import com.heee.bean.model.entity.ECitologicoSubcategoria;
import com.heee.bean.model.entity.EHistMarcador;
import com.heee.bean.model.entity.EinhMarcadores;
import com.heee.bean.model.entity.Estudiocitologico;
import com.heee.bean.model.entity.Estudiosamputaciones;
import com.heee.bean.model.entity.Estudioshistoquimica;
import com.heee.bean.model.entity.Estudiosinmunohistoquimica;
import com.heee.bean.model.entity.Estudiosquirurgicos;
import com.heee.bean.model.entity.Estudiosrevision;
import com.heee.bean.model.entity.Hospital;
import com.heee.bean.model.entity.MarcadorBio;
import com.heee.bean.model.entity.Marcadoreseihq;
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

@ManagedBean(name = "imprimirEstudiosLiberados")
//@ViewScoped
@SessionScoped
public class ImprimirEstudiosLiberados implements Serializable {

    private Paciente paciente;
    private Doctor doctor;
    private Hospital hospital;
    private Tipoestudio tipoEstudio;
    private Cabecerarecepcionmuestra estudioCRM;
    private Estudiosamputaciones estudioAmputaciones;
    private Biologiamolecular estudioBiologiaMolecular;
    private List<MarcadorBio> marcadorBiologiaMolecularEnBase;
    private Estudiocitologico estudioCitologico;
    private List<ECitologicoSubcategoria> marcadorCitologicoEnBase;
    private Estudioshistoquimica estudioHistoquimica;
    private List<EHistMarcador> marcadorHistoquimicaEnBase;
    private Estudiosinmunohistoquimica estudioInmunohistoquimica;
    private List<EinhMarcadores> marcadorInmunohistoquimicaEnBase;
    private Estudiosquirurgicos estudioQuirurgico;
    private Estudiosrevision estudioRevision;
    
    public ImprimirEstudiosLiberados() {
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

    public Biologiamolecular getEstudioBiologiaMolecular() {
        return estudioBiologiaMolecular;
    }

    public void setEstudioBiologiaMolecular(Biologiamolecular estudioBiologiaMolecular) {
        this.estudioBiologiaMolecular = estudioBiologiaMolecular;
    }

    public List<MarcadorBio> getMarcadorBiologiaMolecularEnBase() {
        marcadorBiologiaMolecularEnBase=JPAFactoryDAO.getFactory().getMarcadorBioDAO().marcadoresEstudioBiologiaMolecular(estudioBiologiaMolecular);
        return marcadorBiologiaMolecularEnBase;
    }

    public void setMarcadorBiologiaMolecularEnBase(List<MarcadorBio> marcadorBiologiaMolecularEnBase) {
        this.marcadorBiologiaMolecularEnBase = marcadorBiologiaMolecularEnBase;
    }

    public Estudiocitologico getEstudioCitologico() {
        return estudioCitologico;
    }

    public void setEstudioCitologico(Estudiocitologico estudioCitologico) {
        this.estudioCitologico = estudioCitologico;
    }

    public List<ECitologicoSubcategoria> getMarcadorCitologicoEnBase() {
        marcadorCitologicoEnBase=JPAFactoryDAO.getFactory().getECitologicoSubcategoriaDAO().marcadorEstudioCitologicoPorEstudio(estudioCitologico);
        return marcadorCitologicoEnBase;
    }

    public void setMarcadorCitologicoEnBase(List<ECitologicoSubcategoria> marcadorCitologico) {
        this.marcadorCitologicoEnBase = marcadorCitologico;
    }

    public Estudioshistoquimica getEstudioHistoquimica() {
        return estudioHistoquimica;
    }

    public void setEstudioHistoquimica(Estudioshistoquimica estudioHistoquimica) {
        this.estudioHistoquimica = estudioHistoquimica;
    }

    public List<EHistMarcador> getMarcadorHistoquimicaEnBase() {
        marcadorHistoquimicaEnBase=JPAFactoryDAO.getFactory().getEHistMarcadorDAO().marcadorHistoquimicaPorEstudio(estudioHistoquimica);
        return marcadorHistoquimicaEnBase;
    }

    public void setMarcadorHistoquimicaEnBase(List<EHistMarcador> marcadorHistoquimicaEnBase) {
        this.marcadorHistoquimicaEnBase = marcadorHistoquimicaEnBase;
    }

    public Estudiosinmunohistoquimica getEstudioInmunohistoquimica() {
        return estudioInmunohistoquimica;
    }

    public void setEstudioInmunohistoquimica(Estudiosinmunohistoquimica estudioInmunohistoquimica) {
        this.estudioInmunohistoquimica = estudioInmunohistoquimica;
    }

    public List<EinhMarcadores> getMarcadorInmunohistoquimicaEnBase() {
        marcadorInmunohistoquimicaEnBase=JPAFactoryDAO.getFactory().getEInHistMarcadorDAO().marcadorInmunohistoquimicaPorEstudio(estudioInmunohistoquimica);
        return marcadorInmunohistoquimicaEnBase;
    }

    public void setMarcadorInmunohistoquimicaEnBase(List<EinhMarcadores> marcadorInmunohistoquimicaEnBase) {
        this.marcadorInmunohistoquimicaEnBase = marcadorInmunohistoquimicaEnBase;
    }

    public Estudiosquirurgicos getEstudioQuirurgico() {
        return estudioQuirurgico;
    }

    public void setEstudioQuirurgico(Estudiosquirurgicos estudioQuirurgico) {
        this.estudioQuirurgico = estudioQuirurgico;
    }

    public Estudiosrevision getEstudioRevision() {
        return estudioRevision;
    }

    public void setEstudioRevision(Estudiosrevision estudioRevision) {
        this.estudioRevision = estudioRevision;
    }

   
    
    
}
