package Communication;

import java.io.Serializable;
import Users.*;

public class Request implements Serializable
{
	private static final long serialVersionUID = -3068396638338390061L;

	private Users from;
	private Users to;
	
	private String requestType;
	private String requestMess;
	
	public Request(Users from, Users to, String requestType, String requestMess) {
		this.from = from; this.to = to;
		this.requestType = requestType;
		this.requestMess = requestMess;
	}

	public Users getFrom() {
		return from;
	}
	public void setFrom(Users from) {
		this.from = from;
	}
	public Users getTo() {
		return to;
	}
	public void setTo(Users to) {
		this.to = to;
	}
	public String getRequestType() {
		return requestType;
	}
	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}
	public String getRequestMess() {
		return requestMess;
	}
	public void setRequestMess(String requestMess) {
		this.requestMess = requestMess;
	}
	
	public String toString() {
		return "From: " + this.from.getId() + " -> to: " + this.to.getId() + ". " + this.requestType + ", " + this.requestMess;
	}
}
