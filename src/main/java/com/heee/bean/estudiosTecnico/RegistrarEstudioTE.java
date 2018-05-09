package com.heee.bean.estudiosTecnico;

import com.heee.bean.model.entity.Cabecerarecepcionmuestra;
import com.heee.bean.model.entity.Empleado;
import com.heee.bean.model.jpa.JPAFactoryDAO;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.view.ViewScoped;

@ManagedBean(name = "registrarEstudioTE")
//@RequestScoped
@ViewScoped
@SessionScoped

public class RegistrarEstudioTE implements Serializable {

    private static final long serialVersionUID = 1L;

    private Cabecerarecepcionmuestra cabeceraRM;
    private String patologoAsignado;
    List<Empleado> ltsEmpleados;

    public void registrarDescripcionTE() {
        cabeceraRM.setEstadoestudiocrm("Microscopia");
        cabeceraRM.setPatologoasignado(patologoAsignado);
        JPAFactoryDAO.getFactory().getCabecerarecepcionmuestraDAO().update(this.cabeceraRM);
    }

    public Cabecerarecepcionmuestra getCabeceraRM() {
        return cabeceraRM;
    }

    public void setCabeceraRM(Cabecerarecepcionmuestra cabeceraRM) {
        this.cabeceraRM = cabeceraRM;
    }

    public String getPatologoAsignado() {
        return patologoAsignado;
    }

    public void setPatologoAsignado(String patologoAsignado) {
        this.patologoAsignado = patologoAsignado;
    }

    public List<Empleado> getLtsEmpleados() {
        ltsEmpleados = JPAFactoryDAO.getFactory().getEmpleadoDAO().find();
        return ltsEmpleados;
    }

    public void setLtsEmpleados(List<Empleado> ltsEmpleados) {
        this.ltsEmpleados = ltsEmpleados;
    }
    
}
