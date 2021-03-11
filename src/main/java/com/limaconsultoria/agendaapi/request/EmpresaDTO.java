package com.limaconsultoria.agendaapi.request;

import lombok.Data;

@Data
public class EmpresaDTO {
    private Long id;
    private String nome;
    private String cnpj;
    private String email;

}
