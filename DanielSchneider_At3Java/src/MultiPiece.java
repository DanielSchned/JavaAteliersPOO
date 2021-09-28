public class MultiPiece extends Appartement  {
    private static final int LOYERPIECE = 200;
    private int nbPiece;
    
    public MultiPiece(Proprietaire proprietaire, int nbPiece){
        super(proprietaire);
        this.nbPiece = nbPiece;
        
    }

    public int loyer(){
        return(LOYERPIECE * nbPiece); 
    }

    public String toString(){
        return(nbPiece + " pièces APP" + nb + " appartenant à " +proprietaire.getNom() + "(" + proprietaire.getAdresse() + ")");  
    }
    


}
