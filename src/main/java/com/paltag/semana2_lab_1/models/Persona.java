package com.paltag.semana2_lab_1.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Persona {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Getter
        @Setter
        private long id;
        @Column
        @Getter
        @Setter
        private String nombre;
        @Column
        @Getter
        @Setter
        private String apellido;
        @Column
        @Getter
        @Setter
        private int edad;
        @Column
        @Getter
        @Setter
        private String dni;

}
