package com.limaconsultoria.agendaapi.agendaapi.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
    public class Agendamento implements Serializable {
    private static long serialVersionUID;

    static {
        serialVersionUID = 1L;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Date data;
    private String observacoes;

}
