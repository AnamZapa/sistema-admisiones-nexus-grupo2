package com.grupo2.nexus.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class UsuarioDto {
    private Long id;

    // Traemos los campos de DatosPersonales directamente
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;

    private String rol; // Convertimos el Enum a String
    private String estado; // Para el Enum Activo

    // Opcional: Para saber cuántas cosas tiene a cargo sin mandar las listas completas
    private Integer cantidadCursos;
    private Integer cantidadSolicitudes;
}
