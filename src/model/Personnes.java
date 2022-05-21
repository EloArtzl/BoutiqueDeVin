package model;

import java.util.HashMap;

public class Personnes {
	private HashMap<Integer, Personne> lesPersonnes;

	public Personnes() {
		super();
		this.lesPersonnes= new HashMap<>();
		// TODO Auto-generated constructor stub
	}

	public HashMap<Integer, Personne> getLesPersonnes() {
		return lesPersonnes;
	}

	public void setLesPersonnes(HashMap<Integer, Personne> lesPersonnes) {
		this.lesPersonnes = lesPersonnes;
	}
	
	

}
