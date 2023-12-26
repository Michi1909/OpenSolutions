package Auftraege;

public class Auftraggeber {
    private String firmenname;
    /*
    Ein Objekt der Klasse Auftraggeber verwaltet
    seine Aufträge mithilfe eines Objekts der Klasse
    AuftragsContainer.
     */
    private AuftragsContainer aktuelleAuftraege = new AuftragsContainer();
    private double auftragsvolumen = 0;
    public Auftraggeber(String firmenname){
        this.firmenname=firmenname;
    }
    public void erteiltAuftrag(Auftrag auftrag){
        /*
        Erteilt ein Auftraggeber dem Unternehmen einen Auftrag,
        so wird dieser zu dem AuftragsContainer des Auftraggebers hinzugefügt.
        Ein Objekt der Klasse Auftraggeber hat genau einen AuftragsContainer.
         */
        this.aktuelleAuftraege.auftragHinzufuegen(auftrag);
    }
    public void nimmtAuftrag(Auftrag auftrag){
        /*
        Nimmt der Auftraggeber einen Auftrag ab, so wird dieser aus
        seinem AuftragsContainer entfernt.
         */
        this.aktuelleAuftraege.auftragEntfernen(auftrag);
    }
    public double gibAuftragsvolumen(){
        return this.auftragsvolumen;
    }
    public String getFirmenname(){
        return this.firmenname;
    }
    public String asString(){
        return "Firmenname des Auftragsgeber ist: "+getFirmenname()+aktuelleAuftraege.asString();
    }
}
