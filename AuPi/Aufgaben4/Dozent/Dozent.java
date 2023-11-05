package Dozent;

public class Dozent {
    String name;
    String lehrgebiet;
    boolean dekan =false;
    char geschlecht;
    public Dozent(String name, String lehrgebiet, char geschlecht ){
        this.name=name;
        this.lehrgebiet=lehrgebiet;
        this.geschlecht=geschlecht;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setLehrgebiet(String lehrgebiet){
        this.lehrgebiet=lehrgebiet;
    }
    public void setDekan(boolean dekan){
        this.dekan=dekan;
    }
    public String getName(){
        return this.name;
    }
    public String getLehrgebiet(){
        return this.lehrgebiet;
    }
    public boolean isDekan(){
        return this.dekan;
    }
    public char getGeschlecht(){
        return geschlecht;
    }
    public String asString(){
        return "Name: "+getName()+" arbeitet in " +getLehrgebiet()+" und hat das Geschlecht:"+ getGeschlecht();
    }

}
