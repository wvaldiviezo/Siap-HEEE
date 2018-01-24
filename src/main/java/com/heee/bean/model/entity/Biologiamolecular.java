/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heee.bean.model.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author EPN
 */
@Entity
@Table(name = "biologiamolecular")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Biologiamolecular.findAll", query = "SELECT b FROM Biologiamolecular b"),
    @NamedQuery(name = "Biologiamolecular.findByIdbiologiamolecular", query = "SELECT b FROM Biologiamolecular b WHERE b.idbiologiamolecular = :idbiologiamolecular"),
    @NamedQuery(name = "Biologiamolecular.findByIdcabecerarecepcionmuestrabm", query = "SELECT b FROM Biologiamolecular b WHERE b.idcabecerarecepcionmuestrabm = :idcabecerarecepcionmuestrabm"),
    @NamedQuery(name = "Biologiamolecular.findByRecomendaciopatologo", query = "SELECT b FROM Biologiamolecular b WHERE b.recomendaciopatologo = :recomendaciopatologo"),
    @NamedQuery(name = "Biologiamolecular.findByCaracteristicamuestra", query = "SELECT b FROM Biologiamolecular b WHERE b.caracteristicamuestra = :caracteristicamuestra"),
    @NamedQuery(name = "Biologiamolecular.findByMotivocaracteristica", query = "SELECT b FROM Biologiamolecular b WHERE b.motivocaracteristica = :motivocaracteristica"),
    @NamedQuery(name = "Biologiamolecular.findByRepetirestudio", query = "SELECT b FROM Biologiamolecular b WHERE b.repetirestudio = :repetirestudio"),
    @NamedQuery(name = "Biologiamolecular.findByRevisadoporpatologo", query = "SELECT b FROM Biologiamolecular b WHERE b.revisadoporpatologo = :revisadoporpatologo"),
    @NamedQuery(name = "Biologiamolecular.findByValornegativo", query = "SELECT b FROM Biologiamolecular b WHERE b.valornegativo = :valornegativo"),
    @NamedQuery(name = "Biologiamolecular.findByValorpositivo", query = "SELECT b FROM Biologiamolecular b WHERE b.valorpositivo = :valorpositivo"),
    @NamedQuery(name = "Biologiamolecular.findByResponsabletomacitologica", query = "SELECT b FROM Biologiamolecular b WHERE b.responsabletomacitologica = :responsabletomacitologica"),
    @NamedQuery(name = "Biologiamolecular.findByMuestrarepetida", query = "SELECT b FROM Biologiamolecular b WHERE b.muestrarepetida = :muestrarepetida"),
    @NamedQuery(name = "Biologiamolecular.findByCodigocitologicoanterior", query = "SELECT b FROM Biologiamolecular b WHERE b.codigocitologicoanterior = :codigocitologicoanterior"),
    @NamedQuery(name = "Biologiamolecular.findByGestas", query = "SELECT b FROM Biologiamolecular b WHERE b.gestas = :gestas"),
    @NamedQuery(name = "Biologiamolecular.findByMenarca", query = "SELECT b FROM Biologiamolecular b WHERE b.menarca = :menarca"),
    @NamedQuery(name = "Biologiamolecular.findByPartos", query = "SELECT b FROM Biologiamolecular b WHERE b.partos = :partos"),
    @NamedQuery(name = "Biologiamolecular.findByCesareas", query = "SELECT b FROM Biologiamolecular b WHERE b.cesareas = :cesareas"),
    @NamedQuery(name = "Biologiamolecular.findByAbortos", query = "SELECT b FROM Biologiamolecular b WHERE b.abortos = :abortos"),
    @NamedQuery(name = "Biologiamolecular.findByFechaultimamestruacion", query = "SELECT b FROM Biologiamolecular b WHERE b.fechaultimamestruacion = :fechaultimamestruacion"),
    @NamedQuery(name = "Biologiamolecular.findByIniciovidasexual", query = "SELECT b FROM Biologiamolecular b WHERE b.iniciovidasexual = :iniciovidasexual"),
    @NamedQuery(name = "Biologiamolecular.findByFechacreabm", query = "SELECT b FROM Biologiamolecular b WHERE b.fechacreabm = :fechacreabm"),
    @NamedQuery(name = "Biologiamolecular.findByIdusuariocreabm", query = "SELECT b FROM Biologiamolecular b WHERE b.idusuariocreabm = :idusuariocreabm"),
    @NamedQuery(name = "Biologiamolecular.findByFechaactualizabm", query = "SELECT b FROM Biologiamolecular b WHERE b.fechaactualizabm = :fechaactualizabm"),
    @NamedQuery(name = "Biologiamolecular.findByIdsuarioactualiza", query = "SELECT b FROM Biologiamolecular b WHERE b.idsuarioactualiza = :idsuarioactualiza")})
