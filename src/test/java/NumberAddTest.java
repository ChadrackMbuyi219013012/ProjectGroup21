/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Assert;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;

/**
 *
 * @author Joshua Julies 220102473
 */
public class NumberAddTest {
    
    public NumberAddTest() {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test of Add method, of class NumberAdd.
     */
    @Test(timeout=1500)
    public void testAdd() {
        System.out.println("Add:");
        NumberAdd obj1 = new NumberAdd();
        NumberAdd obj2 = new NumberAdd();
        int x = 80;
        int y = 10;
        NumberAdd instance = new NumberAdd();
        int expResult = 90;
        int result = instance.Add(x, y);
        Assert.assertEquals(expResult, result);
        Assert.assertSame(obj1, obj2);
        Assert.fail("This is a fail test message.");
        
        instance.Display();   
    }

    /**
     * Test of Display method, of class NumberAdd.
     */
    @Ignore
    @Test
    public void testDisplay() {
        System.out.println("Display");
        NumberAdd instance = new NumberAdd();
        String expResult = "";
        String result = instance.Display();
        Assert.assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        Assert.fail("The test case is a prototype.");
    }
    
}
