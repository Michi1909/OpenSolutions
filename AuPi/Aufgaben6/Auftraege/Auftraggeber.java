package Auftraege;

public class Auftraggeber {
    private String firmenname;
    private AuftragsContainer aktuelleAuftraege = new AuftragsContainer();
    private double auftragsvolumen = 0;
    public Auftraggeber(String firmenname){
        this.firmenname=firmenname;
    }
    public void erteiltAuftrag(Auftrag auftrag){
        this.aktuelleAuftraege.auftragHinzufuegen(auftrag);
    }
    public void nimmtAuftrag(Auftrag auftrag){
        this.aktuelleAuftraege.auftragEntfernen(auftrag);
    }
    public double gibAuftragsvolumen(){
        return auftragsvolumen;
    }
    public String asString(){
        return "Firmenname des Auftragsgeber ist: "+firmenname+aktuelleAuftraege.asString();
    }
}
