import java.time.LocalDate;

public class Employe extends Personne{
    private LocalDate datEmbauche;
    private float salaire;
    private Secretaire secretaire;

    protected Employe(String leNom, String lePrenom, LocalDate dateNaissance, Adresse lAdresse, LocalDate datEmbauche, float salaire){
        super(leNom, lePrenom, dateNaissance, lAdresse);
        this.datEmbauche = datEmbauche;
        this.salaire = salaire;
    }

    protected Employe(){}

    public static Employe createEmploye(String leNom, String lePrenom, LocalDate dateNaissance, Adresse lAdresse, LocalDate datEmbauche, float salaire){
        Employe employe;
        if ((LocalDate.now().compareTo(dateNaissance) > 16) && (LocalDate.now().compareTo(dateNaissance)) < 65) {
            employe = new Employe(leNom, lePrenom, dateNaissance, lAdresse, datEmbauche, salaire);
        }else{

            employe = new Employe();
        }
        return employe;
    }

    public float getSalaire(){
        return salaire;
    }

    public void augmenterLeSalaire(float pourcent){
        if (pourcent > 0){
            salaire = salaire * (100/pourcent);
        }
    }

    public int calculAnnuite(){
        return LocalDate.now().compareTo(datEmbauche) + 1;
    }

    public double calculSalaireManager(Manager manager){

        double ancien = manager.calculAnnuite();
        double calculPourcentage = ancien * 0.5;
        double pourcentage = 0;
        pourcentage = (calculPourcentage / 100);  
        double calculSalaire = pourcentage * manager.getSalaire();
        
        return calculSalaire;

    }
    
    public void setSecretaire(Secretaire s){
        
        secretaire = s;
    }

    public double calculSalaireSecretaire(Secretaire secretaire){

        double ancien = secretaire.calculAnnuite(); 
        double calculPourcentage = ancien * 0.5;
        double pourcentage = 0;
        pourcentage = (calculPourcentage / 100) + 1;  
        double calculSalaire = pourcentage * secretaire.getSalaire();
        
        return calculSalaire;

    }


}

