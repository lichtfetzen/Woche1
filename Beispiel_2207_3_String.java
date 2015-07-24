/*
    Komplexer Datentyp:

    String

 */
package Woche1;

// Scanner für Eingabe importieren
import java.util.Scanner;

/**
 *
 * @author w4s1m0t0
 */
public class Beispiel_2207_3_String {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Neuen Scanner erzeugen
        Scanner sc = new Scanner(System.in);
        
        // Stringvariable
        String s;
        
        // Eingabeaufforderung
        System.out.print("Text eingeben: ");
        
        // Eingabe in Variable speichern
        s = sc.next();
        
        // Test, ob in s der String "ja" steht
        if (s.equals("Ja") || s.equals("ja")){
            System.out.println("Sie haben \"" + s + "\" eingegeben.");
        }
        else{
            System.out.println("Sie haben \"" + s + "\", statt 'Ja' oder 'ja' eingegeben.");
        }
    }
    
}
