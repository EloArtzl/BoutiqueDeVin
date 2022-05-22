package service;


import java.util.ArrayList;

import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import model.Vin;
import model.Vins;



@Path("/GestionsVins")
@Produces(MediaType.APPLICATION_JSON+ " ;charset=UTF-8")
public class GestionVins {
	/**
	 * 
	 */
	
	private static GestionVins INSTANCE;
	private Vins vins;
	
	public GestionVins() {
		
		vins = Vins.getInstance();
		vins.initialise();// à enlever aprés c'est juste pour tester
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
	public Response addVin(Vin v) {
		String msg="";
		if (vins.getLesVins().add(v)) {
			 msg="Le vin "+ v + "a été ajouté au catalogue :)";
			 
			 
			return Response.status(200).entity(msg).build();
		}
		msg="L'ajout n'a pas réussi :(";
		return Response.status(500).entity(msg).build();
	}
	
	@GET
	@Path("vins")
	public Response getListVins() {
		ArrayList<Vin> ret = new ArrayList<>();
		ret.addAll(vins.getLesVins());
		//attention si c'est Bien les objets Vin qui sont les valeurs
		if(ret.isEmpty()) {
			return Response.status(500).entity(ret).build();
			
		}
		
		
		return Response.ok(ret).build();
	}
	@DELETE
    @Path("delete/{id}")
	public Response deleteVin(@PathParam("id")Integer id) {
		if(vins.findById(id)!=null) {
			vins.getLesVins().remove(vins.findById(id));
			vins.getQuantities().remove(id);
			return Response.status(200).build();
			
		};
		String resp= "Ce vin n'existe pas :(";
		return Response.status(500).entity(resp).build();
		
	}
	@GET
    @Path("vins/{id}")
   
	public Response getVin(@PathParam("id")Integer id) {
		if(vins.findById(id)!=null) {
			return Response.status(200).entity(vins.findById(id)).build();
		}
		String resp= "Il n'y a pas de vin avec l'id : " + id +":(";
		return Response.status(500).entity(resp).build();
	}
	
	
	
	@GET
	@Path("vinsmMotcle")
	public Response consulterParMotCle(@DefaultValue("Guest") @QueryParam("mc") String mc) {
		if(vins.consulterParMot(mc)!=null) {
			return Response.status(200).entity(vins.consulterParMot(mc)).build();
		}
		String resp= "Il n'y a pas de vin : " + mc+"  :(";
		return Response.status(500).entity(resp).build();
		
	}
	
	
	@POST
	@Path("update/{id}")
	public Response updateVin(@PathParam("id")Integer id) {
		String msg="";
		if (vins.update(vins.findById(id))!=null){
			
			msg="Le vin " + vins.update(vins.findById(id)) + " est bien mis à jour ";
			return  Response.status(200).entity(msg).build();
		}
		msg="Une erreur s'est produite lors de la mise à jour";
		
		return Response.status(500).entity(msg).build();
		//Quant on fait une mise à jour on supprime l'ancienne V
		
	}
	//les fonctions pour mettre à jour les quantités des Vins et les vins en même temps
	/*@POST
    @Path("VinAndQuantite")
	public Response addVinAndQuantity(Vin v, Integer quantity) {
		String msg="";
		if (vins.getLesVins().add(v) &&  vins.getQuantities().putIfAbsent(v.getId(),quantity)!=0) {
			 msg="Le vin "+ v + "a été ajouté au catalogue :)";
			 
			 
			return Response.status(200).entity(msg).build();
		}
		msg="L'ajout n'a pas réussi :(";
		return Response.status(500).entity(msg).build();
	}
	*/
	@GET
	@Path("listeVinsAndQuantity")
	public Response getListVinsQuant() {
		String ret= vins.toString();
		
		if(ret.isEmpty()) {
			return Response.status(500).entity(ret).build();
			
		}
		
		
		return Response.ok(ret).build();
	}
/**********************************************************/
	
	
	@GET
    @Path("vinsAndQuantity/{id}")
   
	public Response getVinAndQuatitt(@PathParam("id")Integer id) {
		if(vins.findById(id)!=null) {
			 ;
			
					String resp= vins.findById(id).toString()+ " /Quantity :"  +vins.getQuantities().get(id);
			return Response.status(200).entity(resp).build();
		}
		String resp= "Il n'y a pas de vin avec l'id : " + id +":(";
		return Response.status(500).entity(resp).build();
	}
	/*********************************************************************************/
	@GET
	@Path("vinsmMotcleAndQuantit")
	public Response consulterVinQuaParMotCle(@DefaultValue("Vin") @QueryParam("mc") String mc) {
		if(vins.consulterParMot(mc)!=null) {
			
			
			String msg= vins.consulterParMot(mc) + "/quantity : " +vins.getQuantities().get(vins.consulterParMot(mc).getId());
			
			return Response.status(200).entity(msg).build();
		}
		String resp= "Il n'y a pas de vin : " + mc+"  :(";
		return Response.status(500).entity(resp).build();
		
	}
	/**************************************************************************/
	
	@GET
	@Path("ListeVinsParMotCle")
	public Response getListeVinParMotCle(@DefaultValue("Vin") @QueryParam("mc") String mc) {
		if(vins.ListerParMot(mc)!=null) {
			return Response.status(200).entity(vins.ListerParMot(mc)).build();
			
		}
		String resp= "Il n'y a pas de vin : " + mc+"  :(";
		return Response.status(500).entity(resp).build();
		
	}
	
}
