/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Woche1;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class Beispiel_2207_1_Fliesskomma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       
        float x;
        double y;
        
        x = 40.54f;
        System.out.println(x);
        x = 52;
        System.out.println(x);
        x = .5468f;
        System.out.println(x);
        x = -2.5e-3f;
        System.out.println(x);
        
        y = 67.5401;
        System.out.println(y);
        y = 88;
        System.out.println(y);
        y = 54.87f;
        System.out.println(y);
        y = 2.1e3;      // 2.1 * 1000 = 2100
        System.out.println(y);
        
        y = x;
        
        x = (float)y;   // Cast-Konstruktion
        
        x = sc.nextFloat();
        y = sc.nextDouble();
        
        System.out.println(x);
        System.out.println(y);
    }
    
}
