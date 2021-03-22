package com.limaconsultoria.agendaapi.request;

import com.limaconsultoria.agendaapi.domain.Cliente;
import com.limaconsultoria.agendaapi.domain.Profissional;
import com.limaconsultoria.agendaapi.domain.Servico;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AgendamentoDTO {

    private Long id;
    private String data;
    private String observacoes;
    private Cliente cliente;
    private Servico servico;
    private Profissional profissional;

}
