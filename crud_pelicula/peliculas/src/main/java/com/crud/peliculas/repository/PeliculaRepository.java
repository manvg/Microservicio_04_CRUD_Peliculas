package com.crud.peliculas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.peliculas.model.Pelicula;

public interface PeliculaRepository extends JpaRepository<Pelicula, Long>{

}
