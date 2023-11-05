package Dozent;

public class DozentTest {
    public static void main(String[]args){
       //a)
        Dozent einDozent = new Dozent("Kaiser, Willhelm","Dortmund",'m');
        Dozent eineDekanin = new Dozent("Kaiserin, Sissi","Dortmund",'w');
        System.out.println("Name des Dozenten:"+einDozent.getName()+" arbeitet in " +einDozent.getLehrgebiet()+" und hat das Geschlecht:"+ einDozent.getGeschlecht());
        System.out.println("Name der Dekanin:"+eineDekanin.getName()+" arbeitet in " +eineDekanin.getLehrgebiet()+" und hat das Geschlecht:"+ eineDekanin.getGeschlecht());
        eineDekanin.setLehrgebiet("Köln");
        System.out.println("Name der Dekanin:"+eineDekanin.getName()+" arbeitet in " +eineDekanin.getLehrgebiet()+" und hat das Geschlecht:"+ eineDekanin.getGeschlecht());
        //b)
        System.out.println(eineDekanin.asString());
        System.out.println(einDozent.asString());
    }
}
