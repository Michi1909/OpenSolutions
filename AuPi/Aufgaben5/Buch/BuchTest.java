package Buch;

public class BuchTest
{
    private static void ueberpruefenDerBucherzeugung(Buch b, String titel)
    {
        if (b != null)
            System.out.println(b.asString());
        else
            System.out.println("Das Buch \"" + titel +"\" konnte nicht erzeugt werden.");
    }

    public static void main(String[] args)
    {
        // Konstruktor mit allen Eigenschaften
        Buch b1 = Buch.neuesBuchMitKorrekterISBN ("Balzert", "Grundlagen der Informatik","3-8274-1410-5");
        System.out.println(b1.asString());
        System.out.println();
        System.out.println("Zweite Ausgabe des ersten Exemplars:\n" + b1.getAutor() + ": " + b1.getTitel() + " (" + b1.getInventarnummer() + ") ISBN: " + b1.getIsbnNummer());
        System.out.println();

        // copy-Konstruktor - Ein zweites Exemplar des Buchs "Grundlagen der Informatik" fuer den Bestand
        Buch b2 = new Buch(b1);
        System.out.println("Ausgabe der Kopie:\n"+ b2.asString());
        System.out.println();
        // Ein Buch, von dem man nur den Titel kennt
        Buch b3 = new Buch ("Die Apothekerin");
        System.out.println(b3.asString());
        System.out.println();

        Buch b4 = Buch.neuesBuchMitKorrekterISBN("Tanenbaum", "Computernetzwerke", "3-8273-7011-6");
        ueberpruefenDerBucherzeugung(b4, "Computernetzwerke");
        System.out.println();

        // Ein Beispiel fuer eine falsche Inventarnummer
        Buch b5 = Buch.neuesBuchMitKorrekterISBN("Noll", "Die Apothekerin", "3-8273-7011-X");
        ueberpruefenDerBucherzeugung(b5, "Die Apothekerin");
        System.out.println();

        Buch b6 = Buch.neuesBuchMitKorrekterISBN("Niemand", "Buch ohne Titel aber mit schoener ISBN", "3-540-40418-X");
        ueberpruefenDerBucherzeugung(b6, "Buch ohne Titel aber mit schoener ISBN");
        System.out.println();

        Buch b7 = Buch.neuesBuchMitKorrekterISBN("N.N.", "Zu kurzer ISBN", "3-540-404");
        ueberpruefenDerBucherzeugung(b7, "Buch mit zu kurzer ISBN");
        System.out.println();
    }
}
