package com.stefanini.poc.services.impl;

import com.stefanini.poc.dtos.LogDto;
import com.stefanini.poc.models.EnderecoModel;
import com.stefanini.poc.models.LogModel;
import com.stefanini.poc.repositories.LogRepository;
import com.stefanini.poc.services.LogService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogServiceImpl implements LogService {

    @Autowired
    LogRepository logRepository;

    @Override
    public LogModel save(LogDto logDto) {
        var logModel = new LogModel();

        BeanUtils.copyProperties(logDto, logModel);

        return logRepository.save(logModel);
    }
}
