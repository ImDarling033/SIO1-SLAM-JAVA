package testsDepartements;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import metier.Departement;
import metier.Region;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author buffet
 */
public class DepartementTest {
    
    private Region region;
    private Departement departement;
    
    public DepartementTest() {
    }

    @BeforeEach
    public void setUp() throws Exception {
        this.region=new Region(1,"une région");
        this.departement = new Departement("1","un département",this.region);       
    }

    @AfterEach
    public void tearDown() throws Exception {
    }
    
    @Test
    public void testNom() {
        assertEquals("un département",this.departement.getNom());
    }
    
    @Test
    public void testNomRegion() {
        assertEquals("une région",this.departement.getLaRegion().getNom());
    }
}
