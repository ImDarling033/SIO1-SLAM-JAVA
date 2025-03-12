/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package testsDepartements;

import conteneur.ConteneurDepartements;
import metier.Region;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author buffet
 */
public class ConteneurDepartementsTest {
    
    private ConteneurDepartements conteneur;
    
    public ConteneurDepartementsTest() {
        this.conteneur=new ConteneurDepartements();
    }
    
    
    @BeforeEach
    public void setUp() {
        this.conteneur.ajouteUnDepartement("1","un département",new Region(1,"une région"));
        this.conteneur.ajouteUnDepartement("11","un autre département",new Region(1,"une région"));
        this.conteneur.ajouteUnDepartement("111","un dernier département",new Region(2,"une autre région"));
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testGet() {
        assertEquals("un autre département",this.conteneur.donneDepartementDepuisCodeInsee("11").getNom());
    }
    
}
