package com.limaconsultoria.agendaapi.agendaapi.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
public class Servico implements Serializable {
        private static long serialVersionUID;

        static {
            serialVersionUID = 1L;
        }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String nome;
    private String categoria;

}
