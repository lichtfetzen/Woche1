/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Woche1;
import java.util.Scanner;           // Scanner zum einlesen von Eingaben importieren

/**
 *
 * @author wasimoto
 */
public class Aufgabe_2107_1_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Variablendeklaration
        
        int zahl;
        int stunden;
        int minuten;
        int sekunden;
        int rest;
        
        // Ausgabe
        
        System.out.println("Anzahl Sekunden eingeben:");
        
        // Eingabeaufforderung
        
        zahl = sc.nextInt();
        
        // Umwandlung in Stunden, Minuten und Sekunden
        
        stunden = zahl / 3600;
        rest = zahl % 3600;
        minuten = rest / 60;
        sekunden = rest % 60;
        
        // Ausgabe des Ergebnisses
        
        System.out.println(zahl + " Sekunden enstsprechen: " + stunden + " Stunden, " + minuten + " Minuten und " + sekunden + " Sekunden.");
    }
    
}
