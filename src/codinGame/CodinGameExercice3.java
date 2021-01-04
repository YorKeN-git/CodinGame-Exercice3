package codinGame;

import java.util.Scanner;

public class CodinGameExercice3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Info : Un numero est gagnant lorsque la somme des 3 premiers chiffres est égale à la somme des 3 derniers chiffres");
		System.out.println("Saisissez le nombre de ticket à saisir :");
		//Nombre de saisie de ticket 
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
        	System.out.println("Numero du ticket (6 numeros obligatoire):");
        	String t = in.next();
        	//Additionne les 3 premiers chiffres 
        	int partieUn = Character.getNumericValue(t.charAt(0)) + Character.getNumericValue(t.charAt(1)) 
        					+ Character.getNumericValue(t.charAt(2));
        	//Additionne les 3 derniers chiffres 
        	int partieDeux = Character.getNumericValue(t.charAt(3)) + Character.getNumericValue(t.charAt(4)) 
			+ Character.getNumericValue(t.charAt(5));
        	if(partieUn == partieDeux) {
        		System.out.println("Gagné !");
        	}else {
        		System.out.println("Perdu !");
        	}
        	
		}
        System.out.println("Merci d'avoir joué !");
	}

}
