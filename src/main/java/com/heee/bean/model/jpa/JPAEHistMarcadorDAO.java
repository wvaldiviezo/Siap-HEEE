/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heee.bean.model.jpa;

import com.heee.bean.model.dao.EHistMarcadorDAO;
import com.heee.bean.model.entity.EHistMarcador;
import com.heee.bean.model.entity.Estudioshistoquimica;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author wilmer.valdiviezo
 */
public class JPAEHistMarcadorDAO extends JPAGenericDAO<EHistMarcador, Integer> implements EHistMarcadorDAO{
    public JPAEHistMarcadorDAO() {
        super(EHistMarcador.class);
    }

    @Override
    public List<EHistMarcador> marcadorHistoquimicaPorEstudio(Estudioshistoquimica estudioHistoquimica) {
        int idEstudio=estudioHistoquimica.getIdeh(); 
        List<EHistMarcador> marcadoresEstudioHistoquimica=null;
        
        try {
            String consulta = "select * from e_hist_marcador where ideh=" + idEstudio;
            Query query = em.createNativeQuery(consulta, EHistMarcador.class);
            marcadoresEstudioHistoquimica = query.getResultList();
            
        } catch (Exception e) {
            System.out.println("error en la consulta SQL en marcadore estudio historquimica por Estudio");
        }
        return marcadoresEstudioHistoquimica;
    }
    
}
