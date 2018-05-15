/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heee.bean.estadisticas;

import com.heee.bean.model.entity.Contadorestipoestudioanio;
import com.heee.bean.model.entity.Tipoestudio;
import com.heee.bean.model.jpa.JPAFactoryDAO;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

@ManagedBean(name = "estadisticasMensuales")
@ViewScoped
public class EstadisticasMensuales implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<Contadorestipoestudioanio> ltsContTipoEstudio;
    private List<Tipoestudio> ltsTipoEstudios;

    public EstadisticasMensuales() {

    }
    
    //Getters & Setters

    public List<Contadorestipoestudioanio> getLtsContTipoEstudio() {
        return ltsContTipoEstudio;
    }

    public void setLtsContTipoEstudio(List<Contadorestipoestudioanio> ltsContTipoEstudio) {
        this.ltsContTipoEstudio = ltsContTipoEstudio;
    }

    public List<Tipoestudio> getLtsTipoEstudios() {
        return ltsTipoEstudios;
    }

    public void setLtsTipoEstudios(List<Tipoestudio> ltsTipoEstudios) {
        this.ltsTipoEstudios = ltsTipoEstudios;
    }
    
}
