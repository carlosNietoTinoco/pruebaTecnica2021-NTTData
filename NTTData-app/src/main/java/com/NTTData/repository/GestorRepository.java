package com.NTTData.repository;

import com.NTTData.model.Gestor;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface GestorRepository extends CrudRepository<Gestor, String> {

    Optional<Iterable<Gestor>> findByPrimerNombre(String PRIMER_NOMBRE);

    //@Convert(converter = GestorToNombresGestorDTOConverter.class)
    Iterable<Gestor> findByPrimerNombreLikeOrSegundoNombreLike(
            String primerNombre,
            String segundoNombre);
}
