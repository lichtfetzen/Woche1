/*
    Buch: Aufgabe: 4.32
    
    Dezimalzahl in Binärzahl umrechnen.
 */
package Woche1;

// Scanner importierten für Tastaeingaben
import java.util.Scanner;

/**
 *
 * @author w4s1m0t0
 */
public class Dec2Bin_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Scanner erzeugen
        Scanner sc = new Scanner(System.in);
        
        //Variablen deklarieren und initialisieren
        int d;            // Dezimalzahl
        long b = 0;         // Binärzahl
        int m = 1;          
        
        // Eingabeaufforderung
        System.out.print("Dezimalzahl: ");
        
        // Eingabe in Variable d speichern
        d = sc.nextInt();
        
        if( d < 0 ){
            System.out.println("Ende");
        }
        else{
            while( d > 0 ){
                b += (d % 2) * m;
                d /= 2;
                m *= 10;
            }
            System.out.println("Binaerzahl: " + b);
        }
                
    }
    
}
