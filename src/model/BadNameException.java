package model;

public class BadNameException extends Exception{
	private static final long serialVersionUID = 1L;
	String name;
	public BadNameException(String c) {
		this.name=c;
		
		
	}
	public String getName() {
		return name;
	}
	

}
