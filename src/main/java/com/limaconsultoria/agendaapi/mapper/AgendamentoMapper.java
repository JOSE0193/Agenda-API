package com.limaconsultoria.agendaapi.mapper;


import com.limaconsultoria.agendaapi.domain.Agendamento;
import com.limaconsultoria.agendaapi.request.AgendamentoDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AgendamentoMapper {

    Agendamento toAgendamento(AgendamentoDTO agendamentoDTO);
}
