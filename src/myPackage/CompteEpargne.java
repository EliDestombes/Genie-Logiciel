package myPackage;

public class CompteEpargne {

	private double CE_solde;
	public CompteEpargne() {
		CE_solde =0;
	}
	
	public void setSolde(double value) {
		CE_solde += value ; 
	}
	public double getSolde() {
		return CE_solde;
	}
	public void RemunererCE() {
		this.setSolde(this.getSolde()*0.032);
	}
	
}