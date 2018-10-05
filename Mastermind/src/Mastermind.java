import java.util.Scanner;
import java.util.Random;

public class Mastermind {
	Scanner sc = new Scanner (System.in);
	private char bon= 'V';//V pour valide
    private char faux = 'X';// x pour non-valide
	int max=9;//valeur du chiffre maximal
	int essais_max=8;
	int compteur=0;
	private int code[]= new int [4];//tableau du code ramdom
	int nb_saisies[]=new int[4];//table du code saisies
	boolean victoire = false;
	
	
	public Mastermind() 
	{
		
	}
	
	void jouer()//fonction qui lance le jeu
	{
		
		Random r = new Random();
		for(int i =0 ; i<4;i++)
		{
			code[i]=r.nextInt(max+1);
			
			System.out.println(code[i]);
		}
		//tous ce qui se trouve ci-dessus permet de gnerer le code aleatoire
		
		System.out.println("Vous avez lancer un Mastermind ");
	    System.out.println("Vous avez droit à 8 essais");
	    System.out.println("--------------------------------------------------------------------------------------------");   
		
		do{
			
			System.out.println("\nVoici votre essai n° " + (compteur+1) + "/" + essais_max + " :");
			int nombres_saisies = sc.nextInt();
			for(int i=0 ; i<4;i++)
	        nb_saisies[i]=(int) (nombres_saisies /(Math.pow(10, (nb_chiffres-i-1)) ))%10;
			//calcul se contente "juste" de récupérer le chiffre à la position
            // i dans nombreSaisi
			
			// On écrit la saisies du joueur  
		    for(int i=0;i<4;i++)
		      System.out.print(nb_saisies[i] + " ");
		      victoire = true;
		      for(int i=0 ; i<nb_chiffres ; i++) {
	                boolean valide = nb_saisies[i] == code[i];
					if(valide)
	                     System.out.println(bon + " ");
	                else System.out.println(faux + "  ");
	                victoire = victoire && valide;
		    	
			}
		      compteur++;
		      if(compteur == essais_max)
	          System.out.println("Vous avez epuisé vos " + essais_max + " essais, Vous avez perdu...");
	 }
		while(!victoire && compteur < essais_max);
    System.out.println("Vous avez fait : "+compteur+ " coups");
    sc.close();
	}
	
	void rejouer()//fonctions pour rejouer
	{
		System.out.println("Voulez vous recommencer une partie?Taper:y/n");
		String answer = sc.nextLine();
		
		if(answer.equals("y"))
		{
			jouer();
		}
		else if(answer.equals("n"))
		{
			System.out.println("La partie est terminée ! Quitter le jeu");
		}
	}
	
}
	
    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

