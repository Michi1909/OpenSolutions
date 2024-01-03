package KontoGirokontoSparkonto;

import java.time.LocalDate;

public class Sparkonto extends Konto {
    private String passwort;
    private LocalDate letzteueberweisung= LocalDate.now();
    private double monatlicherBetrag = 2000;
    public Sparkonto(double ktoStand){
       super(ktoStand);
    }
    @Override
    public void buche(double betrag){
        double kontostand= this.getKontostand();
        if (betrag < 0) {
            double monatlichCheck= this.monatlicherBetrag-betrag;
            if(monatlichCheck>0){
                this.monatlicherBetrag=monatlichCheck;
                LocalDate dateNow= LocalDate.now();
                LocalDate lastDate = letzteueberweisung;
                if(lastDate.getMonth()==dateNow.getMonth()){
                    double kontostandNew = kontostand-betrag;
                    if(kontostandNew>0) {
                        this.setKtoStandM(kontostandNew);
                        this.letzteueberweisung=LocalDate.now();
                    }else{
                        System.out.println("Der Kontostand wird bei der Auszahlung überzogen\n daher kann der Auftrag nicht ausgeführt werden!");
                    }
                }
            }else{
                System.out.println("Das monatliche Auszahlungsvolumen wurde Überschritten!");
            }
        }else if(betrag==0){
            System.out.println("Der Betrag ist null Euro, es gibt keine Veränderung!");
        }else{
            kontostand+=betrag;
            this.setKtoStandM(kontostand);
        }
    }
    @Override
    public String asString(){
        return "Sparkonto:\nKontonummer:"+ this.getKtoNr()+"\nKontostand:"+getKontostand()+"\nmtl. Ausgezahlter betrag Insgesamt bis heute:"+this.monatlicherBetrag+"\nLetzte Überweisung"+this.letzteueberweisung;
    }

    public void pruefePasswort(String p){

    }
}
