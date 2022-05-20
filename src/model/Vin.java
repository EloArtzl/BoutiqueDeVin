package model;
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
	
	private int id;
    public static int actId;
	
	
		
		

	public int getId() {
		this.id=actId;
        actId++;
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
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
	
	// le hashcode donne un indice qui servira a ajoué un produit dans le cataloque, il est calculé en additionnant les lettres et le prix d'un produit
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((nom == null) ? 0 : nom.hashCode());
			long temp;
			temp = Double.doubleToLongBits(prix);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			
			return result;
		}
		
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Vin other = (Vin) obj;
			if (nom == null) {
				if (other.nom != null)
					return false;
			} else if (!nom.equals(other.nom))
				return false;
			if (Double.doubleToLongBits(prix) != Double.doubleToLongBits(other.prix))
				return false;
			return true;
		}
	
	
	
	
	
	
	
	
	
	
}


