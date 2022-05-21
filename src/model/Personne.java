package model;

public class Personne {
	

	private String name;
	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	pId++;
	this.id=pId;
	}

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
		
		return id;
	}

	
	
	@Override
	public String toString() {
		return "Personne [name=" + name + ", sirname=" + sirname + ", email=" + email + ", id=" + id + "]";
	}
	public Boolean isTheGoodPassword(String pw) {
		if (this.motDepasse == pw) {
			return true;
		}else {
			return false;
		}
	}
/** pas de sécurité
	public String getMotDepasse() {
		return motDepasse;
	}
**/
	public void setMotDepasse(String motDepasse) {
		this.motDepasse = motDepasse;
	}

	//fonction rechercher Bouteille
}
