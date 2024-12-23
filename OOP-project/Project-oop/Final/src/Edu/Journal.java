package Edu;

import java.util.HashMap;
import java.util.Vector;

import java.io.Serializable;

public class Journal implements Serializable{
	private static final long serialVersionUID = -7133292178588222345L;

	private HashMap <Course, Vector <Marks> > marks;
    
    {
      marks = new HashMap<Course, Vector<Marks> >();
    }
    
    
    public Journal() {}
    
    
    public HashMap <Course, Vector <Marks> > getMarks() {
    	return marks;
    }
    public void setJournal(HashMap <Course, Vector <Marks> > marks) {
    	this.marks = marks;
    }
  
  
  
    public double getTotal(Course course) {
      double total = 0;
      for(Course c : marks.keySet()) {
        if(c.getTitle().equals(course.getTitle()) == false) continue;
        for(Marks m : marks.get(c)) {
          total+=m.getMark();
        }
      }
      System.out.println(total);
      return total;
    }
    
    
    public void clear() {
      marks = new HashMap<Course, Vector<Marks> >();
    }
}

