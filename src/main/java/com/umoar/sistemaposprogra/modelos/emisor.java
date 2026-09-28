package com.umoar.sistemaposprogra.modelos;

import jakarta.persistence.*;
import lombok.*;

@Entity   // solo si será parte de la base de datos
@Table(name = "emisores")// solo si será parte de la base de datos
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class emisor {
    // solo si será parte de la base de datos
    @Id
    // solo si será parte de la base de datos
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // llave primaria
    private String nombre;
    private String nit;
    private int telefono;
    private String direccion;

}
