package com.stefanini.poc.services.impl;

import com.stefanini.poc.dtos.EnderecoRecordDto;
import com.stefanini.poc.exceptions.NotFoundException;
import com.stefanini.poc.models.EnderecoModel;
import com.stefanini.poc.repositories.EnderecoRepository;
import com.stefanini.poc.services.EnderecoService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnderecoServiceImpl implements EnderecoService {

    private final EnderecoRepository enderecoRepository;

    public EnderecoServiceImpl(EnderecoRepository enderecoRepository) {
        this.enderecoRepository = enderecoRepository;
    }

    @Override
    public List<EnderecoModel> findAll() {
        return enderecoRepository.findAll();
    }

    @Override
    public Optional<EnderecoModel> findById(Long id) {
        Optional<EnderecoModel> enderecoModelOptional = enderecoRepository.findById(id);

//        if (enderecoModelOptional.isEmpty()) {
//            throw new NotFoundException("Error: Endereço não encontrado!");
//        }

        return enderecoModelOptional;
    }

    @Override
    public EnderecoModel save(EnderecoRecordDto enderecoRecordDto) {
        var enderecoModel = new EnderecoModel();

        BeanUtils.copyProperties(enderecoRecordDto, enderecoModel);

        return enderecoRepository.save(enderecoModel);
    }
}
