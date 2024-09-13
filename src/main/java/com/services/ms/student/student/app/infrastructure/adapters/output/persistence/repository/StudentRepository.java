package com.services.ms.student.student.app.infrastructure.adapters.output.persistence.repository;

import com.services.ms.student.student.app.infrastructure.adapters.output.persistence.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //Realmente no es necesario porque ya esta incluido en JpaRepo.
public interface StudentRepository extends JpaRepository<StudentEntity, Long> {
}
