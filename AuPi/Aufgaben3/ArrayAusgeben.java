public class ArrayAusgeben {
    public static void main(String[] args){
        int[] feld1 = {-10, 0, 10, 20};
        int[] feld2 = {-15, 6, 10, 30};
        ausgabe(feld1);
        System.out.println("");
        int[] arrayNeu = mischen(feld1,feld2);
        ausgabe(arrayNeu);
    }
    public static void ausgabe(int[]feld){
        for(int i=0;i<feld.length;i++){
            System.out.print(feld[i]+" ");
        }
    }

    public static int[] mischen(int[] a, int[] b) { // fuer das Ergebnis benötigt man ein Feld, in das die Elemene beider Felder hineinpassen
        int[] ergebnis = new int[a.length + b.length];
        // Um festzustellen, welches Element das kleinste ist,
        // muss man die beiden ersten Elemente der beiden Felder vergleichen.
        // Man startet also mit den Elementen an der Index position 0,
        // und 'merkt' sich diese in den Variabel iA bzw. iB.
        // Wurde eine Element aus a oder b in das Ergebnisfeld kopiert,
        // muss man fuer dieses Feld das naechste Element betrachten, also
        // den entsprechenden Index (iA bzw. iB) um 1 erhöhen
        // Zwei Sonderfälle: Ist eines der Felder a oder b schon ganz abgearbeitet,
        // braucht man nicht mehr zu vergleichen und die restlichen Elemente des anderen Felds
        // koennen direkt das Ergebnisfeld kopiert werden

        int iA = 0; // zu behandelnder Index fuer Feld a
        int iB = 0; // zu behandelnder Index fuer Feld b
        for (int i = 0; i < a.length + b.length; i++)
        // i steht fuer die Position im Feld ergebnis, fuer die der nun einzufuegende Wert bestimmt werden muss
        {
            if (iA >= a.length) // 1. Sonderfall: Feld a ist schon leer, nur b-Werte kommt infrage
            {
                ergebnis[i] = b[iB];
                iB++;
            } else if (iB >= b.length) // 2. Sonderfall: Feld b ist schon leer, nur a-Werte kommen infrage
            {
                ergebnis[i] = a[iA];
                iA++;
            } else if (a[iA] < b[iB]) // a-Wert kleiner b-Wert
            {
                ergebnis[i] = a[iA];
                iA++;
            } else {
                ergebnis[i] = b[iB]; // b-Wert kleiner oder gleich a-Wert
                iB++;
            }
        }
        return ergebnis;
    }

}
