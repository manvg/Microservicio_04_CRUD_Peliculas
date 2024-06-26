package com.crud.peliculas.service;

import java.util.List;
import java.util.Optional;

import com.crud.peliculas.model.Pelicula;
import com.crud.peliculas.model.ResponseModel;

public interface PeliculaService {
    List<Pelicula> getAllPeliculas();
    Optional<Pelicula> getPeliculaById(Long id);
    Pelicula createPelicula(Pelicula pelicula);
    Pelicula updatePelicula(Long id, Pelicula pelicula);
    ResponseModel deletePelicula(Long id);
}
