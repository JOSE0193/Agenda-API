package com.limaconsultoria.agendaapi.request;

import com.limaconsultoria.agendaapi.domain.Agendamento;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class ClienteDTO {
    private Long id;
    @NotEmpty(message = "The cliente name cannot be empty")
    private String nome;
    @NotNull(message = "The birth date cannot be null")
    private String dataNascimento;
    private char sexo;
    private String cpf;
    private String email;
    private Agendamento agendamento;
}
