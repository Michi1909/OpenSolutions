package Auftraege;

public class Auftrag {
    private int nummer;
    private String grund;
    private int stundenAnzahl;
    private double stundenSatz;
    private double auftragVolumen;
    public Auftrag(int auftragsnummer,String grund, int stundenAnzahl, double stundenSatz, double auftragVolumen){
        this.nummer=auftragsnummer;
        this.grund=grund;
        this.stundenAnzahl=stundenAnzahl;
        this.stundenSatz=stundenSatz;
        this.auftragVolumen=auftragVolumen;
    }
    public int gibStundenanzahl(){
        return this.stundenAnzahl;
    }
    public double gibStundensatz(){
        return this.stundenSatz;
    }
    public double gibAuftragsVolumen() {
        return this.auftragVolumen;
    }
    public String asString(){
        return "\nAuftragsnummer ist: "+nummer+"\nStundenanzahl ist: "+ stundenAnzahl+ "\nStundensatz ist: "+stundenSatz+"\nDas Auftragsvolumen ist: "+auftragVolumen;
    }

}
