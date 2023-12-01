package Aufgabe5Konto;
public class Konto {
    private final long basisKtoNr= 100000000;
    private static int anzahlKto=1;
    private long ktoNr;
    private double ktoStandM = 0.0;
    private double dispoLimit = 1000.0;
    public Konto(){
        this(0,500);
    }
    public Konto(double ktoStand, double dispoLimit){
        this.ktoStandM=ktoStand;
        this.dispoLimit=dispoLimit;
        this.ktoNr= basisKtoNr+anzahlKto;
        anzahlKto++;
    }
    long getKtoNr(){
        return ktoNr;
    }
    double getDispoLimit(){
        return this.dispoLimit;
    }
    int getAnzahlKto(){
        return anzahlKto;
    }
    double getKtoStandM(){
        return this.ktoStandM;
    }
    boolean sicheresAuszahlen(double betrag){

        double betragErg = this.ktoStandM-betrag;

        if(betragErg>=-this.getDispoLimit()){
            this.auszahlen(betrag);
            return true;
        }
        return false;

    }
    boolean sicheresUeberweisen(Konto ktoNr, double betrag){

        if(this.sicheresAuszahlen(betrag)){
            ktoNr.einzahlen(betrag);
            return true;
        }
        return false;
    }
    void einzahlen(double betrag){
        this.ktoStandM+=betrag;
    }
   private void auszahlen(double betrag){
        this.ktoStandM-=betrag;
    }
    void setDispoLimit(double dispoLimit){
        this.dispoLimit=dispoLimit;
    }
    String asString(){
        return "Das Konto mit der Kontonr.: "+this.getKtoNr()+" hat einen Kontostand von: "+ this.getKtoStandM()+ " und einen Dispolimit von: "+this.getDispoLimit();
    }

}

