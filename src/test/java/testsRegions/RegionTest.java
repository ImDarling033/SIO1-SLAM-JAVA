/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package testsRegions;

import metier.Region;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author buffet
 */
public class RegionTest {
    
    private Region region;
    
    public RegionTest() {
    }

    @BeforeEach
    public void setUp() throws Exception {
        this.region=new Region(1,"une région");        
    }

    @AfterEach
    public void tearDown() throws Exception {
    }
    
    @Test
    public void testNom() {
        assertEquals("une région",this.region.getNom());
    }
}
