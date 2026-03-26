package com.grupo2.nexus.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grupo2.nexus.model.dto.UsuarioDto;
import com.grupo2.nexus.model.entity.Usuario;
import com.grupo2.nexus.service.UsuarioService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/usuarios")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService usuarioService;

    @GetMapping
    public ResponseEntity<List<UsuarioDto>> getAll() {
        return ResponseEntity.ok(usuarioService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioDto> getById(@PathVariable Long id) {
        return ResponseEntity.ok(usuarioService.findById(id));
    }

    @PostMapping
    public ResponseEntity<UsuarioDto> create(@RequestBody Usuario usuario) {
        // El Service ya se encarga de validar el email y poner el rol por defecto
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioService.save(usuario));
    }

    @PutMapping("/{id}")
    public ResponseEntity<UsuarioDto> update(
            @PathVariable Long id,
            @RequestBody Usuario usuario) {

        // IMPORTANTE: Le decimos al objeto que su ID es el que viene en la URL
        // Esto evita que alguien intente actualizar el usuario 5 mandando el ID 10 en el JSON.
        usuario.setId(id);

        return ResponseEntity.ok(usuarioService.update(id, usuario));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        usuarioService.delete(id);
        return ResponseEntity.noContent().build();
    }
}