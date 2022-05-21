package model;

public class Personne {
	

	private String name;
	private String sirname;
	private String email;
	private String motDepasse;
	
	private int id;
    public static int pId;
    
  /* public Personne(String _name, String _prenom, String _email){
        // super() appel le constructeur de la classe héritée
        this.name=_name;
        this.sirname=_prenom;
        this.email=_email;
        this.id=pId;
        pId++;

    }
    */

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSirname() {
		return sirname;
	}

	public void setSirname(String sirname) {
		this.sirname = sirname;
	}

	public int getId() {
		pId++;
		this.id=pId;
		return id;
	}

	
	
	@Override
	public String toString() {
		return "Personne [name=" + name + ", sirname=" + sirname + ", email=" + email + ", id=" + id + "]";
	}

	public String getMotDepasse() {
		return motDepasse;
	}

	public Boolean isTheGoodPassword(String pw) {
		if (this.motDepasse == pw) {
			return true;
		}else {
			return false;
		}
	}
	public void setMotDepasse(String motDepasse) {
		this.motDepasse = motDepasse;
	}
	
	//fonction rechercher Bouteille
}
