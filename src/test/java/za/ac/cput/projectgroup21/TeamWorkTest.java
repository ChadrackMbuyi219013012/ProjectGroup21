/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.projectgroup21;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;

/**
 *
 * @author 219013012 Chadrack Mbuyi 
 */
public class TeamWorkTest {
    
    public TeamWorkTest() {
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
     * Test of multiply method, of class TeamWork
     */
    @Test
    public void TestequalityAddition(){
        System.out.println("addition");
        String num1 = "5";
        String num2 = "7";
        String num3 = "6";
        TeamWork instance = new TeamWork();
        int expResult = 18;
        int result = instance.addition(num1, num2, num3);
        assertEquals (expResult, result);
    }
    
    @Test
    public void TestIdentifyAddition(){
        System.out.println("addition");
        String num1 = "6";
        String num2 = "6";
        String num3 = "6";
        TeamWork instance = new TeamWork();
        int expResult = 18;
        int result = instance.addition(num1, num2, num3);
        assertSame (num3, num1);
        
    }
    @Test
    public void TestfailAddition(){
        System.out.println("addition");
        String num1 = "5";
        String num2 = "7";
        String num3 = "6";
        TeamWork instance = new TeamWork();
        int expResult = 18;
        int result = instance.addition(num1, num2, num3);
        fail("This test method will fail");
        
    }
    @Test
    public void TestdisableAddition(){
        System.out.println("addition");
        String num1 = "5";
        String num2 = "7";
        String num3 = "6";
        TeamWork instance = new TeamWork();
        int expResult = 18;
        int result = instance.addition(num1, num2, num3);
        assertSame(num3,num1);
    
    
    
}
}
