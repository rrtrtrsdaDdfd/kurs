package com.example.kurs.controller;

import com.example.kurs.DTO.ErrorDto;
import com.example.kurs.exception.MssException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice
@RestController
public class RestResponseExceptionHandler {
    @ExceptionHandler(value = {MssException.class})
    protected ResponseEntity<ErrorDto> mssConflict() {
        return ResponseEntity
                .status(400)
                .body(new ErrorDto(400,MssException.userWithBadMss));
    }

}
