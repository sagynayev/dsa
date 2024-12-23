package Users;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Edu.Database;

public class UserController {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void logIn() throws IOException {
		System.out.println("Hello user. Welcome to WSP!");
		while(true) {
			System.out.println("For exit enter - exit.\n");
			
			System.out.print("Enter your ID: ");
			String id = br.readLine();
			if(id.toLowerCase().equals("exit")) {System.out.println("\nBye-bye. Have a nice day!");Database.serilaizeUsers();break;}
			
			System.out.print("Enter your password: ");
			String password = br.readLine();
			if(password.toLowerCase().equals("exit")) {System.out.println("\nBye-bye. Have a nice day!");Database.serilaizeUsers();break;}
			
			Users u = Database.isRegistered(id, password);
			
			if(u == null) System.out.println("\nError. Incorrect ID or password. Try again:\n");
				
				if(u instanceof Student) {
					Student s = (Student)u;
					wspStudent.logIn(s);
				}
			}
		}
	public static <T> void viewProfile(T t) throws IOException {
    	System.out.println("\nMy profile:\n\n" + ((Users)t).forProfile());
    	System.out.print("\nEnter 'back' for return: ");
    	
    	String back = br.readLine();
    	if(back.toLowerCase().equals("back")) return;
    }
		
}

