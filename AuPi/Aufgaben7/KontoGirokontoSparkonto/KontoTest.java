package KontoGirokontoSparkonto;

public class KontoTest {
    public static void main(String[] args){
        Girokonto girokonto1 = new Girokonto(2500,500);
        Sparkonto sparkonto1 = new Sparkonto(5000);
        Girokonto girokonto2 = new Girokonto(3000,200);
        Sparkonto sparkonto2 = new Sparkonto(200);
        bareinzahlung(girokonto1,1200);
        bareinzahlung(sparkonto1,-200);

        System.out.println(sparkonto1.asString());

    }
    public static void bareinzahlung(Konto einKonto, double einBetrag){
        if(einBetrag>0){
            einKonto.buche(einBetrag);
        }else{
            System.out.println("Der Betrag der Einzahlung ist kleiner oder gleich null \n und kann daher nicht ausgeführt werden!");
        }
    }

}
