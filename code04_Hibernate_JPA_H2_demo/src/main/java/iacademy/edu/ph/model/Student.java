package iacademy.edu.ph.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table (name="game_changer_students") // renames the table name to whatever the name value is (Default is the Class' name)
public class Student implements Serializable {

	/* 
	 * All Instance Variable must be private
	 */
	@Id
	private long id;
	private String lastName;
	private String firstName;
	private String course;
	private int yearLevel;
	
	public Student() {
		
	}

	public Student(long id, String lastName, String firstName, String course, int yearLevel) {
		super();
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.course = course;
		this.yearLevel = yearLevel;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getYearLevel() {
		return yearLevel;
	}

	public void setYearLevel(int yearLevel) {
		this.yearLevel = yearLevel;
	}

}
