package Buch;

public class Buch {
    private String autor;
    private String titel;
    private String isbnNummer;
    private int inventarNummer;
    private static int naechsteInventarNummer;

    Buch(Buch buch){
        this.autor= buch.autor;
        this.titel= buch.titel;
        this.isbnNummer= buch.isbnNummer;
        this.inventarNummer=buch.inventarNummer;
    }
    Buch(String titel){
        this("",titel,"");
    }
    private Buch(String autor, String titel, String isbnNummer){
        this.autor=autor;
        this.titel=titel;
        this.isbnNummer=isbnNummer;
        inventarNummer++;
        naechsteInventarNummer=inventarNummer+1;

    }
    static Buch neuesBuchMitKorrekterISBN(String autor,String titel, String isbnNummer){
        if(checkISBN(isbnNummer)){
            return new Buch(autor, titel, isbnNummer);
        }else return null;
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
    int getInventarnummer(){
        return this.inventarNummer;
    }
    String asString(){
        return "Titel: "+titel+", Autor: "+autor+", ISBN: "+isbnNummer+", Inventarnummer: "+inventarNummer+", Naechste Inventarnummer: "+getNaechsteInventarnummer()+"\n";
    }
    private static int getNaechsteInventarnummer(){
        return naechsteInventarNummer;
    }
    private static boolean checkISBN(String originalISBN)
    {   // Bestimmen der Position des variablen Bindestrichs
        if (originalISBN.length() == 13)
        {
            int posStrich1 = originalISBN.indexOf("-"); // steht an pos 1 fix, koennte man also auch weglassen
            int posStrich2 = originalISBN.indexOf("-", posStrich1 + 1);

            // ISBN ohne Striche (=reduzierte ISBN)
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
