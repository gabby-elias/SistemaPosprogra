package com.umoar.sistemaposprogra.modelos;

import jakarta.persistence.*;
import lombok.*;

    @Entity //solo si son parte de la base de datos
    @Table(name = "clientes") //
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public class Cliente {
        //solo si son parte de la base de datos
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        //cada entidad debe tener una llave privada
        private long id; //<-llave primaria>

        private String nombre;
        private String nit;
        private int telefono;
        private String direccion;




    }


