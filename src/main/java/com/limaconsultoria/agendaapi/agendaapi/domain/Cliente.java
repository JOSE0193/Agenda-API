package com.limaconsultoria.agendaapi.agendaapi.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@AllArgsConstructor
public class Cliente implements Serializable {
    private static long serialVersionUID;

    static {
        serialVersionUID = 1L;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)

    @Column(nullable = false)
    private String nome;
    private String dataNascimento;
    private char sexo;
    private String cpf;
    private String email;

}
