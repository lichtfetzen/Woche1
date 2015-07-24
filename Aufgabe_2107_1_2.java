/*
    Aufgabe 2
 */
package Woche1;
import java.util.Scanner;   // Für Tastaeingaben notwendig

/**
 *
 * @author w4s1m0t0
 */
public class Aufgabe_2107_1_2 {
    
    public static void main(String[] args) {

        // Neuen Scanner erzeugen
        
        Scanner sc = new Scanner(System.in);
        
        // Variablendeklaration
        
        int zahl1;
        int zahl2;
        
        // Eingabeaufforderung und Eingabe beider Zahlen
        
        System.out.println("Bitte geben Sie die erste Zahl ein:");
        zahl1 = sc.nextInt();
        
        System.out.println("Bitte geben Sie die zweite Zahl ein:");
        zahl2 = sc.nextInt();
        
        // Check welche Zahl größer
        
        if ( zahl1 > zahl2 ){
            if ( zahl1 % zahl2 == 0 ){
                System.out.println(zahl1 + " ist größer als " + zahl2 + " und ohne Rest teilbar");
            }
            else {
                System.out.println(zahl1 + " ist größer als " + zahl2 + " und mit Rest teilbar");
            }
        }
        else {
            if ( zahl2 % zahl1 == 0){
                System.out.println(zahl2 + " ist größer als " + zahl1 + " und ohne Rest teilbar");
            }
            else{
                System.out.println(zahl1 + " ist größer als " + zahl2 + " und mit Rest teilbar");
            }
        }
        
    }
    
}
