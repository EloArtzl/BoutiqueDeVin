package model;



import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class Annuaire {
	private Map <String,Personne> personnes;
	
	private static Annuaire instance=null;

    private Annuaire(){
   
        personnes= new HashMap <String, Personne>();

    }
   
	public static Annuaire getInstance(){
        if(instance==null){
            instance= new Annuaire();
            
        }
        return instance;
    }
	
	public String getNameOfPersonne(String email) {
		if (email != null) {
			if (personnes.containsKey(email)) { return this.personnes.get(email).getName();}else {return "";}
		}else {
			return "";
		}
	}
	public String getSurNameOfPersonne(String email) {
		if (email != null) {
			if (personnes.containsKey(email)) { return this.personnes.get(email).getSirname();}else {return "";}
		}else {
			return "";
		}
		
	}
	
	
    public void addPersonne(Personne pers) throws ErrorAdd{
    	if(this.personnes.put(pers.getEmail(), pers)!= null)  {
    		
    		throw new ErrorAdd();
    		
    	}
    	else {
    		System.out.println("Personne Ajoutéé au catalogue");
    		
    	}
    }
    public void deletePersonne(Personne pers) {
    	if(!this.personnes.remove(pers, pers.getId())) {
    		System.out.println("Impossible de supprimer la Personne" + pers);
    	}
    	//this.personnes.
    }
    
    public boolean containsEmail(String email) {
    	if (this.personnes.containsKey(email)) {
			return true;
		} else {
			return false;
		}
	}
    public boolean emailverification(String email, String password) {
    	return this.personnes.get(email).isTheGoodPassword(password);
	}
    
    public String toString() {
    	 // pointeur de parcours
    	/*String result ="Catalog{";
    	while(it.hasNext()) {       // tant que l'itérateur ne pointe pas sur NULL
    		Product p=it.next(); // on garde le produit courant
    		result = result +p+"/"; // on rajoute ce produit courant à notre chaine de caractére
    	}
    	result= result + "}";
    	*/
    	Set<Entry<String, Personne>> entrees = personnes.entrySet(); // Pour afficher les contenus de la map
    	Iterator<Entry<String, Personne>> iter= entrees.iterator();
    	
    	String result2="{";
    	while(iter.hasNext()) {
    		@SuppressWarnings("rawtypes")
			Map.Entry entree=(Map.Entry)iter.next(); //un coupe de valeur (clé et valeur)
    		Object cle=entree.getKey(); // on récupére juste la cléf
    		Object valeur=entree.getValue();// on récupére la valeur
    		Personne k = (Personne)valeur; // je fait un cast 
    		//System.out.println(valeur);
    		//System.out.println(k);
    		//int v= (int)valeur;
    		 
    		result2= result2 + "[(" + k + ")]";
    	}
    	result2+="}";
    	return result2;
    }
    
}
