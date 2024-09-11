package com.paltag.semana2_lab_1.controllers;

import com.paltag.semana2_lab_1.models.Persona;
import com.paltag.semana2_lab_1.models.Proveedores;
import com.paltag.semana2_lab_1.repository.Repository;
import com.paltag.semana2_lab_1.repository.RepositoryProveedores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class controller {

    @Autowired
    private Repository repository;



    @GetMapping
    public String hello() {
        return "Hola soy sebastian : me pueden llamar defo";
    }

    @GetMapping("obtener-persona")
    public List<Persona> getPersona() {

        return repository.findAll();

    }

    @PostMapping("crear-persona")
    public  String postPersona(@RequestBody Persona persona) {
        repository.save(persona);
        return "Grabado" ;

    }


    @PutMapping("editar/{id}")
    public  String updatePe(@PathVariable Integer  id,@RequestBody Persona persona) {
        Persona updatePersona = repository.findById(id).get();
        updatePersona.setNombre(persona.getNombre());
        updatePersona.setApellido(persona.getApellido());
        updatePersona.setEdad(persona.getEdad());
        updatePersona.setDni(persona.getDni());
        repository.save(updatePersona);
        return "Grabado" ;

    }

    @DeleteMapping("delete/{id}")
    public String deletePersona(@PathVariable Integer id) {
        repository.deleteById(id);
        return "Eliminado" ;
    }


    // solucion Proveedores
    @Autowired
    private RepositoryProveedores repositoryProveedores;


    @GetMapping("obtener-proveedor")
    public List<Proveedores> getProveedor() {
        return repositoryProveedores.findAll();
    }


    @PostMapping("crear-proveedor")
    public  String postProveedor(@RequestBody Proveedores proveedor) {
        repositoryProveedores.save(proveedor);
        return "Grabado" ;

    }

    @PutMapping("editar-proveedor/{id}")
    public  String updateProveedor(@PathVariable Integer  id,@RequestBody Proveedores proveedor) {
        Proveedores updatePro = repositoryProveedores.findById(id).get();
        updatePro.setNombre(proveedor.getNombre());
        updatePro.setDireccion(proveedor.getDireccion());
        updatePro.setCiudad(proveedor.getCiudad());
        updatePro.setEstado(proveedor.getEstado());
        updatePro.setCodigo_postal(proveedor.getCodigo_postal());
        updatePro.setTelefono(proveedor.getTelefono());
        updatePro.setCorreo_electronico(proveedor.getCorreo_electronico());
        updatePro.setContacto(proveedor.getContacto());
        updatePro.setFecha_registro(proveedor.getFecha_registro());
        updatePro.setComentario(proveedor.getComentario());
        updatePro.setFecha_ultima_compra(proveedor.getFecha_ultima_compra());
        updatePro.setCalificacion(proveedor.getCalificacion());
        repositoryProveedores.save(updatePro);
        return "Grabado" ;

    }

    @DeleteMapping("delete-proveedor/{id}")
    public String deleteProveedor(@PathVariable Integer id) {
        repositoryProveedores.deleteById(id);
        return "Eliminado" ;
    }

}
