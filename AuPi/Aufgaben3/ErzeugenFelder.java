
public class ErzeugenFelder {
    public static void main(String[] args){
        int [] feld1= new int[5];
        int count= 2;
        for(int i =0;i< feld1.length;i++){
            feld1[i]=count;
            count+=2;
            System.out.println(feld1[i]);
        }
        System.out.println("\n");
        befuelleFeld();
    }

    //Befülle Feld mit 100 int Werten von 0-99
    public static void befuelleFeld(){
        int[] feld = new int[100];
        int laenge = feld.length;
        for(int i=0;i<laenge;i++){
            feld[i]=i;
            System.out.println("feld["+i+"] = ["+feld[i]+"]");
        }
    }

}
