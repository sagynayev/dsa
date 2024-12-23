package Edu;

import java.io.FileOutputStream;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Optional;
import java.util.Vector;
import Communication.News;
import Communication.Request;
import Enums.TypeUser;
import Users.Users;

public class Database {
	public static HashMap <TypeUser, HashSet <Users> > users = new HashMap <>();
    public static HashSet <Course> courses = new HashSet <>();
    public static HashSet <Research> researches = new HashSet <>();
    public static Vector <Request> requests = new Vector <>();
	public static HashMap <String , Vector <News> > news = new HashMap <>();
	public static boolean registrationIsOpen;
	 private static Database instance;
	
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
	public static Users isRegistered(String id, String password) {
		for(java.util.Map.Entry<TypeUser, HashSet<Users>> e: Database.users.entrySet()) {
			Optional <Users> optional = e.getValue().stream().filter(n -> n.getId().equals(id) && n.getPassword().equals(password)).findFirst();
			if(optional.isPresent()) {Users u = optional.get(); return u;}
		}
		return null;
	}
	public static Database getInstance() {
	    if (instance == null) {
	        synchronized (Database.class) { 
	            if (instance == null) {
	                instance = new Database();
	            }
	        }
	    }
	    return instance;
	}
	
}
