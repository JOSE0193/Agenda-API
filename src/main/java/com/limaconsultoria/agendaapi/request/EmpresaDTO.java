package com.limaconsultoria.agendaapi.request;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class EmpresaDTO {

    private Long id;
    @NotEmpty(message = "The empresa name cannot be empty")
    private String nome;
    private String cnpj;
    private String email;

}
