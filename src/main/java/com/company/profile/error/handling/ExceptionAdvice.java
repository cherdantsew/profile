package com.company.profile.error.handling;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.validation.ConstraintViolationException;
import java.util.NoSuchElementException;

@ControllerAdvice
@ResponseBody
public class ExceptionAdvice extends ResponseEntityExceptionHandler {
    @ExceptionHandler(value = NoSuchElementException.class)
    public ResponseEntity<Object> handleNoSuchElementException(RuntimeException ex) {
        String bodyOfResponse = "There is no such element in repo.\n" + ex.getMessage();
        ErrorDTO errorDTO = ErrorDTO.builder().message(bodyOfResponse).build();
        return new ResponseEntity<>(errorDTO, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = ConstraintViolationException.class)
    public ResponseEntity<Object> handleConstraintViolationException(RuntimeException ex) {
        String bodyOfResponse = "The method param or class field value constraint is violated.\n" + ex.getMessage();
        ErrorDTO errorDTO = ErrorDTO.builder().message(bodyOfResponse).build();
        return new ResponseEntity<>(errorDTO, HttpStatus.BAD_REQUEST);
    }
}