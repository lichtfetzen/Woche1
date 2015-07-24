/*

Formatierte Ausgabe mit Hilfe von FORMATDISKRIPTOREN

 */
package Woche1;

/**
 *
 * @author w4s1m0t0
 */
public class Beispiel_2307_2_Formatierte_Ausgabe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        char c = 'a';
        int a = 24;
        double x = -201.8047;
        String s = "ENDE";
        int laenge = 5;
        
        System.out.format("c = %-4c\n" + "TEST " + (int)a + " a = %-5d\nx = %14.3f\n\t%-20s\n", c, a, x, s);
        
    }
    
}
