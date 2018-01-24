package com.heee.bean.usuario;

import com.heee.bean.menu.SessionBean;
import com.heee.bean.model.entity.Empleado;
import com.heee.bean.model.entity.Usuario;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;


@ManagedBean(name = "usuarioController")
public class UsuarioCrear implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private Empleado empleado;
    private Usuario usuario;
    
    SessionBean sesion = new SessionBean();
    
    private List<Empleado> verificarExistenciaVector;
    
    
    /*Método Constructor*/
    public UsuarioCrear(){
        this.empleado = new Empleado(); //Inicialización de la variable        
    }
    
    /*Método para validar los duplicados*/
    
    
    /*Getters & Setters*/

    public Empleado getEmpleado() {
       if(this.empleado == null) {
           this.empleado = new Empleado();
       }
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public SessionBean getSesion() {
        return sesion;
    }

    public void setSesion(SessionBean sesion) {
        this.sesion = sesion;
    }

    public List<Empleado> getVerificarExistenciaVector() {
        return verificarExistenciaVector;
    }

    public void setVerificarExistenciaVector(List<Empleado> verificarExistenciaVector) {
        this.verificarExistenciaVector = verificarExistenciaVector;
    }
    
    
    
    
}
