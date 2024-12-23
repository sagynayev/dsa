package Users;

import java.io.IOException;

import java.util.List;
import java.util.Vector;

import Communication.*;
import Edu.*;
import Enums.EmployeeTypes;

public class Manager extends Employee{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Manager(String firstName, String lastName, String id, String username, String password, String email,
			String phoneNumber, EmployeeTypes department) {
		super(firstName, lastName, id, username, password, email, phoneNumber, department);
		// TODO Auto-generated constructor stub
	}
	public boolean addCourse(Course course, Vector <Lesson> lessons) throws IOException {
		try {
	    	Database.courses.add(new Course(course, lessons));
	    	Database.serilaizeCourses();
	    	return true;
		} 
		catch(Exception e) {}
		return false;
	}
	

	public boolean equals(Object o) {
		return super.equals(o);
	}
	public int hashCode() {
		return super.hashCode();
	}

	public int compareTo(Users u) {
	     return super.compareTo(u);
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	@Override
	public void sendMessage(Employee e, Message m) {
		e.getMyMessages().add(m);
	}
	@Override
	public void sentMessage() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void updatePersonalInfo() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<String> viewAssignedTasks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String idGenerator() throws IOException {
		// TODO Auto-generated method stub
		return null;
	}
	
}
