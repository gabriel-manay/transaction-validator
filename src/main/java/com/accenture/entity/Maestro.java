package com.accenture.entity;

//CREATE TABLE maetar (clave INT AUTO_INCREMENT PRIMARY KEY,
// numtar VARCHAR (16) NOT NULL, bintar VARCHAR(6) NOT NULL,
// codbco VARCHAR(3) NOT NULL, codcasa VARCHAR(3) NOT NULL,
// numusu VARCHAR (9) NOT NULL, cvv VARCHAR(3) NOT NULL,
// catego VARCHAR (1) NOT NULL, tiptar VARCHAR (1) NOT NULL);

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Maestro {
    @Id
    private Integer clave;
    private String numtar;
    private String bintar;
    private String codbco;
    private String codcasa;
    private String numusu;
    private String cvv;
    private String catego;
    private String tiptar;
}
