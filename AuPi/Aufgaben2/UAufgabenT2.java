import java.util.Scanner;

public class UAufgabenT2 {
    public static void main(String[]args){
      kleines1x1MitWhileSchleifen();

    }

    public static void kleines1x1MitWhileSchleifen(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte eine ganze Zahl eingeben:");
        int n = sc.nextInt();

        System.out.println("While begins here:");
        for(int i=n; i>0;i-=3){
            if(i>1) {
                System.out.print(i + " / ");
            }else {
                System.out.print(i);
            }
        }

        System.out.println("");
        System.out.println("While begins here:\n");
        int s=n;
        while(s>0){
            if(s>1) {
                System.out.print(s + " / ");
            }else {
                System.out.print(s);
            }
            s-=3;
        }

        System.out.println("");
        System.out.println("do-While begins here:\n");
        boolean t = true;
        int st = n;
        do{
            if(st>1) {
                System.out.print(st + " / ");
            }else {
                System.out.print(st);
                t=false;
            }
            st-=3;

        }while(t);


        System.out.println("\nGood Job!");
    }

}
