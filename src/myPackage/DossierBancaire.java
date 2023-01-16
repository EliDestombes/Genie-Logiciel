package myPackage;

public class DossierBancaire {
	private CompteCourant CC_solde= new CompteCourant();
	private CompteEpargne CE_solde= new CompteEpargne();
	//Constructeur
    public DossierBancaire() {
    	CC_solde = 0;
    	CE_solde = 0;
    }

    public void deposer(double value) {
    	CC_solde.setSolde(value*0.4);
    	CE_solde.setSolde(value*0.6);
    }
    public double get_solde() {return (CC_solde.getSolde() + CE_solde.getSolde());}
    public void remunerer() { CE_solde.RemunererCE();}
	
}