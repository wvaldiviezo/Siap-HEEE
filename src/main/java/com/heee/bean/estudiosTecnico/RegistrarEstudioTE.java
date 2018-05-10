package com.heee.bean.estudiosTecnico;

import com.heee.bean.model.dao.EstudiosBiologiaMolecularDAO;
import com.heee.bean.model.entity.Biologiamolecular;
import com.heee.bean.model.entity.Cabecerarecepcionmuestra;
import com.heee.bean.model.entity.EHistMarcador;
import com.heee.bean.model.entity.EinhMarcadores;
import com.heee.bean.model.entity.Empleado;
import com.heee.bean.model.entity.Estudioshistoquimica;
import com.heee.bean.model.entity.Estudiosinmunohistoquimica;
import com.heee.bean.model.entity.MarcadorBio;
import com.heee.bean.model.entity.Marcadoreseh;
import com.heee.bean.model.jpa.JPAFactoryDAO;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.view.ViewScoped;

@ManagedBean(name = "registrarEstudioTE")
//@RequestScoped
@ViewScoped
@SessionScoped

public class RegistrarEstudioTE implements Serializable {

    private static final long serialVersionUID = 1L;

    private Cabecerarecepcionmuestra cabeceraRM;
    private String patologoAsignado;
    private Estudioshistoquimica estudioHistoquimica;
    private List<Empleado> ltsEmpleados;
    private List<EHistMarcador> marcadoresHistoquimicaEnBase;
    private Estudiosinmunohistoquimica estudioInmunohistoquimica;
    private List<EinhMarcadores> marcadoresInmunohistoquimicaEnBase;
    private Biologiamolecular estudioBiologiaMolecular;
    private List<MarcadorBio> marcadorBiologiaMolecularEnBase;

    public void registrarDescripcionTE() {
        cabeceraRM.setEstadoestudiocrm("Microscopia Especial");
        cabeceraRM.setPatologoasignado(patologoAsignado);
        JPAFactoryDAO.getFactory().getCabecerarecepcionmuestraDAO().update(this.cabeceraRM);
    }

    public Cabecerarecepcionmuestra getCabeceraRM() {
        return cabeceraRM;
    }

    public void setCabeceraRM(Cabecerarecepcionmuestra cabeceraRM) {
        this.cabeceraRM = cabeceraRM;
    }

    public String getPatologoAsignado() {
        return patologoAsignado;
    }

    public void setPatologoAsignado(String patologoAsignado) {
        this.patologoAsignado = patologoAsignado;
    }

    public List<Empleado> getLtsEmpleados() {
        ltsEmpleados = JPAFactoryDAO.getFactory().getEmpleadoDAO().find();
        return ltsEmpleados;
    }

    public void setLtsEmpleados(List<Empleado> ltsEmpleados) {
        this.ltsEmpleados = ltsEmpleados;
    }

    public Estudioshistoquimica getEstudioHistoquimica() {
        return estudioHistoquimica;
    }

    public void setEstudioHistoquimica(Estudioshistoquimica estudioHistoquimica) {
        this.estudioHistoquimica = estudioHistoquimica;
    }

    public List<EHistMarcador> getMarcadoresHistoquimicaEnBase() {
        marcadoresHistoquimicaEnBase=JPAFactoryDAO.getFactory().getEHistMarcadorDAO().marcadorHistoquimicaPorEstudio(estudioHistoquimica);
        return marcadoresHistoquimicaEnBase;
    }

    public void setMarcadoresHistoquimicaEnBase(List<EHistMarcador> marcadoresHistoquimicaEnBase) {
        this.marcadoresHistoquimicaEnBase = marcadoresHistoquimicaEnBase;
    }

    public Estudiosinmunohistoquimica getEstudioInmunohistoquimica() {
        return estudioInmunohistoquimica;
    }

    public void setEstudioInmunohistoquimica(Estudiosinmunohistoquimica estudioInmunohistoquimica) {
        this.estudioInmunohistoquimica = estudioInmunohistoquimica;
    }

    public List<EinhMarcadores> getMarcadoresInmunohistoquimicaEnBase() {
        marcadoresInmunohistoquimicaEnBase=JPAFactoryDAO.getFactory().getEInHistMarcadorDAO().marcadorInmunohistoquimicaPorEstudio(estudioInmunohistoquimica);
        return marcadoresInmunohistoquimicaEnBase;
    }

    public void setMarcadoresInmunohistoquimicaEnBase(List<EinhMarcadores> marcadoresInmunohistoquimicaEnBase) {
        this.marcadoresInmunohistoquimicaEnBase = marcadoresInmunohistoquimicaEnBase;
    }

    public Biologiamolecular getEstudioBiologiaMolecular() {
        return estudioBiologiaMolecular;
    }

    public void setEstudioBiologiaMolecular(Biologiamolecular estudioBiologiaMolecular) {
        this.estudioBiologiaMolecular = estudioBiologiaMolecular;
    }

    public List<MarcadorBio> getMarcadorBiologiaMolecularEnBase() {
        marcadorBiologiaMolecularEnBase=JPAFactoryDAO.getFactory().getMarcadorBioDAO().marcadoresEstudioBiologiaMolecular(estudioBiologiaMolecular);
        return marcadorBiologiaMolecularEnBase;
    }

    public void setMarcadorBiologiaMolecularEnBase(List<MarcadorBio> marcadorBiologiaMolecularEnBase) {
        this.marcadorBiologiaMolecularEnBase = marcadorBiologiaMolecularEnBase;
    }

    
    
    
}
