/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heee.bean.model.jpa;

import com.heee.bean.model.dao.EInHistMarcadorDAO;
import com.heee.bean.model.entity.EinhMarcadores;
import com.heee.bean.model.entity.Estudiosinmunohistoquimica;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author wilmer.valdiviezo
 */
public class JPAEInHistMarcadorDAO extends JPAGenericDAO<EinhMarcadores, Integer> implements EInHistMarcadorDAO{
    public JPAEInHistMarcadorDAO() {
        super(EinhMarcadores.class);
    }

    @Override
    public List<EinhMarcadores> marcadorInmunohistoquimicaPorEstudio(Estudiosinmunohistoquimica estudioInmunohistoquimica) {
        int idEstudio=estudioInmunohistoquimica.getIdeihq(); 
        List<EinhMarcadores> marcadoresEstudioInmunohistoquimica=null;
        
        try {
            String consulta = "select * from einh_marcadores where ideihq=" + idEstudio;
            Query query = em.createNativeQuery(consulta, EinhMarcadores.class);
            marcadoresEstudioInmunohistoquimica = query.getResultList();
            
        } catch (Exception e) {
            System.out.println("error en la consulta SQL en marcadore estudio historquimica por Estudio");
        }
        return marcadoresEstudioInmunohistoquimica;
    }
    
}
