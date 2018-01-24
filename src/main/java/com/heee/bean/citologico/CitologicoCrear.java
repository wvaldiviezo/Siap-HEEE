package com.heee.bean.citologico;

import com.heee.bean.contadorEstudios.contadorEstudioCrear;
import com.heee.bean.model.entity.Cabecerarecepcionmuestra;
import com.heee.bean.model.entity.Doctor;
import com.heee.bean.model.entity.ECitologicoSubcategoria;
import com.heee.bean.model.entity.Estudiocitologico;
import com.heee.bean.model.entity.Hospital;
import com.heee.bean.model.entity.Organossistemas;
import com.heee.bean.model.entity.Paciente;
import com.heee.bean.model.entity.Parroquia;
import com.heee.bean.model.entity.Subcategoriacitologico;
import com.heee.bean.model.entity.Subtipo;
import com.heee.bean.model.entity.Tipoestudio;
import com.heee.bean.model.jpa.JPAFactoryDAO;
import java.io.Serializable;

import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.List;
import java.util.logging.SimpleFormatter;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


@ManagedBean(name = "citologicoCrear")
@ViewScoped
//@RequestScoped
public class CitologicoCrear implements Serializable {

    private static final long serialVersionUID = 1L;
    private List<Hospital> hospitalesEnBase;
    private List<Doctor> doctoresEnBase;
    private List<Paciente> pacientesEnBase;
    private List<Tipoestudio> tiposEstudioEnBase;
    private List<Cabecerarecepcionmuestra> cabecerasEnBase;
    private List<Estudiocitologico> estudioCitologicosEnBase;
    private ECitologicoSubcategoria estudioCitologicoPorSubcategoria;
    private Cabecerarecepcionmuestra cabecera;
    private Subcategoriacitologico marcadoresSubcategoriaCitologico;
    private Doctor doctor;
    private Paciente paciente;
    private Parroquia parroquia;
    private Hospital hospital;
    private Estudiocitologico estudioCitologico;
    private int parroquiaID;
    private int numeroEstudio;
    private String nombreEstudio;
    private String otroMaterial;
    private String otroAnticoncepcion;
    private String otroLiquidos;
    private String edadMenarquia;
    private String edadMenopausia;
    private String edadInicioRelaciones;
    private SimpleDateFormat formatoFecha;
    private Date ultimaMenstruacion;
    private Date ultimoParto;
    private Date ultimaCitologia;
    private String numeroGestaciones;
    private String numeroPartos;
    private String numeroAbortos;
    private String numeroCesareas;
    private String paaf;
    

    private String[] marcadorSubcategoriaMaterial;
    private String[] marcadorSubcategoriaEdades;
    private String[] marcadorSubcategoriaParidad;
    private String[] marcadorSubcategoriaAnticoncepcion;
    private String[] marcadorSubcategoriaTerapiaHormonal;
    private String[] marcadorSubcategoriaFechas;
    private String[] marcadorSubcategoriaLiquidos;
    private String[] marcadorSubcategoriaLavado;
    private String[] marcadorSubcategoriaPaaf;
    private String[] marcadorSubcategoriaCepillado;

    private Organossistemas organosSistemas;
    private Subtipo subtipo;
    private contadorEstudioCrear contadorEstudio;

    private int organosSistemaID;
    private int subtipoID;

    private boolean skip;
    
    private Date fechaCreacion = new Date();

