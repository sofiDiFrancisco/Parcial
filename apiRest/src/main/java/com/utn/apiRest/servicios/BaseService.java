package com.utn.apiRest.servicios;

import com.utn.apiRest.entidades.Base;

import java.io.Serializable;
import java.util.List;

public interface BaseService <E extends Base, ID extends Serializable> {
    public List<E> findAll() throws Exception; //Listar - No recibe parametros y manejo de error con excepciones
    public E findById(ID id) throws Exception; //Obtiene una persona por su ID
    public E save(E entity) throws Exception; //Crear una nueva entidad (post)
    public E update(ID id, E entity) throws Exception; //Actualiza (patch-put) /Id de la persona y la persona
    public boolean delete(ID id) throws Exception; //Elimina registro (delete)
}
