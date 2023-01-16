package myPackage;

public class CompteCourant {
	
	private double CC_solde ;
	public CompteCourant() {
		CC_solde =0 ; 
	}
	public void setSolde(double value) {
		CC_solde += value ; 
	}
	public double getSolde() {
		return CC_solde;
	}
	
}