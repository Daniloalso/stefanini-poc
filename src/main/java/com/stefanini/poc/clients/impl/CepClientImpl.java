package com.stefanini.poc.clients.impl;

import com.stefanini.poc.clients.CepClient;
import com.stefanini.poc.dtos.CepDto;
import com.stefanini.poc.dtos.LogDto;
import com.stefanini.poc.enums.LogType;
import com.stefanini.poc.exceptions.NotFoundException;
import com.stefanini.poc.services.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;

@Component
public class CepClientImpl implements CepClient {

    @Value("${app.cep.url}")
    String cepUrl ; // "http://localhost:8082/ceps/";

    @Autowired
    LogService logService;

    public CepDto buscarCep(String cep) {
        RestTemplate restTemplate = new RestTemplate();
        try {
            var cepDto = restTemplate.getForObject(cepUrl + cep, CepDto.class);

            logService.save(new LogDto(LogType.REQUEST, LocalDateTime.now(),cep,cepDto.toString() ,"Sucesso"));

            return cepDto;

        } catch (RestClientException e) {
            logService.save(new LogDto(LogType.REQUEST, LocalDateTime.now(),cep,"Error",e.getMessage().substring(0,254) ));
            throw new NotFoundException("CEP não encontrado!");
        }
    }
}
