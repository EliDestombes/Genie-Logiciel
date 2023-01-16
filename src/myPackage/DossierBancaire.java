package myPackage;

public class DossierBancaire {
	private CompteCourant CC_solde = new CompteCourant();
	
	
	//Constructeur
    public DossierBancaire()
    {
    	CC_solde=0;
    }

    public void deposer(double value) {CC_solde.setSolde(value);    }
    
    public double get_solde() {CC_solde.getSolde();}
    public void remunerer() {}
	
    private double m_solde;
}
