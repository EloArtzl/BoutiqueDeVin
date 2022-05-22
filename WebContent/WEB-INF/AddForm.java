package model;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public class AddForm {
	Integer IIYear = null;
	Integer IIVolume = null;
	Double IIPrice = null;
	Integer IIQuantity = null;
	String IName ;
	String IYear;
	String ICastle;
	String IRegion;
	String IDegree;
	String IVolume;
	String IPrice;
	String IUrl;
	String IDescription;
	String IQuantity;
	Map<String, String> erreurs = new HashMap<String, String>();

	public AddForm() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void verifChamp(HttpServletRequest request) {
		System.out.println("on est dans le do post ");
		IName = request.getParameter("nameInput");
		IYear = request.getParameter("yearInput");
		ICastle = request.getParameter("castleInput");
		IRegion = request.getParameter("regionInput");
		IDegree = request.getParameter("degreeInput");
		IVolume = request.getParameter("volumeInput");
		IPrice = request.getParameter("priceInput");
		IUrl = request.getParameter("urlInput");
		IDescription = request.getParameter("descriptionInput");
		IQuantity = request.getParameter("quantityInput");
		
	    

		
		
		if (request.getParameter("caseAdd")!=null) {
			
			
			// verification des champs saisi
				//name
				if (IName.isBlank()) {erreurs.put("nameInput", "Le champ est obligatoire");}
			
				//year
				if (IYear.matches("[+-]?\\d*(\\.\\d+)?") && !IYear.isBlank()) {
					System.out.println(IYear.matches("[+-]?\\d*(\\.\\d+)?"));
					IIYear = Integer.parseInt(IYear); // retourne une erreur NumberFormatException si la str n'est pas convertible
				}else {erreurs.put("yearInput", "L'année doit être un nombre entier");}
				
				//castle
				if (ICastle.isBlank()) {erreurs.put("castleInput", "Le champ est obligatoire");}
				
				//region
				if (IRegion.isBlank()) {erreurs.put("regionInput", "Le champ est obligatoire");}
				
				//degree
				if (IDegree.isBlank()) {erreurs.put("degreeInput", "Le champ est obligatoire");}
				
				//Volume
				if (IVolume.matches("[+-]?\\d*(\\.\\d+)?") && !IVolume.isBlank()) {
					IIVolume = Integer.parseInt(IVolume); // retourne une erreur NumberFormatException si la str n'est pas convertible
				}else {erreurs.put("volumeInput", "Le  (cl) doit être un nombre entier");}
				
				//price
				if (IPrice.matches("[+-]?\\d*(\\.\\d+)?") && !IPrice.isBlank()) {
					IIPrice = Double.parseDouble(IPrice); // retourne une erreur NumberFormatException si la str n'est pas convertible
				}else {erreurs.put("priceInput", "Le prix doit être un nombre d&eacute;cimal");}
				
				//url
				if (IUrl.isBlank()) {erreurs.put("urlInput", "Le champ est obligatoire");}
				
				//description
				if (IDescription.isBlank()) {erreurs.put("descriptionInput", "Le champ est obligatoire");}
				
				//quantité
				if (IQuantity.matches("[+-]?\\d*(\\.\\d+)?") && !IQuantity.isBlank()) {
					IIQuantity = Integer.parseInt(IQuantity); // retourne une erreur NumberFormatException si la str n'est pas convertible
				}else {erreurs.put("quantityInput", "La quantité doit être un nombre entier");}
			
	}

}
	public Map<String, String> getErreurs() {
        return erreurs;
    }
	public void addVinToCatalog() {
		Vin vin = new Vin();
		vin.setNom(IName);
		vin.setAnnee(IIYear);
		vin.setChateau(ICastle);
		vin.setRegion(IRegion);
		vin.setPourcentageAlcool(IDegree);
		vin.setVolume(IIVolume);
		vin.setPrix(IIPrice);
		vin.setUrlImage(IUrl);
		vin.setDescription(IDescription);
		
		Vins vins = Vins.getInstance();
		try {
			vins.addProduct(vin, IIQuantity);
		} catch (ErrorAdd e) {
			// TODO Auto-generated catch block
			System.out.println(vin.toString());
			System.out.println("l'exception est levee");

			e.printStackTrace();
		}

		System.out.println(vin.toString());

		System.out.println(vins.toString());
	}
}