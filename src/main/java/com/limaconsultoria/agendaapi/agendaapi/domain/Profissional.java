package com.limaconsultoria.agendaapi.agendaapi.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Profissional {
    private int idProfessional;
    private String nomeProfissional;
    private String emailProfissional;
}
