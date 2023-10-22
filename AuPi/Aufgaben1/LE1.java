public class LE1 {

    /*
    -----Aufgabe 4.3
     */
    public static void berechneProdukt(){
        int variable1=5;
        int variable2=4;

        if(variable1!= 0 && variable2!= 0){
            int ergebnis= variable1*variable2;
            System.out.println("Das Produkt der beiden Zahlen "+variable1 +" und "+variable2+" ist "+ergebnis+".");
        }else{
            System.out.println("Das Produkt mit der Zahl 0 ist 0.");
        }
        
    }
    /*
    -----Aufgabe 4.4------
     */
    public static void vertauscheVariablen(){
        int variable1 = 5;
        int variable2 = 10;
        int tmp = variable1;

        System.out.println("Die beiden Variable variable1="+variable1+", variable2="+variable2+" werden vertauscht.");

        variable1=variable2;
        variable2=tmp;

        System.out.println("Die beiden Variable variable1="+variable1+", variable2="+variable2+" sind nun vertauscht.");
    }

    /*
    --------Aufgabe 5.a)----------
     */

    public static double temperaturUmrechnen(double fahrenheit){
        double celsius = (5.0/9.0)*(fahrenheit-32);
        return celsius;
    }

    /*
    ----Aufgabe 5.4----------
     */

    public static void ausgabeUeberpruefen(){
        boolean b1 = 3 <= 2 | !(3.0/2==1.5);
        System.out.println("b1: "+b1);
        byte b2 = (byte)(128+1);
        System.out.println("b2: "+b2);
        int i1 = (int)3.0/2 + 3/2 + 4%3;
        System.out.println("i1: "+i1);
        int i2 = (int)5.6;
        System.out.println("i2: "+i2);
        float f1 = 123456789;
        System.out.println("f1: "+f1);
        double d1 = 200.0 + 45 + 3.5f;
        System.out.println("d1: "+d1);
    }

    /*
    -----Übungsblatt Aufgabe 5
     */

    public static void checkAusgabe(){
        final int x = 3;
        int t1 = 4 * x + 2;
        int t2 = 2 * x * x + t1;
        t1 = x * x * x + t2;
        System.out.println("t1 ist: "+t1);
    }


    /*
    ----Vorlesung----
     */

    public static void typenPruefen(){
        char c2 = 'A';
        // Nicht zulässig char c4 = "A";
        char c5 = 65;
        // nicht zulässig int c = 123L;
        long l = 123l;
        // nicht zulässig float f =0.12;
        float g = 12.345f;
        // nicht zulässig float h = 12.9;
        double d = 12.0;
        float h = 1E2f;
        int a =0x78;
        byte b = 017;
        // nicht zulässig byte b = 0178;
        char c3 = '\u0064';
    }
}
