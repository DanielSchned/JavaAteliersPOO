public class GestionAgence {
    public static void main(String[] args) {
        Proprietaire prop1 = new Proprietaire("toto", "Corte");
        Proprietaire prop2 = new Proprietaire("titi", "Ajaccio");
        Agence ag1 = new Agence("ESPADONBLEU");
        Studio stud1 = new Studio(prop1);
        ag1.ajoutAppartement(stud1);  
        MultiPiece mult1 = new MultiPiece(prop1, 2);
        ag1.ajoutAppartement(mult1);  
        MultiPiece mult2 = new MultiPiece(prop2, 4);
        ag1.ajoutAppartement(mult2);  
        ag1.afficher();
    }
}
