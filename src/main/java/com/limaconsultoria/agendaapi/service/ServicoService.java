package com.limaconsultoria.agendaapi.service;


import com.limaconsultoria.agendaapi.domain.Servico;
import com.limaconsultoria.agendaapi.mapper.ServicoMapper;
import com.limaconsultoria.agendaapi.repository.ServicoRepository;
import com.limaconsultoria.agendaapi.request.ServicoDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ServicoService {

        private final ServicoRepository servicoRepository;

        public List<Servico> listAll() {
            return servicoRepository.findAll();
        }
        public List<Servico> findByNome(String nome){
            return servicoRepository.findByNome(nome);
        }

        public Servico findByIdThrowBadRequestException(Long id) {
            return servicoRepository.findById(id)
                    .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Serviço not Found"));
        }

        public Servico save(ServicoDTO servicoDTO) {
            return servicoRepository.save(ServicoMapper.INSTANCE.toServico(servicoDTO));
        }

        public void delete(Long id) {
            servicoRepository.deleteById(id);
        }

        public void replace(ServicoDTO servicoDTO) {
            Servico savedServico = findByIdThrowBadRequestException(servicoDTO.getId());
            Servico servico = ServicoMapper.INSTANCE.toServico(servicoDTO);
            servico.setId(savedServico.getId());
            servicoRepository.save(servico);
        }
}
