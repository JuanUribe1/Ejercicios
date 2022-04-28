package com.examples.SpringBootH2.servicio;

import com.examples.SpringBootH2.modelo.Usuario;

import java.util.Optional;

public interface ServicioUsuario {
    Usuario guardarUsuario(Usuario usuario);
    Usuario obtenerUsuario(Long idUsuario);
    Usuario usuarioAModificar(Long id, Usuario usuarioAModificar);
    boolean eliminarUsuario(Long id);
}
