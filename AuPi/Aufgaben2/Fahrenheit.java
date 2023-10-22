import java.util.Scanner;

public class Fahrenheit {

    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        boolean tmp= true;
        do{
            int celsiusIn;
            double fahrenheit;
            System.out.println("Bitte auswählen:\n" +
                    "1. Fahrenheit berechnen\n" +
                    "0. Programm beenden");

            int auswahl = myScanner.nextInt();

            switch (auswahl){
                case 1:     System.out.print("\nEingabe Temperaturwert in Grad Celsius (ganze Zahl): ");
                            celsiusIn = myScanner.nextInt();
                            fahrenheit = berechneFahrenheit(celsiusIn);
                            System.out.println(celsiusIn + " Grad Celsius entspricht " + fahrenheit + " Fahrenheit.\n");
                            break;

                case 0:     System.out.println("Das Programm wird beendet!\n Bis zum nächsten Mal!");
                            tmp=false;
                            break;

                default:    System.out.println("Bitte wähle eine passende Auswahl 1 oder 2 aus!\n");
                            continue;
            }
        }while(tmp);
    }

    public static double berechneFahrenheit(int celsiusIn) {
        double fahrenheit= celsiusIn * 1.8 + 32;
        return fahrenheit;
    }
}
