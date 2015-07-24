/*
    Aufgabe 7 / JAV1 / 1. Woche
 */
package Woche1;

// Scanner für Eingabe importieren
import java.util.Scanner;

/**
 *
 * @author w4s1m0t0
 */
public class Aufgabe_2207_1_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Scanner erzeugen
        Scanner sc = new Scanner(System.in);
        
        // Variable deklarieren
        int zahl;
        
        // Ausgabe: Eingabeaufforderung
        System.out.print("Bitte eine Jahreszahl zwischen 1580 und 2100 eingeben: ");
        
        // Eingabe: in Variable 'zahl'
        zahl = sc.nextInt();
        
        // Check: Eingabe gültig?
        if ( 1580 <= zahl && zahl <= 2100){
            // Wenn Ja, dann Schaltjahrcheck
            if ( zahl % 400 == 0 || zahl % 4 == 0 && zahl % 100 != 0){
                // Wenn true, dann Ausgabe: Schaltjahr
                System.out.println(zahl + " ist ein Schaltjahr");
            }
            else{
                // Sonst, Ausgabe: kein Schaltjahr
                System.out.println(zahl + " ist kein Schaltjahr");
            }
        }
        else{
            // Check: Eingabe ungültig, ENDE
            System.out.println("Falsche Eingabe. ENDE!");
        }
    }
    
}
