package com.example.DesafioAluraAPIScreenmatch.service;

import com.example.DesafioAluraAPIScreenmatch.DTO.FraseDTO;
import com.example.DesafioAluraAPIScreenmatch.model.Frase;
import com.example.DesafioAluraAPIScreenmatch.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FraseService {

    @Autowired
    private FraseRepository repository;

    public FraseDTO obterFraseAleatoria() {
        Frase frase = repository.buscarFraseAleatoria();
        return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPoster(), frase.getPersonagem());
    }
}