package com.jecesario.generationawsfinalproject.rest.controllers.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class DefaultError {
    
    private List<String> messages;

}
