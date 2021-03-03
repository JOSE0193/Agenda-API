package com.limaconsultoria.agendaapi.agendaapi.service;

import com.limaconsultoria.agendaapi.agendaapi.domain.Agendamento;
import com.limaconsultoria.agendaapi.agendaapi.mapper.AgendaMapper;
import com.limaconsultoria.agendaapi.agendaapi.repository.*;
import com.limaconsultoria.agendaapi.agendaapi.request.AgendaPostRequestBody;
import com.limaconsultoria.agendaapi.agendaapi.request.AgendaPutRequestBody;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;

@Service
@RequiredArgsConstructor
    public class AgendamentoService {

    private final AgendamentoRepository agendamentoRepository;

    public List<Agendamento> listAll() {
        return agendamentoRepository.findAll();
    }

    public Agendamento findByIdThrowBadRequestException(Integer id) {
        return agendamentoRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Agendamento not Found"));
    }

    public Agendamento save(AgendaPostRequestBody agendaPostRequestBody) {
        return agendamentoRepository.save(AgendaMapper.INSTANCE.toAgendamento(agendaPostRequestBody));
    }

    public void delete(Integer id) {
        agendamentoRepository.delete(findByIdThrowBadRequestException(id));
    }

    public void replace(AgendaPutRequestBody agendaPutRequestBody) {
        Agendamento savedAgenda = findByIdThrowBadRequestException(agendaPutRequestBody.getId());
        Agendamento agendamento = AgendaMapper.INSTANCE.toAgendamento(agendaPutRequestBody);
        agendamento.setId(savedAgenda.getId());
        agendamentoRepository.save(agendamento);
    }
}
