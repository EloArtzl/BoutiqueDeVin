package model;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



@Path("/GestionsVins")
public class GestionVins {
	private static GestionVins INSTANCE;
	private Vins vins;
	
	public GestionVins() {
		
		vins = new Vins();
		if ( INSTANCE == null) {
			INSTANCE = this;
		}
	}
	
	/** Point d'acces pour l'instance unique du singleton */
	public static GestionVins getInstance() {
		if ( INSTANCE == null) {
    		INSTANCE = new GestionVins();
    	}
    	return INSTANCE;
	}
	@POST
    @Path("add")
	public void addVin(Vin v) {
		vins.getLesVins().put(v.getId(), v);
	}
	
	@GET
    @Produces(MediaType.APPLICATION_JSON)
	public List<Vin> getListVins() {
		ArrayList<Vin> ret = new ArrayList<>();
		ret.addAll(vins.getLesVins().values());//attention si c'est Bien les objets Vin qui sont les valeurs
		
		return ret;
	}
	@DELETE
    @Path("delete/{id}")
	public void deleteVin(@PathParam("id")Integer id) {
		vins.getLesVins().remove(id);
		
	}
	@GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
	public Vin getVin(@PathParam("id")Integer id) {
		return vins.getLesVins().get(id);
	}
	

}
