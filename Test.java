
//class JAVA Bean ne contient que les getters et setters 
class Personne {

	private String cin;
	private String nom;
	private String prenom;
	private String adresse;
	private String email;
	public Personne() {
		super();
	}
	public Personne(String cin, String nom, String prenom, String adress, String email) {
		super();
		this.cin = cin;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adress;
		this.email = email;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Personne [cin=" + cin + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", email="
				+ email + "]";
	}
	
	
}


public class Test {
	public static void main(String[] args) {
		Personne per = new Personne("11890089", "Mohamed", "ZAIRI", "Kairouan", "Mohamed.zairi93@gmail.com");//creation instance du personne
		
		
			System.out.println(per.toString());
		
	}
}
