package com.grupo2.nexus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grupo2.nexus.model.entity.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {


}
