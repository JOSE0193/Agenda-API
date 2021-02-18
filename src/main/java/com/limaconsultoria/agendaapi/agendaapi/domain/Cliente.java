package com.limaconsultoria.agendaapi.agendaapi.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class Cliente {
    private int idCliente;
    private String nomeCliente;
    private Date dataNascimento;
    private char sexo;
    private String cpf;
    private String emailCliente;
}
