package KFZAufgabe6;

public class KfzTest {
    public static void main(String[]args){
        KfzContainer kfzVerwaltung = new KfzContainer(6);
        Kfz kfz1 = new Kfz("RE 123","Mercedes");
        Kfz kfz2 = new Kfz("RE 234","Audi");
        Kfz kfz3 = new Kfz("RE 345","VW");
        Kfz kfz4 = new Kfz("RE 456","Ford");
        Kfz kfz5 = new Kfz("RE 567","Renault");
        Kfz kfz6 = new Kfz("RE 678","Porsche");

        kfzVerwaltung.addKfz(kfz1);
        kfzVerwaltung.addKfz(kfz2);
        kfzVerwaltung.addKfz(kfz3);
        kfzVerwaltung.addKfz(kfz4);
        kfzVerwaltung.addKfz(kfz5);
        kfzVerwaltung.addKfz(kfz6);

        kfz1.vermietenAn(new Kunde("Michaela"));
        kfz1.zurueckgeben();
        kfz1.vermietenAn(new Kunde("Severi"));
        kfz1.zurueckgeben();
        kfz2.vermietenAn(new Kunde("Ella"));
        kfz2.zurueckgeben();
        kfz3.vermietenAn(new Kunde("Dennis"));
        kfz4.vermietenAn(new Kunde("Lara"));
        kfz6.vermietenAn(new Kunde("Silvi"));

        Kfz kfzTest =kfzVerwaltung.maxVermietetesKfz();
        System.out.println(kfzTest.asString());

        Kfz kfzTest2= kfzVerwaltung.kfzMitAnzVermietungen(2);
        System.out.println(kfzTest2.asString());
    }
}
