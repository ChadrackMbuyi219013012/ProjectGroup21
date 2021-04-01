/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.projectgroup21;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Matthew Jones
 */
public class JavaAccountTest {
    
    private JavaAccount stud1;
    private JavaAccount stud2;
    private JavaAccount stud3;
    
    @BeforeEach
    public void setUp() 
    {
        stud1 = new JavaAccount();
        stud2 = new JavaAccount();
        stud3 = new JavaAccount();
    }
    
    @Test
    void testIdentity()
    {
        assertSame(stud1,stud3);
    }
    
    @Test
    void testEquality()
    {
        assertEquals(stud1,stud3);
    }
    
    @Test
    void testFail()
    {
        assertEquals(stud1,stud3);
        fail("This test will fail on purpose");
    }
    
    @Test
    void testTimeoutPass()
    {
        assertSame(stud2,stud3);
    }
    
    @Test
    void testDisability()
    {
        assertEquals(stud1,stud2);
    }
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
