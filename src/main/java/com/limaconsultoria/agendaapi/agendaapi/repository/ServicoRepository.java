package com.limaconsultoria.agendaapi.agendaapi.repository;

import com.limaconsultoria.agendaapi.agendaapi.domain.Servico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicoRepository extends JpaRepository <Servico, Integer>{
}
