package Auftraege;

public class Auftrag {
    private int nummer;
    String grund;
    int stundenAnzahl;
    double stundenSatz;
    double auftragVolumen;
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
        return "\nAuftrasnummer ist: "+nummer+"\nStundenanzahl ist: "+ stundenAnzahl+ "\nStundensatz ist: "+stundenSatz+"\nDas Auftragsvolumen ist: "+auftragVolumen;
    }

}
