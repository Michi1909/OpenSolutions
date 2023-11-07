package Person;

public class PersonTest {
    public static void main(String[]args){
        Person person1 = new Person("Ella");
        Person person2 = new Person("Seve","1",100000.0);
        System.out.println("Person1 Name: "+person1.getName());
        System.out.println("Person1 Jahreseinkommen: "+person1.getJahresEinkommen());
        System.out.println("Person1 Steuerklasse: "+person1.getSteuerklasse());

        System.out.println("Person2 Name: "+person2.getName());
        System.out.println("Person2 Jahreseinkommen: "+person2.getJahresEinkommen());
        System.out.println("Person2 Steuerklasse: "+person2.getSteuerklasse());
    }
}
