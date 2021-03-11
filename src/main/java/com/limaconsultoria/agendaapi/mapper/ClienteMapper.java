package com.limaconsultoria.agendaapi.mapper;


import com.limaconsultoria.agendaapi.domain.Cliente;
import com.limaconsultoria.agendaapi.request.ClienteDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper(componentModel = "spring")
public interface ClienteMapper {

       ClienteMapper INSTANCE = Mappers.getMapper(ClienteMapper.class);

       Cliente toCliente(ClienteDTO clienteDTO);
}

