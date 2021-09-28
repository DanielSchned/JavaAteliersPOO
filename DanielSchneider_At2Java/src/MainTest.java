import java.time.LocalDate;


public class MainTest {
    public static void main(String[] args) {
        Adresse adresseP1 = new Adresse(3, "rue colonel", "20000", "Paris");
        Personne personne1 = new Personne("jean", "jean",
                LocalDate.of(2000, 12, 17), adresseP1);
        Personne personne2 = new Personne("pierre", "leca",
                LocalDate.of(2002, 1, 22), adresseP1);
        Personne personne3 = new Personne("jean", "jean",
                LocalDate.of(2000, 12, 17), adresseP1);

        System.out.println("il y a " + Personne.getNbPersonnes() + " personnes enregistrée");

        System.out.println(personne1.getNom() + " est plus agéé que " + personne2.getNom() + " :" +
                Personne.plusAgee(personne1, personne2));

        System.out.println(personne1.getNom() + " est plus agéé que " + personne2.getNom() + " :" +
                personne1.plusAgeeQue(personne2));

        System.out.println(personne1.getNom() + " est moins agéé que " + personne2.getNom() + " :" +
                personne2.plusAgeeQue(personne1));

        //test redifinit
        if (personne1 == personne3){
            System.out.println("Egalité sur la memoir de l'objet");
        }

        if (personne1.equals(personne3)){
            System.out.println("Egalité sur le contenu de l'objet");
        }


        Employe employe1 = Employe.createEmploye("jean", "jean",
                LocalDate.of(2000, 12, 17), adresseP1,
                LocalDate.of(2020, 12, 7), 1200);

        System.out.println();
        System.out.println("l'employé " + employe1.getNom() + " est present dans l'entreprise depuis " +
                employe1.calculAnnuite() + " ans. Il est né le " + personne1.getDateNaissance());

                Secretaire secretaire1 = new Secretaire("jean", "jean",
                LocalDate.of(2000, 12, 17), adresseP1,
                LocalDate.of(1999, 12, 7), 1200);

        employe1.setSecretaire(secretaire1);
    }

}
