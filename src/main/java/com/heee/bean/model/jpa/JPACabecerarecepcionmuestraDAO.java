package com.heee.bean.model.jpa;

import com.heee.bean.model.dao.CabecerarecepcionmuestraDAO;
import com.heee.bean.model.entity.Cabecerarecepcionmuestra;
import java.util.List;
import javax.persistence.Query;

public class JPACabecerarecepcionmuestraDAO extends JPAGenericDAO<Cabecerarecepcionmuestra, Integer> implements CabecerarecepcionmuestraDAO {

    public JPACabecerarecepcionmuestraDAO() {
        super(Cabecerarecepcionmuestra.class);
    }

    /*Método que consulta los estudios con estado Macroscopia para mostrar en el menú de Macroscopía*/
    @Override
    public List<Cabecerarecepcionmuestra> buscarEstudiosAceptados() {
        List estudiosAceptados = null;
        try {
            String consulta = "SELECT * FROM cabecerarecepcionmuestra WHERE estadoestudiocrm = 'Macroscopia'";
            Query query = em.createNativeQuery(consulta, Cabecerarecepcionmuestra.class);
            estudiosAceptados = query.getResultList();
            return estudiosAceptados;
        } catch (Exception e) {
            System.out.println("No hay estudios aceptados");
            return null;
        }
    }

    /*Método que consulta los estudios con estado Tecnico Normal para mostrar en el menu del área técnica normal*/
    @Override
    public List<Cabecerarecepcionmuestra> buscarEstudiosAsignadosTecnicos() {
        List estudiosAceptados = null;
        try {
            String consulta = "SELECT * FROM cabecerarecepcionmuestra where estadoestudiocrm = 'Tecnico Normal'";
            Query query = em.createNativeQuery(consulta, Cabecerarecepcionmuestra.class);
            estudiosAceptados = query.getResultList();
            return estudiosAceptados;
        } catch (Exception e) {
            System.out.println("No hay estudios para el área técnica");
            return null;
        }
    }
    
        /*Método que consulta los estudios con estado Tecnico Normal para mostrar en el menu del área técnica normal*/
    @Override
    public List<Cabecerarecepcionmuestra> buscarEstudiosAsignadosTecnicosEsp() {
        List estudiosAceptados = null;
        try {
            String consulta = "SELECT * FROM cabecerarecepcionmuestra where estadoestudiocrm = 'Tecnico Especial'";
            Query query = em.createNativeQuery(consulta, Cabecerarecepcionmuestra.class);
            estudiosAceptados = query.getResultList();
            return estudiosAceptados;
        } catch (Exception e) {
            System.out.println("No hay estudios para el área técnica");
            return null;
        }
    }

}
