package Auftraege;

import java.util.Scanner;

public class AuftragsverwaltungTest {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        boolean tmp = true;
        //AuftragsContainer auftragVerwaltung = new AuftragsContainer();
        Auftraggeber auftraggeber;
        System.out.println("Bitte geben Sie den Namen der Firma an: ");
        String firmenname= sc.next();
        auftraggeber = new Auftraggeber(firmenname);
       // int count = 0;
        //while(tmp){
            //if(count<=3){
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
                auftraggeber.erteiltAuftrag(auftrag);
                //count++;
           // }else{tmp = false;}
       // }
        System.out.println(auftraggeber.asString());

    }
}
