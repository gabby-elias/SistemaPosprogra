package com.umoar.sistemaposprogra.repositorios;

import com.umoar.sistemaposprogra.modelos.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductosRepository extends JpaRepository<Producto, Long> {
}
