package com.limaconsultoria.agendaapi.agendaapi.repository;

import com.limaconsultoria.agendaapi.agendaapi.domain.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface AgendamentoRepository extends JpaRepository(Agendamento, Integer) {
    List<Agendamento> listAll();
}
