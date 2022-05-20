                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   package model;

public class Admin{
	String numTel;
	private String name;
	private String sirname;
	private String email;
	private String motDepasse;
	public String getNumTel() {
		return numTel;
	}

	public void setNumTel(String numTel) {
		this.numTel = numTel;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMotDepasse() {
		return motDepasse;
	}

	public void setMotDepasse(String motDepasse) {
		this.motDepasse = motDepasse;
	}

	public static void setInstance(Admin instance) {
		Admin.instance = instance;
	}

	private static Admin instance=null;
	
	public static Admin getInstance(){
        if(instance==null){
            instance= new Admin();
            
        }
        return instance;
    }
	/*
public void addVin() {
		//code
	}
	//public void deleteVin() {
		//code
	}
	public void searchVin() {
		//code
	}
	public void modifyVin() {
		//code
	}
	*/
}
