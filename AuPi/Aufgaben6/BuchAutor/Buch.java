package BuchAutor;

public class Buch
{
    // Instanzattribute
    private Autor autor;
    private String titel;
    private String isbnNummer;
    private int inventarnummer;
    Datum erscheinungsDatum;

    // Klassenattribute
    private static int naechsteInventarnummer = 112;

    // Konstruktoren
    // Konstruktor mit den 3 Parametern
    public Buch(Autor autor, String titel, String isbnNummer)
    {
        this.autor = autor;
        this.titel = titel;
        this.isbnNummer = isbnNummer;
        this.inventarnummer = Buch.getNaechsteInventarnummer();
    }

    // Konstruktor fuer ein Buch, von dem man nur den Titel kennt
    public Buch(String titel)
    {
        this(new Autor("","",new Datum(null)), titel, "ohne ISBN");
    }

    // Copy-Konstruktor
    public Buch(Buch einBuch)
    {
        this(einBuch.autor, einBuch.titel, einBuch.isbnNummer);
    }

    // Generatormethode
    public static Buch neuesBuchMitKorrekterISBN(Autor autor, String titel, String isbnNummer)
    {
        if (Buch.checkISBN(isbnNummer))
            return new Buch(autor, titel, isbnNummer);
        return null;
    }

    // Exemplarmethoden - Get-Methoden
    // Zurueckgeben des Autors
    public Autor getAutor()
    {
        return autor;
    }

    void setErscheinungsdatum(int tag, int monat, int jahr){
        this.erscheinungsDatum= Datum.erstelleDatum(tag,monat,jahr);
    }
    Datum getErscheinungsDatum(){
        return this.erscheinungsDatum;
    }
    // Zurueckgeben des Titles des Buches
    public String getTitel()
    {
        return titel;
    }

    // Zurueckgeben der ISBN-Nr
    public String getIsbnNummer()
    {
        return isbnNummer;
    }

    // Zurueckgeben der Inventarnummer
    public int getInventarnummer()
    {
        return inventarnummer;
    }

    // Die Methode zur Ausgabe aller Informationen zu einem Buch
    // ist bereits implementiert
    public String getBuchAsString()
    {
        return autor.asString() + ": " + titel + " (" + inventarnummer + ")" + " ISBN: "
                + isbnNummer;
    }

    // Klassenmethoden zur Pflege der Klassenattribute
    private static int getNaechsteInventarnummer()
    {
        int ergebnis = naechsteInventarnummer;
        naechsteInventarnummer = naechsteInventarnummer + 1;
        return ergebnis;
    }

    // Klassenmethode zum Ueberpruefen einer 10-stelligen ISBN
    private static boolean checkISBN(String originalISBN)
    {   // Bestimmen der Position des variablen Bindestrichs
        if (originalISBN.length() == 13)
        {
            int posStrich1 = originalISBN.indexOf("-"); // steht an pos 1 fix, koennte man also auch weglassen
            int posStrich2 = originalISBN.indexOf("-", posStrich1 + 1);

            // ISBN ohne Striche
            String reduzierteISBN = originalISBN.substring(0, posStrich1)
                    + originalISBN.substring(posStrich1 + 1, posStrich2)
                    + originalISBN.substring(posStrich2 + 1, 11);

            // Berechnung der Summe total
            // Koennte man auch gut ueber eine Schleife machen!
            // OHNE Fehlerbehandlung im Fall, dass keine Ziffer vorliegt
            int total = 10 * Integer.parseInt(reduzierteISBN.substring(0, 1)) +
                    9 * Integer.parseInt(reduzierteISBN.substring(1, 2)) +
                    8 * Integer.parseInt(reduzierteISBN.substring(2, 3)) +
                    7 * Integer.parseInt(reduzierteISBN.substring(3, 4)) +
                    6 * Integer.parseInt(reduzierteISBN.substring(4, 5)) +
                    5 * Integer.parseInt(reduzierteISBN.substring(5, 6)) +
                    4 * Integer.parseInt(reduzierteISBN.substring(6, 7)) +
                    3 * Integer.parseInt(reduzierteISBN.substring(7, 8)) +
                    2 * Integer.parseInt(reduzierteISBN.substring(8, 9));
            int pruefSumme = 10 - ((total - 1) % 11);

            // Bestimmen der in der ISBN-Nummer gegebenen Pruefsumme als Zeichen - wegen des mgl. X
            char originalCheckSumme = originalISBN.charAt(12);

            // Zum Abgleich: Entweder Umwandeln der errechneten Pruefsumme in ein Zeichen
            // oder Umwandeln der gegebenen Pruefsumme in eine Zahl

            // Zunaechst: Umwandeln der errechneten Pruefsumme in ein Zeichen
            final String ZIFFERN = "0123456789X";
            char errechneteCheckSumme = ZIFFERN.charAt(pruefSumme);
            // Vergleich der errechneten Pruefsumme als Zeichen mit der in der ISBN-Nummer gegebenen Pruefsumme
            return originalCheckSumme == errechneteCheckSumme;

            // Alternative: Umwandeln der gegebenen Pruefsumme in eine Zahl
            // int originalPruefsumme = 0;
            // if (originalCheckSumme == 'X')
            //    originalPruefsumme = 10;
            // else
            //   char [] x = {originalCheckSumme};
            //     originalPruefsumme = Integer.parseInt(new String(x));
            // }

            // Vergleich der errechneten Pruefsumme mit der in der ISBN-Nummer gegebenen Pruefsumme
            // return pruefSumme == originalPruefsumme;
        } else return false;
    }

}