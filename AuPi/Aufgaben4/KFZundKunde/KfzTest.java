package KFZundKunde;
public class KfzTest {
    public static void main(String[] args){
        String str = "";
        Kfz erstesKfz = new Kfz("DO - GM 15","BMW", 15020);
        Kfz zweitesKfz = new Kfz("GM - K 34", "VW");
        System.out.println(zweitesKfz.getKennzeichen());
        System.out.println(zweitesKfz.getModell());
        System.out.println(zweitesKfz.getKmStand());
        erstesKfz.setKmStand(50000);
        zweitesKfz = new Kfz("K - DO","Opel",300);
        System.out.println(erstesKfz.asString(erstesKfz));
        System.out.println(zweitesKfz.asString(zweitesKfz));

    }
}
