package com.umoar.sistemaposprogra.repositorios;

import com.umoar.sistemaposprogra.modelos.producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductosRepository extends JpaRepository<producto, Long> {
}
