package com.services.ms.student.student.app.infrastructure.adapters.output.persistence.mapper;

import com.services.ms.student.student.app.domain.model.Student;
import com.services.ms.student.student.app.infrastructure.adapters.output.persistence.entity.StudentEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface StudentPersistenceMapper {

    //@Mapping(target = "age", source = "age") //Realmente no hace falta porque los campos tienen el mismo nombre.
    StudentEntity toStudentEntity(Student student);

    Student toStudent (StudentEntity entity);

    List<Student> toStudentList(List<StudentEntity> entityList);

}
