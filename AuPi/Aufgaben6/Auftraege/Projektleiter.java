package Auftraege;

public class Projektleiter
{

    private String name;

    private AuftragsContainer aktuellGeleiteteAuftraege = new AuftragsContainer();

    Projektleiter(String name)
    {
        this.name = name;
    }

    public void uebernehmeAuftrag(Auftrag einAuftrag)
    {
        aktuellGeleiteteAuftraege.auftragHinzufuegen(einAuftrag);
    }

    public void schliesseAuftragAb(Auftrag einAuftrag)
    {
        aktuellGeleiteteAuftraege.auftragEntfernen(einAuftrag);
    }

    public double verantwortetesAuftragsvolumen()
    {
        return aktuellGeleiteteAuftraege.gibAuftragsvolumen();
    }

    public double durchschnittlichesAuftragsvolumen()
    {
        return aktuellGeleiteteAuftraege.gibDurchschnittlichesAuftragsvolumen();
    }

    // Service Operation
    public String asString()
    {
        String darstellung = "-- AUSGABE EINES PROJEKTLEITEROBJEKTS MIT ALLEN AUFTRAEGEN --\n\n";

        darstellung = darstellung + "Projektleiter: " + name
                + "\nAuftragsvolumen= " + verantwortetesAuftragsvolumen()
                + "\ndurchschnittliches Auftragsvolumen = " + durchschnittlichesAuftragsvolumen()
                + "\n" + aktuellGeleiteteAuftraege.asString();
        return darstellung + "\n-- ENDE DER AUSGABE --\n\n";
    }

}
