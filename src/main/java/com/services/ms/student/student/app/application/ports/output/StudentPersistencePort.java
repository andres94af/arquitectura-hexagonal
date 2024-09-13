package com.services.ms.student.student.app.application.ports.output;

//Iterfaz encargada de la persistencia de datos. La que se comunica con la BBDD.

import com.services.ms.student.student.app.domain.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentPersistencePort {

    Optional<Student> findById(Long id);
    List<Student> findAll();
    Student save(Student student);
    void deleteById (Long id);

}
