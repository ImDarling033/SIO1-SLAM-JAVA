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
public class RegionNewTest {
    
    private Region region;
    
    public RegionNewTest() {
    }

    @BeforeEach
    public void setUp() throws Exception {
        this.region=new Region(1,"une région");
    }

    @AfterEach
    public void tearDown() throws Exception {
    }
    
    @Test
    public void testCount() {
        assertEquals(0,this.region.nombreDepartements());
    }
    
    @Test
    public void testAdd() {
        new Departement("1","un département",this.region);
        new Departement("2", "un autre département",this.region);
        assertEquals(2,this.region.nombreDepartements());
    }
    
    @Test
    public void testGet() {
        new Departement("1","un département",this.region);
        assertEquals("un département",this.region.donneUnDepartement(0).getNom());
    }
}
