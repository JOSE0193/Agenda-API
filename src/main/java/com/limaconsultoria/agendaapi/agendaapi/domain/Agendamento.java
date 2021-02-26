package com.limaconsultoria.agendaapi.agendaapi.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@Entity
    public class Agendamento implements Serializable {
    private static long serialVersionUID;

    static {
        serialVersionUID = 1L;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Date data;
    private String observacoes;

    @OneToOne(mappedBy = "agendamento")
    private List<Cliente> clientes;


    public Agendamento(Integer Id, LocalDateTime data, String observacoes) {

    }

    public Agendamento() {

        clientes = new ArrayList<>();
    }
}
