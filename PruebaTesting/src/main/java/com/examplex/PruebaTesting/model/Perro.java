package com.examplex.PruebaTesting.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection = "perros")
public class Perro {
    @Id
    private String _id;
    private String nombre;
    private int anoNacimiento;
    private int edad;
}
