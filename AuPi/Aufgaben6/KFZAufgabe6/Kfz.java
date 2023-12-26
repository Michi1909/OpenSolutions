package KFZAufgabe6;
public class Kfz{
    private String kennzeichen, modell;
    int kmStand;
    private Kunde vermietetAn;
    private static long anzahlKfz;
    private static long alleVermietungen;
    private long meineVermietungen;
    Kfz(String kennzeichen, String modell)
    {
        this.kennzeichen = kennzeichen;
        this.modell = modell;
        this.anzahlKfz+=1;
    }
    boolean vermietenAn (Kunde mieter)
    {
        if (vermietetAn == null)
        {
            this.setMieter(mieter);
            this.alleVermietungen++;
            this.meineVermietungen++;
            return true;
        } else return false;
    }
    private void setMieter(Kunde einMieter)
    {
        // Sicherstellen, dass der Empfaenger noch
        // nicht verliehen ist
        if (vermietetAn == null)
            this.vermietetAn = einMieter;
    }
    void zurueckgeben(){vermietetAn = null;}
    public long getAnzahlKfz(){return this.anzahlKfz;}
    public long getAlleVermietungen(){return this.alleVermietungen;}
    public  long getMeineVermietungen(){return this.meineVermietungen;}
    public String getModell(){
        return this.modell;
    }
    public String getKennzeichen(){
        return this.kennzeichen;
    }
    public String getKunde(){
        if(vermietetAn!=null){
        return this.vermietetAn.asString();
        }
        return "Fahrzeug aktuell nicht vermietet!";
    }
    public String asString(){
        return "Dieses Kfz wurde " + this.getMeineVermietungen()+"-mal gemietet!\nDas Modell ist: "+ getModell()+" & das Kennzeichen ist: "+getKennzeichen()+"\nMieter des Fahrzeugs ist: \n"+getKunde();
    }


}
