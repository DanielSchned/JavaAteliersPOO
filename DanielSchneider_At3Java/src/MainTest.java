

public class MainTest {
    public static void main(String[] args) {
        Proprietaire p1 = new Proprietaire("DelaFontaine", "Paris");
        Agence a1 = new Agence("Agence1");
        System.out.println(p1);

        Studio s1 = new Studio(p1);
        a1.ajoutAppartement(s1);
        System.out.println(s1.getNbAppartements());

        Studio s2 = new Studio(p1);
        a1.ajoutAppartement(s2);

        MultiPiece m1 = new MultiPiece(p1, 2);
        a1.ajoutAppartement(m1);
        System.out.println(m1.getNbAppartements());
        
        a1.afficher();
        

        
        
        
        
        

        Agence a2 = new Agence("Agence2");
        a2.ajoutAppartement(m1);
        
        
    }
}
