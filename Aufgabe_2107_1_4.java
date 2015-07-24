/*
    Aufgabe 4

    - Beliebig viele int Zahlen einlesen.
    - '0' bricht ab.
    - Ausgabe:
        + min
        + max
        + Anzahl ungerader Zahlen
        + Anzahl gerader Zahlen
 */
package Woche1;

// Scanner für Eingabe importieren
import java.util.Scanner;

/**
 *
 * @author w4s1m0t0
 */
public class Aufgabe_2107_1_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Scanner erzeugen
        Scanner sc = new Scanner(System.in);
        
        // Variablen initialisieren und deklarieren
        boolean flag = true;
        int max = 0;
        int min = 0;
        int gerade = 0;
        int ungerade = 0;
        int zahl = 0;
        
        while (flag) {
            System.out.println("Bitte geben Sie eine Zahl ein.");   
            System.out.println("'0' beendet das Programm");
            
            zahl = sc.nextInt();                // Eingegebener Wert wird in 'zahl' gespeichert
            
            if (zahl == 0){
                flag = false;                   // Wenn zahl gleich 0 dann flag auf false setzen
            }
            else{                               // Wenn zahl unglich 0
                if( zahl % 2 == 0){             // Zahl gerade oder ungereade?
                    gerade++;                   // Counter für gerade um 1 erhöhen
                }
                else{
                    ungerade++;                 // Counter für ungerade um 1 erhöhen
                }
                if (zahl > max){                // Zahl größer als Maximum?
                    max = zahl;
                }
                if (min == 0){                  // Min gleich 0?
                    min = zahl;                 // Wenn ja, dann zahl in min eintragen
                }
                else{                           // Sonst prüfen, ob zahl kleiner Minimum
                    if(zahl < min){
                        min = zahl;             // Wenn dies der Fall, zahl in Minimum eintragen
                    }
                }
            }
        }
        
        // Min, Max, Anzahl Gerade, Anzahl Ungerade
        System.out.println("Min: " + min + ", Max: " + max + ", Gerade: " + gerade + ", Ungerade: " + ungerade);        
    }
}
