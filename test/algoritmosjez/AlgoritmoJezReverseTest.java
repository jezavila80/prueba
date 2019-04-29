/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmosjez;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jezreel_avila
 */
public class AlgoritmoJezReverseTest {
    
    public AlgoritmoJezReverseTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class AlgoritmoJezReverse.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        args = new String []{"1","2","3","4"}; 
        AlgoritmoJezReverse.main(args);
        // TODO review the generated test code and remove the default call to fail.
        
        //fail("The test case is a prototype.");
    }

    /**
     * Test of reverseJez method, of class AlgoritmoJezReverse.
     */
    @Test
    public void testReverseJez() {
        System.out.println("reverseJez");
        int[] arreglo = null;
        AlgoritmoJezReverse.reverseJez(arreglo);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of parImpar method, of class AlgoritmoJezReverse.
     */
    @Test
    public void testParImpar() {
        System.out.println("parImpar");
        int[] arreglo = null;
        int expResult = 0;
        int result = AlgoritmoJezReverse.parImpar(arreglo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of sacarLimite method, of class AlgoritmoJezReverse.
     */
    @Test
    public void testSacarLimite() {
        System.out.println("sacarLimite");
        int[] arreglo = null;
        arreglo = new int []{1,2,3,4}; 
        int impar = 0;
        boolean expResult = false;
        if (arreglo == null) {
            impar = 0;
        }
        if (arreglo.length % 2 != 0) {
            impar = (arreglo.length / 2);
        }
        int result = AlgoritmoJezReverse.sacarLimite(arreglo, impar);
        int opers = (10-(10*10))+10;
        System.out.println("=" + opers);
        if (result >= 0) {
            expResult = true;
        }
        assertTrue(expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
