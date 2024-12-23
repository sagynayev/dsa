package Edu;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import Enums.TypeCourse;
import Users.Student;
import Users.Teacher;

public class Course {
	  private String courseId;
	    private String title;
	    private int credits;
	    private TypeCourse type;
	    private List<Teacher> teachers;
	    private List<Student> students;

	    public Course(String courseCode, String title, int credits, TypeCourse type) {
	        this.courseId = courseCode;
	        this.title = title;
	        this.setCredits(credits);
	        this.setType(type);
	        this.teachers = new ArrayList<>();
	        this.students = new ArrayList<>();
	    }

	    public Course(Course course, Vector<Lesson> lessons) {
		}

		public void addTeacher(Teacher teacher) {
	        teachers.add(teacher);
	        System.out.println("Teacher " + teacher.getFirstName() + " has been added to the course " + title);
	    }

	    public String getCourseId() {
	        return courseId;
	    }

	    public String getTitle() {
	        return title;
	    }
	    public List<Student> getStudents() {
	        return students;
	    }

	    public void addStudent(Student student) {
	        if (!students.contains(student)) {
	            students.add(student);
	            System.out.println("Student " + student.getFirstName() + " has been added to the course " + title);
	        } else {
	            System.out.println("Student is already registered for this course.");
	        }
	    }

	    public void removeStudent(Student student) {
	        if (students.remove(student)) {
	            System.out.println("Student " + student.getFirstName() + " has been removed from the course " + title);
	        } else {
	            System.out.println("Student not found in this course.");
	        }
	    }

		public int getCredits() {
			return credits;
		}

		public void setCredits(int credits) {
			this.credits = credits;
		}

		public TypeCourse getType() {
			return type;
		}

		public void setType(TypeCourse type) {
			this.type = type;
		}
}
