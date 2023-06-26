package org.ntlstudio.mathutil.core.test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.ntlstudio.mathutil.core.MathUtility;

/**
 *
 * @author ACER
 */
public class MathUtilityTDDTest {
    
   public static Object[][] initTestData(){
        Integer testData[][] = {{0,1},
                                {1,1},
                                {2,2},
                                {3,6},
                                {5,120}};
        
                                //n expected
                                //c0, c1
        return testData;
    }
   
   @ParameterizedTest
   @MethodSource("initTestData")
   public void testFactorialGivenRightArgumentReturnWell(int n, long expected){
       assertEquals(expected, MathUtility.getFactorial(n));
   }
   
   //kĩ thuật DDT - data driven testing - tách dâta thanhf mảng 2 chiều 
}
