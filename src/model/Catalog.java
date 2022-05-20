package model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class Catalog{
    
	private Set <Vin> products;// stocks the all the products
	private Map <Integer,Integer> quantities; // stocks the products quantities and their id;
    
    private static Catalog instance=null;

    private Catalog(){
   
        products= new HashSet <Vin>();
        quantities=new HashMap<Integer,Integer>();

    }
    public static Catalog getInstance(){
        if(instance==null){
            instance= new Catalog();
            
        }
        return instance;
    }
    // @replaceProdut consiste à rajouter les produits qui sont supprimés( dans le panier), dans le catalog.
    public void replaceProduct(int _id, int quantity) {
    	int v = this.quantities.get(_id);
    	v= v + quantity;
    	this.quantities.replace(_id,v);
    }
    // @ is_disponible consiste a vérifier si le produit qu'on ajoute dans le panier est disponible avec la méme quantité
    
    public boolean is_disponible(int _id, int quantity) throws QuantityException, IdException {
    	if(this.quantities.containsKey(_id)) {// si la clef existe dans le catalogue
    		int v= this.quantities.get(_id); // on récupére la valeur du clef 
    		int result = v-quantity ;// on fait la sustration pour voir si la quantité restante suffit pour la commande
    		if(result> 0) {
    			this.quantities.replace(_id,result);// on remplace plustot § c'est pas un put !
    			return true;//
    			
    		}else {
    			throw new QuantityException(quantity);
    		}
    		
    	}
    	else if (!this.quantities.containsKey(_id)) {
    	   throw new IdException(_id);
    	}
    	return false;
    }
    public Vin setVin(Vin v) {
    	Vin vin= new Vin();
    	vin.setAnnee(v.getAnnee());
    	vin.setChateau(v.getChateau());
    	vin.setDescription(v.getDescription());
    	vin.setId(v.getId());
    	vin.setNom(v.getNom());
    	vin.setPourcentageAlcool(v.getPourcentageAlcool());
    	vin.setPrix(v.getPrix());
    	vin.setRegion(v.getRegion());
    	vin.setUrlImage(v.getUrlImage());
    	vin.setVolume(v.getVolume());
    	
    	return vin;
    	
    }
    public void addProduct(Vin v, int quantity) throws ErrorAdd{
    	
    	 Vin vin=this.setVin(v);
    
    	 if(this.products.add(vin)) // add the product in the hashset and if it 
    		 this.quantities.put(vin.getId(), quantity);
    		 
    	 
    	 else
    	 
    		 throw new ErrorAdd();
    	 
    	
    }
    
    // QUESTION 4
    //Faire en sorte qu’il soit possible de modifier le prix d’un produit en catalogue seulement enle rempla
    //̧cant par un nouveau produit. Qu’advient-il alors des paniers qui font r ́ef ́erence `aces produits ?
    //Pour répondre à cette question nous avons compris qu'il faut modifier le prix du produit en gardant le méme id
    // De ce fait j'ai penser à modifier la fonction hashcode en tenant juste compte du nom du produit
    // cette fonction est codée dans cataloque et mis en commentaire
    // Alors nous pourrons modifier le prix du produit sans le supprimer
    // Le produit dans le cataloque 
    // Alors les produits qui font référence à ces produits dans le panier sont perdus car leur id n'existent plus dans le panier
    public void modifie_prix(Vin oldVin, double price) {
    	//int v=OldProduct.hashCode();
    	
    	// faire en sorte que le nouveau produit 
    	// qu'on va stocker ait le méme hashcode
        // du coup on peut lui donner le nouveau prix
    	
    	// on peut coder une fonction hashcode qui ne prend en compte que le nom pour calculer l'indice
    	// de ce fait si on supprime et crée un autre produit 
    	
    	
    	Vin vin=this.setVin(oldVin);
    	vin.setPrix(price);
    	 //maintenant on supprime OldProduct du catalog
    	if(this.products.remove(oldVin))
    		this.products.add(vin);
    	else
    		System.out.println("Suppression impossible");
    	
    	
    	
    }
    // to print the catalog
        public String toString() {
    	Iterator<Vin> it= products.iterator(); // pointeur de parcours
    	/*String result ="Catalog{";
    	while(it.hasNext()) {       // tant que l'itérateur ne pointe pas sur NULL
    		Product p=it.next(); // on garde le produit courant
    		result = result +p+"/"; // on rajoute ce produit courant à notre chaine de caractére
    	}
    	result= result + "}";
    	*/
    	Set<Entry<Integer, Integer>> entrees = quantities.entrySet(); // Pour afficher les contenus de la map
    	Iterator<Entry<Integer, Integer>> iter= entrees.iterator();
    	
    	String result2="{";
    	while(iter.hasNext() & it.hasNext()) {
    		@SuppressWarnings("rawtypes")
			Map.Entry entree=(Map.Entry)iter.next(); //un coupe de valeur (clé et valeur)
    		Object cle=entree.getKey(); // on récupére juste la cléf
    		Object valeur=entree.getValue();// on récupére la valeur
    		int k = (int)cle; // je fait un cast 
    		int v= (int)valeur;
    		Vin p=it.next(); 
    		result2= result2 + "["+p+ "(" +k+" ," +v + ")" + "]";
    	}
    	result2+="}";
    	return result2;
    }
        // to print product knowing their id
        public String afficheById(int _id) {
        	Iterator<Vin> it= products.iterator();
        	String result ="";
        	while(it.hasNext()) {
        		Vin p=it.next();
        		if(p.getId()== _id) {
        			return result +=p;
        		}
        		}
        	return "No product have this id";
        }

    
    
    
   

}



