/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ap2slam;

import java.util.Scanner;
import metier.Region;

/**
 *
 * @author buffet
 */
public class Programme {

        /**
	 * @param args
	 */
	public static void main(String[] args) {
		Gestion laFrance = new Gestion();
		Scanner scan = new Scanner(System.in);
		int reponse;
		int codeRegion;
		String codeDept, codeCom;
		do{
			System.out.println("---------------");
			System.out.println("1 - Region");
			System.out.println("2 - Departement");
			System.out.println("3 - Commune");
			System.out.println("9 - Quitter");
			System.out.println("---------------");
			reponse = scan.nextInt();
			switch(reponse){
			case 1 :
				System.out.println("Entrer un code de région");
				codeRegion = scan.nextInt();
				Region laRegion = laFrance.donneRegionDepuisCodeInsee(codeRegion);
				if(laRegion==null)
					System.out.println("Le code région recherché n'existe pas");
				else{
					System.out.println("Il s'agit de "+laRegion.getNom());	
				}
				break;
			case 2 :
					
				break;
			case 3 :
				
                                break;	
			}
			scan.nextLine();
		}while(reponse!=9);
		scan.close();
	}

}
