package com.heee.bean.biologiaMolecular;

import com.heee.bean.contadorEstudios.contadorEstudioCrear;
import com.heee.bean.model.entity.Biologiamolecular;
import com.heee.bean.model.entity.Cabecerarecepcionmuestra;
import com.heee.bean.model.entity.Doctor;
import com.heee.bean.model.entity.Hospital;
import com.heee.bean.model.entity.MarcadorBio;
import com.heee.bean.model.entity.Marcadorsubcategoriabm;
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

public class BiologiaMolecularCrear implements Serializable {

    private static final long serialVersionUID = 1L;
    private List<Hospital> hospitalesEnBase;
    private List<Biologiamolecular> biologiaMolecularEnBase;
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
    private String txtOtroInfecionesVirales;
    private String txtOtroMoleculares;
    private contadorEstudioCrear contadorEstudio;
    private Biologiamolecular estudioBiologiaMolecular;
    private MarcadorBio marcadorBio;
    private Marcadorsubcategoriabm marcadorSubategoriaBiologiaM;

    private String[] marcadoresPredisposicionGenetica;
    private String[] marcadoresBiomarcadoresOncologicos;
    private String[] marcadoresInfeccionesVirales;
    private String[] marcadoresMoleculares;

    public BiologiaMolecularCrear() {
        doctoresEnBase = null;
        pacientesEnBase = null;
        hospitalesEnBase = null;
        biologiaMolecularEnBase = null;
        tiposEstudiosEnBase = null;
        cabecerasEnBase = null;
        this.cabecera = new Cabecerarecepcionmuestra();
        this.doctor = new Doctor();
        this.paciente = new Paciente();
        this.hospital = new Hospital();
        this.parroquia = new Parroquia();
        this.contadorEstudio = new contadorEstudioCrear();
        this.estudioBiologiaMolecular = new Biologiamolecular();
        this.marcadorBio = new MarcadorBio();
        this.marcadorSubategoriaBiologiaM = new Marcadorsubcategoriabm();

        parroquiaID = 0;
        partesID = 0;
        numeroEstudio = 0;
        nombreEstudio = "";
        txtOtroInfecionesVirales = "";
        txtOtroMoleculares = "";

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
        String[] atributo = {"nombrete"};
        String[] valor = {nombreEstudio};
        tiposEstudiosEnBase = JPAFactoryDAO.getFactory().getTipoEstudioDAO().find(atributo, valor);
        this.cabecera.setIdte(tiposEstudiosEnBase.get(tiposEstudiosEnBase.size() - 1));
        JPAFactoryDAO.getFactory().getCabecerarecepcionmuestraDAO().create(cabecera);

        cabecerasEnBase = JPAFactoryDAO.getFactory().getCabecerarecepcionmuestraDAO().find();
        this.estudioBiologiaMolecular.setIdcabecerarecepcionmuestrabm(cabecerasEnBase.get(cabecerasEnBase.size() - 1).getIdcrm());
        JPAFactoryDAO.getFactory().getEstudiosBiologiaMolecularDAO().create(this.estudioBiologiaMolecular);

        contadorEstudio.contarEstudio();

        biologiaMolecularEnBase = JPAFactoryDAO.getFactory().getEstudiosBiologiaMolecularDAO().find();
        if (marcadoresBiomarcadoresOncologicos != null) {
            for (String marcador : marcadoresBiomarcadoresOncologicos) {
                marcadorBio.setIdbiologiamolecular(biologiaMolecularEnBase.get(biologiaMolecularEnBase.size() - 1));
                marcadorSubategoriaBiologiaM.setIdmarcadorsubcategoriabm(Integer.parseInt(marcador));
                marcadorBio.setIdmarcadorsubcategoriabm(this.marcadorSubategoriaBiologiaM);
                JPAFactoryDAO.getFactory().getMarcadorBioDAO().create(marcadorBio);
            }
        }
        if (marcadoresInfeccionesVirales != null) {
            for (String marcador : marcadoresInfeccionesVirales) {
                if (marcador.equals("31")) {
                    marcadorBio.setIdbiologiamolecular(biologiaMolecularEnBase.get(biologiaMolecularEnBase.size() - 1));
                    marcadorSubategoriaBiologiaM.setIdmarcadorsubcategoriabm(Integer.parseInt(marcador));
                    marcadorBio.setIdmarcadorsubcategoriabm(this.marcadorSubategoriaBiologiaM);
                    marcadorBio.setDescripcionmarcador(txtOtroInfecionesVirales);
                    JPAFactoryDAO.getFactory().getMarcadorBioDAO().create(marcadorBio);
                    marcadorBio.setDescripcionmarcador(null);
                }else{
                marcadorBio.setIdbiologiamolecular(biologiaMolecularEnBase.get(biologiaMolecularEnBase.size() - 1));
                marcadorSubategoriaBiologiaM.setIdmarcadorsubcategoriabm(Integer.parseInt(marcador));
                marcadorBio.setIdmarcadorsubcategoriabm(this.marcadorSubategoriaBiologiaM);
                JPAFactoryDAO.getFactory().getMarcadorBioDAO().create(marcadorBio);
                }
            }
        }
        if (marcadoresMoleculares != null) {
            for (String marcador : marcadoresMoleculares) {

                if (marcador.equals("33")) {
                    marcadorBio.setIdbiologiamolecular(biologiaMolecularEnBase.get(biologiaMolecularEnBase.size() - 1));
                    marcadorSubategoriaBiologiaM.setIdmarcadorsubcategoriabm(Integer.parseInt(marcador));
                    marcadorBio.setIdmarcadorsubcategoriabm(this.marcadorSubategoriaBiologiaM);
                    marcadorBio.setDescripcionmarcador(txtOtroMoleculares);
                    JPAFactoryDAO.getFactory().getMarcadorBioDAO().create(marcadorBio);
                    marcadorBio.setDescripcionmarcador(null);
                }else{
                marcadorBio.setIdbiologiamolecular(biologiaMolecularEnBase.get(biologiaMolecularEnBase.size() - 1));
                marcadorSubategoriaBiologiaM.setIdmarcadorsubcategoriabm(Integer.parseInt(marcador));
                marcadorBio.setIdmarcadorsubcategoriabm(this.marcadorSubategoriaBiologiaM);
                JPAFactoryDAO.getFactory().getMarcadorBioDAO().create(marcadorBio);
                }
            }
        }
        if (marcadoresBiomarcadoresOncologicos != null) {
            for (String marcador : marcadoresPredisposicionGenetica) {
                marcadorBio.setIdbiologiamolecular(biologiaMolecularEnBase.get(biologiaMolecularEnBase.size() - 1));
                marcadorSubategoriaBiologiaM.setIdmarcadorsubcategoriabm(Integer.parseInt(marcador));
                marcadorBio.setIdmarcadorsubcategoriabm(this.marcadorSubategoriaBiologiaM);
                JPAFactoryDAO.getFactory().getMarcadorBioDAO().create(marcadorBio);
            }
        }
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

    public String getTxtOtroInfecionesVirales() {
        return txtOtroInfecionesVirales;
    }

    public void setTxtOtroInfecionesVirales(String txtOtroInfecionesVirales) {
        this.txtOtroInfecionesVirales = txtOtroInfecionesVirales;
    }

    public String getTxtOtroMoleculares() {
        return txtOtroMoleculares;
    }

    public void setTxtOtroMoleculares(String txtOtroMoleculares) {
        this.txtOtroMoleculares = txtOtroMoleculares;
    }

}
