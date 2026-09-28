package com.umoar.sistemaposprogra.repositorios;

import com.umoar.sistemaposprogra.modelos.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
