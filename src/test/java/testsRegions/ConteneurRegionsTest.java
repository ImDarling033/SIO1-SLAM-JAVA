/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package testsRegions;

import conteneur.ConteneurRegions;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/**
 *
 * @author buffet
 */
public class ConteneurRegionsTest {
    
    private ConteneurRegions conteneur;
    
    public ConteneurRegionsTest() {
        this.conteneur=new ConteneurRegions();
    } 
       
    @BeforeEach
    public void setUp() {
        this.conteneur.ajouteUneRegion(1,"une région");
        this.conteneur.ajouteUneRegion(11,"une autre région");
        this.conteneur.ajouteUneRegion(111,"une dernière région");
    }
    
    @AfterEach
    public void tearDown() {
    }
    
    @Test
    public void testGet() {
        assertEquals("une autre région",this.conteneur.donneRegionDepuisCodeInsee(11).getNom());
    }
}