    /*Método Constructor*/
    public CitologicoCrear() {

        
        otroMaterial ="";
        otroAnticoncepcion ="";
        otroLiquidos ="";
        edadMenarquia ="";
        edadMenopausia ="";
        edadInicioRelaciones="";
        formatoFecha= new SimpleDateFormat("yyyy-MM-dd");
        ultimaMenstruacion=null;
        ultimoParto=null;
        ultimaCitologia=null;
        numeroGestaciones="";
        numeroPartos="";
        numeroAbortos="";
        numeroCesareas="";
        paaf="";

        doctoresEnBase = null;
        pacientesEnBase = null;
        hospitalesEnBase = null;
        tiposEstudioEnBase = null;
        cabecerasEnBase = null;
        
        this.cabecera = new Cabecerarecepcionmuestra();
        this.paciente = new Paciente();
        this.doctor = new Doctor();
        this.hospital = new Hospital();
        this.parroquia = new Parroquia();
        this.estudioCitologico = new Estudiocitologico();

        parroquiaID = 0;
        numeroEstudio = 0;
        organosSistemaID = 0;
        subtipoID = 0;
        nombreEstudio = "";
        estudioCitologicosEnBase = null;
        
        marcadorSubcategoriaMaterial = null;
        marcadorSubcategoriaEdades = null;
        marcadorSubcategoriaParidad = null;
        marcadorSubcategoriaAnticoncepcion = null;
        marcadorSubcategoriaTerapiaHormonal = null;
        marcadorSubcategoriaFechas = null;
        marcadorSubcategoriaLiquidos = null;
        marcadorSubcategoriaLavado = null;
        marcadorSubcategoriaPaaf = null;
        marcadorSubcategoriaCepillado = null;
        
        this.estudioCitologicoPorSubcategoria = new ECitologicoSubcategoria();
        this.marcadoresSubcategoriaCitologico= new Subcategoriacitologico();
        this.organosSistemas = new Organossistemas();
        this.subtipo = new Subtipo();
        this.estudioCitologico = new Estudiocitologico();
        this.contadorEstudio = new contadorEstudioCrear();

    }

