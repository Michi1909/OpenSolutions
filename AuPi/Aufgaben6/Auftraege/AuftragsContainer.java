package Auftraege;

public class AuftragsContainer {
    private int anzahlAuftraege=0;
    private Auftrag[] auftraege = new Auftrag[2];
    public int gibAnzahlAuftraege(){
        return anzahlAuftraege;
    }
    public void auftragHinzufuegen(Auftrag auftrag){

        if (anzahlAuftraege == auftraege.length)
        {
            containerVergroessern();
        }

            auftraege[anzahlAuftraege] = auftrag;
            anzahlAuftraege++;

    }
    public void auftragEntfernen(Auftrag a){
        //for(int i=0; i < auftraege.length;i++){
        int position = sucheAuftrag(a);
            if(auftraege[position]==a){
                auftraege[position]=null;
                anzahlAuftraege--;
            }
        //}
    }
    private void containerVergroessern(){
        Auftrag[] auftraegeMehr = new Auftrag[auftraege.length * 2];
        System.arraycopy(auftraege, 0, auftraegeMehr, 0, auftraege.length);
        // altes Feld ersetzen
        auftraege = auftraegeMehr;
    }
    public double gibAuftragsvolumen(){
        double volumen = 0;
        for (int i = 0; i < anzahlAuftraege; i++)
        {
            volumen = volumen + auftraege[i].gibAuftragsVolumen();
        }
        return volumen;
    }
    public double gibDurchschnittlichesAuftragsvolumen()
    {
        if (anzahlAuftraege != 0)
            return gibAuftragsvolumen() / anzahlAuftraege;
        return 0;
    }
    private int sucheAuftrag(Auftrag a){
        int position=0;
        boolean tmp=true;
        int i =0;
        while(tmp){
            if(auftraege[i]==a){
                position=i;
                tmp=false;
            }
            i++;
        }
        return position;
    }
    public String asString(){
        String str = "";
        for(int i=0;i<anzahlAuftraege;i++){
            str += auftraege[i].asString();
        }
        return str;
    }
}
