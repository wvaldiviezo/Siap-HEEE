package com.heee.bean.biologiaMolecular;

import com.heee.bean.contadorEstudios.contadorEstudioCrear;
import com.heee.bean.model.entity.Cabecerarecepcionmuestra;
import com.heee.bean.model.entity.Doctor;
import com.heee.bean.model.entity.Hospital;
import com.heee.bean.model.entity.Paciente;
import com.heee.bean.model.entity.Parroquia;
import com.heee.bean.model.entity.Tipoestudio;
import com.heee.bean.model.jpa.JPAFactoryDAO;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "biologiaMolecularCrear")
@ViewScoped
@RequestScoped
public class BiologiaMolecularCrear implements Serializable {

    private static final long serialVersionUID = 1L;
    private List<Hospital> hospitalesEnBase;
    private List<Doctor> doctoresEnBase;
    private List<Paciente> pacientesEnBase;
    private List<Tipoestudio> tiposEstudiosEnBase;
    private List<Cabecerarecepcionmuestra> cabecerasEnBase;
    private Cabecerarecepcionmuestra cabecera;
    private Doctor doctor;
    private Paciente paciente;
    private Parroquia parroquia;
    private int parroquiaID;
    private Hospital hospital;
    private int partesID;
    private int numeroEstudio;
    private String nombreEstudio;
    private contadorEstudioCrear contadorEstudio;
    
    private String[] marcadoresPredisposicionGenetica;
    private String[] marcadoresBiomarcadoresOncologicos;
    private String[] marcadoresInfeccionesVirales;
    private String[] marcadoresMoleculares;

    public BiologiaMolecularCrear() {
        doctoresEnBase = null;
        pacientesEnBase = null;
        hospitalesEnBase = null;
        tiposEstudiosEnBase=null;
        cabecerasEnBase=null;
        this.cabecera = new Cabecerarecepcionmuestra();
        this.doctor = new Doctor();
        this.paciente = new Paciente();
        this.hospital = new Hospital();
        this.parroquia = new Parroquia();
        this.contadorEstudio= new contadorEstudioCrear();
        parroquiaID = 0;
        partesID = 0;
        numeroEstudio = 0;
        nombreEstudio ="";
        
        
    }

    public void registrarBiologiaMolecular() {
        System.out.println("guardar");

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
        String[] atributo={"nombrete"};
        String[] valor={nombreEstudio};
        tiposEstudiosEnBase=JPAFactoryDAO.getFactory().getTipoEstudioDAO().find(atributo,valor);
        this.cabecera.setIdte(tiposEstudiosEnBase.get(tiposEstudiosEnBase.size()-1));
        JPAFactoryDAO.getFactory().getCabecerarecepcionmuestraDAO().create(cabecera);
        
        contadorEstudio.contarEstudio();
       // System.out.println("codigo:" + cabecera.getCodigoestudio());

    }
    
    

    //getter and setter
    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public Parroquia getParroquia() {
        return parroquia;
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

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Cabecerarecepcionmuestra getCabecera() {
        return cabecera;
    }

    public void setCabecera(Cabecerarecepcionmuestra cabecera) {
        this.cabecera = cabecera;
    }

    public int getPartesID() {
        return partesID;
    }

    public void setPartesID(int partesID) {
        this.partesID = partesID;
    }

    public String getNombreEstudio() {
        return nombreEstudio;
    }

    public void setNombreEstudio(String nombreEstudio) {
        this.nombreEstudio = nombreEstudio;
    }

    public contadorEstudioCrear getContadorEstudio() {
        return contadorEstudio;
    }

    public void setContadorEstudio(contadorEstudioCrear contadorEstudio) {
        this.contadorEstudio = contadorEstudio;
    }

    public String[] getMarcadoresPredisposicionGenetica() {
        return marcadoresPredisposicionGenetica;
    }

    public void setMarcadoresPredisposicionGenetica(String[] marcadoresPredisposicionGenetica) {
        this.marcadoresPredisposicionGenetica = marcadoresPredisposicionGenetica;
    }

    public String[] getMarcadoresBiomarcadoresOncologicos() {
        return marcadoresBiomarcadoresOncologicos;
    }

    public void setMarcadoresBiomarcadoresOncologicos(String[] marcadoresBiomarcadoresOncologicos) {
        this.marcadoresBiomarcadoresOncologicos = marcadoresBiomarcadoresOncologicos;
    }

    public String[] getMarcadoresInfeccionesVirales() {
        return marcadoresInfeccionesVirales;
    }

    public void setMarcadoresInfeccionesVirales(String[] marcadoresInfeccionesVirales) {
        this.marcadoresInfeccionesVirales = marcadoresInfeccionesVirales;
    }

    public String[] getMarcadoresMoleculares() {
        return marcadoresMoleculares;
    }

    public void setMarcadoresMoleculares(String[] marcadoresMoleculares) {
        this.marcadoresMoleculares = marcadoresMoleculares;
    }
    
    
}
