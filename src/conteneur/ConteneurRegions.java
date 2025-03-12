/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conteneur;

import java.util.ArrayList;
import metier.Region;

/**
 *
 * @author buffet
 */
public class ConteneurRegions {
	/**
	 * Collection d'objets Region sous la forme d'un ArrayList
	 * @see ArrayList
	 */
	private ArrayList<Region> toutesLesRegions;
	
	/**
	 * Constructeur de la classe ConteneurRegions
	 */
	public ConteneurRegions(){
		this.toutesLesRegions = new ArrayList<Region>();
	}
	
	/**
	 * Méthode qui ajoute un objet Region dans le conteneur
	 * @param unCodeInsee le code insee de la nouvelle Region à ajouter
	 * @param unNom le nom de la nouvelle Region à ajouter
	 */
	public void ajouteUneRegion(int unCodeInsee, String unNom) {
		this.toutesLesRegions.add(new Region(unCodeInsee,unNom));
	}

	/**
	 * Méthode qui retourne un objet Region à partir d'un code insee
	 * @param unCodeInsee le code insee recherché
	 * @return un objet Region dont le code est égal à celui passé en paramètre (ou null)
	 */
	public Region donneRegionDepuisCodeInsee(int unCodeInsee) {
	    for (int region=0;region<this.toutesLesRegions.size();region++) {
	        if (unCodeInsee==this.toutesLesRegions.get(region).getCodeInsee()) {
	        	return this.toutesLesRegions.get(region);
	        }
	    }
	    return null; 
	}

}

