/*
    Aufgabe 8 / JAV1 / 1. Woche
 */
package Woche1;

/**
 *
 * @author Administrator
 */
public class Aufgabe_2207_1_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Variable deklarieren und initialisieren
        long a = 27;
        long b = 99;
        long c = 0;
        int i = 1;
        
        // Führe solange aus, bis 'i' groesser-gleich 100, erhöhe 'i' jeweils um 1
        for ( ; c >= 0; i++){
            c = a + b;
            a = b;
            b = c;
            // Ausgabe: Anzahl der Durchläufe und das jeweilige Ergebnis
            System.out.println(i + ". Durchlauf: " + c);
        }
    }
    
}
