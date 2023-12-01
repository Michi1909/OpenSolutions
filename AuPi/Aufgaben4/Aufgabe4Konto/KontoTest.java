package Aufgabe4Konto;

public class KontoTest {
    public static void main(String[]args){
        Konto ella = new Konto(123456,5000.0,1000.0);
        Konto basel = new Konto(234567,6000.0,1000.0);
        Konto test = new Konto(345678,2000.0,500);
        System.out.println(ella.asString());
        System.out.println(basel.asString());
        System.out.println(test.asString());
        ella.sicheresUeberweisen(basel,6000.0);
        test.sicheresUeberweisen(basel,3000);
        basel.sicheresUeberweisen(test,1500);
        System.out.println();
        System.out.println(ella.asString());
        System.out.println(basel.asString());
        System.out.println(test.asString());

    }
}
