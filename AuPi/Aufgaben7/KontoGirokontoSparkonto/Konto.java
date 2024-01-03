package KontoGirokontoSparkonto;
public abstract class Konto {
    private long kontoNr;
    private final long basisKtoNr= 100000000;
    private double ktoStandM = 0.0;
    private static int anzahlKto=1;
    public Konto(double ktoStandM){
        this.ktoStandM=ktoStandM;
        this.kontoNr= basisKtoNr+anzahlKto;
        anzahlKto++;
    }
    public double getKontostand(){
        return ktoStandM;
    }
    public void setKtoStandM(double betrag){
        this.ktoStandM=betrag;
    }
    public void ueberweisen(double betrag, Konto konto){
        if(betrag>0){
            this.ktoStandM-=betrag;
            konto.setKtoStandM(betrag+konto.ktoStandM);
        }else{
            System.out.println("Überweisung ist nicht möglich,\nda es sich um einen negativen Betrag handelt!");
        }
    }
    long getKtoNr(){
        return kontoNr;
    }
    public abstract void buche(double betrag);
    public abstract String asString();

}
