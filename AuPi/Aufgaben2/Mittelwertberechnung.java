import java.util.Scanner;

public class Mittelwertberechnung {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
       // Aufgabe 2 a)
        //Aufgabe 2 b)
       while(true){
           System.out.println(" Möchten Sie den Mittelwert berechnen?\n Bitte wählen Sie aus:\n 1. Mittelwert berechnen\n 2. Programm beenden");
           int auswahl = myScanner.nextInt();

           switch (auswahl){
               case 1 :  System.out.println("Mittelwertberechnung");
                         System.out.println("\nErste ganze Zahl eingeben:");
                         int a = myScanner.nextInt();
                         System.out.println("Zweite ganze Zahl eingeben:");
                         int b = myScanner.nextInt();
                         System.out.println("Dritte ganze Zahl eingeben:");
                         int c = myScanner.nextInt();
                         double mittelwert = mittelwertberechnung(a,b,c);
                         System.out.println("\nDer Mittelwert ist: " + mittelwert);
                         break;
               case 2 :  System.out.println("Bis zum nächsten Mal!");
                         //Aufgabe 2 c) das Programm beendet bei Auswahl 2 durch return
                         return;
               default:  System.out.println("Bitte wählen Sie 1 oder 2 aus!");

           }
       }
    }

    public static double mittelwertberechnung(int a, int b, int c){
        double mittelwert;
        return mittelwert = (a + b + c)/3.0;

    }
}
