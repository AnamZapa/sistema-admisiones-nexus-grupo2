package com.grupo2.nexus.service;

import com.grupo2.nexus.model.entity.Curso;
import java.util.List;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;  
import com.grupo2.nexus.repository.CursoRepository;

@Service
@RequiredArgsConstructor
public class cursoService {

    private final CursoRepository cursoRepository;

      public List<Curso> findAll() {
        return cursoRepository.findAll().stream()
                .map(x -> this.toResponse(x))
                .toList();
    }


    public Curso findById(Long id) {
        return cursoRepository.findById(id)
                .map(x -> this.toResponse(x))
                .orElseThrow(() -> new RuntimeException("Curso no encontrado"));
    }

    public Curso save(Curso request) {
        return this.toResponse(cursoRepository.save(request));
    }

    public Curso update(Long id, Curso request) {
        Curso curso = cursoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Curso no encontrado"));
        curso.setNombre(request.getNombre());
        curso.setDescripcion(request.getDescripcion());
        return this.toResponse(cursoRepository.save(curso));
    }

    public void delete(Long id) {
        cursoRepository.deleteById(id);
    }

    private Curso toResponse(Curso curso) {
        return curso;
    }
}
