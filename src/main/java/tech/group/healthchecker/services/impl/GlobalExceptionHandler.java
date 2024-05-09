package tech.group.healthchecker.services.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<?> handleAnyException(Exception exception) {
        return ResponseEntity.internalServerError()
                .body(ExceptionResponse.of(500, exception.getMessage()));
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor(staticName = "of")
    static class ExceptionResponse {
        private Integer code;
        private String message;
    }
}
