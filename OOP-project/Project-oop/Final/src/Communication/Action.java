package Communication;

import java.time.LocalDate;

import Users.Users;

public class Action {
	 LocalDate date;
	    Users executor;
	    String action;
	    
	    public Action() {
	    	
	    }
	    
	    public Action(LocalDate date, Users user, String action) {
	    	super();
	    	this.date = date;
	    	this.executor = user;
	    	this.action = action;
	    } 
	    
		@Override
		public String toString() {
			return "Date = " + date + ", executor = " + executor + ", action = " + action + "\n";
		}

		public LocalDate getDate() {
			return date;
		}

		public void setDate(LocalDate date) {
			this.date = date;
		}

		public Users getExecutor() {
			return executor;
		}

		public void setExecutor(Users user) {
			this.executor = user;
		}

		public String getAction() {
			return action;
		}

		public void setAction(String action) {
			this.action = action;
		}
}
