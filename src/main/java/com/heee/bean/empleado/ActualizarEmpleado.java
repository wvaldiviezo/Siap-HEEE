package com.heee.bean.empleado;

import com.heee.bean.model.entity.Area;
import com.heee.bean.model.entity.Cargo;
import com.heee.bean.model.entity.Empleado;
import com.heee.bean.model.entity.Especialidad;
import com.heee.bean.model.jpa.JPAFactoryDAO;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;

@ManagedBean(name = "empleadoActualizar")
//@ViewScoped
@SessionScoped
public class ActualizarEmpleado implements Serializable {

    private Empleado empleado;
    private Especialidad especialidad;
    private Cargo cargo;
    private Area area;
    private List<Especialidad> especialidades;
    private List<Cargo> cargos;
    private List<Area> areas;

    public ActualizarEmpleado() {
        this.empleado = new Empleado();
        especialidades = null;
        cargos = null;
        areas = null;
    }

    //Método para guardar los cambios realizados en la información del empleado seleccionado en la vista actualizarEmpleado
    public String guardar() {
        try {
            this.cargo.setIdcargo(this.cargo.getIdcargo());
            this.empleado.setIdcargo(cargo);
            JPAFactoryDAO.getFactory().getEmpleadoDAO().update(this.empleado);

            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Aviso", "Información actualizada con éxito"));
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Aviso", "Actualización fallida !!!"));
        }

        return "/principal/administrador/buscarEmpleado.HeeSiap";
    }

    //Método para cancelar la edición de la información del empleado
    public String cancelar() {
        return "/principal/administrador/buscarEmpleado.HeeSiap";
    }

    //Getters & Setters
    public Empleado getEmpleado() {
        return this.empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public List<Especialidad> getEspecialidades() {
        this.especialidades = null;
        if (this.especialidades == null) {
            this.especialidades = JPAFactoryDAO.getFactory().getEspecialidadDAO().find();
        }
        return especialidades;
    }

    public void setEspecialidades(List<Especialidad> especialidades) {
        this.especialidades = especialidades;
    }

    public List<Cargo> getCargos() {
        this.cargos = null;
        if (this.cargos == null) {
            this.cargos = JPAFactoryDAO.getFactory().getCargoDAO().find();
        }
        return cargos;
    }

    public void setCargos(List<Cargo> cargos) {
        this.cargos = cargos;
    }

    public List<Area> getAreas() {
        this.areas = null;
        if (this.areas == null) {
            this.areas = JPAFactoryDAO.getFactory().getAreaDAO().find();
        }
        return areas;
    }

    public void setAreas(List<Area> areas) {
        this.areas = areas;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

}
