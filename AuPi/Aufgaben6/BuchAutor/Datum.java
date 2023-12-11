package BuchAutor;


public class Datum
{
    // Beschreibung des Zustands
    private int tag;
    private int monat;
    private int jahr;

    // Konstruktor mit Parametern
    private Datum (int tt, int mm, int yy)
    {   tag = tt;
        monat = mm;
        jahr = yy;
    }

    // Copy-Konstruktor
    public Datum(Datum d)
    {
        this.tag = d.tag;
        this.monat = d.monat;
        this.jahr = d.jahr;
    }

    // Generatormethode
    public static Datum erstelleDatum(int tt, int mm, int jjjj)
    {  if (Datum.checkDat(tt, mm, jjjj))
        return new Datum(tt, mm, jjjj);
    else
        return null;
    }

    // getter
    public int getTag()
    {
        return this.tag;
    }
    public int getMonat()
    {
        return this.monat;
    }
    public int getJahr()
    {
        return this.jahr;
    }

    // Objektmetohde
    // liefert den Wochentag zu einem Datum zurück
    public String wochentag()// vgl. LE1, Loesung zu Aufgabe 5.7
    {
        String wtStr = null; // zu berechnender Rueckgabewert
        // Exemplarattribute ersetzen nun die Eingabe
        int t = tag;
        int m = monat;
        // Jahrhundert und Jahreszahl aus dem 4-stelligem Jahr bestimmen
        int jh = jahr / 100;
        int jz = jahr % 100;

        int wochentag; // 0 = Samstag ... 6 = Freitag
        if (m == 1)// Behandlung des Januars
        {   m = 13; // Behandlung als 13. Monat
            if (jz == 0) // ggfs. das Jahrhundert und Jahr anpassen
            {   jh -= 1;
                jz = 99;
            } else
                jz = jz - 1; // oder nur das Jahr anpassen
        }

        if (m == 2) //Behandlung des Februars entsprechend, siehe oben
        {   m = 14;
            if (jz == 0)
            {   jh -= 1;
                jz = 99;
            } else
                jz = jz - 1;
        }

        // Zeller's Kongruenz
        wochentag = (t + (26 * (m + 1)) / 10 + jz + jz / 4 + jh / 4 + 5 * jh) % 7;
        // statt Bildschirmausgabe Ergebnisrueckgabe
        if (wochentag == 0) wtStr = "Samstag";
        if (wochentag == 1) wtStr = "Sonntag";
        if (wochentag == 2) wtStr = "Montag";
        if (wochentag == 3) wtStr = "Dienstag";
        if (wochentag == 4) wtStr = "Mittwoch" ;
        if (wochentag == 5) wtStr = "Donnerstag";
        if (wochentag == 6) wtStr = "Freitag";

        return wtStr;
    } // Ende wochentag()

    // Darstellung als Zeichenkette
    public String asString()
    {   return "" +tag +"." +monat +"." +jahr;
    }


    // private Hilfsmethode
    // liefert den Wochentag zu den Angaben zurück,
    // sofern diese einem validen Datum entsprechen
    public static String wtService(int tt, int mm, int yyy)
    {
        if (checkDat(tt, mm, yyy))
        { Datum tempDat = new Datum(tt, mm, yyy);
            return tempDat.wochentag();
        }
        else
            return null;
    }

    // private Hilfsmethode
    // ueberprüft, ob die Angaben einem validen Datum entsprechen
    private static boolean checkDat(int t, int m, int j)
    {
        if (t<1||t>31 || m<1||m>12 || j<1000) return false;
        if (t< 29) return true; // keine Sonderbehandlung notwendig
        if (t==29)
            if (m!=2)
                return true; // alle Monate außer Feb. haben einen 29igsten
            else
                // für Februar ist der 29igste nur für ein Schaltjahr erlaubt
                if (j%4==0 && (j%100!=0 || j%1000==0))
                    return true; else return false;
        if (t==30)
            // ein Feb. kann nie einen 30isten haben, jedoch alle anderen Monate
            if (m!=2) return true; else return false;
        // t ist nun 31, sonst wäre die Methode schon verlassen worden
        // einen 31 gibt es nicht im Feb., Apr., Jun., Jul. und Nov.
        if (m==2||m==4||m==6||m==9||m==11)
            return false;
        return true;
    }

} // Ende Klassendeklaration Datum
