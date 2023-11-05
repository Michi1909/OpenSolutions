public class Tannenbaum {

    public static void main(String[]args){

    printTanenbaum(9);
    }
    public static void printTanenbaum(int n){

        for (int i = 1; i <= n; i++) {
            // Leerzeichen vor den Sternen
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Sterne für die aktuelle Zeile
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Zeilenumbruch am Ende jeder Zeile
            System.out.println();
        }

        // Stamm des Tannenbaums
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= n - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

    }

}
