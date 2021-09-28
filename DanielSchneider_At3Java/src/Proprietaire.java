public class Proprietaire {
    private String nom;
    private String adresse;

    public Proprietaire(String nom, String adresse){
        this.nom = nom;
        this.adresse = adresse;
    }


    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return this.adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String toString(){
        return(nom + "(" + adresse + ")");  
    }

}
