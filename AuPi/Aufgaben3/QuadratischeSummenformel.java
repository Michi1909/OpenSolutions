import java.util.Scanner;

public class QuadratischeSummenformel {
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Gib eine ganze Zahl ein:");
            int zahl = sc.nextInt();
            int summe = berechneSummenformel(zahl);
            System.out.println("Die quadratische Summe der Zahl: "+zahl+" ist "+summe);

    }

    public static int berechneSummenformel(int zahl){
        int summe=1;
        int quadratSumme=0;
        for(int i=1; i<=zahl;i++){
            summe=i*i;
            quadratSumme+=summe;
        }
        return quadratSumme;
    }
}
