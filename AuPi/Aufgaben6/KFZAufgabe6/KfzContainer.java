package KFZAufgabe6;
public class KfzContainer{
    private Kfz[] kfzBestand = new Kfz[100];
    private int anzKfz = 0;

    // Erzeugen eines Containers bestimmter Größe
    public KfzContainer(int groesse) {
        this.kfzBestand=new Kfz[groesse];
    }
    // Hinzufügen eines Kfz
    public boolean addKfz(Kfz einKfz) {
        boolean eingefuegt = false;
        if (anzKfz < kfzBestand.length)
        {
            this.kfzBestand[this.anzKfz] = einKfz;
            this.anzKfz++;
            eingefuegt = true;
        }
        return eingefuegt;
    }
    public Kfz maxVermietetesKfz(){
        int tmp=1;
        Kfz kfz = this.kfzBestand[tmp];
        for(int i = 0;i<this.kfzBestand.length;i++){
            if(this.kfzBestand[i].getMeineVermietungen()>=kfz.getMeineVermietungen()){
                kfz=this.kfzBestand[i];
                tmp++;
            }
        }
        return kfz;
    }
    public Kfz kfzMitAnzVermietungen(long anzahlVermietungen){
        int laenge = this.kfzBestand.length;
        Kfz kfz= null;
        for(int i=0;i<laenge;i++){
            if(kfzBestand[i].getMeineVermietungen()==anzahlVermietungen){
                kfz= kfzBestand[i];
            }
        }
        return kfz;
    }
}