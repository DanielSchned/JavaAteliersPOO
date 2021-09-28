import java.util.ArrayList;

public class Agence {
    private String nom;
    ArrayList<Appartement> appartements = new ArrayList<Appartement>();

    public Agence(String nom){
        this.nom = nom;
    }

   public String getNom(){
        return nom;
   } 
    public void ajoutAppartement(Appartement appartement){
        appartements.add(appartement);
        
    }

    private int totalLoyer(){
        int resultat = 0;
        for (int i = 0; i < appartements.size(); i++) {
            resultat = resultat + appartements.get(i).loyer();
            
        }
        System.out.println("Le loyer total est de : "+resultat);
        return resultat;
    }

    public void afficher(){
        int k = 0;
        for (int j = 0; j < appartements.size(); j++) {
            k++;
        }
        System.out.println(""+ getNom() +" - " + k + " appartements");
        System.out.println("Liste appartements :");
        for (int i = 0; i < appartements.size(); i++) {
            System.out.println(appartements.get(i));     
        }
        totalLoyer();
    }
}
