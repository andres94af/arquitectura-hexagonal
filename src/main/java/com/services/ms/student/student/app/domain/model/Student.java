package com.services.ms.student.student.app.domain.model;

//Al ser la capa de dominio no debe ser declarado como Entity ni tener validaciones como notnull, etc.
//Debe ser una clase modelo

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    private Long id;
    private String firstName;
    private String lastName;
    private Integer age;
    private String address;

}
