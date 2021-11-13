package com.NTTData.service;

import com.NTTData.model.Gestor;
import com.NTTData.model.NombresGestorDTO;
import com.NTTData.model.RequestGestorDTO;

import java.util.List;
import java.util.Optional;

public interface NTTDataService {

    Iterable<Gestor> getAllGestor();

    List<NombresGestorDTO> getGestorByName(RequestGestorDTO requestGestorDTO);
}
