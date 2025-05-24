package com.VirtualBookstore.exception;

import com.VirtualBookstore.payroll.ErrorDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@RestControllerAdvice
public class ExceptionHandling {

    @ExceptionHandler(ResourceNotFound.class)
    public ResponseEntity<ErrorDetails> resourceNotFound(
            ErrorDetails er,
            WebRequest request
    ){
        ErrorDetails error = new ErrorDetails(
                er.getMessage(),
                new Date(),
                request.getDescription(true)
        );

        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    public ResponseEntity<ErrorDetails> globalException(
            Exception ex,
            WebRequest request
    ){
        ErrorDetails error = new ErrorDetails(
                ex.getMessage(),
                new Date(),
                request.getDescription(true)
        );

        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
