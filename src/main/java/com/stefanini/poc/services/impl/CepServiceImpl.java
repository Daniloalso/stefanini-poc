package com.stefanini.poc.services.impl;

import com.stefanini.poc.clients.CepClient;
import com.stefanini.poc.dtos.CepDto;
import com.stefanini.poc.enums.LogType;
import com.stefanini.poc.models.LogModel;
import com.stefanini.poc.repositories.LogRepository;
import com.stefanini.poc.services.CepService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class CepServiceImpl implements CepService {

    @Autowired
    CepClient cepClient;

    @Override
    public CepDto buscaCep(String cep) {
        var cepDto = cepClient.buscarCep(cep);

        return cepDto;
    }
}
