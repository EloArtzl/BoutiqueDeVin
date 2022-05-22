package model;

public class IdException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	public IdException(int id) {
		
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

}