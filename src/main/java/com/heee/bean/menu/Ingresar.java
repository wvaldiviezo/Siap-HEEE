/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heee.bean.menu;

import com.heee.bean.model.entity.Empleado;
import com.heee.bean.model.entity.Usuario;
import com.heee.bean.model.jpa.JPAFactoryDAO;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;




@ManagedBean(name = "ingresar")
@RequestScoped
//@SessionScoped
//@ViewScoped
public class Ingresar implements Serializable {

    private String nombreUsuario;
    private String contrasenia;
//    private Empleado Empleado= new Empleado();
//    private Usuario Usuario = new Usuario();
    private final FacesContext faceContext;
//    private final HttpServletRequest httpServletRequest;
    /**
     * Creates a new instance of ingresar
     */
    public Ingresar() {
        this.faceContext = FacesContext.getCurrentInstance();
        nombreUsuario=null;
        contrasenia=null;
//        this.httpServletRequest = ((HttpServletRequest)this.faceContext.getExternalContext().getRequest());
        
    }
    //
    public String validarIngreso(){
        
    String redireccion = null;
    System.out.println("Ingreso validacion");
    System.out.println("Nombre:"+nombreUsuario);
    System.out.println("Contrasenia:"+contrasenia);
        String[] usuarioNombreCampo= {"usuariousuario"};
        String[] usuarioNombreValor= {nombreUsuario};

        List<Usuario> usuarioLista=JPAFactoryDAO.getFactory().getUsuarioDAO().find(usuarioNombreCampo, usuarioNombreValor);
       
            if (usuarioLista.isEmpty()){
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Aviso", "Datos Erróneos verifique usuario o contraseña"));
            }else{
                for(Usuario usuario :usuarioLista){
                
                if (usuario.getClaveusuario().equals(contrasenia)){
                
                FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario", usuario);
               
                redireccion = "/principal/bienvenida?faces-redirect=true";  
                 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Aviso", "Datos Correctos"));
                }else{
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Aviso", "Datos Erróneos verifique usuario o contraseña"));
                System.out.println("dato incorrecto");
                }
                }
            
            }
       

        return redireccion;
    }
    // getters and setters

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombre) {
        this.nombreUsuario = nombre;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

//    public Usuario getUsuario() {
//        return Usuario;
//    }
//
//    public void setUsuario(Usuario usuario) {
//        this.Usuario = usuario;
//    }
//
//    public Empleado getEmpleado() {
//        return Empleado;
//    }
//
//    public void setEmpleado(Empleado Empleado) {
//        this.Empleado = Empleado;
//    }
    
    
    
}
