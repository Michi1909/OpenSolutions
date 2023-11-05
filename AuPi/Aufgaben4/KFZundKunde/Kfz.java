package KFZundKunde;

public class Kfz {
    String kennzeichen, modell;
    int kmStand;
    Kfz(String kennzeichen, String modell)
    {
        this.kennzeichen = kennzeichen;
        this.modell = modell;
    }
    Kfz(String kennzeichen, String modell, int kmStand)
    {
        this(kennzeichen, modell);
        this.kmStand = kmStand;
    }
    void setKennzeichen(String kennzeichen)
    {
        this.kennzeichen = kennzeichen;
    }
    void setModell(String modell)
    {
        this.modell = modell;
    }
    void setKmStand(int kmStand)
    {
        this.kmStand = kmStand;
    }
    String getKennzeichen()
    {
        return this.kennzeichen;
    }
    String getModell()
    {
        return this.modell;
    }
    int getKmStand()
    {
        return this.kmStand;

    }

}
