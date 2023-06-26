/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ntlstudio.mathutil.core;

/**
 *
 * @author ACER
 */
public class MathUtility {
    
    //hàm tính n! = 1.2.3....n
    //0!=1!=1
    //ko có giai thừa âm
    // mình k chấp nhận n>20
    public static long getFactorial(int n) throws NumberFormatException{
        //TODO
        long value = 1;
        if(n>20||n<0){
            throw new NumberFormatException();
        }else{
            for(int i=2;i<=n;i++){
                value*=i;
            }
        }
        return value;
    }
}
