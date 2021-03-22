package com.limaconsultoria.agendaapi.mapper;


import com.limaconsultoria.agendaapi.domain.Empresa;
import com.limaconsultoria.agendaapi.request.EmpresaDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface EmpresaMapper {

       EmpresaMapper INSTANCE = Mappers.getMapper(EmpresaMapper.class);

       Empresa toEmpresa(EmpresaDTO empresaDTO);
}
