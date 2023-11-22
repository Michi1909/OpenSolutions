package KFZAufgabe;
public class Kfz{
    private String kennzeichen, modell;
    int kmStand;
    private long vermietetAn = -1;

    // Kundennummer des Kunden, an den das
    // Kfz vermietet ist; -1 = unvermietet
    Kfz(String kennzeichen, String modell)
    {
        this.kennzeichen = kennzeichen;
        this.modell = modell;
    }
    boolean vermietenAn (long eineKundenNummer)
    {
        if (vermietetAn == -1)
        {
            vermietetAn = eineKundenNummer;
            return true;
        } else return false;
    }
    void zurueckgeben()
    {
        vermietetAn = -1;
    }
}
