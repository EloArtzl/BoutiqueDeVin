package model;

public class QuantityException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int quantity;
	
	public QuantityException(int a) {
		this.quantity=a;
		
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	

}
