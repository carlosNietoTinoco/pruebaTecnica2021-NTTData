package com.NTTData.util;

import com.NTTData.model.Gestor;
import com.NTTData.model.NombresGestorDTO;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.Optional;

@Converter
public class GestorToNombresGestorDTOConverter implements AttributeConverter<Optional<Iterable<Gestor>>, Optional<Iterable<NombresGestorDTO>>> {

    @Override
    public Optional<Iterable<NombresGestorDTO>> convertToDatabaseColumn(Optional<Iterable<Gestor>> gestors) {
        return Optional.empty();
    }

    @Override
    public Optional<Iterable<Gestor>> convertToEntityAttribute(Optional<Iterable<NombresGestorDTO>> nombresGestorDTOS) {
        return Optional.empty();
    }
}
