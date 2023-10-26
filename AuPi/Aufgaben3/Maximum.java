import java.util.Scanner;

public class Maximum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie 3 ganze Zahlen ein:");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();

        int maxZahl = berechneMaximum(a,b,c);
        System.out.println("Das Maximum der Zahlen "+a+", "+b+", "+c+" ist "+maxZahl);
    }
    public static int berechneMaximum(int x, int y, int z){
        if(x<y){
            if(y<z){
                return z;
            }
            return y;
        }else if(x<z){
            return z;
        }else{
            return x;
        }

    }
}
