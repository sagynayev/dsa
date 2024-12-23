package Edu;

import java.io.FileOutputStream;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Vector;
import Communication.News;
import Communication.Request;

public class Database {

    public static HashSet <Course> courses = new HashSet <>();
    public static HashSet <Research> researches = new HashSet <>();
    public static Vector <Request> requests = new Vector <>();
	public static HashMap <String , Vector <News> > news = new HashMap <>();
	public static boolean registrationIsOpen;
	
	public static void SerializeAll() throws IOException {
		serilaizeUsers();
		serilaizeCourses();
	}
	public static void serilaizeUsers() throws IOException {
		try {
			FileOutputStream fos = new FileOutputStream("users.out");
			ObjectOutputStream user = new ObjectOutputStream(fos);
			user.writeObject(user);
			user.flush();
			user.close();
			fos.close();
		} 
		catch(Exception e) {e.getStackTrace();}
    }
	public static void serilaizeCourses() throws IOException {
		try {
			FileOutputStream fos = new FileOutputStream("courses.out");
			ObjectOutputStream course = new ObjectOutputStream(fos);
			course.writeObject(courses);
			course.flush();
			course.close();
			fos.close();
		} catch(Exception e) {
			e.getStackTrace();
		}
    }
}
