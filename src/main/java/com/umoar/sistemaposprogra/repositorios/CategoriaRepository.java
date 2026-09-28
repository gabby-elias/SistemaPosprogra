package com.umoar.sistemaposprogra.repositorios;

import com.umoar.sistemaposprogra.modelos.categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<categoria, Long> {
}
