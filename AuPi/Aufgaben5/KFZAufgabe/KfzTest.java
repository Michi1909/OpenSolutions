package KFZAufgabe;

public class KfzTest {
    public static void main(String[]args){
        Kfz kfz1 = new Kfz("Re-MK 1210","Mercedes");
        Kfz kfz2 = new Kfz("Re-LS 0303","Audi");

        kfz1.vermietenAn(1234567);
        long count  = kfz1.getAnzahlKfz();
        long count1 = kfz1.getAlleVermietungen();
        long count2 = kfz1.getMeineVermietungen();
        System.out.println();
        System.out.println(" 1 Ausgabe: ");
        System.out.println("Anzahl aller Autos im Fuhrpark: "+ count+"\nAnzahl aller Vermietungen im Unternehmen: "+count1+"\nAnzahl der Vermietungen des aktuell Vermieteten Auto: "+count2);
        kfz1.zurueckgeben();
        long count3 = kfz1.getAnzahlKfz();
        long count4 = kfz1.getAlleVermietungen();
        long count5 = kfz1.getMeineVermietungen();
        System.out.println();
        System.out.println(" 2 Ausgabe: ");
        System.out.println("Anzahl aller Autos im Fuhrpark: "+ count3+"\nAnzahl aller Vermietungen im Unternehmen: "+count4+"\nAnzahl der Vermietungen des aktuell Vermieteten Auto: "+count5);
        kfz1.vermietenAn(2345678);
        long count6 = kfz1.getAnzahlKfz();
        long count7 = kfz1.getAlleVermietungen();
        long count8 = kfz1.getMeineVermietungen();
        System.out.println();
        System.out.println(" 3 Ausgabe: ");
        System.out.println("Anzahl aller Autos im Fuhrpark: "+ count6+"\nAnzahl aller Vermietungen im Unternehmen: "+count7+"\nAnzahl der Vermietungen des aktuell Vermieteten Auto: "+count8);
        kfz2.vermietenAn(3456789);
        long count9  = kfz2.getAnzahlKfz();
        long count10 = kfz2.getAlleVermietungen();
        long count11 = kfz2.getMeineVermietungen();
        System.out.println();
        System.out.println(" 4 Ausgabe: ");
        System.out.println("Anzahl aller Autos im Fuhrpark: "+ count9+"\nAnzahl aller Vermietungen im Unternehmen: "+count10+"\nAnzahl der Vermietungen des aktuell Vermieteten Auto: "+count11);

    }
}
