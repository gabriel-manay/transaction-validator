package com.accenture.errorHandling;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class InvalidAccountNumber implements InvalidField{
    @Override
    public String message() {
        return "Invalid Account Number";
    }
}
