package KFZAufgabe6;

public class Kunde {
    String name;
    public Kunde(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public String asString(){
        return "Kundenname ist: "+getName();
    }
}
