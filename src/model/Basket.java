package model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* 
 * 4. on peut faire une interface entre catalogue et basket pour masquer le catalogue à Basket
 * ou de faire une copie 
 */

public class Basket {
    //private int comProducts[];
	private Map <Integer,Integer> comProducts;
    private Personne basketOwner;
    private Vins vins;

   public  Basket(Personne p,Vins c2) throws BadNameException {
        this.vins = c2;
       
        this.comProducts = new HashMap<Integer,Integer>();
        Personne p1= new Personne();
        p1.setEmail(p.getEmail());
        p1.setName(p.getName());
        p1.setSirname(p.getSirname());
        
        this.setBasketOwner(p1);
        

    }
   //add an article to the basket
   // 3.a to resolve this question
   // at first we code in Catalog function named is_possible wich will
   // verify if the customer can add a product to his basket
   // and if it is not possible to add the product an error will be shown
   public void inc(int _id, int quantity) throws QuantityException, IdException {
	   try {
		   boolean is_possible= this.vins.is_disponible(_id,quantity);// là il fait les calculs pour voir si le produit est bien disponible.
		   if(is_possible)
			   this.comProducts.put(_id,quantity);
		   
	   }
	   //3.b
	   catch(QuantityException e) {
		   System.out.println("Quantité insuffisant pour votre commande"+e.getQuantity());
	   }
	   catch(IdException m) {
		   System.out.println("Ce produit n'existe"+m.getId());
	   }
	  
	   
   }
   // delete an article into the basket
   public void dec(int _id, int quantity) {
	   int v= this.comProducts.get(_id); // parfois le client doit pouvoir diminuer la quantité du produit qu'il a commandé
	   if(quantity==v) {                   // C'est pourquoi on vérifie si la quantité qu'il veut supprimer est égale donc 
		                                   //on supprime le produit totalement dans le produit
		   this.comProducts.remove(_id);
	   }
	   else {
		   v= v-quantity;
		   
		   this.comProducts.replace(_id, v);// replace the product in the basket with the right quantity
		   this.vins.replaceProductQuantity(_id, quantity);// add the removed product in the catalog
		   
		   
	   }
	   
	
   }
  
   public String toString() {
	   Set<Entry<Integer, Integer>> entrees = comProducts.entrySet(); // ComProducts c'est le map 
   	Iterator<Entry<Integer, Integer>> iter= entrees.iterator();
   	
   	String result2="{";
   	while(iter.hasNext()) {
   		@SuppressWarnings("rawtypes")
		Map.Entry entree=(Map.Entry)iter.next();
   		Object cle=entree.getKey();
   		Object valeur=entree.getValue();
   		int k = (int)cle;
   		int v= (int)valeur;
   		String product= this.vins.afficheById(k);
   		result2= result2 +"(" +product+" ," +v + ")";
   	}
   	result2+="}";
	   
	   return result2;
	
   }
public Personne getBasketOwner() {
	return basketOwner;
}
public void setBasketOwner(Personne basketOwner) {
	this.basketOwner = basketOwner;
}
    

}
