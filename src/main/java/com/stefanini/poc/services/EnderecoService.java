package com.stefanini.poc.services;

import com.stefanini.poc.dtos.EnderecoRecordDto;
import com.stefanini.poc.models.EnderecoModel;

import java.util.List;
import java.util.Optional;

public interface EnderecoService {

    List<EnderecoModel> findAll();

    Optional<EnderecoModel> findById(Long id);

    EnderecoModel save(EnderecoRecordDto enderecoRecordDto);

    //EnderecoModel registerUser(EnderecoRecordDto enderecoRecordDto)
}
