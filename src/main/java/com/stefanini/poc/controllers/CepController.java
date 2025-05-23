package com.stefanini.poc.controllers;

import com.stefanini.poc.services.CepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ceps")
public class CepController {

    @Autowired
    private CepService cepService;

    @GetMapping("/{cep}")
    public ResponseEntity<Object> getOneCep(@PathVariable(value = "cep") String cep) {
        return ResponseEntity.status(HttpStatus.OK).body(cepService.buscaCep(cep));
    }

}