    /*Método para hacer el registro del examen Qx en el módulo de la Secretaria*/
    public void registrarCitologico() {

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
        this.cabecera.setFechacreacrm(this.fechaCreacion);
        String[] campoTipo = {"nombrete"};
        String[] valorCampoTipo = {nombreEstudio};
        tiposEstudioEnBase = JPAFactoryDAO.getFactory().getTipoEstudioDAO().find(campoTipo, valorCampoTipo);
        this.cabecera.setIdte(tiposEstudioEnBase.get(tiposEstudioEnBase.size() - 1));
        JPAFactoryDAO.getFactory().getCabecerarecepcionmuestraDAO().create(cabecera);

        cabecerasEnBase = JPAFactoryDAO.getFactory().getCabecerarecepcionmuestraDAO().find();
        this.estudioCitologico.setIdcabeceracepcionmuestracec(cabecerasEnBase.get(cabecerasEnBase.size() - 1).getIdcrm());
        JPAFactoryDAO.getFactory().getEstudiosCitologicoDAO().create(estudioCitologico);

        contadorEstudio.contarEstudio();
        estudioCitologicosEnBase=JPAFactoryDAO.getFactory().getEstudiosCitologicoDAO().find();
   
        if (marcadorSubcategoriaMaterial != null) {
            for (String marcador : marcadorSubcategoriaMaterial) { 
                estudioCitologicoPorSubcategoria.setIdcec(estudioCitologicosEnBase.get(estudioCitologicosEnBase.size()-1));
                marcadoresSubcategoriaCitologico.setIdsubcategoria(Integer.parseInt(marcador));
                estudioCitologicoPorSubcategoria.setIdsubcategoria(this.marcadoresSubcategoriaCitologico);
                if(marcador.equals("6")){  
                    estudioCitologicoPorSubcategoria.setDescripcionsubcategoria(otroMaterial);
                }
                JPAFactoryDAO.getFactory().getECitologicoSubcategoriaDAO().create(estudioCitologicoPorSubcategoria);
                
            }
            System.out.println("paso material");
        } 
        if(marcadorSubcategoriaAnticoncepcion!=null){
             for (String marcador : marcadorSubcategoriaAnticoncepcion) {
                System.out.println("macador seleccionado"+marcador);
                estudioCitologicoPorSubcategoria.setIdcec(estudioCitologicosEnBase.get(estudioCitologicosEnBase.size()-1));
                marcadoresSubcategoriaCitologico.setIdsubcategoria(Integer.parseInt(marcador));
                estudioCitologicoPorSubcategoria.setIdsubcategoria(this.marcadoresSubcategoriaCitologico);
                System.out.println("marcador:"+otroMaterial);
                if(marcador.equals("17")){  
                    estudioCitologicoPorSubcategoria.setDescripcionsubcategoria(otroAnticoncepcion);
                }
                JPAFactoryDAO.getFactory().getECitologicoSubcategoriaDAO().create(estudioCitologicoPorSubcategoria);
                
            }
             System.out.println("paso anticoncepcion");
        }
        if(marcadorSubcategoriaEdades!=null){
            for (String marcador : marcadorSubcategoriaEdades) {
                System.out.println("macador seleccionado"+marcador);
                estudioCitologicoPorSubcategoria.setIdcec(estudioCitologicosEnBase.get(estudioCitologicosEnBase.size()-1));
                marcadoresSubcategoriaCitologico.setIdsubcategoria(Integer.parseInt(marcador));
                estudioCitologicoPorSubcategoria.setIdsubcategoria(this.marcadoresSubcategoriaCitologico);
                if(marcador.equals("7")){  
                    estudioCitologicoPorSubcategoria.setDescripcionsubcategoria(edadMenarquia);
                }
                if(marcador.equals("8")){  
                    estudioCitologicoPorSubcategoria.setDescripcionsubcategoria(edadMenopausia);
                }
                if(marcador.equals("9")){  
                    estudioCitologicoPorSubcategoria.setDescripcionsubcategoria(edadInicioRelaciones);
                }
                JPAFactoryDAO.getFactory().getECitologicoSubcategoriaDAO().create(estudioCitologicoPorSubcategoria);
                
            } 
            System.out.println("paso edades");
        }
        if(marcadorSubcategoriaFechas!=null){
            for (String marcador : marcadorSubcategoriaFechas) {      
                    estudioCitologicoPorSubcategoria.setIdcec(estudioCitologicosEnBase.get(estudioCitologicosEnBase.size()-1));
                    marcadoresSubcategoriaCitologico.setIdsubcategoria(Integer.parseInt(marcador));
                    estudioCitologicoPorSubcategoria.setIdsubcategoria(this.marcadoresSubcategoriaCitologico);
                    if(marcador.equals("19")){  
                    estudioCitologicoPorSubcategoria.setDescripcionsubcategoria(formatoFecha.format(ultimaMenstruacion));
                    }
                    if(marcador.equals("20")){  
                        estudioCitologicoPorSubcategoria.setDescripcionsubcategoria(formatoFecha.format(ultimoParto));
                    }
                    if(marcador.equals("21")){  
                        estudioCitologicoPorSubcategoria.setDescripcionsubcategoria(formatoFecha.format(ultimoParto));
                    }
                        JPAFactoryDAO.getFactory().getECitologicoSubcategoriaDAO().create(estudioCitologicoPorSubcategoria);
                    }
            System.out.println("paso fechas");
        }
        if(marcadorSubcategoriaParidad!=null){
            for (String marcador : marcadorSubcategoriaParidad) {

                    System.out.println("macador seleccionado"+marcador);
                    estudioCitologicoPorSubcategoria.setIdcec(estudioCitologicosEnBase.get(estudioCitologicosEnBase.size()-1));
                    marcadoresSubcategoriaCitologico.setIdsubcategoria(Integer.parseInt(marcador));
                    estudioCitologicoPorSubcategoria.setIdsubcategoria(this.marcadoresSubcategoriaCitologico);
                    if(marcador.equals("10")){  
                    estudioCitologicoPorSubcategoria.setDescripcionsubcategoria(numeroGestaciones);
                    }
                    if(marcador.equals("11")){  
                        estudioCitologicoPorSubcategoria.setDescripcionsubcategoria(numeroPartos);
                    }
                    if(marcador.equals("12")){  
                        estudioCitologicoPorSubcategoria.setDescripcionsubcategoria(numeroAbortos);
                    }
                    if(marcador.equals("13")){  
                        estudioCitologicoPorSubcategoria.setDescripcionsubcategoria(numeroCesareas);
                    }
                        JPAFactoryDAO.getFactory().getECitologicoSubcategoriaDAO().create(estudioCitologicoPorSubcategoria);
                    
                    
            }
            System.out.println("paso paridad");
        }
        if(marcadorSubcategoriaLiquidos!=null){
            for (String marcador : marcadorSubcategoriaLiquidos) {
                System.out.println("macador seleccionado"+marcador);
                estudioCitologicoPorSubcategoria.setIdcec(estudioCitologicosEnBase.get(estudioCitologicosEnBase.size()-1));
                marcadoresSubcategoriaCitologico.setIdsubcategoria(Integer.parseInt(marcador));
                estudioCitologicoPorSubcategoria.setIdsubcategoria(this.marcadoresSubcategoriaCitologico);
                if(marcador.equals("28")){  
                        estudioCitologicoPorSubcategoria.setDescripcionsubcategoria(otroLiquidos);
                    }
                JPAFactoryDAO.getFactory().getECitologicoSubcategoriaDAO().create(estudioCitologicoPorSubcategoria);
            }
            System.out.println("paso liquidos");
        }
        if(marcadorSubcategoriaLavado!=null){
            for (String marcador : marcadorSubcategoriaLavado) {
                System.out.println("macador seleccionado"+marcador);
                estudioCitologicoPorSubcategoria.setIdcec(estudioCitologicosEnBase.get(estudioCitologicosEnBase.size()-1));
                marcadoresSubcategoriaCitologico.setIdsubcategoria(Integer.parseInt(marcador));
                estudioCitologicoPorSubcategoria.setIdsubcategoria(this.marcadoresSubcategoriaCitologico);
                JPAFactoryDAO.getFactory().getECitologicoSubcategoriaDAO().create(estudioCitologicoPorSubcategoria);
            }
            System.out.println("paso lavado");
        }
        if(marcadorSubcategoriaCepillado!=null){
            for (String marcador : marcadorSubcategoriaCepillado) {
                System.out.println("macador seleccionado"+marcador);
                estudioCitologicoPorSubcategoria.setIdcec(estudioCitologicosEnBase.get(estudioCitologicosEnBase.size()-1));
                marcadoresSubcategoriaCitologico.setIdsubcategoria(Integer.parseInt(marcador));
                estudioCitologicoPorSubcategoria.setIdsubcategoria(this.marcadoresSubcategoriaCitologico);
                JPAFactoryDAO.getFactory().getECitologicoSubcategoriaDAO().create(estudioCitologicoPorSubcategoria);
            }
            System.out.println("paso cepillado");
        }
        if(marcadorSubcategoriaPaaf !=null){
            for (String marcador : marcadorSubcategoriaPaaf) {
                System.out.println("macador seleccionado"+marcador);
                estudioCitologicoPorSubcategoria.setIdcec(estudioCitologicosEnBase.get(estudioCitologicosEnBase.size()-1));
                marcadoresSubcategoriaCitologico.setIdsubcategoria(Integer.parseInt(marcador));
                estudioCitologicoPorSubcategoria.setIdsubcategoria(this.marcadoresSubcategoriaCitologico);
                if(marcador.equals("31")){  
                        estudioCitologicoPorSubcategoria.setDescripcionsubcategoria(paaf);
                    }
                JPAFactoryDAO.getFactory().getECitologicoSubcategoriaDAO().create(estudioCitologicoPorSubcategoria);
            }
            System.out.println("paso paaf");
        }
            

        System.out.println("Salio del metodo registrarCitologico");
    }

