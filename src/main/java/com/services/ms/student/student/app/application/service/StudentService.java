package com.services.ms.student.student.app.application.service;

import com.services.ms.student.student.app.application.ports.input.StudentServicePort;
import com.services.ms.student.student.app.application.ports.output.StudentPersistencePort;
import com.services.ms.student.student.app.domain.exception.StudentNotFoundException;
import com.services.ms.student.student.app.domain.model.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

//Clase de servicio implementa el puerto de entrada y hace uso del puerto de salida.
//Debe tener la anotacion de servicio
@Service
@RequiredArgsConstructor
public class StudentService implements StudentServicePort {

    private final StudentPersistencePort persistencePort;

    @Override
    public Student findById(Long id) {
        return persistencePort.findById(id)
                .orElseThrow(StudentNotFoundException::new);
    }

    @Override
    public List<Student> findAll() {
        return persistencePort.findAll();
    }

    @Override
    public Student save(Student student) {
        return persistencePort.save(student);
    }

    @Override
    public Student update(Long id, Student student) {
        return persistencePort.findById(id)
                .map(savedStudent -> {
                    savedStudent.setFirstName(student.getFirstName());
                    savedStudent.setLastName(student.getLastName());
                    savedStudent.setAddress(student.getAddress());
                    savedStudent.setAge(student.getAge());
                    return persistencePort.save(savedStudent);
                })
                  .orElseThrow(StudentNotFoundException::new);
                //.orElseThrow(() -> new StudentNotFoundException()); Es lo mismo que hacer esto.
    }

    @Override
    public void deleteById(Long id) {
        if (persistencePort.findById(id).isEmpty()){
            throw new StudentNotFoundException();
        }
        persistencePort.deleteById(id);
    }
}
