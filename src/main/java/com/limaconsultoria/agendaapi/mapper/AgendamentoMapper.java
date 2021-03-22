package com.limaconsultoria.agendaapi.mapper;


import com.limaconsultoria.agendaapi.domain.Agendamento;
import com.limaconsultoria.agendaapi.request.AgendamentoDTO;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface AgendamentoMapper {

    AgendamentoMapper INSTANCE = Mappers.getMapper(AgendamentoMapper.class);

    Agendamento toAgendamento(AgendamentoDTO agendamentoDTO);
}
