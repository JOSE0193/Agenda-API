package com.limaconsultoria.agendaapi.agendaapi.mapper;

import com.limaconsultoria.agendaapi.agendaapi.domain.Agendamento;
import com.limaconsultoria.agendaapi.agendaapi.request.AgendaPostRequestBody;
import com.limaconsultoria.agendaapi.agendaapi.request.AgendaPutRequestBody;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public abstract class AgendaMapper {

    public static final AgendaMapper INSTANCE = Mappers.getMapper(AgendaMapper.class);

    public Agendamento toAgendamento(AgendaPostRequestBody agendamentoPostRequestBody);

    public Agendamento toagendamento(AgendaPutRequestBody agendamentoPutRequestBody);
}
