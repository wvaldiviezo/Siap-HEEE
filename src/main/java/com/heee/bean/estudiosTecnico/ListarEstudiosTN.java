package com.heee.bean.estudiosTecnico;

import com.heee.bean.model.entity.Cabecerarecepcionmuestra;
//import com.heee.bean.model.entity.Detallerecepcionmuestra;
import com.heee.bean.model.entity.Paciente;
import com.heee.bean.model.jpa.JPAFactoryDAO;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.view.ViewScoped;

@ManagedBean(name = "estudiosParaTecnicoN")
@ViewScoped
public class ListarEstudiosTN implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private List<Paciente> ltsPacientes;
    
    private List<Cabecerarecepcionmuestra> ltsEstudiosLista;
    private List<Cabecerarecepcionmuestra> ltsEstudiosFiltrados;
    
    private Paciente paciente;
    //private List<Detallerecepcionmuestra> ltsDetalleLista;

    private Cabecerarecepcionmuestra crMuestra;
    //private Detallerecepcionmuestra detalleCRM;
    
    private String estadoestudiocrm;
    
    @ManagedProperty("#{registrarEstudioTN}")
    private RegistrarEstudioTN ctrRegistarTN;

    public ListarEstudiosTN() {

    }
    
    /*Método que llama al controlador RegistrarMacroscopia para hacer el regsitro de la macroscopía
    del estudio seleccionado*/
    public String registrarEstudioTN(int idCRM) {
        Cabecerarecepcionmuestra crm = (Cabecerarecepcionmuestra) JPAFactoryDAO.getFactory().getCabecerarecepcionmuestraDAO().read(Integer.valueOf(idCRM));
        getCtrRegistarTN().setCabeceraRM(crm);
        return "/principal/tecnico/registrarEstudioTecnicoN.HeeSiap";
    }

    //Getter & Setters

    public List<Cabecerarecepcionmuestra> getLtsEstudiosLista() {
        ltsEstudiosLista = JPAFactoryDAO.getFactory().getCabecerarecepcionmuestraDAO().buscarEstudiosAsignadosTecnicos();
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

    public RegistrarEstudioTN getCtrRegistarTN() {
        return ctrRegistarTN;
    }

    public void setCtrRegistarTN(RegistrarEstudioTN ctrRegistarTN) {
        this.ctrRegistarTN = ctrRegistarTN;
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

//    public Detallerecepcionmuestra getDetalleCRM() {
//        return detalleCRM;
//    }
//
//    public void setDetalleCRM(Detallerecepcionmuestra detalleCRM) {
//        this.detalleCRM = detalleCRM;
//    }

    public String getEstadoestudiocrm() {
        return estadoestudiocrm;
    }

    public void setEstadoestudiocrm(String estadoestudiocrm) {
        this.estadoestudiocrm = estadoestudiocrm;
    }

}
