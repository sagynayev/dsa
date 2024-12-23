package Edu;

import java.util.HashMap;

public class Semester {
	private int semesterNum;
    private double GPA;
    private int credits;
    private HashMap<Course, Double> attestations;

    public Semester(int semesterNum) {
        this.semesterNum = semesterNum;
        this.GPA = 0.0;
        this.credits = 0;
        this.attestations = new HashMap<>();
    }

    public void addCourseResult(Course course, double grade, int courseCredits) {
        attestations.put(course, grade);
        calculateSemesterDetails(courseCredits);
    }

    private void calculateSemesterDetails(int courseCredits) {
        double totalGradePoints = 0.0;

        for (double grade : attestations.values()) {
            totalGradePoints += grade * courseCredits; // Weighted grade
        }

        this.credits = attestations.size() * courseCredits; // Assuming each course has the same credits
        this.GPA = credits > 0 ? totalGradePoints / credits : 0.0;
    }

    public double getGPA() {
        return GPA;
    }

    public int getCredits() {
        return credits;
    }

    public int getSemesterNum() {
        return semesterNum;
    }

    public void addCredits(int credits) {
        this.credits += credits;
    }

}
