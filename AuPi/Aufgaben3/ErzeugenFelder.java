
public class ErzeugenFelder {
    public static void main(String[] args){
        int [] feld1= new int[5];
        int count= 2;
        for(int i =0;i< feld1.length;i++){
            feld1[i]=count;
            count+=2;
            System.out.println(feld1[i]);
        }
    }

}
