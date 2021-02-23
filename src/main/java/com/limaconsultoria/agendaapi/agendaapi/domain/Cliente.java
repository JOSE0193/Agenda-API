package com.limaconsultoria.agendaapi.agendaapi.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@Entity
public class Cliente implements Serializable {
    private static long serialVersionUID;

    static {
        serialVersionUID = 1L;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome_cliente;
    private Date data_nascimento;
    private char sexo;
    private String cpf;
    private String email_cliente;
    @OneToOne
    @JoinColumn(name = "Agendamento_id")
    private Agendamento agendamento;

    


}
