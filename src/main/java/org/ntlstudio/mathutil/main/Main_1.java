/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ntlstudio.mathutil.main;

import org.ntlstudio.mathutil.core.MathUtility;

/**
 *
 * @author ACER
 */
public class Main_1 {
    public static void main(String[] args) {
        //test case 1: check if getF() return well with n = 0
        //steps/Procedures
        //-input n = 0 to the function/method
        //-run the method to get actual value of 0!
        //Expected: 0! muct be is 1, expected value = 1
        System.out.println("Check getF(0) | Expected: 1 | Acctual: "+MathUtility.getFactorial(0));
        System.out.println("Check getF(2) | Expected: 2 | Acctual: "+MathUtility.getFactorial(2));
        
    }
}
