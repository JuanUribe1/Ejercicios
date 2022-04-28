package com.examples.SpringBootH2.controlador;

import com.examples.SpringBootH2.modelo.Usuario;
import com.examples.SpringBootH2.servicio.ServicioUsuario;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
@RequiredArgsConstructor
public class ControladorUsuario {

    private final ServicioUsuario servicioUsuario;

    @PostMapping
    public ResponseEntity guardarUsuario(@RequestBody Usuario usuario){
        return new ResponseEntity(servicioUsuario.guardarUsuario(usuario), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity obtenerUsuario(@PathVariable("id") Long idUsuario){
        return new ResponseEntity(servicioUsuario.obtenerUsuario(idUsuario), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity modificarUsuario(@PathVariable("id") Long idUsuario, @RequestBody Usuario usuario){
        return new ResponseEntity(servicioUsuario.usuarioAModificar(idUsuario, usuario), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity eliminarUsuario(@PathVariable("id") Long idUsuario){
        if(servicioUsuario.eliminarUsuario(idUsuario)){
            return new ResponseEntity(HttpStatus.OK);
        }else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }

}
