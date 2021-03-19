package com.limaconsultoria.agendaapi.mapper;


import com.limaconsultoria.agendaapi.domain.Cliente;
import com.limaconsultoria.agendaapi.request.ClienteDTO;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface ClienteMapper {

    Cliente toCliente(ClienteDTO clienteDTO);
}

