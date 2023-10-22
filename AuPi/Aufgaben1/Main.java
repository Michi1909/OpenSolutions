import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //-----Propädeutikum----------
       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte eine gerade, ganze Zahl eingeben:");
        int eingabe= scanner.nextInt();
        int ausgabe= Gaußformel.berechneGaussFormel(eingabe);
        System.out.println(ausgabe);*/

        //------LE1----------------
        LE1.berechneProdukt();
        LE1.vertauscheVariablen();
        System.out.println("Bitte geben Sie die Fahrenheit ein:");
        double fahrenheit = sc.nextDouble();
        System.out.println("Die Fahrenheit "+fahrenheit+" ist umgerechnet in Celsius: "+LE1.temperaturUmrechnen(fahrenheit));
        LE1.ausgabeUeberpruefen();
        LE1.checkAusgabe();
    }
}