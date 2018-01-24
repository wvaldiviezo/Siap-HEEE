package com.heee.bean.model.jpa;

import com.heee.bean.model.dao.AreaDAO;
import com.heee.bean.model.dao.CabecerarecepcionmuestraDAO;
import com.heee.bean.model.dao.CantonDAO;
import com.heee.bean.model.dao.CargoDAO;
import com.heee.bean.model.dao.DoctorDAO;
import com.heee.bean.model.dao.EmpleadoDAO;
import com.heee.bean.model.dao.ExtremidadDAO;
import com.heee.bean.model.dao.FactoryDAO;
import com.heee.bean.model.dao.HospitalDAO;
import com.heee.bean.model.dao.MenuDAO;
import com.heee.bean.model.dao.PacienteDAO;
import com.heee.bean.model.dao.ParroquiaDAO;
import com.heee.bean.model.dao.ParteDAO;
import com.heee.bean.model.dao.ProvinciaDAO;
import com.heee.bean.model.dao.UsuarioDAO;
import com.heee.bean.model.dao.ContadoresTipoEstudioAnioDAO;
import com.heee.bean.model.dao.EspecialidadDAO;
import com.heee.bean.model.dao.EstudiosAmputacionesDAO;
import com.heee.bean.model.dao.EstudiosQuirurgicosDAO;
import com.heee.bean.model.dao.MarcadoresEIHQDAO;
import com.heee.bean.model.dao.OrganosSistemasDAO;
import com.heee.bean.model.dao.SubtipoDAO;
import com.heee.bean.model.dao.TipoEstudioDAO;
import com.heee.bean.model.dao.EstudiosHistoquimicaDAO;
import com.heee.bean.model.dao.MarcadoresEHDAO;
//import com.heee.bean.model.dao.MarcadoresParteEHDAO;
//import com.heee.bean.model.dao.MarcadoresParteEHPkDAO;
import com.heee.bean.model.dao.CategoriaCitologicoDAO;
import com.heee.bean.model.dao.DetallerecepcionmuestraDAO;
import com.heee.bean.model.dao.ECitologicoSubcategoriaDAO;
import com.heee.bean.model.dao.EHistMarcadorDAO;
import com.heee.bean.model.dao.EstudiosCitologicoDAO;
import com.heee.bean.model.dao.EstudiosRevisionDAO;
import com.heee.bean.model.dao.MarcadorSubcategoriaBiologiaMDAO;
import com.heee.bean.model.dao.SubcategoriaBiologiaMDAO;
import com.heee.bean.model.dao.SubcategoriaCitologicoDAO;

/*Esta clase es una extención de la clase FactoryDAO, en donde se relaciona la entidad de la clase DAO
con el JPA*/
public class JPAFactoryDAO extends FactoryDAO {
    
    @Override        
    public EmpleadoDAO getEmpleadoDAO() {
        return new JPAEmpleadoDAO();
    }
 
    @Override        
    public UsuarioDAO getUsuarioDAO() {
        return new JPAUsuarioDAO();
    }

    @Override
    public MenuDAO getMenuDAO() {
        return new JPAMenuDAO();
    }

    @Override
    public ProvinciaDAO getProvinciaDAO() {
        return new JPAProvinciaDAO();
    }

    @Override
    public CantonDAO getCantonDAO() {
        return new JPACantonDAO();
    }

    @Override
    public ParroquiaDAO getParroquiaDAO() {
        return new JPAParroquiaDAO();
    }
    
    @Override
    public CargoDAO getCargoDAO() {
        return new JPACargoDAO();
    }
    
    @Override
    public EspecialidadDAO getEspecialidadDAO() {
        return new JPAEspecialidadDAO();
    }

    @Override
    public ExtremidadDAO getExtremidadDAO() {
        return new JPAExtremidadDAO();
    }

    @Override
    public ParteDAO getParteDAO() {
        return new JPAParteDAO();
    }
    
    @Override
    public AreaDAO getAreaDAO() {
        return new JPAAreaDAO();
    }

    
    @Override
    public HospitalDAO getHospitalDAO(){
        return new JPAHospitalDAO();
    }
    
    @Override
    public DoctorDAO getDoctorDAO(){
        return new JPADoctorDAO();
    }
    
    @Override
    public PacienteDAO getPacienteDAO(){
        return new JPAPacienteDAO();
    }
    
    @Override
    public CabecerarecepcionmuestraDAO getCabecerarecepcionmuestraDAO(){
        return new JPACabecerarecepcionmuestraDAO();
    }
    
    @Override
    public DetallerecepcionmuestraDAO getDetallerecepcionmuestraDAO(){
        return new JPADetallerecepcionmuestraDAO();
    }
    
    @Override
    public ContadoresTipoEstudioAnioDAO getContadoresTipoEstudioAnioDAO() {
        return new JPAContadoresTipoEstudioAnioDAO();
    }

    @Override
    public TipoEstudioDAO getTipoEstudioDAO() {
        return new JPATipoEstudioDAO();
    }

    @Override
    public SubtipoDAO getSubtipoDAO() {
        return new JPASubtipoDAO();
    }

    @Override
    public OrganosSistemasDAO getOrganosSistemasDAO() {
        return new JPAOrganosSistemasDAO();
    }

    @Override
    public CategoriaCitologicoDAO getCategoriaDAO() {
        return new JPACategoriaCitologicoDAO();
    }

    @Override
    public SubcategoriaCitologicoDAO getSubcategoriaDAO() {
        return new JPASubcategoriaCitologicoDAO();
    }

    @Override
    public MarcadoresEIHQDAO getMarcadoresEIHQDAO() {
        return new JPAMarcadoresEIHQDAO();
    }

    @Override
    public EstudiosAmputacionesDAO getEstudiosAmputacionesDAO() {
        return new JPAEstudiosAmputacionesDAO();
    }
    
    @Override
    public EstudiosQuirurgicosDAO getEstudiosQuirurgicosDAO(){
        return new JPAEstudiosQuirurgicosDAO();
    }

    @Override
    public EstudiosHistoquimicaDAO getEstudiosHistoquimicaDAO() {
        return new JPAEstudiosHistoquimicaDAO();
    }

    @Override
    public MarcadoresEHDAO getMarcadoresEHDAO() {
        return new JPAMarcadoresEHDAO();
    }

    /*
    @Override
    public MarcadoresParteEHDAO getMarcadoresParteEHDAO() {
        return new JPAMarcadoresParteEHDAO();
    }

    @Override
    public MarcadoresParteEHPkDAO getMarcadoresParteEHPkDAO() {
        return new JPAMarcadoresParteEHPkDAO();
    }
*/

    @Override
    public EstudiosRevisionDAO getEstudiosRevisionDAO() {
        return new JPAEstudiosRevisionessDAO();
    }

    @Override
    public EstudiosCitologicoDAO getEstudiosCitologicoDAO() {
        return new JPAEstudiosCitologicoDAO();
    }

    @Override
    public EHistMarcadorDAO getEHistMarcadorDAO() {
        return new JPAEHistMarcadorDAO();
    }

    @Override
    public ECitologicoSubcategoriaDAO getECitologicoSubcategoriaDAO() {
        return new JPAECitologicoSubcategoriaDAO();
    }

    @Override
    public SubcategoriaBiologiaMDAO getSubcategoriaBiologiaMDAO() {
        return new JPASubcategoriaBiologiaMDAO();
    }

    @Override
    public MarcadorSubcategoriaBiologiaMDAO getMarcadorSubcategoriaBiologiaMDAO(){
         return new JPAMarcadorSubcategoriaBiologiaMDAO();
    }
}
