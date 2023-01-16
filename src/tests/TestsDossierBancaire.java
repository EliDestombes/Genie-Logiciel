package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import myPackage.DossierBancaire;

public class TestsDossierBancaire {
	
	public TestsDossierBancaire(){}
	
	public class MyTest1 {

		@Test  
		public void test1_1() 
		{
			DossierBancaire dossier=new DossierBancaire();
			dossier.deposer(100);
			assertEquals(100,dossier.get_solde(),0); //voir documentation en ligne sur assertions Junit
			
			CompteCourant compte=new CompteCourant();
			compte.setSolde(100);
			assertEquals(100,compte.getSolde(),0);
			
			CompteEpargne compteE=new CompteEpargne();
			compteE.setSolde(100);
			assertEquals(100,compteE.getSolde(),0);
			
		    dossier.remunerer();
		    assertEquals(101.92,compteE.getSolde(),0);
		    
		    
		    try {
	            dossier.retirer(10);
	        } catch (Exception e) {

	            e.printStackTrace();
	        }
		}
		
	}

	public static void main(String[] args) {
		
		
		Result result = JUnitCore.runClasses(MyTest1.class);
		for (Failure fail : result.getFailures()) 
		{
			System.out.println(fail.toString());
		}
		if (result.wasSuccessful()) 
		{
			System.out.println("All tests finished successfully...");
		}
	}
	
	
	
}