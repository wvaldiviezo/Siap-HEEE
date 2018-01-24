package com.heee.bean.model.jpa;

import com.heee.bean.model.dao.UsuarioDAO;
import com.heee.bean.model.entity.Usuario;
import java.util.List;
import javax.persistence.Query;

public class JPAUsuarioDAO extends JPAGenericDAO<Usuario, Integer> implements UsuarioDAO {

    public JPAUsuarioDAO() {
        super(Usuario.class);
    }
    
    /*Método que permite hacer el Inicio de Sesión*/
    
    /*
    @Override
    public Usuario iniciarSesion(Usuario us) {
        Usuario usuario = null;
        String consulta;  //Las consultas que se van ha realizar son de tipo JPQL.

        try {
            consulta = "FROM Usuario u WHERE u.usuario = ?1 and u.claveUsuario = ?2"; //usuario y claveUsuario son los nombres del atributo del modelo, no de la tabla //?1 y ?2 se indica que las variables van a recibir parámetros.
            Query query = em.createQuery(consulta);
            //Paso de parámetros que vienen desde el controlador
            query.setParameter(1, us.getUsuario());
            query.setParameter(2, us.getClaveUsuario());

            List<Usuario> lista = query.getResultList(); //Obtención de la lista de la consulta
            //comprobación
            if (!lista.isEmpty()) {
                usuario = lista.get(0);
            }
        } catch (Exception e) {
            throw e;
        }
        return usuario;
    }
    
*/
    
}
