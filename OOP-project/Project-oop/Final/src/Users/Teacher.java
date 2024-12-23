package Users;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Vector;
import Communication.Request;
import Edu.Course;
import Edu.Database;
import Edu.Lesson;
import Edu.Marks;
import Edu.Research;
import Enums.DayOfWeek;
import Enums.EmployeeTypes;
import Enums.TypeTeacher;
import Interfaces.SendableResearchable;


public class Teacher extends Employee implements Cloneable, Serializable, SendableResearchable {
  
	private static final long serialVersionUID = 1L;
	private TypeTeacher typeTeacher;
    private List<Course> assignedCourses;


    public Teacher(String firstName, String lastName, String id, String username, 
    		String password, String email, String phoneNumber, EmployeeTypes department,TypeTeacher typeTeacher ) {
        super();
        this.assignedCourses = new ArrayList<>();
        this.setTypeTeacher(typeTeacher);
    }

    public List<Course> viewAssignedCourses() {
        return assignedCourses;
    }

    public boolean putMark(Student s, Marks m, Lesson lesson) throws IOException {
	    Vector <Marks> marks = s.getJournal().getMarks().computeIfAbsent(lesson.getCourse(), k -> new Vector<>());
	    Double total = marks.stream().map(n->n.getMark()).mapToDouble(i -> i).sum();
	    if(total + m.getMark() > 30) {
	      return false;
	    }
	    marks.add(m);
	    return true;
	 }
    public boolean drawUpSchedule(Lesson lesson, DayOfWeek day, int begin) throws IOException {
		lesson.setDay(day);
		if(!(begin > 7 && begin < 23)) return false;
		lesson.setBegin(begin);
		Database.serilaizeUsers();
		Database.serilaizeUsers();
		return true;
	}
    public void assignGrade(Student student, double grade) {
        student.setGPA(grade);
        System.out.println("Grade " + grade + " assigned to student " + student.getFirstName());
    }

    public List<Student> viewStudentList(Course course) {
        return course.getStudents();
    }

    @Override
    public List<String> viewAssignedTasks() {
        return List.of("Prepare lecture notes", "Evaluate assignments");
    }

	public List<Course> getAssignedCourses() {
		return assignedCourses;
	}

	public void setAssignedCourses(List<Course> assignedCourses) {
		this.assignedCourses = assignedCourses;
	}

	@Override
	public void sendRequest(Request request) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doResearch(Research research) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sentMessage() {
		// TODO Auto-generated method stub
		
	}
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null) return false;
		if(this.getClass() != o.getClass()) return false;
		
		Users u = (Users)o;
		
		return this.id.equals(u.id);
	}
	public int hashCode() {
		return Objects.hash(id);
	}

	public int compareTo(Users u) {
	     return id.compareTo(u.getId());
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public TypeTeacher getTypeTeacher() {
		return typeTeacher;
	}

	public void setTypeTeacher(TypeTeacher typeTeacher) {
		this.typeTeacher = typeTeacher;
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
	public String idGenerator() throws IOException {
		// TODO Auto-generated method stub
		return null;
	}


	
}