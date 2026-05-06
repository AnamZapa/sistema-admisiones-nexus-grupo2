package com.grupo2.nexus.controller;

import com.grupo2.nexus.model.dto.RequestDto;
import com.grupo2.nexus.model.entity.Request;
import com.grupo2.nexus.model.enums.EstadoSolicitud;
import com.grupo2.nexus.service.RequestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/requests")
@RequiredArgsConstructor
public class RequestController {

    private final RequestService requestService;

    @GetMapping
    public ResponseEntity<List<RequestDto>> getAll() {
        return ResponseEntity.ok(requestService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<RequestDto> getById(@PathVariable Long id) {
        return ResponseEntity.ok(requestService.findById(id));
    }

    @PostMapping
    public ResponseEntity<RequestDto> create(@RequestBody Request request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(requestService.save(request));
    }

    /** PATCH /api/v1/requests/{id}/estado  — body: { "estado": "APROBADO" } */
    @PatchMapping("/{id}/estado")
    public ResponseEntity<RequestDto> updateEstado(
            @PathVariable Long id,
            @RequestBody Map<String, String> body) {
        EstadoSolicitud nuevoEstado = EstadoSolicitud.valueOf(body.get("estado").toUpperCase());
        return ResponseEntity.ok(requestService.updateEstado(id, nuevoEstado));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        requestService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
