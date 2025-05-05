package com.stefanini.poc.controllers;


import com.stefanini.poc.dtos.EnderecoRecordDto;
import com.stefanini.poc.services.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    @GetMapping
    public ResponseEntity<Object> getAll() {
        return ResponseEntity.status(HttpStatus.OK).body(enderecoService.findAll());
    }

    @GetMapping("/{enderecoId}")
    public ResponseEntity<Object> getOneUser(@PathVariable(value = "enderecoId") Long enderecoId){
        return ResponseEntity.status(HttpStatus.OK).body(enderecoService.findById(enderecoId));
    }

    @PostMapping
    public ResponseEntity<Object> insert(@RequestBody @Validated EnderecoRecordDto enderecoDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(enderecoService.save(enderecoDto));
    }

}
