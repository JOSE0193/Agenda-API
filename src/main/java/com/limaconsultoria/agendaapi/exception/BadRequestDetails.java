package com.limaconsultoria.agendaapi.exception;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class BadRequestDetails {
    private String title;
    private int status;
    private String details;
    private String developmentMessage;
    private LocalDateTime timestamp;
}
