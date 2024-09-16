package com.services.ms.student.student.app.infrastructure.adapters.input.rest.mapper;

import com.services.ms.student.student.app.domain.model.Student;
import com.services.ms.student.student.app.infrastructure.adapters.input.rest.model.request.StudentCreateRequest;
import com.services.ms.student.student.app.infrastructure.adapters.input.rest.model.response.StudentResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface StudentRestMapper {

    @Mapping(target = "id", ignore = true)//Al no especificarse el campo ID (porque no hayce falta) se ignora
    Student toStudent(StudentCreateRequest request);

    StudentResponse toStudentResponse(Student student);

    List<StudentResponse> toStudentResponseList(List<Student> studentList);

}
