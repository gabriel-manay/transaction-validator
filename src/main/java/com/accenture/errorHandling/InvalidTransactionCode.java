package com.accenture.errorHandling;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class InvalidTransactionCode implements InvalidField{
    @Override
    public String message() {
        return "Invalid Transaction Code";
    }
}
