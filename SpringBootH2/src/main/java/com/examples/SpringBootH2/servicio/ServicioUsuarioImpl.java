package com.examples.SpringBootH2.servicio;

import com.examples.SpringBootH2.modelo.Usuario;
import com.examples.SpringBootH2.repositorio.RepositorioUsuario;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
@AllArgsConstructor
public class ServicioUsuarioImpl implements ServicioUsuario{

    private final RepositorioUsuario repositorioUsuario;

    @Override
    public Usuario guardarUsuario(Usuario usuario) {
        return repositorioUsuario.save(usuario);
    }

    @Override
    public Usuario obtenerUsuario(Long idUsuario) {
        return repositorioUsuario.findById(idUsuario).orElseThrow(() -> {throw new RuntimeException();});
    }

    @Override
    public Usuario usuarioAModificar(Long id, Usuario usuarioAModificar) {
        Usuario usuarioBuscado = repositorioUsuario.findById(id).get();
        usuarioBuscado.setDireccion(usuarioAModificar.getDireccion());
        usuarioBuscado.setTelefono(usuarioAModificar.getTelefono());
        return repositorioUsuario.save(usuarioBuscado);
    }

    @Override
    public boolean eliminarUsuario(Long id) {
        try {
            repositorioUsuario.deleteById(id);
            return true;
        }catch(Exception ex){
            return false;
        }
    }
}
