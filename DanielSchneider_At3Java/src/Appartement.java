public abstract class Appartement {
    private static int nbAppartements = 0;
    protected int nb;
    protected Proprietaire proprietaire;

    public Appartement(Proprietaire proprietaire){
        this.proprietaire = proprietaire;
        nbAppartements++;
        nb = nbAppartements;
    }
    public int getNbAppartements(){
        return nbAppartements;
    }

    abstract int loyer();

    public String toString(){
        return("APP" + nb + " appartenant à " +proprietaire.getNom() + "(" + proprietaire.getAdresse() + ")");  
    }
}
