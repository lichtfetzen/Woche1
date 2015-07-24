/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Woche1;

// Scanner für Tastatureingaben importierren
import java.util.Scanner;

/**
 *
 * @author w4s1m0t0
 */

public class Aufgabe_2307_1_10 {

    public static void main(String[] args) {

        // Scanner erzeugen
        Scanner sc = new Scanner(System.in);
        
        // Variable initialisieren und deklarieren
        int zaehler = 0;                                // Zaehler für Ausgabe von 10 Zahlen je Zeile
        int OG;                                         // Obergrenze
        int UG;                                         // Untergrenze
        
        System.out.print("Bitte geben Sie die Obergrenze ein: ");
        OG = sc.nextInt();
        System.out.print("Bitte geben Sie die Untergrenze ein: ");
        UG = sc.nextInt();
        
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

