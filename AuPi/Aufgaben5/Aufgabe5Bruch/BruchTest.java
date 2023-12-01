package Aufgabe5Bruch;

public class BruchTest {
    public static void main(String[]args){
        //Bruch bruch1 = Bruch.neuerbruch(2,3);
        //Bruch bruch2 = Bruch.neuerbruch(2,0);
        Bruch task1 = Bruch.neuerbruch(1,4);
        Bruch task2 = Bruch.neuerbruch(1,2);
        Bruch addition = task1.plus(task2);
        System.out.println("Ergebnis ist:\n"+addition.asString());

        //System.out.println(bruch1.asString());
        //System.out.println(bruch2.asString());
        //System.out.println(Bruch.ggT(2,4));
    }
}
