package me.dio.santander.dev.week3.controller.exeception;

import me.dio.santander.dev.week3.domain.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;

@RestControllerAdvice
public class GlobalExceptionHandler {

    private final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handleBusineesException(IllegalArgumentException businessExcepition){
        return new ResponseEntity<>(businessExcepition.getMessage(), HttpStatus.UNPROCESSABLE_ENTITY);

    }

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<String> handleNotFoundException(NoSuchElementException notFound){
        return new ResponseEntity<>("Resource ID not found.", HttpStatus.NOT_FOUND);

    }

    @ExceptionHandler(Throwable.class)
    public ResponseEntity<String> handleUnexpectedException (Throwable unexpectedException){
        logger.error("", unexpectedException);
        return new ResponseEntity<>("Unexpected Server Error, see the logs.", HttpStatus.INTERNAL_SERVER_ERROR);

    }

}
