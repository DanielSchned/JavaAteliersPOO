public class Studio extends Appartement{
    private static final int STUDIOLOYER = 300;

    public Studio(Proprietaire proprietaire){
        super(proprietaire);
        
        
    }

    public int loyer(){
        return STUDIOLOYER;
    }
    public String toString(){
        return("Studio APP" + nb + " appartenant à " +proprietaire.getNom() + "(" + proprietaire.getAdresse() + ")");  
    }
}
