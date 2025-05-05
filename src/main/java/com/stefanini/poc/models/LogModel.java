package com.stefanini.poc.models;

import com.stefanini.poc.enums.LogType;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_logs")
public class LogModel implements Serializable {
    private static final long serialVersionUID = 100L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private LogType tipo;

    @Column(nullable = false)
    private LocalDateTime data;

    @Column(length = 255 )
    private String request;

    @Column(length = 255 )
    private String response;

    @Column(length = 255)
    private String mensagem;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LogType getTipo() {
        return tipo;
    }

    public void setTipo(LogType tipo) {
        this.tipo = tipo;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
