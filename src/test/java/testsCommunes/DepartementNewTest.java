package testsCommunes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import metier.Commune;
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
public class DepartementNewTest {
    
    private Departement departement;
    
    public DepartementNewTest() {
    }

    @BeforeEach
    public void setUp() throws Exception {
        this.departement=new Departement("1","un département",new Region(1,"une région"));
    }

    @AfterEach
    public void tearDown() throws Exception {
    }
    
    @Test
    public void testCount() {
        assertEquals(0,this.departement.nombreCommunes());
    }
    
    @Test
    public void testAdd() {
        new Commune("1","une commune",100,"cp",0.1,0.2,1000,1000,this.departement,"commune");
        new Commune("11","une autre commune",100,"cp",0.1,0.2,1000,1000,this.departement,"commune");
        assertEquals(2,this.departement.nombreCommunes());
    }
    
    @Test
    public void testGet() {
        new Commune("1","une commune",100,"cp",0.1,0.2,1000,1000,this.departement,"commune");
        assertEquals("une commune",this.departement.donneUneCommune(0).getNom());
    }
}
