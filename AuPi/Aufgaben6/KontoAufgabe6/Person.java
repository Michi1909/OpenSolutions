package KontoAufgabe6;

public class Person {
    private Konto[] konto = new Konto[5];
    private int anzkonten =0;

    public boolean addKonto(Konto konto){
        boolean eingefuegt= false;
        if(anzkonten<this.konto.length){
            for(int i = 0; i< this.konto.length;i++){
                if(this.konto[i]==null) {
                    this.konto[i] = konto;
                    this.anzkonten++;
                    eingefuegt = true;
                }
            }
        }
        return eingefuegt;
    }

    public Konto removeKonto(int pos)
    {
        Konto entferntesKonto = null;
        if (pos >= 0 && pos < anzkonten){
            entferntesKonto = konto[pos];
            konto[pos] = null;
            anzkonten--;
        }
        return entferntesKonto;
    }
    public int searchKonto(int eineKtoNr)
    {
        int pos = -1; // (noch) nichts gefunden
        int i = 0;
        while (i < anzkonten) {
            if (konto[i].getKtoNr() == eineKtoNr){
                pos = i; // Position merken
                i = anzkonten; // Abbruch erzwingen
            }else i++;
        }
        return pos;
    }

    public Konto getKonto(int pos)
    {
        Konto erg = null;
        if (pos >= 0 && pos < anzkonten && konto[pos]!=null)
            erg = konto[pos];
        return erg;
    }

}
