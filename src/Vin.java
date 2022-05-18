

public class Vin {
	private String nom;
	private double volume;
	private String chateau;
	private String region;
	private int annee;
	private double prix;
	private String pourcentageAlcool;
	private String description;
	private String urlImage;
	
	public Vin(String nom, double volume, String chateau, String region, int annee, double prix,
			String pourcentageAlcool, String description, String urlImage) {
		super();
		this.nom = nom;
		this.volume = volume;
		this.chateau = chateau;
		this.region = region;
		this.annee = annee;
		this.prix = prix;
		this.pourcentageAlcool = pourcentageAlcool;
		this.description = description;
		this.urlImage = urlImage;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public String getChateau() {
		return chateau;
	}

	public void setChateau(String chateau) {
		this.chateau = chateau;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public String getPourcentageAlcool() {
		return pourcentageAlcool;
	}

	public void setPourcentageAlcool(String pourcentageAlcool) {
		this.pourcentageAlcool = pourcentageAlcool;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrlImage() {
		return urlImage;
	}

	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}
	
	
	
	
	
	
	
	
	
	
	
}


