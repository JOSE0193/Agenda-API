package com.limaconsultoria.agendaapi.mapper;

import com.limaconsultoria.agendaapi.domain.Servico;
import com.limaconsultoria.agendaapi.request.ServicoDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper(componentModel = "spring")
public interface ServicoMapper {

        ServicoMapper INSTANCE = Mappers.getMapper(ServicoMapper.class);

        Servico toServico(ServicoDTO servicoDTO);
}
