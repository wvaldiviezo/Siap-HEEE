package com.heee.bean.model.dao;


import java.util.List;

/*Aqui se encuentran todos los métodos abstractos que se pueden llamar*/
public interface GenericDAO<T, ID> {

    public void create(T entity);

    public T read(ID id);

    public void update(T entity);

    public void delete(T entity);

    public void deleteByID(ID id);

    public List<T> read1(ID id);

    public List<T> find();

    public List<T> find(String[] attributes, String[] values); //like + and

    public List<T> find(String[] attributes, String[] values, String order, int index, int size);
    //indicar el nuevo método para que lo reconozca el controlador

    //Usuario iniciarSesion(Usuario us);
    //Método para listar los estudios Aceptados en Microscopia
    //public List<T> listaEstudiosAceptados(String[] estado);
}
