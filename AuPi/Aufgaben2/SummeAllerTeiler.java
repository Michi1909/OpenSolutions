import java.util.Scanner;

public class SummeAllerTeiler {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Gibt eine ganze Zahl ein:");
        int number = sc.nextInt();
        int summeAllerTeiler = getSummeAllerTeiler(number);
        System.out.println("Die Summer aller Teiler der Zahl "+number+" ist: "+summeAllerTeiler);

        for(int i=0;i<10000;i++){
            if(istVollkommeneZahl(i)){
                System.out.println(i+" ist eine vollkommene Zahl!");
            }
        }
        for(int i=0;i<10000;i++){
            if(istAbundanteZahl(i)){
                System.out.println(i+" ist eine abundante Zahl!");
            }
        }
    }
    public static int getSummeAllerTeiler(int number){
        int teiler=0;
        for(int i=1;i<number;i++){
            if(number%i==0){
              teiler+=i;
            }
        }
        return teiler;
    }
    public static boolean istVollkommeneZahl(int number){
        if(getSummeAllerTeiler(number)==number) {
            return true;
        }else{
            return false;
        }
    }

    public static boolean istAbundanteZahl(int number){
        if(getSummeAllerTeiler(number)>number){
            return true;
        }else{
            return false;
        }
    }
}
