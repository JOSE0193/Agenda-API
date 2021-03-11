package com.limaconsultoria.agendaapi.domain;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.List;

@Builder
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Servico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_SERVICO")
    private Long id;

    @NotNull
    @Column(name = "NOME")
    private String nome;

    @Column(name = "CATEGORIA")
    private String categoria;

    @ManyToOne
    @JoinColumn(name="ID_EMPRESA")
    private Empresa empresa;

    @ManyToMany(mappedBy = "servicos")
    private List<Profissional> profissionais;

    @OneToMany(mappedBy = "servico")
    private List<Agendamento> agendamentos;

}
