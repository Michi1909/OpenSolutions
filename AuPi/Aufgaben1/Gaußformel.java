import java.util.Scanner;

public class Gaußformel {
     public static int berechneGaussFormel(int n){
        int teilsumme=0;
        int anzahl= n;
        for(int i=1; i<=n;i++)
        {
            teilsumme=n*(n+1)/2;
        }
        return teilsumme;
    }
}
