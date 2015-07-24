/*
    
    Aufgabe 11 / Woche 1 / JAV1

    Zinsrechnung ohne Potenzrechnung

 */

package Woche1;

// Scanner für Tastatureingaben importierren
import java.util.Scanner;

/**
 *
 * @author w4s1m0t0
 */

public class Aufgabe_2307_1_11 {

    public static void main(String[] args) {

        // Scanner erzeugen
        Scanner sc = new Scanner(System.in);
        
        // Variablendeklaration und Init
         int STARTJAHR = 1;
         double N = 2015.4;
         double ANFANG = 0.01;
         double ende;
         double ZINS = 2.5;
         double ZINSSATZ = ZINS / 100;
         int i = 2;
         
         // Zinsberechnung:
         // k0 * (1 + i)^n
         // ende = ANFANG * ( 1 + i ) * ( 1 + i )
        
        // ende = ANFANG;
        ende = ANFANG * (1 + ZINSSATZ);
               
        for ( ; i <= N && ende < 1000000 ; i++ )
        {
            ende *= (1 + ZINSSATZ);
        }
        System.out.println("Nach " + i + " Jahren haben Sie " + ende + " auf Ihrem Konto.");
    }

}

