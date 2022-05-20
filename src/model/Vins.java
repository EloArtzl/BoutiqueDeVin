package model;

import java.util.HashMap;


public class Vins {
	private HashMap<Integer, Vin> lesVins;

	public HashMap<Integer, Vin> getLesVins() {
		return lesVins;
	}

	public void setLesVins(HashMap<Integer, Vin> lesVins) {
		this.lesVins = lesVins;
	}

	public Vins() {
		super();
		this.lesVins=new HashMap<>();
		// TODO Auto-generated constructor stub
	}

	
}
