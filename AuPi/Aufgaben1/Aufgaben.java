import java.util.Scanner;
class Aufgaben {
    public static void ausgabeNameUndTelefon(){
        /*
        -----Aufgabe1
         */
        String name= "Michaela";
        String telefonnummer = "017600033333";
        System.out.println("Der Name ist: "+name+" und die Telefonnumer ist: "+telefonnummer);

    }
    public static void ausgabeProdukt(){
        /*
        ----Aufgabe2-------
         */
        int variable1 = 5;
        int variable2 = 4;
        int summe= variable1*variable2;
        System.out.println("Das Produkt der Zahlen "+variable1+" und"+variable2+" ist: "+summe);
    }

    public static void ergebnisInterpretieren(){
        /*
        ----Aufgabe3-----
         */
        int n = 2147483647;
        int x = n+1;
        System.out.println("Die Zahl n:"+n+" wird plus 1 gerechnet und ergibt: "+ x);
    }
    public static void ausgabePruefen(){
        /*
        -----Aufgabe4-------
         */
       int b= (byte)258;
       float r= (int) 13.75f;
       boolean t = ((5 < 2) | (6%4 == 2));
       double d= 6/4;
       double g= 6/4.0;
       double h = (int) (10/4.0 + 3);

       System.out.println(" (byte)258   :"+b);
       System.out.println("(int) 13.75f   :"+r);
       System.out.println("(5 < 2) | (6%4 == 2)   :"+t);
       System.out.println(" 6/4    :"+d);
       System.out.println("6/4.0     :"+g);
       System.out.println(" (int) (10/4.0 + 3)   :"+h);
    }
    public static double temperaturUmrechnen(double fahrenheit){
        /*
        ----Aufgabe5
         */
        double celsius = (5.0/9.0)*(fahrenheit-32);
        return celsius;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        ausgabeNameUndTelefon();
        ausgabeProdukt();
        ergebnisInterpretieren();
        ausgabePruefen();
        System.out.println("Bitte geben Sie die Fahrenheit ein:");
        double fahrenheit = sc.nextDouble();
        System.out.println("Die Fahrenheit "+fahrenheit+" ist umgerechnet in Celsius: "+temperaturUmrechnen(fahrenheit));

    }

}
