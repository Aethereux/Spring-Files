package iacademy.edu.ph;

import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import iacademy.edu.ph.model.Student;
import iacademy.edu.ph.repository.StudentRepository;

@SpringBootTest
class Code04HibernateJpaH2DemoApplicationTests {

	@Autowired
	private StudentRepository repository;
	@Test
	void recoredInsertion() {
		Student student1 = new Student(1111, "Guillermo", "Euclid Jan", "BSCS", 3);
		Student student2 = new Student(2222, "Haliburton", "Tyrese", "BS Web Dev", 2);
		Student student3 = new Student(3333, "James", "Lebwrong", "BS CS", 4);
		
		if (repository != null) {
			repository.save(student1); // this is same as INSERT INTO SQL Statement
			repository.save(student2);
			repository.save(student3);
			
			System.out.println("\n There are " + repository.count() + " records.");
			
			// Get All Records
			
			List<Student> students = repository.findAll();
			
			printAllRecords(students);
			
		} else {
			System.err.println("Repository is NULL.");
		}
		
		System.out.println("\nApplication Terminated.");
	}
	
	public void printAllRecords(List<Student> students) {
		
		Iterator<Student> iterator = students.iterator();
		System.out.println("\nHere are the student Records.");
		while (iterator.hasNext())
		{
			Student estudent = iterator.next();
			System.out.println("ID: " + estudent.getId());
			System.out.println("Name: " + estudent.getFirstName() + " " + estudent.getLastName());
			System.out.println("Course: " + estudent.getCourse());
			System.out.println("Year Level: " + estudent.getYearLevel());

		}
	}

}
