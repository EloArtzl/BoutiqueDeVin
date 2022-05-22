package model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface VinsInterface {
	public Set<Vin> getLesVins();
	
	public void setLesVins(Set<Vin> lesVins);
	
	public Map<Integer, Integer> getQuantities();
	
	public void setQuantities(Map<Integer, Integer> quantities);
	
	 public void initialise();
	 
	 public Vin update(Vin v);
	 
	 public boolean updateQuantity(Vin v, int quantity);
	 
	 public Vin consulterParMot(String mc);
	 
	 public List<Vin> ListerParMot(String mc);
	 
	 public void replaceProductQuantity(int _id, int quantity);
	 
	 public boolean is_disponible(int _id, int quantity) throws QuantityException, IdException ;
	 
	 public void addProduct(Vin v, int quantity) throws ErrorAdd;
	 
	 public void modifie_prix(Vin oldVin, double price);
	 
	 public Vin findById(int _id);
}
