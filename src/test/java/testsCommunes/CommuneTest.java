package testsCommunes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import metier.Departement;
import metier.Commune;
import metier.Region;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author buffet
 */
public class CommuneTest {
    
    private Commune commune;
    
    public CommuneTest() {
    }

    @BeforeEach
    public void setUp() throws Exception {
        this.commune=new Commune("1","une commune",100,"cp",0.1,0.2,1000,1000,new Departement("1","un département",new Region(1,"une région")),"commune");       
    }

    @AfterEach
    public void tearDown() throws Exception {
    }
    
    @Test
    public void testNom() {
        assertEquals("une commune",this.commune.getNom());
    }
    
    @Test
    public void testNomRegion() {
        assertEquals("une région",this.commune.getLeDepartement().getLaRegion().getNom());
    }
}
