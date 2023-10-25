import java.util.Scanner;

public class HarshadZahl {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Gibt eine ganze Zahl ein:");
        int number = sc.nextInt();
        int summe = querSummeBerechnen(number);
        System.out.println("Die Quersummer der Zahl "+number+" ist: "+summe);
        for(int i=1;i<=100;i++) {
            int quersumme = querSummeBerechnen(i);
            if (quersumme!=0 && i % quersumme == 0) {
                System.out.println("Die Zahl " + i + " ist eine Harshad-Zahl. ");
            } else {
                System.out.println("Die Zahl " + i + " ist keine Harshad-Zahl. ");
            }
        }
    }

    public static int querSummeBerechnen(int zahl){
        int querSumme=0;
        while(zahl>0){
            querSumme+=zahl%10;
            zahl/=10;
        }
        return querSumme;
    }
}
