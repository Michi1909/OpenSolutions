package MitarbeiterAngestellter;

public class Angestellter extends Mitarbeiter{
    private int monatsGehalt;
    Angestellter(String name,int monatlichesGehalt){
         super(name);
        this.monatsGehalt=monatlichesGehalt;
    }
}
