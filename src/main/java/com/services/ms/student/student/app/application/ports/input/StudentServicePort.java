package com.services.ms.student.student.app.application.ports.input;

import com.services.ms.student.student.app.domain.model.Student;

import java.util.List;

//Interfaz o puerto de entrada encargado de declarar los metodos crud. No debe tener modelos.
//Estas interfaces seran implementadas por los adaptadores.

public interface StudentServicePort {

    Student findById(Long id);
    List<Student> findAll();
    Student save(Student student);
    Student update(Long id, Student student);
    void deleteById(Long id);

}
