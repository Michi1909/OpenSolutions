import java.util.Scanner;

public class Geldanlage {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte geben Sie ihr Kaptial an:");
        double anlagebetrag = sc.nextDouble();
        System.out.println(
                "--------------------------------------------------------------------\n" +
                "1 1,5 % Verzinsung ohne Bonuszahlung\n" +
                "2 0,7 % Verzinsung mit 15 Euro Bonuszahlung\n" +
                "3 0,4 % Verzinsung mit 20 Euro Bonuszahlung\n" +
                "4 0,1 % Verzinsung mit 50 Euro Bonuszahlung\n" +
                "5 Fertig");
        while(true){
            int auswahl = sc.nextInt();

            switch (auswahl){
                case 1 :  System.out.println(berechneKapital(0.015,0,anlagebetrag,1));
                    break;
                case 2 :  System.out.println(berechneKapital(0.007,15,anlagebetrag,2));
                    break;
                case 3 :  System.out.println(berechneKapital(0.004,20,anlagebetrag,3));
                    break;
                case 4 :  System.out.println(berechneKapital(0.001,50,anlagebetrag,4));
                    break;
                case 5 :  System.out.println("Bis zum nächsten Mal!");
                    //das Programm beendet bei Auswahl 5 durch return
                    return;
                default:  System.out.println("Bitte wählen Sie eine Auswahl zwischen 1 - 5 aus!");

            }
        }
    }
    public static double berechneKapital(double zinssatz, int bonus, double anlagebetrag, int laufzeit){
        double kapital= anlagebetrag;
        double zins=1;
        for(int i=0; i<laufzeit;i++){
            zins = zins*(1+zinssatz);
        }
        return (kapital*zins)+bonus;
    }
}
