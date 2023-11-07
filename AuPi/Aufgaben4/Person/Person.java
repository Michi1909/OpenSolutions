package Person;

public class Person {
    private String name;
    private String steuerklasse;
    private double jahresEinkommen;
    public Person(String name, String steuerklasse, double jahresEinkommen){
        this.name=name;
        this.steuerklasse=steuerklasse;
        this.jahresEinkommen=jahresEinkommen;
    }
    public Person(String name){
        this(name,"",0.0);
    }

    public String getName(){
        return this.name;
    }
    public String getSteuerklasse(){
        return this.steuerklasse=steuerklasse;
    }
    public double getJahresEinkommen(){
        return this.jahresEinkommen=jahresEinkommen;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setSteuerklasse(String steuerklasse){
        this.steuerklasse=steuerklasse;
    }
    public void setJahresEinkommen(double jahresEinkommen){
        this.jahresEinkommen=jahresEinkommen;
    }


}
