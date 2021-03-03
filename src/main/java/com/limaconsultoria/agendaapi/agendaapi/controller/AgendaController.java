package com.limaconsultoria.agendaapi.agendaapi.controller;

import com.limaconsultoria.agendaapi.agendaapi.domain.Agendamento;
import com.limaconsultoria.agendaapi.agendaapi.request.AgendaPostRequestBody;
import com.limaconsultoria.agendaapi.agendaapi.request.AgendaPutRequestBody;
import com.limaconsultoria.agendaapi.agendaapi.service.AgendamentoService;
import com.limaconsultoria.agendaapi.agendaapi.util.DateUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;
import java.util.List;


@RequestMapping("Agendamentos")
@RestController
@RequiredArgsConstructor
@Log4j2

public class AgendaController {

    private final AgendamentoService agendamentoService;
    private final DateUtil dateUtil;

    @GetMapping
    public ResponseEntity<List<Agendamento>> list() {
        log.info(dateUtil.formatLocalDateTimeToDataBaseStyle(LocalDateTime.now()));
        return ResponseEntity.ok(agendamentoService.listAll());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Agendamento> findById(@PathVariable Integer id) {
        return ResponseEntity.ok(agendamentoService.findByIdThrowBadRequestException(id));
    }

    @PostMapping
    public ResponseEntity<Agendamento> save(@RequestBody AgendaPostRequestBody agendaPostRequestBody){
    return new ResponseEntity<>(agendamentoService.save(agendaPostRequestBody), HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        agendamentoService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping
    public ResponseEntity<Void> replace(@RequestBody AgendaPutRequestBody agendaPutRequestBody){
        agendamentoService.replace(agendaPutRequestBody);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}