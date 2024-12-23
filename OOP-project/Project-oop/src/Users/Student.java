package Users;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Edu.Course;
import Edu.Journal;
import Edu.ResearchProject;
import Edu.Transcript;
import Enums.Faculty;

public class Student extends Users {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String faculty;
    private String name;
    private int year;
    private double GPA;
    private List<Course> courses;
    private Transcript transcript;
    private Journal journal;
    private List<ResearchProject> researches;
    private boolean researchStatus;

    public Student(String firstName, String lastName, String id, String username, String password, String email, String phoneNumber, 
                   String faculty, int year, double GPA) {
        super();
        this.faculty = faculty;
        this.year = year;
        this.GPA = GPA;
        this.courses = new ArrayList<>();
        this.researches = new ArrayList<>();
        this.researchStatus = false;
    }

    public Student(String password, String firstName, String lastName, int age, int year2, double gPA2,
			Faculty valueOf) {
		// TODO Auto-generated constructor stub
	}

	public void registerToCourse(Course course) {
        courses.add(course);
        System.out.println("Registered to course: " + course.getTitle());
    }

    public Transcript getTranscript() {
        return transcript;
    }

    public void addDrop(Course course) {
        courses.remove(course);
        System.out.println("Dropped course: " + course.getTitle());
    }

    public void viewInfo() {
        System.out.println("Faculty: " + faculty);
        System.out.println("Year: " + year);
        System.out.println("GPA: " + GPA);
    }

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double gPA) {
		GPA = gPA;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public Journal getJournal() {
		return journal;
	}

	public void setJournal(Journal journal) {
		this.journal = journal;
	}

	public List<ResearchProject> getResearches() {
		return researches;
	}

	public void setResearches(List<ResearchProject> researches) {
		this.researches = researches;
	}

	public boolean isResearchStatus() {
		return researchStatus;
	}

	public void setResearchStatus(boolean researchStatus) {
		this.researchStatus = researchStatus;
	}

	public void setTranscript(Transcript transcript) {
		this.transcript = transcript;
	}

	public List<Course> getCoursesForRegistration() {
		// TODO Auto-generated method stub
		return null;
	}

	public void rateTeachers(Teacher teacher, double ratingInt) {
		// TODO Auto-generated method stub
		
	}

	public boolean isAlreadyRegistered(Course course) {
		// TODO Auto-generated method stub
		return false;
	}

	public char[] viewCourseFiles(Course course) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean getIsLogged() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String idGenerator() throws IOException {
		// TODO Auto-generated method stub
		return null;
	}


}