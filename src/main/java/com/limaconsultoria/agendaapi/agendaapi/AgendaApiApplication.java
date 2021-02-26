package com.limaconsultoria.agendaapi.agendaapi;

import com.limaconsultoria.agendaapi.agendaapi.domain.*;
import com.limaconsultoria.agendaapi.agendaapi.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.websocket.ClientEndpoint;
import java.time.LocalDateTime;
import java.util.Arrays;

@SpringBootApplication
public class AgendaApiApplication implements CommandLineRunner {
    @Autowired
    private AgendamentoRepository agendaRep = new AgendamentoRepository();
    @Autowired
    private ClienteRepository clienteRep = new ClienteRepository();
    @Autowired
    private EmpresaRepository empresaRep = new EmpresaRepository();
    @Autowired
    private ProfissionalRepository profissionalRep = new ProfissionalRepository();
    @Autowired
    private ServicoRepository servicoRep = new ServicoRepository();


    public static void main(String[] args) {
		SpringApplication.run(AgendaApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Agendamento agenda1 = new Agendamento(null, LocalDateTime.now(), "cliente1");

		Cliente cliente1 = new Cliente
				(null, "José Antonio", 01-11-1993, 'M',
						"043.157.771.45", "jose01.1193@gmail.com", agenda1);

		Empresa empresa1 = new Empresa(null, "Clinica Moviment",
				"42.131.783/0001-92", "clinicamoviment123@gmail.com");

		Profissional profissional1 = new Profissional(null, "Katiene", "katigatinha@gmail.com");

		Servico servico1 = new Servico(null, "Fisioterapia", "Clínica");

		agenda1.getAgendamento().addAll(Array.asList(cliente1));

		this.agendaRep.saveAll(Arrays.asList(agenda1));
		this.clienteRep.saveAll(Arrays.asList(cliente1));
        this.empresaRep.saveAll(Arrays.asList(empresa1));
        this.profissionalRep.saveAll(Arrays.asList(profissional1));
        this.servicoRep.saveAll(Arrays.asList(servico1));

	}
}
