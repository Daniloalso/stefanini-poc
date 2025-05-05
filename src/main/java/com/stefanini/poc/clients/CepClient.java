package com.stefanini.poc.clients;

import com.stefanini.poc.dtos.CepDto;

public interface CepClient {

    CepDto buscarCep(String cep);
}
