package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;


public class Vins implements VinsInterface, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//private HashMap<Integer, Vin> lesVins;
	
	
	private Set <Vin> lesVins;// stocks the all the products
	private Map <Integer,Integer> quantities; 
	private static Vins instance=null;
	/*public HashSet<Vin> getLesVins() {
		return lesVins;
	}*/

	

	public Set<Vin> getLesVins() {
		return lesVins;
	}

	public void setLesVins(Set<Vin> lesVins) {
		this.lesVins = lesVins;
	}

	public Map<Integer, Integer> getQuantities() {
		return quantities;
	}

	public void setQuantities(Map<Integer, Integer> quantities) {
		this.quantities = quantities;
	}

	public Vins() {
		super();
		this.lesVins= new HashSet <Vin>();
	    this.quantities=new HashMap<Integer,Integer>();
		
	}
	 public static Vins getInstance(){
	        if(instance==null){
	            instance= new Vins();
	            
	        }
	        return instance;
	    }
   public void initialise() {
	   Vin v = new Vin("Vin rosée", 1,  "Chateau de la paix","Gironde", 2018, 198," 20",  "Description vin", "image1.jpeg");
	   Vin v1 = new Vin("Pessac Leognan", 1,  "Pessac Leognan","Gironde", 2000, 15," 33", "Robe rouge vermillon moyennement intense. Nez fin et élégant s'ouvrant sur la framboise fraîche, et évoluant sur des notes de cassis et thym. Bouche fraîche et équilibrée, marquée par des tanins jeunes présents en fin de bouche.",
			   "image1.jpeg");
	   Vin v2= new Vin("CHATEAU TURCAUD - BORDEAUX 2018", 1,  "Chateau de la paix","Gironde", 2018, 198," 20",  "D'une belle couleur rouge grenat, le vin s'ouvre sur un nez aux notes de fruits noirs concentrés, d'épices et de poivre frais. L'attaque en bouche est franche, fraîche et avec une belle acidité qui pousse le fruit noir de baies (mures) avec une impression variétale florale. Le milieu de bouche est bien équilibré aux tannins fondus, peu extraits mais présents, apportant rondeur et persistance jusqu'à la finale, droite et nette. Un vin gourmand, souple et sensuel!", "image1.jpeg");
	   
	   
	   this.quantities.put(v.getId(), 12);
	   this.lesVins.add(v);
	   this.quantities.put(v1.getId(), 13);
	   this.lesVins.add(v1);
	   this.lesVins.add(v2);
	   this.quantities.putIfAbsent(v2.getId(), 100);
	   
	   
   }
   
   public Vin update(Vin v) {
	   lesVins.add(v);
	   return v;
   }
   public boolean updateQuantity(Vin v, int quantity) {
	   if(this.quantities.put(v.getId(), quantity)!=null)
	      return true;
	   else 
		   return false;
   }
   public Vin consulterParMot(String mc) {
	   
	   Iterator<Vin> it= lesVins.iterator();
	   
	
	Vin res=new Vin();
	while(it.hasNext()) { 
		
		Vin v= it.next();
		//On cherche dans la description du Vin si il existe pas le mot spécifié
	    if(v.getDescription().contains(mc)) {
	    	res.setAnnee(v.getAnnee());
	    	res.setChateau(v.getChateau());
	    	res.setDescription(v.getDescription());
	    	res.setId(v.getId());
	    	res.setNom(v.getNom());
	    	res.setPourcentageAlcool(v.getPourcentageAlcool());
	    	res.setPrix(v.getPrix());
	    	res.setRegion(v.getRegion());
	    	res.setUrlImage(v.getUrlImage());
	    	res.setVolume(v.getVolume());
	    	
	    	return res;
	    }
	}
	return null;
	
	
}
   //Renvoie une liste de Vins correspondant au mot spécifié
   //LISTERPARMOT
   //On fait une recherche par mot clé et ensuite on rempli la liste , avec les vins qui ont le même mot clé
   
 public List<Vin> ListerParMot(String mc) {
	 ArrayList<Vin> ret = new ArrayList<>();
	   
	Iterator<Vin> it= lesVins.iterator();
	while(it.hasNext()) { 
		Vin v= it.next();
		Vin res=new Vin();
		//On cherche dans la description du Vin si il existe pas le mot spécifié
	    if(v.getDescription().contains(mc)) {
	    	
	    	res.setAnnee(v.getAnnee());
	    	res.setChateau(v.getChateau());
	    	res.setDescription(v.getDescription());
	    	res.setId(v.getId());
	    	res.setNom(v.getNom());
	    	res.setPourcentageAlcool(v.getPourcentageAlcool());
	    	res.setPrix(v.getPrix());
	    	res.setRegion(v.getRegion());
	    	res.setUrlImage(v.getUrlImage());
	    	res.setVolume(v.getVolume());
	    	
	    	ret.add(res);
	    }
	}
	return ret;
	
	
}
   
   //Pour rajouter les produits supprimés du panier
   public void replaceProductQuantity(int _id, int quantity) {
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
   
   	 if(this.lesVins.add(vin)) // add the product in the hashset and if it 
   		 this.quantities.put(vin.getId(), quantity);
   		 
   	 
   	 else
   	 
   		 throw new ErrorAdd();
   	 
   	
   }
   
   
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
   	if(this.lesVins.remove(oldVin))
   		this.lesVins.add(vin);
   	else
   		System.out.println("Suppression impossible");
   	
   	
   	
   }
   // to print the catalog
    public String toString() {
   	Iterator<Vin> it= lesVins.iterator(); // pointeur de parcours
   	
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
   		result2= result2 + "["+p.toString()+ "(" +k+" ," +v + ")" + "]";
   	}
   	result2+="}";
   	return result2;
   }
    // to print product knowing their id
  public String afficheById(int _id) {
       	Iterator<Vin> it= lesVins.iterator();
       	String result ="";
       	while(it.hasNext()) {
       		Vin p=it.next();
       		if(p.getId()== _id) {
       			return result +=p;
       		}
       		}
       	return "No product have this id";
       }
public Vin findById(int _id) {
	Iterator<Vin> it= lesVins.iterator();
   	
   	while(it.hasNext()) {
   		Vin p=it.next();
   		if(p.getId()== _id) {
   			return p;
   		}
   		}
   			return null;
}
   
   
	
}
