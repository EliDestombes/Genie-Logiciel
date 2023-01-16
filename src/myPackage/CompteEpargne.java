package myPackage;

public class CompteEpargne extends Compte{


    private double tauxInteret ;
    public CompteEpargne() {

        tauxInteret = 0.032;
    }

    public void RemunererCE() {
        this.setSolde(this.getSolde()*tauxInteret);
    }

}