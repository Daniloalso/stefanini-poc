package com.stefanini.poc.dtos;

import com.stefanini.poc.enums.LogType;

import java.time.LocalDateTime;

public record LogDto(LogType tipo, LocalDateTime data, String request, String response, String mensagem) {
}
