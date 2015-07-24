/*
    Einlesen von Strings über Tastatur
 */
package Woche1;

// Scanner für Tastaeingaben importieren
import java.util.Scanner;

/**
 *
 * @author w4s1m0t0
 */

public class Beispiel_2307_1_String {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        // Scanner erzeugen
        Scanner sc = new Scanner(System.in);
        
        // Variablen deklarieren
        String s;
        String t;
        String w;
        char c = 'a';
        
        System.out.println("String 1 eingeben: ");
        s = sc.nextLine();                              // Gesamte Zeile wird erfasst
        System.out.println("String 2 eingeben: ");          
        t = sc.next();                                  // Nur bis zum ersten Leerzeichen wird erfasst
        
        w = s + t;
        System.out.println(w);
        
        System.out.println("String eingeben: ");
        s = sc.next();
        t = sc.next();
        
        w = s + t;
        
        System.out.println(w);
        System.out.println((int)c);
    }    
}
