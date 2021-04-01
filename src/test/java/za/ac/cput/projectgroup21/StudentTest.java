/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.projectgroup21;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Simphiwe Kahlana 220162891
 */
public class StudentTest {
    
  private Student student1;
  private Student student2;
  private Student student3;
    @BeforeEach
    public void setUp() {
        student1 = new Student();
        student2 = new Student();
        student3 = student1;
    }
    @Test
    void TestIdentity(){
        assertSame(student1 , student3);
        }
    @Test
    void TestEquality(){
        assertEquals(student1 , student3);
       
    }
    @Test
    void Fail(){
         fail("The test case is a prototype.");
    }
    
    @Test
    @Ignore
    void DisablingTest(){
        //Ignore this test. It's unneccessary
    }
    
    
    
    
    
    /** The Test Disabling is Below
     * Test of getName method, of class Student.
     */
    @Test
    public void testGetName(int timeout) {
        System.out.println("getName");
        Student instance = new Student();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStudentNumber method, of class Student.
     */
    @Test
    public void testGetStudentNumber() {
        System.out.println("getStudentNumber");
        Student instance = new Student();
        long expResult = 0L;
        long result = instance.getStudentNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLoanAmount method, of class Student.
     */
    @Test
    public void testGetLoanAmount() {
        System.out.println("getLoanAmount");
        Student instance = new Student();
        double expResult = 0.0;
        double result = instance.getLoanAmount();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Student.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Student instance = new Student();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStudentNumber method, of class Student.
     */
    @Test
    public void testSetStudentNumber() {
        System.out.println("setStudentNumber");
        long studentNumber = 0L;
        Student instance = new Student();
        instance.setStudentNumber(studentNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLoanAmount method, of class Student.
     */
    @Test
    public void testSetLoanAmount() {
        System.out.println("setLoanAmount");
        double loanAmount = 0.0;
        Student instance = new Student();
        instance.setLoanAmount(loanAmount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Student.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Student instance = new Student();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
