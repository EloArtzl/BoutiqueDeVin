                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   package model;

public class Admin extends Personne {
	String numTel;
	private static Admin instance=null;
	public Admin(String nom, String prenom, String email, String num_tel) {
		super(nom, prenom, email);
		this.numTel=num_tel;
	}
	public static Admin getInstance(){
        if(instance==null){
            instance= new Admin("Toto","tutu","toto@gmail.com","0788889978");
            
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
