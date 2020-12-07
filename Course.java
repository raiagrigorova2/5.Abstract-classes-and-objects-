package AbstractClassesAndObjects;

import java.util.ArrayList;

public class Course {
//	�������� � ���������
//	����� Course, ���������
//	����������. ���� ���� ���� 
//	�� �� �������� �� �������� ������� �������.
	private String courseName;
	private ArrayList <String> students;
	private int numberOfStudents;
//	(The Course class)
//	��������� ����� �� Course �� ������ 16.2.
//	����������� ArrayList �� ������ �� �����a
//	�� ����������� �� �������. ���������� UML
//	�������� �� ����a. �� ������ �� ���������
//	����������� ������� �� ����� Course (�.�.
//	����������� �� �������������� � ��������
//	�� ������ �� �� �������, � private ��������
//	����� �� ����� �������.)

	public Course(String courseName){
		this.courseName = courseName;
		students = new ArrayList <String>();
		numberOfStudents = 0;
	}

	public String getCourseName() {
		return courseName;
	}
	
	public void addStudent(String student) {
		if(numberOfStudents < 100) {
			students.set(numberOfStudents, student);
			numberOfStudents++;
		}
	}
	
	public void dropStudent(String student) {
		for(int i = 0; i < numberOfStudents; i++) {
			if(student.equals(students.get(i))) {
				for(int j = i; j <  numberOfStudents - 1; j++) {
					students.set(j, students.get(j+1));
				}
				numberOfStudents--;
				students.set(numberOfStudents, null);
				break;
			}
		}
	}
	
	public ArrayList <String> getStudents() {
		return students;
	}
	
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	
	public void print() {
		System.out.println(this.getNumberOfStudents() + " students in total in "+ this.getCourseName());
		
		for(int i = 0; i < this.getNumberOfStudents(); i++) {
			System.out.println("students [" + i + "] is " + this.getStudents().get(i));
		}
	}
}
