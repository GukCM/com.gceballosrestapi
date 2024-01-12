package com.example.com.gceballosrestapi.repositories;

import com.example.com.gceballosrestapi.models.UsuarioModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

//El repositorio utiliza la informacion del Modelo para saber que informacion va a traer
@Repository
//Se cambia la clase por interface que significa que implementa ciertos metodos desde CrudRepository que ya estan programados para obtener informacion
//solo se necesita indicar el tipo de dato que es, en este caso UsuarioModel y el identificador que es Long
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long> {
    public abstract ArrayList<UsuarioModel> findByPrioridad(Integer prioridad);
}