    /*Getters & Setters*/

    public String getOtroMaterial() {
        return otroMaterial;
    }

    public void setOtroMaterial(String otroMaterial) {
        this.otroMaterial = otroMaterial;
    }

    public String getOtroAnticoncepcion() {
        return otroAnticoncepcion;
    }

    public void setOtroAnticoncepcion(String otroAnticoncepcion) {
        this.otroAnticoncepcion = otroAnticoncepcion;
    }

    public String getOtroLiquidos() {
        return otroLiquidos;
    }

    public void setOtroLiquidos(String otroLiquidos) {
        this.otroLiquidos = otroLiquidos;
    }

    public String getEdadMenarquia() {
        return edadMenarquia;
    }

    public void setEdadMenarquia(String edadMenarquia) {
        this.edadMenarquia = edadMenarquia;
    }

    public String getEdadMenopausia() {
        return edadMenopausia;
    }

    public void setEdadMenopausia(String edadMenopausia) {
        this.edadMenopausia = edadMenopausia;
    }

    public String getEdadInicioRelaciones() {
        return edadInicioRelaciones;
    }

    public void setEdadInicioRelaciones(String edadInicioRelaciones) {
        this.edadInicioRelaciones = edadInicioRelaciones;
    }

    public Date getUltimaMenstruacion() {
        return ultimaMenstruacion;
    }