public class Biologiamolecular implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idbiologiamolecular")
    private Integer idbiologiamolecular;
    @Column(name = "idcabecerarecepcionmuestrabm")
    private Integer idcabecerarecepcionmuestrabm;
    @Size(max = 250)
    @Column(name = "recomendaciopatologo")
    private String recomendaciopatologo;
    @Size(max = 15)
    @Column(name = "caracteristicamuestra")
    private String caracteristicamuestra;
    @Size(max = 150)
    @Column(name = "motivocaracteristica")
    private String motivocaracteristica;
    @Column(name = "repetirestudio")
    private Boolean repetirestudio;
    @Column(name = "revisadoporpatologo")
    private Boolean revisadoporpatologo;
    @Column(name = "valornegativo")
    private Integer valornegativo;
    @Column(name = "valorpositivo")
    private Integer valorpositivo;
    @Size(max = 150)
    @Column(name = "responsabletomacitologica")
    private String responsabletomacitologica;
    @Column(name = "muestrarepetida")
    private Boolean muestrarepetida;
    @Size(max = 150)
    @Column(name = "codigocitologicoanterior")
    private String codigocitologicoanterior;
    @Column(name = "gestas")
    private Integer gestas;
    @Column(name = "menarca")
    private Integer menarca;
    @Column(name = "partos")
    private Integer partos;
    @Column(name = "cesareas")
    private Integer cesareas;
    @Column(name = "abortos")
    private Integer abortos;
    @Column(name = "fechaultimamestruacion")
    @Temporal(TemporalType.DATE)
    private Date fechaultimamestruacion;
    @Column(name = "iniciovidasexual")
    private Boolean iniciovidasexual;
    @Column(name = "fechacreabm")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechacreabm;
    @Column(name = "idusuariocreabm")
    private Integer idusuariocreabm;
    @Column(name = "fechaactualizabm")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaactualizabm;
    @Column(name = "idsuarioactualiza")
    private Integer idsuarioactualiza;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idbiologiamolecular")
    private List<BiomoleCarcadorSub> biomoleCarcadorSubList;

    public Biologiamolecular() {
    }

    public Biologiamolecular(Integer idbiologiamolecular) {
        this.idbiologiamolecular = idbiologiamolecular;
    }

    public Integer getIdbiologiamolecular() {
        return idbiologiamolecular;
    }

    public void setIdbiologiamolecular(Integer idbiologiamolecular) {
        this.idbiologiamolecular = idbiologiamolecular;
    }

    public Integer getIdcabecerarecepcionmuestrabm() {
        return idcabecerarecepcionmuestrabm;
    }

    public void setIdcabecerarecepcionmuestrabm(Integer idcabecerarecepcionmuestrabm) {
        this.idcabecerarecepcionmuestrabm = idcabecerarecepcionmuestrabm;
    }

    public String getRecomendaciopatologo() {
        return recomendaciopatologo;
    }

    public void setRecomendaciopatologo(String recomendaciopatologo) {
        this.recomendaciopatologo = recomendaciopatologo;
    }

    public String getCaracteristicamuestra() {
        return caracteristicamuestra;
    }

    public void setCaracteristicamuestra(String caracteristicamuestra) {
        this.caracteristicamuestra = caracteristicamuestra;
    }

    public String getMotivocaracteristica() {
        return motivocaracteristica;
    }

    public void setMotivocaracteristica(String motivocaracteristica) {
        this.motivocaracteristica = motivocaracteristica;
    }

    public Boolean getRepetirestudio() {
        return repetirestudio;
    }

    public void setRepetirestudio(Boolean repetirestudio) {
        this.repetirestudio = repetirestudio;
    }

    public Boolean getRevisadoporpatologo() {
        return revisadoporpatologo;
    }

    public void setRevisadoporpatologo(Boolean revisadoporpatologo) {
        this.revisadoporpatologo = revisadoporpatologo;
    }

    public Integer getValornegativo() {
        return valornegativo;
    }

    public void setValornegativo(Integer valornegativo) {
        this.valornegativo = valornegativo;
    }

    public Integer getValorpositivo() {
        return valorpositivo;
    }

    public void setValorpositivo(Integer valorpositivo) {
        this.valorpositivo = valorpositivo;
    }

    public String getResponsabletomacitologica() {
        return responsabletomacitologica;
    }

    public void setResponsabletomacitologica(String responsabletomacitologica) {
        this.responsabletomacitologica = responsabletomacitologica;
    }

    public Boolean getMuestrarepetida() {
        return muestrarepetida;
    }

    public void setMuestrarepetida(Boolean muestrarepetida) {
        this.muestrarepetida = muestrarepetida;
    }

    public String getCodigocitologicoanterior() {
        return codigocitologicoanterior;
    }

    public void setCodigocitologicoanterior(String codigocitologicoanterior) {
        this.codigocitologicoanterior = codigocitologicoanterior;
    }

    public Integer getGestas() {
        return gestas;
    }

    public void setGestas(Integer gestas) {
        this.gestas = gestas;
    }

    public Integer getMenarca() {
        return menarca;
    }

    public void setMenarca(Integer menarca) {
        this.menarca = menarca;
    }

    public Integer getPartos() {
        return partos;
    }

    public void setPartos(Integer partos) {
        this.partos = partos;
    }

    public Integer getCesareas() {
        return cesareas;
    }

    public void setCesareas(Integer cesareas) {
        this.cesareas = cesareas;
    }

    public Integer getAbortos() {
        return abortos;
    }

    public void setAbortos(Integer abortos) {
        this.abortos = abortos;
    }

    public Date getFechaultimamestruacion() {
        return fechaultimamestruacion;
    }

    public void setFechaultimamestruacion(Date fechaultimamestruacion) {
        this.fechaultimamestruacion = fechaultimamestruacion;
    }

    public Boolean getIniciovidasexual() {
        return iniciovidasexual;
    }

    public void setIniciovidasexual(Boolean iniciovidasexual) {
        this.iniciovidasexual = iniciovidasexual;
    }

    public Date getFechacreabm() {
        return fechacreabm;
    }

    public void setFechacreabm(Date fechacreabm) {
        this.fechacreabm = fechacreabm;
    }

    public Integer getIdusuariocreabm() {
        return idusuariocreabm;
    }

    public void setIdusuariocreabm(Integer idusuariocreabm) {
        this.idusuariocreabm = idusuariocreabm;
    }

    public Date getFechaactualizabm() {
        return fechaactualizabm;
    }

    public void setFechaactualizabm(Date fechaactualizabm) {
        this.fechaactualizabm = fechaactualizabm;
    }

    public Integer getIdsuarioactualiza() {
        return idsuarioactualiza;
    }

    public void setIdsuarioactualiza(Integer idsuarioactualiza) {
        this.idsuarioactualiza = idsuarioactualiza;
    }

    @XmlTransient
    public List<BiomoleCarcadorSub> getBiomoleCarcadorSubList() {
        return biomoleCarcadorSubList;
    }

    public void setBiomoleCarcadorSubList(List<BiomoleCarcadorSub> biomoleCarcadorSubList) {
        this.biomoleCarcadorSubList = biomoleCarcadorSubList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idbiologiamolecular != null ? idbiologiamolecular.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Biologiamolecular)) {
            return false;
        }
        Biologiamolecular other = (Biologiamolecular) object;
        if ((this.idbiologiamolecular == null && other.idbiologiamolecular != null) || (this.idbiologiamolecular != null && !this.idbiologiamolecular.equals(other.idbiologiamolecular))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.heee.bean.model.entity.Biologiamolecular[ idbiologiamolecular=" + idbiologiamolecular + " ]";
    }
    
}
