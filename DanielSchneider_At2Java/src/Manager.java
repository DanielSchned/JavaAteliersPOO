import java.time.LocalDate;


public class Manager extends Employe{
    protected Manager(String leNom, String lePrenom, LocalDate dateNaissance, Adresse lAdresse,
                      LocalDate datEmbauche, float salaire){
        super(leNom, lePrenom, dateNaissance, lAdresse, datEmbauche,salaire);
 
    }
    protected Manager(){}

    public static Manager createManager(String leNom, String lePrenom, LocalDate dateNaissance, Adresse lAdresse,
                                        LocalDate datEmbauche, float salaire){
        Manager manager;
        if ((LocalDate.now().compareTo(dateNaissance) > 16) && (LocalDate.now().compareTo(dateNaissance)) < 65) {
            manager = new Manager(leNom, lePrenom, dateNaissance, lAdresse, datEmbauche, salaire);
        }else{

            manager = new Manager();
        }
        return manager;
    }

    
    
}
