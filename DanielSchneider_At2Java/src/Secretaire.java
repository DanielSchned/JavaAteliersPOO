import java.time.LocalDate;

public class Secretaire extends Employe {

    protected Secretaire(String leNom, String lePrenom, LocalDate dateNaissance, Adresse lAdresse,
    LocalDate datEmbauche, float salaire){
        super(leNom, lePrenom, dateNaissance, lAdresse, datEmbauche, salaire);
        
    }
    protected Secretaire(){}
}
