package com.limaconsultoria.agendaapi.service;


import com.limaconsultoria.agendaapi.domain.Cliente;
import com.limaconsultoria.agendaapi.mapper.ClienteMapper;
import com.limaconsultoria.agendaapi.repository.ClienteRepository;
import com.limaconsultoria.agendaapi.request.ClienteDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ClienteService {

        private final ClienteRepository clienteRepository;

        public List<Cliente> listAll() {
            return clienteRepository.findAll();
        }
        public List<Cliente> findByNome(String nome){
            return clienteRepository.findByNome(nome);
        }

        public Cliente findByIdThrowBadRequestException(Long id) {
            return clienteRepository.findById(id)
                    .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Cliente is not Found"));
        }

        public Cliente save(ClienteDTO clienteDTO) {
            return clienteRepository.save(ClienteMapper.INSTANCE.toCliente(clienteDTO));
        }

        public void delete(Long id) {
            clienteRepository.deleteById(id);
        }

        public void replace(ClienteDTO clienteDTO) {
            Cliente savedCliente = findByIdThrowBadRequestException(clienteDTO.getId());
            Cliente cliente = ClienteMapper.INSTANCE.toCliente(clienteDTO);
            cliente.setId(savedCliente.getId());
            clienteRepository.save(cliente);
        }
}
