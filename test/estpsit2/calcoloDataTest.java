/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estpsit2;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PC
 */
public class calcoloDataTest {
    
    public calcoloDataTest() {
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
     * Test of calcoloData method, of class calcoloData.
     */
    @Test
    public void testCalcoloData() {
        System.out.println("calcoloData");
        calcoloData instance = new calcoloData (new Date(18,4,1900));
        Date expResult = new Date (15,6,1923);
        Date result = instance.calcoloData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of giorno method, of class calcoloData.
     */
    @Test
    public void testGiorno() {
        System.out.println("giorno");
        calcoloData instance = new calcoloData (new Date (18,4,1900));
        String expResult = "venerdi";
        String result = instance.giorno();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
