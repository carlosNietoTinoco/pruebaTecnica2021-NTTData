package com.NTTData.service.impl;

import com.NTTData.model.Gestor;
import com.NTTData.model.NombresGestorDTO;
import com.NTTData.model.RequestGestorDTO;
import com.NTTData.repository.GestorRepository;
import com.NTTData.service.NTTDataService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class NTTDataServiceImpl implements NTTDataService {

    @Autowired
    private GestorRepository gestorRepository;

    @Override
    public Iterable<Gestor> getAllGestor() {
        return gestorRepository.findAll();
    }

    @Override
    public List<NombresGestorDTO> getGestorByName(RequestGestorDTO requestGestorDTO) {

        Iterable<Gestor> gestores = gestorRepository.findByPrimerNombreLikeOrSegundoNombreLike(
                requestGestorDTO.getNombre(),
                requestGestorDTO.getNombre());

        List<NombresGestorDTO> nombresGestorerDTO = convertirGestoresANobreGestores(gestores);
        return nombresGestorerDTO;
    }

    private List<NombresGestorDTO> convertirGestoresANobreGestores(Iterable<Gestor> gestores) {
        List<NombresGestorDTO> nombresGestoresDTO = new ArrayList<NombresGestorDTO>();
        for (Gestor gestor:gestores){
            nombresGestoresDTO.add(new NombresGestorDTO(gestor.getNombres()));
        }
        return nombresGestoresDTO;
    }
}
