package Auftraege;

import java.util.Scanner;

public class AuftragsverwaltungTest {
    public static void main(String[]args){
        boolean tmp = true;
        Auftraggeber auftraggeber = erstellAuftraggeber();
        Auftrag[] auftraege = new Auftrag[3];
        int count = 0;
        while(tmp){
            if(count<3){
                auftraege[count] = erstelleAuftrag();
                auftraggeber.erteiltAuftrag(auftraege[count]);
                count++;
            }else{tmp = false;}
        }
        System.out.println("\n");
        System.out.println(auftraggeber.asString());
    }

    public static Auftraggeber erstellAuftraggeber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte geben Sie den Namen der Firma an: ");
        String firmenname= sc.next();
        Auftraggeber auftraggeber = new Auftraggeber(firmenname);
        return auftraggeber;
    }
    public static Auftrag erstelleAuftrag(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie bitte eine Auftragsummer ein:");
        int auftragsnummer= sc.nextInt();
        System.out.println("Geben Sie bitte einen Grund für die Arbeit an:");
        String grund= sc.next();
        System.out.println("Geben Sie bitte eine Stundenanzahl ein:");
        int stundenanzahl= sc.nextInt();
        System.out.println("Geben Sie bitte einen Stundensatz ein:");
        int stundensatz= sc.nextInt();
        System.out.println("Geben Sie bitte ein Auftragsvolumen ein:");
        double auftragsvolumen= sc.nextDouble();
        Auftrag auftrag = new Auftrag(auftragsnummer,grund,stundenanzahl,stundensatz,auftragsvolumen);
        return auftrag;
    }

}
