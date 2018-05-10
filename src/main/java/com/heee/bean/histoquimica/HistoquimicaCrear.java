package com.heee.bean.histoquimica;

import com.heee.bean.contadorEstudios.contadorEstudioCrear;
import com.heee.bean.model.dao.TipoEstudioDAO;
import com.heee.bean.model.entity.Cabecerarecepcionmuestra;
import com.heee.bean.model.entity.Doctor;
import com.heee.bean.model.entity.EHistMarcador;
import com.heee.bean.model.entity.Estudiosamputaciones;
import com.heee.bean.model.entity.Estudioshistoquimica;
import com.heee.bean.model.entity.Hospital;
import com.heee.bean.model.entity.Marcadoreseh;
import com.heee.bean.model.entity.Paciente;
import com.heee.bean.model.entity.Parroquia;
import com.heee.bean.model.entity.Partes;
import com.heee.bean.model.entity.Tipoestudio;
import com.heee.bean.model.jpa.JPAFactoryDAO;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "histoquimicaCrear")
@ViewScoped
@RequestScoped

public class HistoquimicaCrear implements Serializable {

    private List<Hospital> hospitalesEnBase;
    private List<Estudioshistoquimica> estudiosHistoquimicaEnBase;
    private List<Cabecerarecepcionmuestra> cabecerasEnBase;
    private List<Doctor> doctoresEnBase;
    private List<Paciente> pacientesEnBase;
    private List<Tipoestudio> tiposEstudiosEnBase;
    private List<Marcadoreseh> listaMarcadoresHistoquimicaEnBase;
    private List<Marcadoreseh> listaMarcadoresSeleccionados;
    private String[] marcadoresSeleccionados;
    private Cabecerarecepcionmuestra cabecera;
    private Doctor doctor;
    private Marcadoreseh marcadoreseh;
    private Paciente paciente;
    private Parroquia parroquia;
    private EHistMarcador marcadorEstudioHistoquimica;
    private int parroquiaID;
    private Hospital hospital;
    private int partesID;
    private int numeroEstudio;
    private String nombreEstudio;
    private Partes partes;
    private Estudioshistoquimica estudioHistoquimica;
    private contadorEstudioCrear contadorEstudio;
    //private MarcadorEsParteDeEh marcadorParteEH;
    //private MarcadorEsParteDeEhPK marcadorParteEHpk;
    private Date fechaCreacion = new Date();

    public HistoquimicaCrear() {
        doctoresEnBase = null;
        pacientesEnBase = null;
        hospitalesEnBase = null;
        tiposEstudiosEnBase=null;
        estudiosHistoquimicaEnBase=null;
        marcadoresSeleccionados=null;
        listaMarcadoresHistoquimicaEnBase=null;
        listaMarcadoresSeleccionados=null;
        
        this.cabecera = new Cabecerarecepcionmuestra();
        this.cabecera.setEstadoestudiocrm("Tecnico Especial");
        this.doctor = new Doctor();
        this.partes = new Partes();
        this.paciente = new Paciente();
        this.hospital = new Hospital();
        this.parroquia = new Parroquia();
        this.contadorEstudio = new contadorEstudioCrear();
        this.marcadoreseh = new Marcadoreseh();
        this.marcadorEstudioHistoquimica =new EHistMarcador();
        this.estudioHistoquimica=new Estudioshistoquimica();
        parroquiaID = 0;
        partesID = 0;
        numeroEstudio = 0;
        nombreEstudio="";
        
        //this.marcadorParteEH = new MarcadorEsParteDeEh();
       // this.marcadorParteEHpk = new MarcadorEsParteDeEhPK();

    }

