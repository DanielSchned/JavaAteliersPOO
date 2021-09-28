import java.time.LocalDate;


public class Personne{
    private static final Adresse ADRESSE_INCONNUE = null;
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;
    private Adresse adresse=ADRESSE_INCONNUE;
	private static int nbPersonnes = 0;
	private static final int AGE_MAJORITE = 18;
	private int ageObtentionDiplome;

	/**
	 * Constructeur de Personne
	 * @param leNom le nom de la personne
	 * @param lePrenom le pr�nom de la personne
	 * @param laDate la date de naissance de la personne
	 * @param lAdresse l'adresse de la personne
	 */
	public Personne(String leNom,String lePrenom, LocalDate laDate, Adresse lAdresse){
		nom = leNom.toUpperCase();
		prenom=lePrenom;
		dateNaissance=laDate;
		adresse=lAdresse;
		nbPersonnes ++;
	}
	
	/** 
	 * Constructeur de Personne
	 * @param leNom le nom de la personne
	 * @param lePrenom le prénom de la personne
	 * @param j le jour de naissance
	 * @param m le mois de naissance
	 * @param a l'année de naissance
	 * @param numero le né de la rue
	 * @param rue la rue
	 * @param code_postal le code postal de l'adresse
	 * @param ville la ville ou la personne habite
	 */
	public Personne(String leNom,String lePrenom, int j, int m, int a, int numero, String rue, String code_postal, String ville){
		this(leNom, lePrenom,LocalDate.of(a, m, j) ,new Adresse(numero,rue,code_postal,ville));
	}

	public Personne() {
	}

	/**
	 * Accesseur
	 * @return retourne le nom
	 */
	public String getNom(){
		return nom;
	}
	public int getMajorite(){
		return AGE_MAJORITE;
	}
	/**
	 * Accesseur
	 * @return retourne le prénom
	 */
	public String getPrenom(){
		return prenom;
	}

	public int obtDernierDiplome(){
		return ageObtentionDiplome;
	}


	/**
	 * Accesseur
	 * @return retourne la date de naissance	 
	 */
	public LocalDate getDateNaissance() {
		return dateNaissance;
	}
	/**
	 * Accesseur
	 * @return retourne l'adresse	 
	 */
	public Adresse getAdresse() {
		return adresse;
	}
	/**
	 * Modificateur
	 * @param a l'adresse
	 */
	public void setAdresse(Adresse a) {
		adresse=a;
	}
		
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		String result ="\nNom : "+nom+"\n"
		+"Prénom : "+prenom+"\n"+
		"Né(e) le : "+dateNaissance.getDayOfMonth()+
		"-"+dateNaissance.getMonth()+
		"-"+dateNaissance.getYear()+"\n"+
		"Adresse : "+
		adresse.toString();
		return result;
	}

	public static int getNbPersonnes(){
		return nbPersonnes;
	}


	public static boolean plusAgee(Personne pPlusAgee, Personne pMoinsAgee){
		return pMoinsAgee.getDateNaissance().compareTo(pPlusAgee.getDateNaissance()) > 0;
	}

	public boolean plusAgeeQue(Personne moinsAge){
		return plusAgee(this, moinsAge);
		// return (this.dateNaissance.compareTo(moinsAge.dateNaissance) < 0);
	}

	public boolean equals(Object obj){
		boolean res = false;
		if (obj instanceof Personne){
			Personne objPersonne = (Personne) obj;
			res = objPersonne.toString().equals(this.toString());
		}
		return res;
	}
}
