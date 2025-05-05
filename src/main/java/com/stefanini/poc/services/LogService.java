package com.stefanini.poc.services;

import com.stefanini.poc.dtos.EnderecoRecordDto;
import com.stefanini.poc.dtos.LogDto;
import com.stefanini.poc.models.EnderecoModel;
import com.stefanini.poc.models.LogModel;
import org.apache.juli.logging.Log;

public interface LogService {

    LogModel save(LogDto logDto);
}
