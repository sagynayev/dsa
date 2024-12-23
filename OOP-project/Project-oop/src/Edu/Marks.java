package Edu;

import java.io.Serializable;
import java.util.GregorianCalendar;

import Users.Teacher;

public class Marks implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Teacher teacher;
    private double mark;
    private String description;
    private GregorianCalendar date;

    public Marks() {
        
    }


    protected Marks(Teacher teacher, double mark, String description, GregorianCalendar date) {
		super();
		this.teacher = teacher;
		this.mark = mark;
		this.description = description;
		this.date = date;
	}


	public Teacher getTeacher() {
		return teacher;
	}


	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}


	public double getMark() {
		return mark;
	}


	public void setMark(double mark) {
		this.mark = mark;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public GregorianCalendar getDate() {
		return date;
	}


	public void setDate(GregorianCalendar date) {
		this.date = date;
	}


	@Override
	public String toString() {
		return "Marks [teacher=" + teacher + ", mark=" + mark + ", description=" + description + ", date=" + date + "]";
	}


}
