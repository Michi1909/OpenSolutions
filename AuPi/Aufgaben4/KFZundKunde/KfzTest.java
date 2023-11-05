package KFZundKunde;

public class KfzTest {
    public static void main(String[] args){
        Kfz erstesKfz = new Kfz("DO - GM 15","BMW", 15020);
        Kfz zweitesKfz = new Kfz("GM - K 34", "VW");
        erstesKfz.setKmStand(50000);
        zweitesKfz = new Kfz("K - DO","Opel",300);
        System.out.println(erstesKfz.getKennzeichen());
        System.out.println(erstesKfz.getModell());
        System.out.println(erstesKfz.getKmStand());
        System.out.println(zweitesKfz.getKennzeichen());
        System.out.println(zweitesKfz.getModell());
        System.out.println(zweitesKfz.getKmStand());
    }
}
