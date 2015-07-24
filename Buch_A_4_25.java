/*
    Buch / Aufgabe 4.25
    Aus *-Zeichen generiertes Dreieck.
    Anzahl der Zeilen ist einzugeben.
    
 */
package Woche1;

// Scanner für Eingabe importieren
import java.util.Scanner;

/**
 *
 * @author w4s1m0t0
 */
public class Buch_A_4_25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Scanner erzeugen
        Scanner sc = new Scanner(System.in);
        
        // Variable deklarieren und initialisieren
        int zeilen;
        int dreieck = 1;
        int luft;
        
        
       // Eingabeaufforderung
       System.out.print("Anzahl der Zeilen: ");
       
       // Eingabe in 'zeilen' speichern
       zeilen = sc.nextInt();
       
       // Luftanteil berechnen
       luft = zeilen - dreieck;
       
       for ( int i = 1 ; i <= zeilen ; i++)             // Zeile erzeugen mit
       {
           for ( int k = 1 ; k <= luft; k++)            // Leerzeichen generieren
           {
               System.out.print(" ");  
           }
           for ( int j = 1; j <= dreieck ; j++ )        // und Baum generieren
           {
               System.out.print("*");               
           }
           dreieck += 2;
           luft--;
           System.out.println();                        // am Ende Zeilenumbruch
       }
       for ( int h = 1 ; h < zeilen ; h++ )             
               {
                   System.out.print(" ");               // Luft am Stamm erzeugen
               }
       System.out.println("I");                         // Baumstamm erzeugen
       
    }
}

