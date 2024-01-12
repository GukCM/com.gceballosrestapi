package com.example.com.gceballosrestapi.services;

import com.example.com.gceballosrestapi.models.UsuarioModel;
import com.example.com.gceballosrestapi.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

//La peticion manda a llamar este servicio que es el que ejecuta la logica de la app, que utiliza el repositorio donde se hacen las conexiones con la base de datos
//Para convertir la clase a tipo servicio
@Service
public class UsuarioService {
    //Notacion para no instanciar de manera que spring sabe cual utilizar
    @Autowired
    UsuarioRepository usuarioRepository;

    //Metodo para obtener usuarios, regresando objetos tipo UsuarioModel, esperando ver todos los usuarios registrados, utilizando el usuarioRepository declarado
    public ArrayList<UsuarioModel> obtenerUsuarios() {
        return (ArrayList<UsuarioModel>) usuarioRepository.findAll();
    }

    public UsuarioModel guardarUsuario(UsuarioModel usuario) {
        return usuarioRepository.save(usuario);
    }

    public Optional<UsuarioModel> obtenerPorId(Long id) {
        return usuarioRepository.findById(id);
    }

    public ArrayList<UsuarioModel> obtenerPorPriodidad(Integer prioridad) {
        return usuarioRepository.findByPrioridad(prioridad);
    }

    public boolean eliminarUsuario(Long id) {
        try {
            usuarioRepository.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }
}


