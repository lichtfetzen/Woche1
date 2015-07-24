/*
    Aufgabe 3
    
    Beliebige Anzahl an Zahlen eingeben und die Summe ausgeben.
    '0' beendet das Programm.
 */
package Woche1;

// Für Tastaeingabe notwendig
import java.util.Scanner;

/**
 *
 * @author w4s1m0t0
 */

public class Aufgabe_2107_1_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Scanner erzeugen
        Scanner sc = new Scanner(System.in);
        
        // Variablendeklaration
        int zahl;
        int ergebnis;
        
        // Variable initialisieren
        ergebnis = 0;
        
        // Eingabeaufforderung
        System.out.println("Bitte geben Sie eine Zahl ein. '0' beendet das Programm");
        
        // Tastaeingabe in Variable zahl speichern
        zahl = sc.nextInt();
        
        // Prüfen ob die Zahl gleich 0 war
        if( zahl == 0) {
            System.out.println("Nichts eingegeben");                // Eingegebene Zahl war 0
        }
        else {                                                      // Eingegebene Zahl war nicht 0
            ergebnis = ergebnis + zahl;                             // Ergebnis ermitteln
            System.out.println("Die Summe lautet: " + ergebnis);    // Ergebnis ausgeben
            while ( zahl != 0 ) {                                   // Während eingegebene Zahl ungleich 0
                System.out.println("Bitte weitere Zahl eingeben. '0' beendet das Programm");            // Eingabeaufforderung
                zahl = sc.nextInt();                                // Tastaeingabe in Variable zahl speichern
                ergebnis = ergebnis + zahl;                         // Ergebnis ermitteln
                System.out.println("Sie haben " + zahl + " addiert, die Summe lautet: " + ergebnis);    // Ergebnis ausgeben
            }
        }
    }
    
}
