package com.limaconsultoria.agendaapi.request;

import com.limaconsultoria.agendaapi.domain.Cliente;
import com.limaconsultoria.agendaapi.domain.Profissional;
import com.limaconsultoria.agendaapi.domain.Servico;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class AgendamentoDTO {
    private Long id;

    @NotNull(message = "The date cannot be empty")
    private String data;
    private String observacoes;
    private Cliente cliente;
    private Servico servico;
    private Profissional profissional;
}
