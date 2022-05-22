package model;



import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.HashMap;
public class Annuaire {
	private Map <Personne,Integer> personnes;
	
	private static Annuaire instance=null;

    private Annuaire(){
   
        personnes= new HashMap <Personne, Integer>();

    }
   
	public static Annuaire getInstance(){
        if(instance==null){
            instance= new Annuaire();
            
        }
        return instance;
    }

    public void addPersonne(Personne pers) throws ErrorAdd{
    	if(this.personnes.put(pers, pers.getId())!= null)  {
    		
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
    public String toString() {
    	 // pointeur de parcours
    	/*String result ="Catalog{";
    	while(it.hasNext()) {       // tant que l'itérateur ne pointe pas sur NULL
    		Product p=it.next(); // on garde le produit courant
    		result = result +p+"/"; // on rajoute ce produit courant à notre chaine de caractére
    	}
    	result= result + "}";
    	*/
    	Set<Entry<Personne, Integer>> entrees = personnes.entrySet(); // Pour afficher les contenus de la map
    	Iterator<Entry<Personne, Integer>> iter= entrees.iterator();
    	
    	String result2="{";
    	while(iter.hasNext()) {
    		@SuppressWarnings("rawtypes")
			Map.Entry entree=(Map.Entry)iter.next(); //un coupe de valeur (clé et valeur)
    		Object cle=entree.getKey(); // on récupére juste la cléf
    		Object valeur=entree.getValue();// on récupére la valeur
    		Personne k = (Personne)cle; // je fait un cast 
    		int v= (int)valeur;
    		 
    		result2= result2 + "[(" +k+" ," +v + ")]";
    	}
    	result2+="}";
    	return result2;
    }
    
}
