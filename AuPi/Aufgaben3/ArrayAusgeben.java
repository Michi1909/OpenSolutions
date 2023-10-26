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
    /**
     * Mischt zwei aufsteigend sortierte Felder in einem neuen, ebenfalls aufsteigend sortierten Feld.
     *
     * @param a Das erste aufsteigend sortierte Feld.
     * @param b Das zweite aufsteigend sortierte Feld.
     * @return Ein neues Feld, das die Werte von a und b in aufsteigender Reihenfolge enthält.
     */
    public static int[] mischen(int[] a, int[] b) {
        // Neues Feld erstellen, das groß genug ist, um alle Werte von a und b zu speichern
        int[] gemischt = new int[a.length + b.length];

        int indexA = 0;  // Index zum Durchlaufen des Feldes a
        int indexB = 0;  // Index zum Durchlaufen des Feldes b
        int indexGemischt = 0;  // Index zum Einfügen von Werten in das gemischte Feld

        // Solange noch Werte in beiden Feldern vorhanden sind
        while (indexA < a.length && indexB < b.length) {
            // Wenn der aktuelle Wert in a kleiner oder gleich dem aktuellen Wert in b ist
            if (a[indexA] <= b[indexB]) {
                gemischt[indexGemischt] = a[indexA];  // Füge den Wert von a zum gemischten Feld hinzu
                indexA++;  // Gehe zum nächsten Wert in a
            } else {
                gemischt[indexGemischt] = b[indexB];  // Füge den Wert von b zum gemischten Feld hinzu
                indexB++;  // Gehe zum nächsten Wert in b
            }
            indexGemischt++;  // Gehe zum nächsten freien Platz im gemischten Feld
        }

        // Falls es noch verbleibende Elemente im Array a gibt, füge sie zum Ergebnis hinzu
        while (indexA < a.length) {
            gemischt[indexGemischt] = a[indexA];
            indexA++;
            indexGemischt++;
        }

        // Falls es noch verbleibende Elemente im Array b gibt, füge sie zum Ergebnis hinzu
        while (indexB < b.length) {
            gemischt[indexGemischt] = b[indexB];
            indexB++;
            indexGemischt++;
        }

        return gemischt;
    }

}
