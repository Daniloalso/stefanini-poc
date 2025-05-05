package com.stefanini.poc.dtos;

import com.fasterxml.jackson.annotation.JsonView;
import com.stefanini.poc.validations.CepConstraint;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record EnderecoRecordDto(@NotBlank(message = "Rua é obrigatório")
                                @Size(min = 4, max = 100, message = "O tamanho deve ser entre 4 e 100 caracteres")
                                String rua,

                                @NotBlank(message = "Número é obrigatório")
                                @Size(min = 1, max = 50, message = "O tamanho deve ser entre 1 e 50 caracteres")
                                String numero,

                                @NotBlank(message = "Bairro é obrigatório")
                                @Size(min = 4, max = 100, message = "O tamanho deve ser entre 4 e 100 caracteres")
                                String bairro,

                                @NotBlank(message = "Cidade é obrigatório")
                                @Size(min = 4, max = 50, message = "O tamanho deve ser entre 4 e 50 caracteres")
                                String cidade,

                                @NotBlank(message = "Estado é obrigatório")
                                @Size(min = 4, max = 50, message = "O tamanho deve ser entre 4 e 50 caracteres")
                                String estado,

                                @NotBlank(message = "CEP é obrigatório")
                                @Size(min = 4, max = 10, message = "O tamanho deve ser entre 4 e 10 caracteres")
                                @CepConstraint
                                String cep) {
}
