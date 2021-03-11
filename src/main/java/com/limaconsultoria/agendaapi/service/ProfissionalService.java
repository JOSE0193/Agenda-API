package com.limaconsultoria.agendaapi.service;


import com.limaconsultoria.agendaapi.domain.Profissional;
import com.limaconsultoria.agendaapi.mapper.ProfissionalMapper;
import com.limaconsultoria.agendaapi.repository.ProfissionalRepository;
import com.limaconsultoria.agendaapi.request.ProfissionalDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProfissionalService {

        private final ProfissionalRepository profissionalRepository;

        public List<Profissional> listAll() {
            return profissionalRepository.findAll();
        }

        public Profissional findByIdThrowBadRequestException(Long id) {
            return profissionalRepository.findById(id)
                    .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Profissional not Found"));
        }
        public List<Profissional> findByNome(String nome){
            return profissionalRepository.findByNome(nome);
        }

        public Profissional save(ProfissionalDTO profissionalDTO) {
            return profissionalRepository.save(ProfissionalMapper.INSTANCE.toProfissional(profissionalDTO));
        }

        public void delete(Long id) {
            profissionalRepository.deleteById(id);
        }

        public void replace(ProfissionalDTO profissionalDTO) {
            Profissional savedProfissional = findByIdThrowBadRequestException(profissionalDTO.getId());
            Profissional profissional = ProfissionalMapper.INSTANCE.toProfissional(profissionalDTO);
            profissional.setId(savedProfissional.getId());
            profissionalRepository.save(profissional);
        }
}
