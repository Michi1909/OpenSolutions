package MitarbeiterAngestellter;

public class Arbeiter extends Mitarbeiter{
    private int stundenLohn;
    Arbeiter(String name, int stundenLohn){
        super(name);
        this.stundenLohn=stundenLohn;
    }

}
