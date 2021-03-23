package com.limaconsultoria.agendaapi.request;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class AgendamentoDTO {

    private Long id;
    @NotNull(message = "The birth date cannot be null")
    private String data;
    private String observacoes;

}
