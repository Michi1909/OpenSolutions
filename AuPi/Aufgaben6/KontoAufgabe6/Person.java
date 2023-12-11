package KontoAufgabe6;

public class Person {
    private Konto[] konto = new Konto[5];
    private int anzkonten =0;

    public boolean addKonto(Konto konto){
        boolean eingefuegt= false;
        if(anzkonten<this.konto.length){
            this.konto[this.anzkonten]=konto;
            this.anzkonten++;
            eingefuegt=true;
        }
        return eingefuegt;
    }




}
