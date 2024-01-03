package EqualsUeberschreiben;

public class Konto extends Object {
    private long kontonummer;
    @Override
    public boolean equals(Object einObject){
        Konto einKonto = (Konto) einObject;
        return (this.kontonummer == einKonto.kontonummer);
    }
}
