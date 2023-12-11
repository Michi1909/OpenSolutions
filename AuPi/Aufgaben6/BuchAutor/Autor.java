package BuchAutor;

public class Autor {
    private String vorname;
    private String nachname;
    private Datum geborenAm;
    Autor(String vName, String nName, Datum gebDatum){
        this.vorname = vName;
        this.nachname = nName;
        this.geborenAm = gebDatum;
    }
    String getVorname(){
        return this.vorname;
    }
    String getNachname(){
        return this.nachname;
    }
    Datum getGeborenAm(){
        return new Datum(this.geborenAm);
    }
    String asString(){
        return "Autor: "+ this.getVorname()+", "+this.getNachname()+" geboren am: "+ this.getGeborenAm();
    }
}
