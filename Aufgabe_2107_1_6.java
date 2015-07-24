/*
    Aufgabe 6

    Fakultät einer beliebigen int Zahl.
    
    n! = 1 * 2 * 3 * ... * (n-1) * n
 */

package Woche1;

// Scanner für Eingabe importieren
import java.util.Scanner;
/**
 *
 * @author w4s1m0t0
 */
public class Aufgabe_2107_1_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Scanner erzeugen
        Scanner sc = new Scanner(System.in);
        
        // Variablen deklarieren und initialisieren
        int erg = 1;
        int zahl = 0;
        int i = 1;
        
        // Eingabeaufforderung
        System.out.println("Bitte geben Sie eine Zahl ein:");
        
        // Eingabe in zahl speichern
        zahl = sc.nextInt();
        
        while (i <= zahl){
            erg = erg * i;
            i++;
        }
        
        // Ergebnis ausgeben
        System.out.println("Die Fakultät lautet: " + erg);

    }
    
}
