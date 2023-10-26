import java.util.Scanner;

public class Fakultaet {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine Zahl ein:");
        int a= sc.nextInt();
        int fakultaetZahl= berechneFakultaet(a);
        System.out.println("n="+a+"! ist ausgerechnet: "+fakultaetZahl);
    }
    public static int berechneFakultaet(int zahl){
        int temp =1;
        for(int i=1;i<=zahl;i++){
            temp*=i;
        }
        return temp;
    }
}
