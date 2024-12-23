package Edu;

import java.util.ArrayList;
import java.util.List;

public class Transcript {
	private List<Semester> semesters;
    private double totalGPA;
    private int totalCredits;

    public Transcript() {
        this.semesters = new ArrayList<>();
        this.totalGPA = 0.0;
        this.totalCredits = 0;
    }

    // Добавление семестра
    public void addSemester(Semester semester) {
        semesters.add(semester);
        calculateTranscriptDetails();
    }

    // Пересчет общей информации
    private void calculateTranscriptDetails() {
        double totalGradePoints = 0.0;
        totalCredits = 0;

        for (Semester semester : semesters) {
            totalGradePoints += semester.getGPA() * semester.getCredits();
            totalCredits += semester.getCredits();
        }

        totalGPA = totalCredits > 0 ? totalGradePoints / totalCredits : 0.0;
    }

    // Получение всех семестров
    public List<Semester> getSemesters() {
        return semesters;
    }

    public double getTotalGPA() {
        return totalGPA;
    }

    public int getTotalCredits() {
        return totalCredits;
    }

    public void printTranscript() {
        System.out.println("Transcript:");
        for (Semester semester : semesters) {
            System.out.println("Semester " + semester.getSemesterNum() + " - GPA: " + semester.getGPA() + ", Credits: " + semester.getCredits());
        }
        System.out.println("Total GPA: " + totalGPA + ", Total Credits: " + totalCredits);
    }
}

