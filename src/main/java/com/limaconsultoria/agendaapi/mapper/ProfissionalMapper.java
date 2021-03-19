package com.limaconsultoria.agendaapi.mapper;


import com.limaconsultoria.agendaapi.domain.Profissional;
import com.limaconsultoria.agendaapi.request.ProfissionalDTO;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface ProfissionalMapper {

    Profissional toProfissional(ProfissionalDTO profissionalDTO);

}
