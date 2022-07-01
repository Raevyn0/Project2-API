package com.revature.pokedeck.util.aspects;

import com.revature.pokedeck.util.dtos.ErrorResponse;
import com.revature.pokedeck.util.exceptions.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ErrorResponseAspect {

    @ExceptionHandler
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponse handleResourceNotFoundExceptions(ResourceNotFoundException e) {
        return new ErrorResponse(404, e.getMessage());
    }
}
