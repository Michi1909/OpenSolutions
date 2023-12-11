package BuchAutor;

public class BuchMitAutorTest {
    public static void main(String[]args){

        // Erzeugen von Autoren
        // das Geburtsdatum wird jeweils direkt als Argument erzeugt und
        // ist somit unabhaengig vom Exemplar des Autors nicht referenzierbar
        Autor hBalzert = new Autor("Helmut", "Balzert", Datum.erstelleDatum (4, 2, 1950));
        Autor iNoll = new Autor("Ingrid", "Noll", Datum.erstelleDatum(29, 9, 1935));

        // Erzeugen von Buechern mit Autoren
        // da die Autoren als eigenstaendige Objekte modelliert und referenzierbar sind,
        // koennen sie ihren jeweiligen Buechern als Autor zugeordnet werden
        Buch b1 = new Buch (hBalzert, "Grundlagen der Informatik","3-8274-1410-5");
        System.out.println(b1.getBuchAsString());

        // Copy-Konstruktor - Ein zweites Exemplar des Buchs "Grundlagen der Informatik" fuer den Bestand
        Buch b2 = new Buch(b1);
        System.out.println("\nAusgabe der Kopie:\n"+ b2.getBuchAsString());
        System.out.println();

        // Buecher der zweiten Autorin
        Buch b3 = new Buch (iNoll, "Die Apothekerin", "3-257-06017-3");
        System.out.println(b3.getBuchAsString());
        System.out.println();

        Buch b4 = new Buch (iNoll, "Rabenbrueder", "3-257-06356-3");
        System.out.println(b4.getBuchAsString());
        System.out.println();

        // Teilaufgabe b)
        // Setzen des Erscheinungsdatum 1.8.1994 fuer das Buch b3
        // und anschließende Ausgabe des Buchs b3 gemaess folgendem Format:
        // Das Buch <titel> von Autor <vorname nachname>
        // ist am <erscheinungsDatum> (<Wochentag dieses Datum) erschienen
        b3.setErscheinungsdatum(1,8,1994);
        System.out.println(b3.getBuchAsString());
    }
}
