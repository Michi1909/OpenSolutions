import java.util.Scanner;

public class PAufgabenT2 {

    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);

        //Aufgabe 1 a)
        for(int i= 3; i>0;i--){
            System.out.println("Bitte gib eine ganze Zahl ein: ");
            int zahl1= sc.nextInt();
            testGerade(zahl1);
        }

        //Aufgabe 1 b)
        for(int i= 3; i>0;i--){
            System.out.println("Bitte gib eine ganze Zahl ein: ");
            int zahl2= sc.nextInt();
            testGroesse(zahl2);
        }

    }
    public static void testGerade(int n){
        if(n%2==0){
            System.out.println(n+" ist eine gerade Zahl!");
        }else{
            System.out.println(n+" ist eine ungerade Zahl!");
        }
    }

    public static void testGroesse(int n){
        if(n<0){
            System.out.println(n+" ist kleiner Null!");
        } else if (n>0) {
            System.out.println(n+" ist groeßer Null!");
        }else {
            System.out.println(n+" ist gleich Null!");
        }
    }
}
