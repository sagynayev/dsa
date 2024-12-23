package Edu;
import Users.Users;
import java.io.Serializable;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

public class Research implements Serializable
{
	private static final long serialVersionUID = -3429241527029990779L;

	private String name;
    private String description;
    
	private Vector <Users> researchers;
    
    {
    	researchers = new Vector <Users>();
    }
    
    
    public Research() {}
    
	public Research(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Vector <Users> getResearchers() {
		return researchers;
	}
	
	public List <String> sysResearchers() {
		List <String> res = this.researchers.stream().map(r -> r.getFirstName()).collect(Collectors.toList()); return res;
	}
	public String toString() {
		return this.name + ", authors: " + this.sysResearchers();
	}
}
