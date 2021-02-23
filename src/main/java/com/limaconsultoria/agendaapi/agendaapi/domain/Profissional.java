package com.limaconsultoria.agendaapi.agendaapi.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;
import java.io.Serializable;


@Data
@AllArgsConstructor
@Entity
public class Profissional implements Serializable {
    private static long serialVersionUID;
    static {
        serialVersionUID = 1L;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome_profissional;
    private String email_profissional;
}
