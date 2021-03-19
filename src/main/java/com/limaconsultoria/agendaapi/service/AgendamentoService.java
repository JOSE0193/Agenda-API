package com.limaconsultoria.agendaapi.service;

import com.limaconsultoria.agendaapi.domain.Agendamento;
import com.limaconsultoria.agendaapi.exception.BadRequestException;
import com.limaconsultoria.agendaapi.mapper.AgendamentoMapper;
import com.limaconsultoria.agendaapi.request.AgendamentoDTO;
import com.limaconsultoria.agendaapi.repository.AgendamentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AgendamentoService {

    private final AgendamentoRepository agendamentoRepository;
    private final AgendamentoMapper mapper;

    public List<Agendamento> listAll() {
        return agendamentoRepository.findAll();
    }

    public Agendamento findByIdThrowBadRequestException(Long id) {
        return agendamentoRepository.findById(id)
                .orElseThrow(() -> new BadRequestException("Agendamento not Found"));
    }

    public Agendamento save(AgendamentoDTO agendamentoDTO) {
        return agendamentoRepository.save(mapper.toAgendamento(agendamentoDTO));
    }

    public void delete(Long id) {
        agendamentoRepository.deleteById(id);
    }

    public void replace(AgendamentoDTO agendamentoDTO) {
        Agendamento savedAgenda = findByIdThrowBadRequestException(agendamentoDTO.getId());
        Agendamento agendamento = mapper.toAgendamento(agendamentoDTO);
        agendamento.setId(savedAgenda.getId());
        agendamentoRepository.save(agendamento);
    }
}
