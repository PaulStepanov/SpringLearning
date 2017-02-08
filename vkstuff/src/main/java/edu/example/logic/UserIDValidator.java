package edu.example.logic;

import org.springframework.stereotype.Component;

@Component
public interface UserIDValidator {
    public String validateID(String id);

}
