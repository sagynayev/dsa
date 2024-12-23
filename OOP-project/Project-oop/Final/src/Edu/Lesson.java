package Edu;

import java.util.Objects;
import java.io.Serializable;
import Enums.LessonType;


/**
 */
public class Lesson implements Serializable, Cloneable, Comparable <Lesson>
{
	private static final long serialVersionUID = -3948456844746305207L;
	
	private Course course;

	private LessonType type;
	private Enums.DayOfWeek day;
	
	private int begin;
    private int duration;
    private int room;
    
    
   public Lesson() {}
   

	public Lesson(Course course, LessonType type, int duration) {
		this.course = course;
		this.type = type;
		this.duration = duration;
		this.room = 0;
	}
	
	
	public LessonType getType() {
		return type;
	}
	public void setType(LessonType type) {
		this.type = type;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getRoom() {
		return room;
	}
	public void setRoom(int room) {
		this.room = room;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	public Enums.DayOfWeek getDay() {
		return day;
	}
	
	public int getBegin() {
		return begin;
	}
	public void setBegin(int begin) {
		this.begin = begin;
	}


	public boolean equals(Object obj) {
		Lesson other = (Lesson) obj;
		return this.getCourse().getTitle().equals(other.getCourse().getTitle()) && this.getType()==other.getType();
	}
	public int hashCode() {
		return Objects.hash(begin, course, day, duration, room, type);
	}
	
	public Object clone() throws CloneNotSupportedException {
		Lesson other = (Lesson) super.clone();
		other.setCourse(course);
		return other;
	}

	public String getDescription() {
		return this.getCourse().getTitle() + ": " + this.getType() + ", " + this.getDay() + ", " + this.getBegin() + "-" + (this.getBegin()+this.getDuration());
	}
	public String toString() {
		return this.getCourse().getTitle() + ": " + this.getType() + ", " + this.getBegin() + "-" + (this.getBegin()+this.getDuration());
	}
	
	public int compareTo(Lesson l) {
		if(this.getBegin() > l.getBegin()) return 1;
		if(this.getBegin() < l.getBegin()) return -1;
		return 0;
	}


	public void setDay(Enums.DayOfWeek day2) {
		this.day = day2;
		
	}
}
