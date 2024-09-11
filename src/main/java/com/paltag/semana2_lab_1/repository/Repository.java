package com.paltag.semana2_lab_1.repository;

import com.paltag.semana2_lab_1.models.Persona;
import com.paltag.semana2_lab_1.models.Proveedores;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository <Persona,Integer>{
}


