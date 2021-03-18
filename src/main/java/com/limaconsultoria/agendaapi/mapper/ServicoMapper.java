package com.limaconsultoria.agendaapi.mapper;

import com.limaconsultoria.agendaapi.domain.Servico;
import com.limaconsultoria.agendaapi.request.ServicoDTO;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface ServicoMapper {

    Servico toServico(ServicoDTO servicoDTO);

}
