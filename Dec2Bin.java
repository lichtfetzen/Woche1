 /*
 * Umrechnung von Dezimal in 8bit Binär; 
 */
package Woche1;

/*
 *
 * @author Wasimoto
 */

import java.util.Scanner;

public class Dec2Bin {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int arr[] = {0, 0, 0, 0, 0, 0, 0, 0};
        int zahl;
        int i = 7;
        
        System.out.println("Bitte Zahl zwischen 0 und 255 eingeben:");
        zahl = sc.nextInt();
        
        while ( i >= 0) {
            if ( zahl % 2 == 0){
                arr[i] = 0;
            }
            else {
                arr[i] = 1;
            }
            zahl = zahl / 2;
            i = i - 1;
        }
        
        i = 0;
        
        while ( i<= 7) {
            System.out.print(arr[i]);
            i = i + 1;
        }
        System.out.println("");
    }   
}
