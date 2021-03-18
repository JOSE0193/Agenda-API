package com.limaconsultoria.agendaapi.service;


import com.limaconsultoria.agendaapi.domain.Servico;
import com.limaconsultoria.agendaapi.exception.BadRequestException;
import com.limaconsultoria.agendaapi.mapper.ServicoMapper;
import com.limaconsultoria.agendaapi.repository.ServicoRepository;
import com.limaconsultoria.agendaapi.request.ServicoDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ServicoService {

        private final ServicoRepository servicoRepository;
        private final ServicoMapper mapper;

        public List<Servico> listAll() {
            return servicoRepository.findAll();
        }
        public List<Servico> findByNome(String nome){
            return servicoRepository.findByNome(nome);
        }

        public Servico findByIdThrowBadRequestException(Long id) {
            return servicoRepository.findById(id)
                    .orElseThrow(() -> new BadRequestException("Serviço not Found"));
        }

        public Servico save(ServicoDTO servicoDTO) {
            return servicoRepository.save(mapper.toServico(servicoDTO));
        }

        public void delete(Long id) {
            servicoRepository.deleteById(id);
        }

        public void replace(ServicoDTO servicoDTO) {
            Servico savedServico = findByIdThrowBadRequestException(servicoDTO.getId());
            Servico servico = mapper.toServico(servicoDTO);
            servico.setId(savedServico.getId());
            servicoRepository.save(servico);
        }
}
