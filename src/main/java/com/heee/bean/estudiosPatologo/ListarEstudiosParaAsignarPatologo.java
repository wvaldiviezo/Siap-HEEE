package com.heee.bean.estudiosPatologo;

import com.heee.bean.model.entity.Cabecerarecepcionmuestra;
import com.heee.bean.model.entity.Paciente;
import com.heee.bean.model.jpa.JPAFactoryDAO;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

@ManagedBean(name = "distribucionEstudiosPatologo")
@ViewScoped
public class ListarEstudiosParaAsignarPatologo implements Serializable{
    
     private static final long serialVersionUID = 1L;
    
    private List<Cabecerarecepcionmuestra> ltsEstudioCabecera;
    private List<Cabecerarecepcionmuestra> ltsEstudioFiltradosCRM;
    
    private Paciente paciente;
    
    private Cabecerarecepcionmuestra crMuestra;
    
    public ListarEstudiosParaAsignarPatologo (){
        
    }
    
    //Getters & Setters

    public List<Cabecerarecepcionmuestra> getLtsEstudioCabecera() {
        ltsEstudioCabecera = JPAFactoryDAO.getFactory().getCabecerarecepcionmuestraDAO().buscarEstudiosParaMicroscopia();
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

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Cabecerarecepcionmuestra getCrMuestra() {
        return crMuestra;
    }

    public void setCrMuestra(Cabecerarecepcionmuestra crMuestra) {
        this.crMuestra = crMuestra;
    }
    
    
    
}
