package com.limaconsultoria.agendaapi.request;

import com.limaconsultoria.agendaapi.domain.Agendamento;
import lombok.Data;

@Data
public class ClienteDTO {
    private Long id;
    private String nome;
    private String dataNascimento;
    private char sexo;
    private String cpf;
    private String email;
    private Agendamento agendamento;
}
