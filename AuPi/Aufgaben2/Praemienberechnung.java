import java.util.Scanner;

public class Praemienberechnung {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Gib die Anzahl der Personen ein:");
        int anzPerson = sc.nextInt();
        System.out.println("Gibt die Anzahl der Fläche in Quadratmeter ein:");
        double anzFlaeche= sc.nextDouble();
        double praemie = berechnePraemien(anzPerson,anzFlaeche);
        System.out.println("Die Prämie betragt: "+praemie+" \nwenn die Personenanzahl: "+anzPerson+"\nund die Fläche: "+anzFlaeche+"qm ist.");
    }
    public static double berechnePraemien(int anzahlPersonen, double flaeche){
        if(anzahlPersonen>0){
            return (10+flaeche)/2;
        }else if(anzahlPersonen>2){
            return (15+flaeche)/2;
        } else if (anzahlPersonen>3) {
            return (15+1.5)*flaeche;
        } else{
            return (25+2)*flaeche;
        }
    }
}
