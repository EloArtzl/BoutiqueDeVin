package model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;


public class Vins implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private HashMap<Integer, Vin> lesVins;

	public HashMap<Integer, Vin> getLesVins() {
		return lesVins;
	}

	public void setLesVins(HashMap<Integer, Vin> lesVins) {
		this.lesVins = lesVins;
	}

	public Vins() {
		super();
		this.lesVins=new HashMap<>();
		// TODO Auto-generated constructor stub
	}
   public void initialise() {
	   Vin v = new Vin("Vin rosée", 1,  "Chateau de la paix","Gironde", 2018, 198," 20%",  "Description ", "image1.jpeg");
	   this.lesVins.put(v.getId(), v);
   }
   public Vin update(Vin v) {
	   lesVins.put(v.getId(),v);
	   return v;
   }
   public Vin consulterParMot(String mc) {
	Set<Entry<Integer, Vin>> entrees = lesVins.entrySet(); // Pour afficher les contenus de la map
	Iterator<Entry<Integer, Vin>> iter= entrees.iterator();
	Vin res=new Vin();
	while(iter.hasNext()) {
		@SuppressWarnings("rawtypes")
		Map.Entry entree=(Map.Entry)iter.next(); //un coupe de valeur (clé et valeur)
		//Object cle=entree.getKey(); // on récupére juste la cléf
		Object valeur=entree.getValue();// on récupére la valeur
		// je fait un cast 
		Vin v= (Vin)valeur;
		
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
	    }
	}
	return res;
	// TODO Auto-generated method stub
	
}
	
}
