
package com.heee.bean.histoquimica;

import com.heee.bean.model.entity.Marcadoreseh;
import com.heee.bean.model.jpa.JPAFactoryDAO;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;


@ManagedBean(name = "histoquimicaListar")
@RequestScoped
public class HistoquimicaListar implements Serializable {

    private List<Marcadoreseh>  marcadores;
    private String[] marcadoresSeleccionados;

    public HistoquimicaListar() {
        marcadores=null;
        marcadoresSeleccionados=null;
    }

    public List<Marcadoreseh> getMarcadores() {
        marcadores=JPAFactoryDAO.getFactory().getMarcadoresEHDAO().find();
        return marcadores;
    }

    public void setMarcadores(List<Marcadoreseh> marcadores) {
        this.marcadores = marcadores;
    }

    public String[] getMarcadoresSeleccionados() {
        return marcadoresSeleccionados;
    }

    public void setMarcadoresSeleccionados(String[] marcadoresSeleccionados) {
        this.marcadoresSeleccionados = marcadoresSeleccionados;
    }
    
    
    
    
}
