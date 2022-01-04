package com.example.online_shop.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
@Getter @Setter
@AllArgsConstructor
public class ResourceNotFoundException extends RuntimeException {
    private String resource;
    private int id;

}

