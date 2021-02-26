package com.limaconsultoria.agendaapi.agendaapi.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@Entity
public class Empresa implements Serializable {
    private static long serialVersionUID;

    static {
        serialVersionUID = 1L;
    }
    @Id( = "id_empresa")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome_empresa;
    private String Cnpj;
    private String email_empresa;

    @OneToOne
    @JoinColumn(name = "Servico_id")
    private Servico servico;


}
