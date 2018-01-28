/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heee.bean.estudiosTecnico;

import com.heee.bean.model.entity.Cabecerarecepcionmuestra;
import com.heee.bean.model.entity.Paciente;
import com.heee.bean.model.jpa.JPAFactoryDAO;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

@ManagedBean(name = "estudiosParaTecnicoE")
@ViewScoped
public class ListarEstudiosTE implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private List<Cabecerarecepcionmuestra> ltsEstudioCabecera;
    private List<Cabecerarecepcionmuestra> ltsEstudioFiltradosCRM;
    
    private Paciente paciente;
    
    public ListarEstudiosTE(){
        
    }
    
    //Getters & Setters

    public List<Cabecerarecepcionmuestra> getLtsEstudioCabecera() {
        ltsEstudioCabecera = JPAFactoryDAO.getFactory().getCabecerarecepcionmuestraDAO().buscarEstudiosAsignadosTecnicosEsp();
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
    
    
}
