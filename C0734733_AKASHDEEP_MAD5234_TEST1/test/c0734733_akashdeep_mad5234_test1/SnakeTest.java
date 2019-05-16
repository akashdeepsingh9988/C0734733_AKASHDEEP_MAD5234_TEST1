/*
    STUDENT NAME :  AKASHDEEP SINGH
    STUDENT ID : C0734733
 */
 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c0734733_akashdeep_mad5234_test1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Akashdeep Singh
 */
public class SnakeTest {

    private Snake peter;
    private Snake takis;

    public SnakeTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        peter = new Snake("Peter S", 10, "coffee");
        takis = new Snake("Takis Z", 80, "vegetables");
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of isHealthy method, of class Snake.
     */
    @Test
    public void testIsHealthy() {
        System.out.println("isHealthy");
        boolean expResult = false;
        
        //CHECKING IF peter is healthy or not
        boolean result = peter.isHealthy();
        assertEquals(expResult,result);
        System.out.println("Peter is healthy? : "+result);
        
        
        //CHECKING IF takis is healthy or not
        expResult = true;
        result = takis.isHealthy();
        assertEquals(expResult,result);
        System.out.println("Takis is healthy? : "+result);
        
    }

    /**
     * Test of fitsInCage method, of class Snake.
     */
    @Test
    public void testFitsInCage() {
        System.out.println("fitsInCage");
        
        /*CHECK IF PETER FITS IN CAGE */
        int cageLength = 5;
        boolean expResult = false;
        
        // if cage is short
        boolean result = peter.fitsInCage(cageLength);
        assertEquals(expResult, result);
        System.out.println("Peter fits in cage ? "+result);
        
        // check if cage is equal 
        result = peter.fitsInCage(10);
        assertEquals(false, result);
        System.out.println("Peter fits in cage ? "+result);
        
        // check if caze long than size
        
        result = peter.fitsInCage(20);
        assertEquals(true, result);
        System.out.println("Peter fits in cage ? "+result);
        //===================  END FOR PETER ===================================================
        
        
        
        //========================   TAKIS  ===============================================================
        // CHECKING FOR TAKIS 
        
        // check if cage short
        cageLength = 50;
        expResult = false;
        result = takis.fitsInCage(cageLength);
        assertEquals(expResult, result);
        System.out.println("Takis fits in cage ? "+result);
        
          // check if cage is equal 
        result = takis.fitsInCage(80);
        assertEquals(false, result);
        System.out.println("TAKIS fits in cage ? "+result);
        
        // check if caze long than size
        
        result = takis.fitsInCage(200);
        assertEquals(true, result);
        System.out.println("TAKIS fits in cage ? "+result);
        
        
        //========================== END FOR TAKIS ===================================
    }

}
