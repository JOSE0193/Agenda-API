package com.limaconsultoria.agendaapi.agendaapi.repository;


import com.limaconsultoria.agendaapi.agendaapi.domain.Cliente;

import java.util.List;


public interface ClienteRepository {
    List<Cliente> listAll();
}
