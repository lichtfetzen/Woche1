/*

Aufgabe aus dem Buch: Schachbrett

 */
package Woche1;

/**
 *
 * @author w4s1m0t0
 */
public class Schachbrett {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Variablendeklaration und Initialisierung
        int zeile = 1;
        int reihe = 1;
        int laenge = 100;                                 // Anzahl Spalten und Zeilen
        
        while (zeile <= laenge){                        // Solange 'zeile' kleiner als 9
            reihe = zeile;                              // 'reihe' bekommt den Wert von aktueller 'zeile'
            while (reihe < zeile + laenge){             // Solange 'reihe' kleiner als aktuelle 'zeile' + 8
                if (reihe > 9){                         // Wenn 'reihe' zweistellig
                    System.out.print(reihe + " ");      // Gebe 'reihe' mit einem Leerzeichen aus
                    reihe++;                            // Erhöhe 'reihe' um 1
                }
                else{                                   // sonst
                    System.out.print(reihe + "  ");     // Gebe 'reihe' mit zwei Leerzeichen aus
                    reihe++;                            // Erhöhe 'reihe' um 1
                }
            }
            System.out.println();                       // Nach jeder Zeile kommt ein Zeilenumbruch
            zeile++;                                    // Erhöhe Zeilenzahl um 1
        }
    }
    
}
