public class Poly {

    public static void main(String[] args){
        final int x1 = 3;
        procPoly(x1);
        int result1 = funcPoly(x1);
        System.out.println(result1);

        final int x2 = 10;
        procPoly(x2);
        int result2 = funcPoly(x2);
        System.out.println(result2);
    }

    public static void procPoly(int x){
        int t1 = 5 * x + 2;
        int t2 = 2 * x * x + t1;
        t1 = 3 * x * x * x + t2;
        System.out.println("Für x="+x+" ist das Ergebnis: "+t1);
    }
    public static int funcPoly(int x){
        int t1 = 5 * x + 2;
        int t2 = 2 * x * x + t1;
        return t1 = 3 * x * x * x + t2;
    }
}
