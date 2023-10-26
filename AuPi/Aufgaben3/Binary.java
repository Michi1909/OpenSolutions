import java.util.Scanner;

public class Binary {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte die Dezimalzahl eingeben:");
        int number = sc.nextInt();
        String binary = asBinary(number);
        System.out.println("Die Binarydarstellung für die Dezimalzahl "+number+" ist "+binary);

    }

    public static String asBinary(int number){
        String result ="";
        do{
            result=number%2+result;
            number/=2;
        }while(number>0);
        return result;
    }



   /* public static String asBinary(int number){
        int temp= number;
        String binary = "";

        while(temp>0){

            int rest= berechneModulo(temp);
            temp/=2;

            if(rest==0){
                binary= "0"+binary;
            }else{
                binary= "1"+binary;
            }
        }
        return binary;
    }
    public static int berechneModulo(int number){
        if(number%2==0){
            return 0;
        }else{
            return 1;
        }
    }*/
}
