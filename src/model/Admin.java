                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   package model;

public class Admin extends Personne{
	private static String mot_de_passe="Amin99";
	
	public static void setInstance(Admin instance) {
		Admin.instance = instance;
	}

	private static Admin instance=null;
	
	public static Admin getInstance(){
        if(instance==null){
            
            Personne p= new Personne();
            p.setName("Admin");
            p.setEmail("Admin@gmail.com");
            p.setMotDepasse(mot_de_passe);
            
            instance= (Admin) p;
        }
        return instance;
    }


	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
}