    public void regristrarHistoquimica() {
        System.out.println("ingreso a guardar himunohistoquimica");
        
        this.parroquia.setIdparroquia(this.parroquiaID);
        this.hospital.setIdparroquia(parroquia);
        JPAFactoryDAO.getFactory().getHospitalDAO().create(hospital);
        
        JPAFactoryDAO.getFactory().getDoctorDAO().create(doctor);
        JPAFactoryDAO.getFactory().getPacienteDAO().create(paciente);
        
        hospitalesEnBase = JPAFactoryDAO.getFactory().getHospitalDAO().find();
        this.cabecera.setIdhospital(hospitalesEnBase.get(hospitalesEnBase.size() - 1));
        doctoresEnBase = JPAFactoryDAO.getFactory().getDoctorDAO().find();
        this.cabecera.setIddoctor(doctoresEnBase.get(doctoresEnBase.size() - 1));
        pacientesEnBase = JPAFactoryDAO.getFactory().getPacienteDAO().find();
        this.cabecera.setIdpaciente(pacientesEnBase.get(pacientesEnBase.size() - 1));
        this.cabecera.setFechacreacrm(fechaCreacion);
        String[] atributo = {"nombrete"};
        String[] valor = {nombreEstudio};
        tiposEstudiosEnBase = JPAFactoryDAO.getFactory().getTipoEstudioDAO().find(atributo, valor);
        this.cabecera.setIdte(tiposEstudiosEnBase.get(tiposEstudiosEnBase.size() - 1));
        JPAFactoryDAO.getFactory().getCabecerarecepcionmuestraDAO().create(cabecera);
        System.out.println("empezo a guardar histoquimica");
        cabecerasEnBase=JPAFactoryDAO.getFactory().getCabecerarecepcionmuestraDAO().find();
        this.estudioHistoquimica.setIdcabecerarecepcionmuestraeh(cabecerasEnBase.get(cabecerasEnBase.size()-1).getIdcrm());
        JPAFactoryDAO.getFactory().getEstudiosHistoquimicaDAO().create(estudioHistoquimica);
        System.out.println("termino de guardar histoquimica");
        estudiosHistoquimicaEnBase=JPAFactoryDAO.getFactory().getEstudiosHistoquimicaDAO().find();
        contadorEstudio.contarEstudio();
        
        this.cabecera.setFechacreacrm(this.fechaCreacion);


for( String marcador: marcadoresSeleccionados){   
        marcadorEstudioHistoquimica.setIdeh(estudiosHistoquimicaEnBase.get(estudiosHistoquimicaEnBase.size()-1));
        marcadoreseh.setIdmarcadoreh(Integer.parseInt(marcador));
        marcadorEstudioHistoquimica.setIdmarcadoreh(this.marcadoreseh);
        JPAFactoryDAO.getFactory().getEHistMarcadorDAO().create(marcadorEstudioHistoquimica);
    }
    
}
    

  

    public String[] getMarcadoresSeleccionados() {
        return marcadoresSeleccionados;
    }

    public void setMarcadoresSeleccionados(String[] marcadoresSeleccionados) {
        this.marcadoresSeleccionados = marcadoresSeleccionados;
    }


    public Cabecerarecepcionmuestra getCabecera() {
        return cabecera;
    }

    public void setCabecera(Cabecerarecepcionmuestra cabecera) {
        this.cabecera = cabecera;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Parroquia getParroquia() {
        return parroquia;
    }

    public Marcadoreseh getMarcadoreseh() {
        return marcadoreseh;
    }

    public void setMarcadoreseh(Marcadoreseh marcadoreseh) {
        this.marcadoreseh = marcadoreseh;
    }

    public contadorEstudioCrear getContadorEstudio() {
        return contadorEstudio;
    }

    public void setContadorEstudio(contadorEstudioCrear contadorEstudio) {
        this.contadorEstudio = contadorEstudio;
    }

    public void setParroquia(Parroquia parroquia) {
        this.parroquia = parroquia;
    }

    public int getParroquiaID() {
        return parroquiaID;
    }

    public void setParroquiaID(int parroquiaID) {
        this.parroquiaID = parroquiaID;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public int getPartesID() {
        return partesID;
    }

    public void setPartesID(int partesID) {
        this.partesID = partesID;
    }

    public int getNumeroEstudio() {
        return numeroEstudio;
    }

    public void setNumeroEstudio(int numeroEstudio) {
        this.numeroEstudio = numeroEstudio;
    }

    public Partes getPartes() {
        return partes;
    }

    public void setPartes(Partes partes) {
        this.partes = partes;
    }

    public Estudioshistoquimica getEstudioHistoquimica() {
        return estudioHistoquimica;
    }

    public void setEstudioHistoquimica(Estudioshistoquimica estudioHistoquimica) {
        this.estudioHistoquimica = estudioHistoquimica;
    }
    
/*
    public MarcadorEsParteDeEh getMarcadorParteEH() {
        return marcadorParteEH;
    }

    public void setMarcadorParteEH(MarcadorEsParteDeEh marcadorParteEH) {
        this.marcadorParteEH = marcadorParteEH;
    }

    public MarcadorEsParteDeEhPK getMarcadorParteEHpk() {
        return marcadorParteEHpk;
    }

    public void setMarcadorParteEHpk(MarcadorEsParteDeEhPK marcadorParteEHpk) {
        this.marcadorParteEHpk = marcadorParteEHpk;
    }
*/

    public String getNombreEstudio() {
        return nombreEstudio;
    }

    public void setNombreEstudio(String nombreEstudio) {
        this.nombreEstudio = nombreEstudio;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    
    
}
