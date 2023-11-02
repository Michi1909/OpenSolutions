import java.util.Scanner;
public class SubtraktionUndAddition {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte die Dezimalzahl eingeben:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int multiplikation = berechneMultiplikation(a, b);
        System.out.println("Die Berechnung der Multiplikation der beiden Ganzenzahlen a:"+a+" und b:"+b+" ergibt: "+ multiplikation);
        int subtraktion = berechneSubtraktion(a,b);
        System.out.println("Die Berechnung der Subtraktion der beiden Ganzenzahlen a:"+a+" und b:"+b+" ergibt: "+ subtraktion);
        int addition = berechneAddition(a, b);
        System.out.println("Die Berechnung der Addition der beiden Ganzenzahlen a:" + a + " und b:" + b + " ergibt: " + addition);

    }


    /*
    Calculate multiplication of 2 numbers
     */
    public static int berechneMultiplikation(int a, int b){
        return a * b;
    }

    /*
    Calculate multiplication when there is a number negative
     */
    public static int berechneSubtraktion(int a, int b){
       return logicBehind(a,b);

    }

    /*
    Calculate when there is no number negative
     */
    public static int berechneAddition(int a, int b){
        return logicBehind(a,b);
    }

    public static int logicBehind(int a,int b){
        int c=0;
        if(a<0 && b>=0){
            for(int i=0;i<b;i++){
                c+=a;
            }
            return c;
        } else if (b<0 && a>=0) {
            for(int i=0;i<a;i++){
                c+=b;
            }
            return c;
        }else if(a<0 && b<0){
            for(int i=0;i<Math.abs(b);i++){
                c-=(a);
            }
            return c;
        }else{
            return 0;
        }
    }

}
