package com.utn.apiRest.controllers;

import com.utn.apiRest.entidades.Persona;
import com.utn.apiRest.servicios.PersonaServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin (origins = "*")
@RequestMapping (path = "api/v1/personas")
public class PersonaController extends BaseControllerImpl<Persona, PersonaServiceImpl>{
    /*private PersonaServiceImpl personaServiceImpl;
    public PersonaController(PersonaServiceImpl personaServiceImpl){
        this.personaServiceImpl = personaServiceImpl;
    }*/
}
