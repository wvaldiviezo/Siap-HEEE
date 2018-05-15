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
    private List<Tipoestudio> tiposEstudiosEnBase;
    private int estudiosTotales;

    @PostConstruct
    public void init() {
        crearGrafico();
        crearGraficoPorAnio();
        contadorEstudio=null;
        estudiosTotales=0;
    }

    private void crearGrafico() {
        modelo = new PieChartModel();
        cantidadEstudios=JPAFactoryDAO.getFactory().getContadoresTipoEstudioAnioDAO().find();
        tiposEstudiosEnBase=JPAFactoryDAO.getFactory().getTipoEstudioDAO().find();
        for(int i=1;i<tiposEstudiosEnBase.size();i++){
            for(Contadorestipoestudioanio contador: cantidadEstudios){
                if(i==contador.getIdte().getIdte()){
                    
                    contadorEstudio=contador;
                    estudiosTotales++;
                }
            }
            modelo.set(contadorEstudio.getIdte().getNombrete()+" "+contadorEstudio.getAnioctea(), estudiosTotales);
            estudiosTotales=0;
            
    
        }

        modelo.setTitle("Estudios ingresados");
        modelo.setLegendPosition("w");
        modelo.setFill(false);
        modelo.setShowDataLabels(true);
        modelo.setDiameter(150);

    
    }
    private void crearGraficoPorAnio(){
       modelo2 = iniciarModeloCategoria();
       modelo2.setTitle("Estudios Por Año");
       modelo2.setLegendPosition("e");
       modelo2.setShowPointLabels(true);
       modelo2.getAxes().put(AxisType.X, new CategoryAxis("Años")) ;
       Axis yAxis = modelo2.getAxis(AxisType.Y);
        yAxis.setLabel("Estudios");
        yAxis.setMin(0);
        yAxis.setMax(200);
    }
    
     private LineChartModel iniciarModeloCategoria() {
        LineChartModel model = new LineChartModel();
 
        ChartSeries boys = new ChartSeries();
        boys.setLabel("Boys");
        boys.set("2004", 120);
        boys.set("2005", 100);
        boys.set("2006", 44);
        boys.set("2007", 150);
        boys.set("2008", 25);
 
        ChartSeries girls = new ChartSeries();
        girls.setLabel("Girls");
        girls.set("2004", 52);
        girls.set("2005", 60);
        girls.set("2006", 110);
        girls.set("2007", 90);
        girls.set("2008", 120);
 
        model.addSeries(boys);
        model.addSeries(girls);
         
        return model;
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
    
    
 

}
