package com.limaconsultoria.agendaapi.agendaapi.repository;

import com.limaconsultoria.agendaapi.agendaapi.domain.Profissional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ProfissionalRepository extends JpaRepository(Profissional, Integer) {
    List<Profissional> listAll();
}
