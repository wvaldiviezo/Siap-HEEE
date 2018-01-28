package com.heee.bean.estudiosTecnico;

import com.heee.bean.model.entity.Cabecerarecepcionmuestra;
import com.heee.bean.model.entity.Detallerecepcionmuestra;
import com.heee.bean.model.entity.Paciente;
import com.heee.bean.model.jpa.JPAFactoryDAO;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

@ManagedBean(name = "estudiosParaTecnico")
@ViewScoped
public class ListarEstudios implements Serializable {

    private static final long serialVersionUID = 1L;
    
    //private List<Paciente> ltsPacientes;
    
    private List<Cabecerarecepcionmuestra> ltsEstudioCabecera;
    private List<Cabecerarecepcionmuestra> ltsEstudioFiltradosCRM;
    
    private Paciente paciente;
    //private List<Detallerecepcionmuestra> ltsDetalleLista;

    //private Cabecerarecepcionmuestra crMuestra;
    //private Detallerecepcionmuestra detalleCRM;

    public ListarEstudios() {

    }

    //Getter & Setters
    
//    public List<Paciente> getLtsPacientes() {
//        return ltsPacientes;
//    }
//
//    public void setLtsPacientes(List<Paciente> ltsPacientes) {
//        this.ltsPacientes = ltsPacientes;
//    }

    public List<Cabecerarecepcionmuestra> getLtsEstudioCabecera() {
        ltsEstudioCabecera = JPAFactoryDAO.getFactory().getCabecerarecepcionmuestraDAO().buscarEstudiosAsignadosTecnicos();
        return ltsEstudioCabecera;
    }

    public void setLtsEstudioCabecera(List<Cabecerarecepcionmuestra> ltsEstudioCabecera) {
        this.ltsEstudioCabecera = ltsEstudioCabecera;
    }

    public List<Cabecerarecepcionmuestra> getLtsEstudioFiltradosCRM() {
        return ltsEstudioFiltradosCRM;
    }

    public void setLtsEstudioFiltradosCRM(List<Cabecerarecepcionmuestra> ltsEstudioFiltradosCRM) {
        this.ltsEstudioFiltradosCRM = ltsEstudioFiltradosCRM;
    }
    
    
    
//
//    public List<Detallerecepcionmuestra> getLtsDetalleLista() {
//        return ltsDetalleLista;
//    }

    
//    public void setLtsDetalleLista(List<Detallerecepcionmuestra> ltsDetalleLista) {
//        this.ltsDetalleLista = ltsDetalleLista;
//    }
//
//    public Cabecerarecepcionmuestra getCrMuestra() {
//        return crMuestra;
//    }
//
//    public void setCrMuestra(Cabecerarecepcionmuestra crMuestra) {
//        this.crMuestra = crMuestra;
//    }

//    public Detallerecepcionmuestra getDetalleCRM() {
//        return detalleCRM;
//    }
//
//    public void setDetalleCRM(Detallerecepcionmuestra detalleCRM) {
//        this.detalleCRM = detalleCRM;
//    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

}
