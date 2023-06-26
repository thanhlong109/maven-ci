/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.ntlstudio.mathutil.core.test;
import static org.ntlstudio.mathutil.core.MathUtility.getFactorial;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.ntlstudio.mathutil.core.MathUtility;
import org.junit.jupiter.api.function.Executable;
/**
 *
 * @author ACER
 */

public class MathUitilityTest {
    
    
    //test ngoai le thi sao
    @Test
    public void testFactorialGivenWrongArgumentThrowsExeption(){
        
        assertThrows(IllegalArgumentException.class, () -> getFactorial(-5));
    }
    
    @Test
    public void testFactorialGivenRightArgumentReturnWell(){
        assertEquals(1, getFactorial(0));
        assertEquals(1, getFactorial(1));
        assertEquals(2, getFactorial(2));
        assertEquals(6, getFactorial(3));
        assertEquals(24, getFactorial(4));
    }
}
