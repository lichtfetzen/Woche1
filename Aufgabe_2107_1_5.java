/*
    Aufgabe 5

    Erste Quersumme einer int Zahl berechnen
 */
package Woche1;

// Scanner importieren für Input
import java.util.Scanner;

/**
 *
 * @author w4s1m0t0
 */
public class Aufgabe_2107_1_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Scanner erzeugen
        Scanner sc = new Scanner(System.in);
        
        // Variablendeklaration und Initialisierung
        int zahl = 0;
        int quer = 0;
        
        // Eingabeaufforderung
        System.out.print("Bitte geben Sie eine Zahl ein, deren Quersummer errechnet werden soll:");
        
        // Eingabe in 'zahl' speichern
        zahl = sc.nextInt();
        
        while (zahl > 0){
            quer = quer + zahl % 10;
            zahl = zahl / 10;
        }
        
        System.out.println("Die Quersumme lautet: " + quer);
    }
    
}
