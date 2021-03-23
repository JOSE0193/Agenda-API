package com.limaconsultoria.agendaapi.request;

import lombok.Data;

import javax.validation.constraints.NotEmpty;


@Data
public class ServicoDTO {

    private Long id;
    @NotEmpty(message = "The servico name cannot be empty")
    private String nome;
    private String categoria;
}
