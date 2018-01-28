package com.heee.bean.model.dao;

import com.heee.bean.model.entity.Cabecerarecepcionmuestra;
import java.util.List;
public interface CabecerarecepcionmuestraDAO extends GenericDAO<Cabecerarecepcionmuestra, Integer>{
    public List<Cabecerarecepcionmuestra> buscarEstudiosAceptados();
    public List<Cabecerarecepcionmuestra> buscarEstudiosAsignadosTecnicos();
    public List<Cabecerarecepcionmuestra> buscarEstudiosAsignadosTecnicosEsp();
    
}
