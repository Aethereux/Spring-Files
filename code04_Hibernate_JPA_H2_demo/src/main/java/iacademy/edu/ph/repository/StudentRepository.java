package iacademy.edu.ph.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import iacademy.edu.ph.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
	
}
