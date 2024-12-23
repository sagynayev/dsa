package Users;

import java.util.List;
import java.util.Objects;
import java.util.Vector;

import Communication.Message;
import Enums.EmployeeTypes;
import Interfaces.Messagable;

abstract class Employee extends Users implements Messagable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private EmployeeTypes department;
	private Vector <Message> myMessages = new Vector <Message>();
    public Employee(String firstName, String lastName, String id, String username, 
    		String password, String email, String phoneNumber, EmployeeTypes department) {
        super( );
        this.department = department;
    }
    public Employee() {
        super();
    }

    public abstract void updatePersonalInfo();
    public Vector<Message> getMyMessages() {
		return myMessages;
	}
    public void sendMessage(Employee e, Message m) {
		e.getMyMessages().add(m);
	}

    public boolean applyForLeave() {
        System.out.println("Leave application submitted.");
        return true;
    }

    public abstract List<String> viewAssignedTasks();
    public boolean equals(Object o) {
    	if(!super.equals(o)) return false;
    	
    	Employee e = (Employee)o;
    	
    	return this.id.equals(e.id) && this.myMessages.equals(e.myMessages);
    }
	public int hashCode() {
		return Objects.hash(super.getId());
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	@Override
	public String toString() {
		return "Employee [department=" + department + ", myMessages=" + myMessages + "]";
	}
}