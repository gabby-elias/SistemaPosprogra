package com.umoar.sistemaposprogra.repositorios;


import com.umoar.sistemaposprogra.modelos.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}