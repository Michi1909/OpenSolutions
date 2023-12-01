package Bruch;

public class BruchTest {
    public static void main(String []args){
      /*  Bruch bruch1 = new Bruch();
        Bruch bruch2 = new Bruch(4);
        Bruch bruch3 = new Bruch(4,7);*/

        //Aufgabe c)
        Bruch task1 = new Bruch(1,2);
        Bruch task2 = new Bruch(1,4);
        Bruch addition = task1.plus(task2);
        //Bruch multipl = task1.mult(task2);
        //Bruch erg = addition.minus(multipl);
        System.out.println("Ergebnis ist:\n"+addition.asString());
        //System.out.println("Ergebnis ist:\n"+erg.asString());

       /* System.out.println("Bruch1 ist:\n"+bruch1.asString());
        System.out.println("Bruch2 ist:\n"+bruch2.asString());
        System.out.println("Bruch3 ist:\n"+bruch3.asString());

        Bruch neuBruch = bruch1.mult(bruch2);
        System.out.println("neuBruch ist:\n"+neuBruch.asString());

        Bruch neuBruch1 = bruch1.plus(bruch2);
        System.out.println("neuBruch1 ist:\n"+neuBruch1.asString());

        Bruch neuBruch2 = bruch1.minus(bruch2);
        System.out.println("neuBruch2 ist:\n"+neuBruch2.asString());

        Bruch neuBruch3 = bruch1.div(bruch2);
        System.out.println("neuBruch3 ist:\n"+neuBruch3.asString());
*/

    }
}
