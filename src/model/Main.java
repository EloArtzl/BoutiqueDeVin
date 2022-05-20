package model;

public class Main {
	public static void main(String[] args) throws ErrorAdd {
		Annuaire all_customers= Annuaire.getInstance();
		// we try to create , to add customer if something goes wrong ,
		//an exception will be triggered
		// and to catch all the different types of exception we use catch() to catch them 😃
		try {
			
				
			
			Personne c1= new Personne("Eloise","Artozoul","fhfhhh@gmail.com");
			Personne c2= new Personne("Yancouba","DIATTA","yancoubadiatta25@gmail.com");
			Personne c3= new Personne("Majid","OULD SALVA","dklfkfl@gmail.com");
			
			all_customers.addPersonne(c1);
			all_customers.addPersonne(c2);
			all_customers.addPersonne(c3);
			System.out.println(c1);
			
			
		}
		//same
		catch(IllegalArgumentException e)
		{
			System.out.println("Mauvais nom ou prenom ou email");
			System.exit(-1);
		}
		catch(RuntimeException m) {
			System.out.println("email déjà existant");
			System.exit(-1);
		
		}
		
		finally {
			System.out.println("Tout est ok");
		}
  System.out.println(all_customers);
	}
}

