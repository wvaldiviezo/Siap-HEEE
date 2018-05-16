/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heee.bean.estadistica;

import com.heee.bean.model.entity.Contadorestipoestudioanio;
import com.heee.bean.model.entity.Tipoestudio;
import com.heee.bean.model.jpa.JPAFactoryDAO;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import org.primefaces.model.chart.PieChartModel;
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.LineChartSeries;
import org.primefaces.model.chart.CategoryAxis;

@ManagedBean(name = "grafico")
@ViewScoped
public class Grafico implements Serializable {

    private PieChartModel modelo;
    private LineChartModel modelo2;
    private Contadorestipoestudioanio contadorEstudio;
    private List<Contadorestipoestudioanio> cantidadEstudios;
    private List<Contadorestipoestudioanio> contadoresEstudios;
    private List<Contadorestipoestudioanio> estudiosPorAnio;
    private List<Tipoestudio> tiposEstudiosEnBase;
//  private int estudiosTotales;
    private String anio;
    private Date fecha;

    @PostConstruct
    public void init() {
        tiposEstudiosEnBase = null;
        contadoresEstudios = null;
//      estudiosTotales=0;
        fecha = new Date();
        crearGrafico();
    }

    private void crearGrafico() {

        modelo = new PieChartModel();
        anio = new SimpleDateFormat("yyyy").format(fecha);
        System.out.println("an;o" + anio);
//        cantidadEstudios = JPAFactoryDAO.getFactory().getContadoresTipoEstudioAnioDAO().find();
        String[] atributo = {"anioctea"};
        String[] valor = {anio};
        estudiosPorAnio = JPAFactoryDAO.getFactory().getContadoresTipoEstudioAnioDAO().find(atributo, valor);
        
            for (Contadorestipoestudioanio contadores : estudiosPorAnio) {
                System.out.println("contador:" + contadores.getIdte().getNombrete() + ";" + contadores.getNumtipoestudio());
                modelo.set(contadores.getIdte().getNombrete() + " " + contadores.getAnioctea(), contadores.getNumtipoestudio());
            }

//        }
        modelo.setTitle("Estudios ingresados");
        modelo.setLegendPosition("w");
        modelo.setFill(false);
        modelo.setShowDataLabels(true);
        modelo.setDiameter(150);

    }

    public PieChartModel getModelo() {
        return modelo;
    }

    public void setModelo(PieChartModel modelo) {
        this.modelo = modelo;
    }

    public LineChartModel getModelo2() {
        return modelo2;
    }

    public void setModelo2(LineChartModel modelo2) {
        this.modelo2 = modelo2;
    }

    public List<Contadorestipoestudioanio> getEstudiosPorAnio() {
        anio = new SimpleDateFormat("yyyy").format(fecha);
        String[] atributo = {"anioctea"};
        String[] valor = {anio};
        estudiosPorAnio = JPAFactoryDAO.getFactory().getContadoresTipoEstudioAnioDAO().find(atributo, valor);
        return estudiosPorAnio;
    }

    public void setEstudiosPorAnio(List<Contadorestipoestudioanio> estudiosPorAnio) {
        this.estudiosPorAnio = estudiosPorAnio;
    }

}
