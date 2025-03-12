/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ap2slam;

import conteneur.ConteneurRegions;
import metier.Region;

/**
 *
 * @author buffet
 */
public class Gestion {
	/**
	 * Un ensemble d'objets Region contenus dans un seul objet Conteneur
	 * @see ConteneurRegions
	 */
	private ConteneurRegions lesRegions;
	
	/**
	 * Constructeur de la classe Gestion
	 */
	public Gestion(){
		this.lesRegions = new ConteneurRegions();
		this.instancieLesRegions();
	}
	
	/**
	 * Méthode qui instancie tous les objets Region à partir du contenu du fichier
	 * @see FonctionsUtiles#lectureFichier(String)
	 * @see ConteneurRegions#ajouteUneRegion(int, String)
	 */
	private void instancieLesRegions(){
		String[][] lesRegions = FonctionsUtiles.lectureFichier("regionsDeFrance.txt");
		for(int i=0;i<lesRegions.length;i++){
			this.lesRegions.ajouteUneRegion(Integer.parseInt(lesRegions[i][0]),lesRegions[i][1]);
		}
	}
	
	/**
	 * Méthode qui retourne un objet Region à partir d'un code insee
	 * @param unCodeInsee le code insee recherché
	 * @return un objet Region dont le code est égal à celui passé en paramètre
	 * @see ConteneurRegions#donneRegionDepuisCodeInsee(int)
	 */
	public Region donneRegionDepuisCodeInsee(int unCodeInsee){
		return this.lesRegions.donneRegionDepuisCodeInsee(unCodeInsee);
	}

}

