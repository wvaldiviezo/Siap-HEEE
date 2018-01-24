package com.heee.bean.empleado;

import com.heee.bean.model.entity.Area;
import com.heee.bean.model.entity.Cargo;
import com.heee.bean.model.entity.Empleado;
import com.heee.bean.model.entity.Especialidad;
import com.heee.bean.model.jpa.JPAFactoryDAO;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;


@ManagedBean(name = "empleadoListar")
@ViewScoped
public class EmpleadoListar implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<Cargo> cargos;
    private List<Especialidad> especialidades;
    private List<Area> areas;

    private List<Empleado> empleadoLista;
    private List<Empleado> empleadoFiltrado;
    private Cargo cargo;
    private Especialidad especialidad;
    private Area area;
    private Empleado empleado;
    //Actualizar información del Empleado
    @ManagedProperty("#{empleadoActualizar}")
    private ActualizarEmpleado ctrEmpleadoActualizar;
    

    public EmpleadoListar() {
        cargos = null;
        especialidades = null;
        areas = null;
        empleadoLista = null;
        empleadoFiltrado = null;
    }

    public void resetCombo() {
        System.out.println("entro  a reset combo");
        cargos = null;
        especialidades = null;
        areas = null;
        String msg = "";
        UIViewRoot viewRoot = FacesContext.getCurrentInstance().getViewRoot();
        String id = viewRoot.getViewId();
    }
    
    //Método invocado por la acción del botón editar en la vista buscarEmpleado.
    public String actualizarAtributosEmpleado(int idEmpleado){
        Empleado emp = (Empleado)JPAFactoryDAO.getFactory().getEmpleadoDAO().read(Integer.valueOf(idEmpleado));
        getCtrEmpleadoActualizar().setEmpleado(emp);
        return "/principal/administrador/actualizarEmpleado.HeeSiap";
    }
   

    //Getter and Setter
    public List<Cargo> getCargos() {
        return cargos;
    }

    public void setCargos(List<Cargo> cargos) {
        this.cargos = cargos;
    }

    public List<Especialidad> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(List<Especialidad> especialidades) {
        this.especialidades = especialidades;
    }

    //Metodo para listar en la vista
    public List<Empleado> getEmpleadoLista() {
        this.empleadoLista = null;
        if (this.empleadoLista == null) {
            this.empleadoLista = JPAFactoryDAO.getFactory().getEmpleadoDAO().find();
        }
        return this.empleadoLista;
    }

    public void setEmpleadoLista(List<Empleado> empleadoLista) {
        this.empleadoLista = empleadoLista;
    }

    public List<Empleado> getEmpleadoFiltrado() {
        return this.empleadoFiltrado;
    }

    public void setEmpleadoFiltrado(List<Empleado> empleadoFiltrado) {
        this.empleadoFiltrado = empleadoFiltrado;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public List<Area> getAreas() {
        return areas;
    }

    public void setAreas(List<Area> areas) {
        this.areas = areas;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public ActualizarEmpleado getCtrEmpleadoActualizar() {
        return this.ctrEmpleadoActualizar;
    }

    public void setCtrEmpleadoActualizar(ActualizarEmpleado ctrEmpleadoActualizar) {
        this.ctrEmpleadoActualizar = ctrEmpleadoActualizar;
    }

}
