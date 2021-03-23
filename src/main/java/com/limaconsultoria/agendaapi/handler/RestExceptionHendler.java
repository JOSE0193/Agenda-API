package com.limaconsultoria.agendaapi.handler;

import com.limaconsultoria.agendaapi.exception.BadRequestException;
import com.limaconsultoria.agendaapi.exception.BadRequestDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class RestExceptionHendler {
    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<BadRequestDetails> handlerBadRequestException(BadRequestException badRequestException) {
        return new ResponseEntity<>(
                BadRequestDetails.builder()
                        .timestamp(LocalDateTime.now())
                        .status(HttpStatus.BAD_REQUEST.value())
                        .title("Bad Request Exception")
                        .details(badRequestException.getMessage())
                        .developmentMessage(badRequestException.getClass().getName())
                        .build(), HttpStatus.BAD_REQUEST);
    }

}
