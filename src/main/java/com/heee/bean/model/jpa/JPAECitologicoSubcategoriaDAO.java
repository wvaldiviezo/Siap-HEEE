/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heee.bean.model.jpa;

import com.heee.bean.model.dao.ECitologicoSubcategoriaDAO;
import com.heee.bean.model.entity.ECitologicoSubcategoria;
import com.heee.bean.model.entity.Estudiocitologico;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author wilmer.valdiviezo
 */
public class JPAECitologicoSubcategoriaDAO extends JPAGenericDAO<ECitologicoSubcategoria, Integer> implements ECitologicoSubcategoriaDAO{
    public JPAECitologicoSubcategoriaDAO() {
        super(ECitologicoSubcategoria.class);
    }

    @Override
    public List<ECitologicoSubcategoria> marcadorEstudioCitologicoPorEstudio(Estudiocitologico estudioCitologico) {
        int idEstudio=estudioCitologico.getIdcec(); 
        List<ECitologicoSubcategoria> marcadoresEstudiocitologicos=null;
        
        try {
            String consulta = "select * from e_citologico_subcategoria where idcec =" + idEstudio;
            Query query = em.createNativeQuery(consulta, ECitologicoSubcategoria.class);
            marcadoresEstudiocitologicos = query.getResultList();
            
        } catch (Exception e) {
            System.out.println("error en la consulta SQL en amputacion");
        }
        return marcadoresEstudiocitologicos;
    }
    
}
