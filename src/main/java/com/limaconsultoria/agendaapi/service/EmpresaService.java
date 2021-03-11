package com.limaconsultoria.agendaapi.service;

import com.limaconsultoria.agendaapi.domain.Empresa;
import com.limaconsultoria.agendaapi.mapper.EmpresaMapper;
import com.limaconsultoria.agendaapi.repository.EmpresaRepository;
import com.limaconsultoria.agendaapi.request.EmpresaDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EmpresaService {

        private final EmpresaRepository empresaRepository;

        public List<Empresa> listAll() {
            return empresaRepository.findAll();
        }
        public List<Empresa> findByNome(String nome){
            return empresaRepository.findByNome(nome);
        }

        public Empresa findByIdThrowBadRequestException(Long id) {
            return empresaRepository.findById(id)
                    .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Empresa not Found"));
        }

        public Empresa save(EmpresaDTO empresaDTO) {
            return empresaRepository.save(EmpresaMapper.INSTANCE.toEmpresa(empresaDTO));
        }

        public void delete(Long id) {
            empresaRepository.deleteById(id);
        }

        public void replace(EmpresaDTO empresaDTO) {
            Empresa savedEmpresa = findByIdThrowBadRequestException(empresaDTO.getId());
            Empresa empresa = EmpresaMapper.INSTANCE.toEmpresa(empresaDTO);
            empresa.setId(savedEmpresa.getId());
            empresaRepository.save(empresa);
        }
}
