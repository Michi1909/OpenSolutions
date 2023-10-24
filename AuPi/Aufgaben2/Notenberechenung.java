import java.util.Scanner;

public class Notenberechenung {

    public static void main(String[] args ){

        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte die Punkteanzahl des Studenten eingeben!:");
        double punkte = sc.nextDouble();
        double note = berechneNoten(punkte);
        System.out.println("Die Note ist hiermit: "+ note);
    }

    public static double berechneNoten(double punkte){
            if (punkte >= 105) return 1.0;
            else if (punkte >= 100) return 1.3;
            else if (punkte >= 95) return 1.7;
            else if (punkte >= 90) return 2.0;
            else if (punkte >= 85) return 2.3;
            else if (punkte >= 80) return 2.7;
            else if (punkte >= 75) return 3.0;
            else if (punkte >= 70) return 3.3;
            else if (punkte >= 65) return 3.7;
            else if (punkte >= 60) return 4.0;
            else if (punkte >= 50) return 4.7;
            else return 5.0;
    }
}
