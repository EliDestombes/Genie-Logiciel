package myPackage;

public class DossierBancaire {
	private CompteCourant CC_solde= new CompteCourant(); //creation compte courant
	private CompteEpargne CE_solde= new CompteEpargne(); //creation compte epargne
	
	//Constructeur
    public DossierBancaire() {}


    public void deposer(double value) { 
    	CC_solde.setSolde(value*0.4); //40% du montant envoyé au compte courant
    	CE_solde.setSolde(value*0.6); //60% du montant envoyé au compte epargne
    }
    public double get_solde() {return (CC_solde.getSolde() + CE_solde.getSolde());}
    public void remunerer() { CE_solde.RemunererCE();}
	
}


///written by Eli Destombes and Enzo Pierre