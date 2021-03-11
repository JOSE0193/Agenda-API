package com.limaconsultoria.agendaapi.mapper;


import com.limaconsultoria.agendaapi.domain.Profissional;
import com.limaconsultoria.agendaapi.request.ProfissionalDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper(componentModel = "spring")
public interface ProfissionalMapper {

        ProfissionalMapper INSTANCE = Mappers.getMapper(ProfissionalMapper.class);

        Profissional toProfissional(ProfissionalDTO profissionalDTO);

}
