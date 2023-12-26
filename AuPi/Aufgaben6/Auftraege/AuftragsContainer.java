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
        for(int i=0; i < auftraege.length;i++){
            if(auftraege[i]==a){
                auftraege[i]=null;
                anzahlAuftraege--;
            }
        }
    }
    private void containerVergroessern(){
        Auftrag[] auftraegeMehr = new Auftrag[auftraege.length * 2];
        System.arraycopy(auftraege, 0, auftraegeMehr, 0, auftraege.length);
        // altes Feld ersetzen
        auftraege = auftraegeMehr;
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
        return position-1;
    }
    public String asString(){
        String str = "";
        for(int i=0;i<anzahlAuftraege;i++){
            str += auftraege[i].asString();
        }
        return str;
    }
}
