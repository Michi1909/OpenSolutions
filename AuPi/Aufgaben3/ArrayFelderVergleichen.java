public class ArrayFelderVergleichen {
    public static void main(String [] args){
        int[] feld1 ={1,2,3,4,5,2,1};//true
        int[] feld2 ={4,5,6,7,8,4,5};//false
        int[] feld3 ={2,3,45,6,7,5,4,3,2,1};//false

        System.out.println("feld1 ist:"+testFeld(feld1));
        System.out.println("feld2 ist:"+testFeld(feld2));
        System.out.println("feld3 ist:"+testFeld(feld3));
        System.out.println();
        System.out.println("feld1 hat die Summe:"+summe(feld1));
        System.out.println("feld2 hat die Summe:"+summe(feld2));
        System.out.println("feld3 hat die Summe:"+summe(feld3));
        System.out.println();
        System.out.println("Wert 4 ist im feld1 "+countValue(feld1,4)+" mal gezählt worden.");
        System.out.println("Wert 3 ist im feld2 "+countValue(feld2,3)+" mal gezählt worden.");
        System.out.println("Wert 1 ist im feld3 "+countValue(feld3,1)+" mal gezählt worden.");


    }
    public static boolean testFeld(int[] feld){
        if(feld.length<4){
            return false;
        } else if(feld[0]!=(feld[feld.length-1])){
            return false;
        }else if(feld[1]!=feld[feld.length-2]){
            return false;
        }else return true;
    }

    //Summe aller Komponentenwerte
    public static int summe(int [] feld){
        int summe=0;
        for(int i=0;i<feld.length;i++){
            summe+=feld[i];
        }
        return summe;
    }
    public static int countValue(int[] feld, int value){
        int counter = 0;
        for(int i=0;i<feld.length;i++){
            if(feld[i]==value){
                counter++;
            }
        }
        return  counter;
    }
}
