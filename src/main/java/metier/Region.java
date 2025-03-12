/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metier;

/**
 *
 * @author buffet
 */
public class Region {
	/**
	 * Code insee de la région
	 */
	private int codeInsee;
	/**
	 * Nom de la région
	 */
	private String nom;
	/**
	 * Constructeur de la classe Region
	 * @param unCodeInsee le code insee de la nouvelle Region
	 * @param unNom le nom de la nouvelle Region
	 */
	public Region(int unCodeInsee, String unNom){
		this.codeInsee = unCodeInsee;
		this.nom = unNom;
	}
	
	/**
	 * Getteur sur l'attribut codeInsee
	 * @return le code insee
	 */
	public int getCodeInsee(){
		return this.codeInsee;
	}

	/**
	 * Getteur sur l'attribut nom
	 * @return le nom
	 */
	public String getNom() {
		return this.nom;
	}

}

