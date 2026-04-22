package com.example.DesafioAluraAPIScreenmatch.controller;

import com.example.DesafioAluraAPIScreenmatch.DTO.FraseDTO;
import com.example.DesafioAluraAPIScreenmatch.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/series/frases")
public class FraseController {

    @Autowired

    private FraseService servico;

    @GetMapping
    public FraseDTO obterFrases(){
        return servico.obterFraseAleatoria();
    }
}
