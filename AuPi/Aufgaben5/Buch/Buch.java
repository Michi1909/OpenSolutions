package Buch;

public class Buch {
    private String autor;
    private String titel;
    private String isbnNummer;
    private int inventarNummer;
    private final static int naechsteInventarnummer = 0;
    private Buch(String autor, String titel, String isbnNummer){
        this.autor = autor;
        this.titel = titel;
        this.isbnNummer=isbnNummer;
    }
    Buch(String titel){
        this("",titel,"");
    }
    Buch(Buch buch){

    }
    static Buch neuesBuchmitKorrekterISBN(String autor, String titel, String isbnNummer){
        return new Buch("","","");
    }
    String getAutor(){
        return this.autor;
    }
    String getTitel(){
        return this.titel;
    }
    String getIsbnNummer(){
        return this.isbnNummer;
    }
    int getInventarNummer(){
        return this.inventarNummer;
    }
    String asString(){
        return "";
    }
    private int getNaechsteInventarnummer(){
        return 1;
    }
    private boolean checkISBN(String isbnNummer){}
}
