package com.utn.apiRest.repositorios;

import com.utn.apiRest.entidades.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends BaseRepository <Persona, Long> {
}