    public void setUltimaMenstruacion(Date ultimaMenstruacion) {
        this.ultimaMenstruacion = ultimaMenstruacion;
    }

    public Date getUltimoParto() {
        return ultimoParto;
    }

    public void setUltimoParto(Date ultimoParto) {
        this.ultimoParto = ultimoParto;
    }

    public Date getUltimaCitologia() {
        return ultimaCitologia;
    }

    public void setUltimaCitologia(Date ultimaCitologia) {
        this.ultimaCitologia = ultimaCitologia;
    }

    

    public String getNumeroGestaciones() {
        return numeroGestaciones;
    }

    public void setNumeroGestaciones(String numeroGestaciones) {
        this.numeroGestaciones = numeroGestaciones;
    }

    public String getNumeroPartos() {
        return numeroPartos;
    }

    public void setNumeroPartos(String numeroPartos) {
        this.numeroPartos = numeroPartos;
    }

    public String getNumeroAbortos() {
        return numeroAbortos;
    }

    public void setNumeroAbortos(String numeroAbortos) {
        this.numeroAbortos = numeroAbortos;
    }

    public String getNumeroCesareas() {
        return numeroCesareas;
    }

    public void setNumeroCesareas(String numeroCesarias) {
        this.numeroCesareas = numeroCesarias;
    }

    public String getPaaf() {
        return paaf;
    }

    public void setPaaf(String paaf) {
        this.paaf = paaf;
    }
    
    
    
    public List<Hospital> getHospitalesEnBase() {
        return hospitalesEnBase;
    }

    public void setHospitalesEnBase(List<Hospital> hospitalesEnBase) {
        this.hospitalesEnBase = hospitalesEnBase;
    }

    public List<Doctor> getDoctoresEnBase() {
        return doctoresEnBase;
    }

    public void setDoctoresEnBase(List<Doctor> doctoresEnBase) {
        this.doctoresEnBase = doctoresEnBase;
    }

    public List<Paciente> getPacientesEnBase() {
        return pacientesEnBase;
    }

