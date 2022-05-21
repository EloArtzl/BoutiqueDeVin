package service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import model.Personne;
import model.Personnes;

@Path("/GestionPersonnes")
public class GestionPersonnes {
	
	private static GestionPersonnes INSTANCE;
	private Personnes personnes;
	
	public GestionPersonnes() {
		personnes=new Personnes();
		
		if ( INSTANCE == null) {
			INSTANCE = this;
		}
		
		
	}
	
	public static GestionPersonnes getInstance() {
		if ( INSTANCE == null) {
    		INSTANCE = new GestionPersonnes();
    	}
    	return INSTANCE;
	}
	
	
	@POST
    @Path("add")
	public void addPersonne(Personne p) {
		personnes.getLesPersonnes().put(p.getId(), p);
	}
	
	@GET
    @Produces(MediaType.APPLICATION_JSON)
	public List<Personne> getListPersonnes() {
		ArrayList<Personne> ret = new ArrayList<>();
		ret.addAll(personnes.getLesPersonnes().values());//attention si c'est Bien les objets Vin qui sont les valeurs
		
		return ret;
	}
	@DELETE
    @Path("delete/{id}")
	public void deletePersonne(@PathParam("id")Integer id) {
		personnes.getLesPersonnes().remove(id);
		
	}
	@GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
	public Personne getPersonne(@PathParam("id")Integer id) {
		return personnes.getLesPersonnes().get(id);
	}
	

}
