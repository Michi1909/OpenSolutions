package KFZAufgabe;
public class Kfz{
    private String kennzeichen, modell;
    int kmStand;
    private long vermietetAn = -1;
    private static long anzahlKfz;
    private static long alleVermietungen;
    private long meineVermietungen;

    // Kundennummer des Kunden, an den das
    // Kfz vermietet ist; -1 = unvermietet
    Kfz(String kennzeichen, String modell)
    {
        this.kennzeichen = kennzeichen;
        this.modell = modell;
        this.anzahlKfz+=1;
    }
    boolean vermietenAn (long eineKundenNummer)
    {
        if (vermietetAn == -1)
        {
            vermietetAn = eineKundenNummer;
            this.alleVermietungen++;
            this.meineVermietungen++;
            return true;
        } else return false;
    }
    void zurueckgeben()
    {
        vermietetAn = -1;
    }
    public long getAnzahlKfz(){return this.anzahlKfz;}
    public long getAlleVermietungen(){return this.alleVermietungen;}
    public  long getMeineVermietungen(){return this.meineVermietungen;}

}
