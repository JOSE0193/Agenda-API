package com.limaconsultoria.agendaapi.agendaapi.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Empresa {
    private int idEmpresa;
    private String nomeEmpresa;
    private String Cnpj;
    private String emailEmpresa;


}
