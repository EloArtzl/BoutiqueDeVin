package model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Catalog {
	private Set <Vin> vins;// stocks the all the products
	private Map <Integer,Integer> quantities; // stocks the products id and their quantities;
    
    private static Catalog instance=null;

    private Catalog(){
   
        this.vins= new HashSet <Vin>();
        this.quantities=new HashMap<Integer,Integer>();

    }
    public static Catalog getInstance(){
        if(instance==null){
            instance= new Catalog();
            
        }
        return instance;
    }

}
