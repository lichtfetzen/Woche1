/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Woche1;

/**
 *
 * @author Administrator
 */
public class Arithmetische_Operatoren {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 23;
        int b = 15;
        int c;
        int d;
        
        System.out.println("a = " + a + ", b = " + b);
        
        c = a-- + ++b;
        
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
        
        d = --a/++b;
        
        System.out.println("a = " + a + ", b = " + b +", d = " + d);
    }
    
}
