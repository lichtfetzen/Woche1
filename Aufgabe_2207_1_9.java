/*
    Aufgabe 9 / JAV1 / 1. Woche

    Primzahlen von 2 bis 2000
 */
package Woche1;

/**
 *
 * @author w4s1m0t0
 */
public class Aufgabe_2207_1_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Variable initialisieren und deklarieren
        int zaehler = 0;                                   // Zaehler für Ausgabe von 10 Zahlen je Zeile
        int OG = 100;                                     // Obergrenze
        int UG = 2;                                        // Untergrenze
        
        for (int i = UG; i <= OG; i++)                     // Beginn bei 2, läuft bis 2000, erhöht um 1
        {
            if ( i == 2 || i == 3 || i == 5 || i == 7 || i == 11 || i == 13 || i == 17 )    // Wenn Zahl 2, 3, 5, 7, 11, 13, 17
            {
                zaehler++;                                  // Erhoehe Zaehler um 1
                if ( zaehler % 5 != 0)                     // Wenn Zaehler nicht durch 10 Teilbar
                {
                    System.out.print(zaehler + ". " + i + "\t\t");             // Zahl ausgeben und Tabulator dranhaengen
                }
                else                
                {
                    System.out.println(zaehler + ". " + i + "\t\t");                  // Wenn Zaehler durch 10 Teilbar, dann gebe Zahl aus und Zeilenumbruch
                }
            }
            else
            {
                if ( i % 17 == 0 || i % 13 == 0 || i % 11 == 0 || i % 7 == 0 || i % 5 == 0 || i % 3 == 0 || i % 2 == 0) // Wenn Zahl teilbar durch 2, 3, 5, 7, 11, 13, 17
                {
                                                            // Dann tue nichts :D
                }
                else                        
                {
                    zaehler++;                              // Sonst erhoehe zaehler um 1
                    if (zaehler % 5 != 0)                  // Wenn Zaehler nicht durch 10 teilbar
                    {
                        System.out.print(zaehler + ". " + i + "\t\t");         // Zahl ausgeben und Tabulator dranhaengen
                    }
                    else
                    {
                        System.out.println(zaehler + ". " + i + "\t\t");              // Wenn Zaehler durch 10 Teilbar, dann gebe Zahl aus und Zeilenumbruch
                    }
                }

            }
        }
    }
    
}

