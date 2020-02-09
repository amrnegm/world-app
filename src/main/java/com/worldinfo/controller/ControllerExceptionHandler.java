package com.worldinfo.controller;


import com.worldinfo.constant.ErrorCode;
import com.worldinfo.dto.ErrorDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.CannotCreateTransactionException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(CannotCreateTransactionException.class)
    ResponseEntity<ErrorDto> handleCannotCreateTransactionException(CannotCreateTransactionException ex) {
        return new ResponseEntity<>(new ErrorDto(ErrorCode.INTERNAL_ERROR), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}

