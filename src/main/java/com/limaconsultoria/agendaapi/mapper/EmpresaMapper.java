package com.limaconsultoria.agendaapi.mapper;


import com.limaconsultoria.agendaapi.domain.Empresa;
import com.limaconsultoria.agendaapi.request.EmpresaDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmpresaMapper {

    Empresa toEmpresa(EmpresaDTO empresaDTO);
}
