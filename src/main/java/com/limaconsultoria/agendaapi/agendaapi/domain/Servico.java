package com.limaconsultoria.agendaapi.agendaapi.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@Entity
public class Servico implements Serializable {
        private static long serialVersionUID;

        static {
            serialVersionUID = 1L;
        }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome_servico;
    private String categoria;

    @OneToMany(mappedBy = "servico")
    private List<Empresa> empresas = new ArrayList<>();


    public Servico(Object id, String fisioterapia, String clínica) {
    }
}
}
