package com.heee.bean.estudiosMacroscopia;

import com.heee.bean.model.entity.Cabecerarecepcionmuestra;
import com.heee.bean.model.entity.Detallerecepcionmuestra;
import com.heee.bean.model.entity.Paciente;
import com.heee.bean.model.entity.Tipoestudio;
import com.heee.bean.model.jpa.JPAFactoryDAO;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import javax.faces.bean.ManagedProperty;

@ManagedBean(name = "estudiosParaMacro")
@ViewScoped
public class ListarEstudios implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<Paciente> ltsPacientes;
    private List<Cabecerarecepcionmuestra> ltsEstudioLista;
    private List<Cabecerarecepcionmuestra> ltsEstudioFiltrados;
    //private List<Tipoestudio> ltsTiposEstudios;

    private Paciente paciente;
    private Cabecerarecepcionmuestra crMuestra;
    //private Tipoestudio tipoEstudio;

    private Detallerecepcionmuestra detalleCRM;

    @ManagedProperty("#{registrarMacroscopia}")
    private RegistrarMacroscopia ctrRegistrarMacro;
    
    private String estadoestudiocrm;

    /*Método contructor*/
    public ListarEstudios() {

    }

    /*Método que llama al controlador RegistrarMacroscopia para hacer el regsitro de la macroscopía
    del estudio seleccionado*/
    public String registrarMacroscopia(int idCRM) {
        Cabecerarecepcionmuestra crm = (Cabecerarecepcionmuestra) JPAFactoryDAO.getFactory().getCabecerarecepcionmuestraDAO().read(Integer.valueOf(idCRM));
        getCtrRegistrarMacro().setCabeceraRM(crm);
        return "/principal/macroscopia/registroMacroscopia.HeeSiap";
    }

    //Getters and Setters
    public List<Paciente> getLtsPacientes() {
        return ltsPacientes;
    }

    public void setLtsPacientes(List<Paciente> ltsPacientes) {
        this.ltsPacientes = ltsPacientes;
    }

    /*Método para filtrar los estudios con estado ACEPTADO que fueron registrados por la secretaria*/
    public List<Cabecerarecepcionmuestra> getLtsEstudioLista() {  
        //cantones = JPAFactoryDAO.getFactory().getCantonDAO().buscarCantonPorProvincia(provinciaID);
        ltsEstudioLista = JPAFactoryDAO.getFactory().getCabecerarecepcionmuestraDAO().buscarEstudiosAceptados();
        return ltsEstudioLista;
        /*
        this.ltsEstudioLista = null;
        if (this.ltsEstudioLista == null) {
            this.ltsEstudioLista = JPAFactoryDAO.getFactory().getCabecerarecepcionmuestraDAO().find();
            for(Cabecerarecepcionmuestra crm : ltsEstudioLista){
                if(crm.getEstadoestudiocrm().equals("Aceptado")){
                    System.out.println("111111111"+crm);
                    
                }
            }
        }
        return ltsEstudioLista;
*/
    }

    public void setLtsEstudioLista(List<Cabecerarecepcionmuestra> ltsEstudioLista) {
        this.ltsEstudioLista = ltsEstudioLista;
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

    public List<Cabecerarecepcionmuestra> getLtsEstudioFiltrados() {
        return ltsEstudioFiltrados;
    }

    public void setLtsEstudioFiltrados(List<Cabecerarecepcionmuestra> ltsEstudioFiltrados) {
        this.ltsEstudioFiltrados = ltsEstudioFiltrados;
    }

    public RegistrarMacroscopia getCtrRegistrarMacro() {
        return ctrRegistrarMacro;
    }

    public void setCtrRegistrarMacro(RegistrarMacroscopia ctrRegistrarMacro) {
        this.ctrRegistrarMacro = ctrRegistrarMacro;
    }

    public Detallerecepcionmuestra getDetalleCRM() {
        return detalleCRM;
    }

    public void setDetalleCRM(Detallerecepcionmuestra detalleCRM) {
        this.detalleCRM = detalleCRM;
    }

    public String getEstadoestudiocrm() {
        return estadoestudiocrm;
    }

    public void setEstadoestudiocrm(String estadoestudiocrm) {
        this.estadoestudiocrm = estadoestudiocrm;
    }
    

}
