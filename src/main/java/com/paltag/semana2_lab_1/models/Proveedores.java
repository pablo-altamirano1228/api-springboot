package com.paltag.semana2_lab_1.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
public class Proveedores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private long id_proveedor;
    @Column
    @Getter
    @Setter
    private String nombre;
    @Column
    @Getter
    @Setter
    private String direccion;
    @Column
    @Getter
    @Setter
    private String ciudad;
    @Column
    @Getter
    @Setter
    private String estado;
    @Column
    @Getter
    @Setter
    private String codigo_postal;
    @Column
    @Getter
    @Setter
    private String telefono;
    @Column
    @Getter
    @Setter
    private String correo_electronico;
    @Column
    @Getter
    @Setter
    private String contacto;
    @Column
    @Getter
    @Setter
    private String fecha_registro;
    @Column
    @Getter
    @Setter
    private String tipo_proveedor;
    @Column
    @Getter
    @Setter
    private String comentario;
    @Column
    @Getter
    @Setter
    private String fecha_ultima_compra;
    @Column
    @Getter
    @Setter
    private int calificacion;
}
