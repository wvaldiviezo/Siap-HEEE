package com.heee.bean.model.dao;

import com.heee.bean.model.jpa.JPAFactoryDAO;

/*En esta clase abstracta se hace la invocación de cada una de las entidades DAO*/
/*Invocación a todas las DAO Entidades, se debe crear por cada una de las Entidades una Factory y un DAO*/
public abstract class FactoryDAO {

    protected static FactoryDAO factory = new JPAFactoryDAO();

    public static FactoryDAO getFactory() {
        return factory;
    }
    
    /*Por cada tabla que se tiene se debe de crear una clase DAO*/
    /*              NombreEntidadDAO  getXXXDAO();*/
    public abstract EmpleadoDAO getEmpleadoDAO();
    public abstract UsuarioDAO getUsuarioDAO();
    public abstract MenuDAO getMenuDAO();
    public abstract CargoDAO getCargoDAO();
    public abstract EspecialidadDAO getEspecialidadDAO();
    public abstract AreaDAO getAreaDAO();
    
    //cabecera del estudio
    public abstract HospitalDAO getHospitalDAO();
    public abstract DoctorDAO getDoctorDAO();
    public abstract PacienteDAO getPacienteDAO();
    public abstract CabecerarecepcionmuestraDAO getCabecerarecepcionmuestraDAO();
    public abstract DetallerecepcionmuestraDAO getDetallerecepcionmuestraDAO();
    

    //estudio amputaciones
    
    public abstract ProvinciaDAO getProvinciaDAO();
    public abstract CantonDAO getCantonDAO();
    public abstract ParroquiaDAO getParroquiaDAO();
    public abstract ExtremidadDAO getExtremidadDAO();
    public abstract ParteDAO getParteDAO();
    public abstract EstudiosAmputacionesDAO getEstudiosAmputacionesDAO();
    
    //estudio quirurgico
    public abstract EstudiosQuirurgicosDAO getEstudiosQuirurgicosDAO();
    
    
    //codigo de barras
    public abstract TipoEstudioDAO getTipoEstudioDAO();
    public abstract ContadoresTipoEstudioAnioDAO getContadoresTipoEstudioAnioDAO();
    
    //combos estudio Quirurgico
    public abstract SubtipoDAO getSubtipoDAO();
    public abstract OrganosSistemasDAO getOrganosSistemasDAO();
    
    
    //Citologico
    public abstract CategoriaCitologicoDAO getCategoriaDAO();
    public abstract SubcategoriaCitologicoDAO getSubcategoriaDAO();
    
    //Inmunohistoquimica
    public abstract MarcadoresEIHQDAO getMarcadoresEIHQDAO();
    
    //Histoquimica
    public abstract EstudiosHistoquimicaDAO getEstudiosHistoquimicaDAO();
    public abstract EstudiosRevisionDAO getEstudiosRevisionDAO();
    
    //marcadores Estudio Himunohistoquimica
    public abstract MarcadoresEHDAO getMarcadoresEHDAO();
    //public abstract MarcadoresParteEHDAO getMarcadoresParteEHDAO();
    //public abstract MarcadoresParteEHPkDAO getMarcadoresParteEHPkDAO();
    public abstract EstudiosCitologicoDAO getEstudiosCitologicoDAO();
    public abstract EHistMarcadorDAO getEHistMarcadorDAO();
    
    public abstract ECitologicoSubcategoriaDAO getECitologicoSubcategoriaDAO();
    public abstract SubcategoriaBiologiaMDAO getSubcategoriaBiologiaMDAO();
    public abstract MarcadorSubcategoriaBiologiaMDAO getMarcadorSubcategoriaBiologiaMDAO();
}
