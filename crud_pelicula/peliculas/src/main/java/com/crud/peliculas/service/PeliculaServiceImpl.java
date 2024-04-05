package com.crud.peliculas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.peliculas.model.Pelicula;
import com.crud.peliculas.model.ResponseModel;
import com.crud.peliculas.repository.PeliculaRepository;

@Service
public class PeliculaServiceImpl implements PeliculaService{
    @Autowired
    private PeliculaRepository peliculaRepository;

    @Override
    public List<Pelicula> getAllPeliculas(){
        return peliculaRepository.findAll();
    }

    @Override
    public Optional<Pelicula> getPeliculaById(Long id){
        return peliculaRepository.findById(id);
    }

    @Override
    public Pelicula createPelicula(Pelicula pelicula){
        return peliculaRepository.save(pelicula);
    }

    @Override
    public Pelicula updatePelicula(Long id, Pelicula pelicula){
        if (peliculaRepository.existsById(id)) {
            pelicula.setId(id);
            return peliculaRepository.save(pelicula);
        }else{
            return null;
        }
    }

    @Override
    public ResponseModel deletePelicula(Long id){
        String message = "";
        Boolean status = false;
        
        if (peliculaRepository.existsById(id)) {
            peliculaRepository.deleteById(id);
            status = true;
            message = "La película ha sido eliminada con éxito.";
        }else{
            message = "No se puede realizar la acción. La película no existe.";
        }

        return new ResponseModel(status, message);
    }
}
