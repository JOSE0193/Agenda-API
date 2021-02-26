package com.limaconsultoria.agendaapi.agendaapi.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
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
    private SimpleDateFormat data_nascimento = new SimpleDateFormat(dd/mm/yyyy);
    private char sexo;
    private String cpf;
    private String email_cliente;
    @OneToMany
    @JoinColumn(name = "id")
    private Agendamento agendamento;


    public Cliente(Integer integer, String josé_antonio, int i, char m, String s, String s1, Agendamento agenda1) {
    }
}
