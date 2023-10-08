package com.utn.apiRest.repositorios;

import com.utn.apiRest.entidades.Autor;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends BaseRepository <Autor, Long>{
}