    public void setPacientesEnBase(List<Paciente> pacientesEnBase) {
        this.pacientesEnBase = pacientesEnBase;
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

    public void setParroquia(Parroquia parroquia) {
        this.parroquia = parroquia;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public int getParroquiaID() {
        return parroquiaID;
    }

    public void setParroquiaID(int parroquiaID) {
        this.parroquiaID = parroquiaID;
    }

    public int getNumeroEstudio() {
        return numeroEstudio;
    }

    public void setNumeroEstudio(int numeroEstudio) {
        this.numeroEstudio = numeroEstudio;
    }

    public Organossistemas getOrganosSistemas() {
        return organosSistemas;
    }

    public void setOrganosSistemas(Organossistemas organosSistemas) {
        this.organosSistemas = organosSistemas;
    }

    public Subtipo getSubtipo() {
        return subtipo;
    }

    public void setSubtipo(Subtipo subtipo) {
        this.subtipo = subtipo;
    }

    public Estudiocitologico getEstudioCitologico() {
        return estudioCitologico;
    }

    public void setEstudioCitologico(Estudiocitologico estudioCitologico) {
        this.estudioCitologico = estudioCitologico;
    }

    public int getOrganosSistemaID() {
        return organosSistemaID;
    }

    public void setOrganosSistemaID(int organosSistemaID) {
        this.organosSistemaID = organosSistemaID;
    }

    public int getSubtipoID() {
        return subtipoID;
    }

    public void setSubtipoID(int subtipoID) {
        this.subtipoID = subtipoID;
    }

    public boolean isSkip() {
        return skip;
    }

    public void setSkip(boolean skip) {
        this.skip = skip;
    }

    public String getNombreEstudio() {
        return nombreEstudio;
    }

    public void setNombreEstudio(String nombreEstudio) {
        this.nombreEstudio = nombreEstudio;
    }

    public Subcategoriacitologico getMarcadoresSubcategoriaCitologico() {
        return marcadoresSubcategoriaCitologico;
    }

    public void setMarcadoresSubcategoriaCitologico(Subcategoriacitologico marcadoresSubcategoriaCitologico) {
        this.marcadoresSubcategoriaCitologico = marcadoresSubcategoriaCitologico;
    }

    public String[] getMarcadorSubcategoriaMaterial() {
        return marcadorSubcategoriaMaterial;
    }

    public void setMarcadorSubcategoriaMaterial(String[] marcadorSubcategoriaMaterial) {
        this.marcadorSubcategoriaMaterial = marcadorSubcategoriaMaterial;
    }

    public String[] getMarcadorSubcategoriaEdades() {
        return marcadorSubcategoriaEdades;
    }

    public void setMarcadorSubcategoriaEdades(String[] marcadorSubcategoriaEdades) {
        this.marcadorSubcategoriaEdades = marcadorSubcategoriaEdades;
    }

    public String[] getMarcadorSubcategoriaParidad() {
        return marcadorSubcategoriaParidad;
    }

    public void setMarcadorSubcategoriaParidad(String[] marcadorSubcategoriaParidad) {
        this.marcadorSubcategoriaParidad = marcadorSubcategoriaParidad;
    }

    public String[] getMarcadorSubcategoriaAnticoncepcion() {
        return marcadorSubcategoriaAnticoncepcion;
    }

    public void setMarcadorSubcategoriaAnticoncepcion(String[] marcadorSubcategoriaAnticoncepcion) {
        this.marcadorSubcategoriaAnticoncepcion = marcadorSubcategoriaAnticoncepcion;
    }

    public String[] getMarcadorSubcategoriaTerapiaHormonal() {
        return marcadorSubcategoriaTerapiaHormonal;
    }

    public void setMarcadorSubcategoriaTerapiaHormonal(String[] marcadorSubcategoriaTerapiaHormonal) {
        this.marcadorSubcategoriaTerapiaHormonal = marcadorSubcategoriaTerapiaHormonal;
    }

    public String[] getMarcadorSubcategoriaFechas() {
        return marcadorSubcategoriaFechas;
    }

    public void setMarcadorSubcategoriaFechas(String[] marcadorSubcategoriaFechas) {
        this.marcadorSubcategoriaFechas = marcadorSubcategoriaFechas;
    }

    public String[] getMarcadorSubcategoriaLiquidos() {
        return marcadorSubcategoriaLiquidos;
    }

    public void setMarcadorSubcategoriaLiquidos(String[] marcadorSubcategoriaLiquidos) {
        this.marcadorSubcategoriaLiquidos = marcadorSubcategoriaLiquidos;
    }

    public String[] getMarcadorSubcategoriaLavado() {
        return marcadorSubcategoriaLavado;
    }

    public void setMarcadorSubcategoriaLavado(String[] marcadorSubcategoriaLavado) {
        this.marcadorSubcategoriaLavado = marcadorSubcategoriaLavado;
    }

    public String[] getMarcadorSubcategoriaPaaf() {
        return marcadorSubcategoriaPaaf;
    }

    public void setMarcadorSubcategoriaPaaf(String[] marcadorSubcategoriaPaaf) {
        this.marcadorSubcategoriaPaaf = marcadorSubcategoriaPaaf;
    }

    public String[] getMarcadorSubcategoriaCepillado() {
        return marcadorSubcategoriaCepillado;
    }

    public void setMarcadorSubcategoriaCepillado(String[] marcadorSubcategoriaCepillado) {
        this.marcadorSubcategoriaCepillado = marcadorSubcategoriaCepillado;
    }
    
     public Date getFechaCreacion() {
        return this.fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    
}
