package Aufgabe5Konto;

public class KontoTest {
    public static void main(String[]args){
        Konto ella = new Konto();
        Konto dennis = new Konto(2500,500);

        ella.einzahlen(2500);
        ella.sicheresAuszahlen(500);
        ella.sicheresUeberweisen(dennis,500);
        System.out.println(ella.asString());

        dennis.einzahlen(2500);
        dennis.sicheresAuszahlen(500);
        dennis.sicheresUeberweisen(ella,500);
        System.out.println(dennis.asString());
        
    }
}
