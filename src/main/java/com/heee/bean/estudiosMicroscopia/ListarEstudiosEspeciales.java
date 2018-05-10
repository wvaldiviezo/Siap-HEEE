package com.heee.bean.estudiosMicroscopia;

import com.heee.bean.model.entity.Cabecerarecepcionmuestra;
import com.heee.bean.model.entity.Paciente;
import com.heee.bean.model.jpa.JPAFactoryDAO;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.view.ViewScoped;

@ManagedBean(name = "estudiosParaMicroEspecial")
@ViewScoped
public class ListarEstudiosEspeciales implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<Cabecerarecepcionmuestra> ltsEstudiosLista;
    private List<Cabecerarecepcionmuestra> ltsEstudiosFiltrados;
    private List<Paciente> ltsPacientes;
    private Paciente paciente;
    private Cabecerarecepcionmuestra crMuestra;
    private String estadoestudiocrm;

    @ManagedProperty("#{registrarMicroscopiaEspecial}")
    private RegistrarMicroscopiaEspecial ctrRegistarMicroscopiaEspacial;

    //Método Constructor
    public ListarEstudiosEspeciales() {

    }

    /*Método que llama al controlador RegistrarMicroscopia para hacer el regsitro de la microscopía
    del estudio seleccionado*/
    public String registrarMicroscopiaEspecial(int idCRM) {
        Cabecerarecepcionmuestra crm = (Cabecerarecepcionmuestra) JPAFactoryDAO.getFactory().getCabecerarecepcionmuestraDAO().read(Integer.valueOf(idCRM));
        getCtrRegistarMicroscopiaEspacial().setCabeceraRM(crm);
        return "/principal/microscopia/registrarMicroscopiaEspecial.HeeSiap";
    }

    //Getters & Setters

    public List<Cabecerarecepcionmuestra> getLtsEstudiosLista() {
        ltsEstudiosLista = JPAFactoryDAO.getFactory().getCabecerarecepcionmuestraDAO().buscarEstudiosParaMicroscopiaEspecial();
        return ltsEstudiosLista;
    }

    public void setLtsEstudiosLista(List<Cabecerarecepcionmuestra> ltsEstudiosLista) {
        this.ltsEstudiosLista = ltsEstudiosLista;
    }

    public List<Cabecerarecepcionmuestra> getLtsEstudiosFiltrados() {
        return ltsEstudiosFiltrados;
    }

    public void setLtsEstudiosFiltrados(List<Cabecerarecepcionmuestra> ltsEstudiosFiltrados) {
        this.ltsEstudiosFiltrados = ltsEstudiosFiltrados;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }   

    public List<Paciente> getLtsPacientes() {
        return ltsPacientes;
    }

    public void setLtsPacientes(List<Paciente> ltsPacientes) {
        this.ltsPacientes = ltsPacientes;
    }

    public Cabecerarecepcionmuestra getCrMuestra() {
        return crMuestra;
    }

    public void setCrMuestra(Cabecerarecepcionmuestra crMuestra) {
        this.crMuestra = crMuestra;
    }

    public String getEstadoestudiocrm() {
        return estadoestudiocrm;
    }

    public void setEstadoestudiocrm(String estadoestudiocrm) {
        this.estadoestudiocrm = estadoestudiocrm;
    }

    public RegistrarMicroscopiaEspecial getCtrRegistarMicroscopiaEspacial() {
        return ctrRegistarMicroscopiaEspacial;
    }

    public void setCtrRegistarMicroscopiaEspacial(RegistrarMicroscopiaEspecial ctrRegistarMicroscopiaEspacial) {
        this.ctrRegistarMicroscopiaEspacial = ctrRegistarMicroscopiaEspacial;
    }
    
    

}
