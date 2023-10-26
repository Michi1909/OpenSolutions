
public class Tauschen
{

    public static void tausche(int v1, int v2)
    { int x;
        x = v1;
        v1 = v2;
        v2 = x;
    }

    public static void tauscheFelder(int[] f1, int[] f2)
    { int[] x;
        x = f1;
        f1 = f2;
        f2 = x;
    }

    public static void tauscheFeldElemente(int[] f1, int[] f2)
    { int x;
        x = f1[0];
        f1[0] = f2[0];
        f2[0] = x;
    }


    public static void main (String[] args)
    {  System.out.println("\nTauschen von elementaren Variablenwerten als Anweisungen, vgl. LE 1, Aufg. 4.4");
        int v1 = 10;
        int v2 = 20;
        System.out.println("v1 = " + v1 + ", v2 = " + v2);
        int x;
        x = v1;
        v1 = v2;
        v2 = x;
        System.out.println("v1 = " + v1 + ", v2 = " + v2);


        System.out.println("\nTauschen von elementaren Variablenwerten mittels Methode");
        // Wiederherstellen der Ausgangssituation
        v1 = 10;
        v2 = 20;
        System.out.println("v1 = " + v1 + ", v2 = " + v2);
        tausche(v1, v2);
        System.out.println("v1 = " + v1 + ", v2 = " + v2);
        System.out.println("Warum klappt das Tauschen nicht?");
        System.out.println("Weil nur innerhalb der Methode getauscht wird!");


        System.out.println("\nTauschen von Feldern mittels Methode");
        // Herstellen der Ausgangssituation
        int[] f1 = {10};
        int[] f2 = {20};
        System.out.println("f1[0] = " + f1[0] + ", f2[0] = " + f2[0]);
        tauscheFelder(f1, f2);
        System.out.println("f1[0] = " + f1[0] + ", f2[0] = " + f2[0]);
        System.out.println("Warum klappt das Tauschen nicht?");
        System.out.println("Weil nur innerhalb der Methode die Referenzen getauscht werden aber keine Indexwerte !");

        System.out.println("\nTauschen von Feldelementen mittels Methode");
        // Wiederherstellen der Ausgangssituation, nichts zu tun
        // Es gilt immer noch: f1 = {10}; und f2 = {20};
        System.out.println("f1[0] = " + f1[0] + ", f2[0] = " + f2[0]);
        tauscheFeldElemente(f1, f2);
        System.out.println("f1[0] = " + f1[0] + ", f2[0] = " + f2[0]);
        System.out.println("Warum klappt das Tauschen nun?");
        System.out.println("Weil wir in der Methode Indexwerte vertauscht haben.");

    }
}