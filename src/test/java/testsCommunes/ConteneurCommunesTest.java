/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package testsCommunes;

import conteneur.ConteneurCommunes;
import metier.Departement;
import metier.Region;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author buffet
 */
public class ConteneurCommunesTest {
    
    private ConteneurCommunes conteneur;
    
    public ConteneurCommunesTest() {
        this.conteneur=new ConteneurCommunes();
    }
    
    
    @BeforeEach
    public void setUp() {
        this.conteneur.ajouteUneCommune("1","une commune",100,"cp",0.1,0.2,1000,1000,new Departement("1","un département",new Region(1,"une région")),"commune");
        this.conteneur.ajouteUneCommune("11","une autre commune",100,"cp",0.1,0.2,1000,1000,new Departement("1","un département",new Region(1,"une région")),"commune");
        this.conteneur.ajouteUneCommune("111","une dernière commune",100,"cp",0.1,0.2,1000,1000,new Departement("11","un autre département",new Region(2,"une autre région")),"commune");
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testGet() {
        assertEquals("une autre commune",this.conteneur.donneCommuneDepuisCodeInsee("11").getNom());
    }
    
}
