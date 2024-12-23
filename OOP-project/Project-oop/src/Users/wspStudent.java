package Users;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class wspStudent{
		static Student student = null; static Manager manager = null; static Teacher teacher = null;
		static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		public static void logIn(Student s) throws IOException {
			student = s;
			viewMenu();
		}

		public static void viewMenu() throws IOException {
	    	while(true) {
		    	System.out.println("\nMenu:\n" +
					                "1. My profile\n" +
					                "2. View user information\n" +
					                "3. Register to course\n" +
					                "4. Rate Teacher\n" +
					                "5. View Schedule\n" +
					                "6. Draw up schedule\n" +
					                "7. View journal\n" +
					                "8. View my courses\n" +
					                "9. View attestation\n" +
					                "10. View trancript\n" +
					                "11. Log-out\n");
	    	
				String choosen = br.readLine();
				
				switch(choosen) {
				case "1":
					UserController.viewProfile(student);
					break;
				case "2":
					viewInfo();
					break;
				case "3":
					registerToCourse();
					break;
				case "4":
					rateTeacher();
					break;
				case "5":
					viewSchedule(student);
					break;
				case "6":
					drawUpSchedule();
					break;
				case "7":
					viewJournal();
					break;
				case "8":
					viewStudentCourses();
					break;
				case "9":
					viewAttestation();
					break;
				case "10":
					break;
				case "11":
					System.out.println();
					Admin.getAdmin().setLogFiles(new Action(LocalDate.now(), student, "logged out"));
			    	Admin.serilaizeLogFiles();
					Librarian.serilaizeAvailableBooks();
					Librarian.serilaizeGivenBooks();
					DataBase.serilaizeOraganizations();
					DataBase.serilaizeUsers();
					DataBase.serilaizeResearches();
					return;
				default:
					System.out.println("\nWe don't have such an index. Please select again:");
				}
	    	}
		}
		public static Student getStudent() throws IOException{
	    	System.out.print("\n1. Enter password: ");
	    	String password = br.readLine();
	    	System.out.print("\n2. Enter first name: ");
	    	String firstName = br.readLine();
	    	System.out.print("\n3. Enter last name: ");
	    	String lastName = br.readLine();
	    	System.out.print("\n4. Enter age: ");
	    	int age = Integer.parseInt(br.readLine());
	    	System.out.print("\n5. Enter year of study: ");
	    	int year = Integer.parseInt(br.readLine());
	    	System.out.print("\n6. Enter GPA:  ");
	    	double GPA = Double.parseDouble(br.readLine());
	    	System.out.print("\n7. Choose faculty from list:\n" + Arrays.asList(Enums.Faculty.values()) + "\n\nEnter faculty: ");
	    	String facultyName = br.readLine().toUpperCase();
	    	try {
				Enums.Faculty.valueOf(facultyName);
			}
			catch(IllegalArgumentException e){
					System.out.println("Error, no such variant! Enter again:  ");
					facultyName = br.readLine().toUpperCase();
			}
	    	Student s = new Student(password, firstName, lastName, age, year, GPA, Enums.Faculty.valueOf(facultyName));
	    	s.setId(s.idGenerator());
	    	System.out.println("8. Id of new student is: " + s.getId() + "\n");
	    	return s;
	    }
		
		public static void viewInfo() throws IOException {
			System.out.println("\n1. Enter the name of the teacher to view information about him\n2. Enter back for return");

	    	while(true) {
	    		System.out.print("\nEnter name or 'back': ");
	    		String teacherName = br.readLine();
	    		
	    		boolean found = false;
			
	    		if(teacherName.toLowerCase().equals("back")) return;
				for(User u: Database.users.get(TypeUser.TEACHER)) {
					if(u instanceof Teacher && u.getFirstName().toLowerCase().equals(teacherName.toLowerCase())) {
						Teacher t = (Teacher)u;
						found = true;
						System.out.println("\n" + t); //+ "\n-\nCourses taught: " + t.getCourses().keySet());
					}
				}
				
				if(!found) System.out.println("There is no such teacher in the system.");
	    	}
	    }
		public static void viewInfo() throws IOException {
			System.out.println("\n1. Enter the name of the teacher to view information about him\n2. Enter back for return");

	    	while(true) {
	    		System.out.print("\nEnter name or 'back': ");
	    		String teacherName = br.readLine();
	    		
	    		boolean found = false;
			
	    		if(teacherName.toLowerCase().equals("back")) return;
				for(User u: DataBase.users.get(TypeUser.TEACHER)) {
					if(u instanceof Teacher && u.getFirstName().toLowerCase().equals(teacherName.toLowerCase())) {
						Teacher t = (Teacher)u;
						found = true;
						System.out.println("\n" + t); //+ "\n-\nCourses taught: " + t.getCourses().keySet());
					}
				}
				
				if(!found) System.out.println("There is no such teacher in the system.");
	    	}
	    }
}
		
}

