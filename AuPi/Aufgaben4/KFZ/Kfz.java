package KFZ;

public class Kfz {
    // Klassenattribute
    String kennzeichen, modell;
    int kmStand;
    int ID;
    int temp=0;
    //Konstruktoren
    Kfz(String kennzeichen, String modell)
    {
        this.kennzeichen = kennzeichen;
        this.modell = modell;
    }
    Kfz(String kennzeichen, String modell, int kmStand)
    {
        this(kennzeichen, modell);
        this.kmStand = kmStand;
        this.ID=temp;
        temp++;
    }

    //Set-Methoden geben nichts zurück sondern ändern nur das Attribut
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
    //Get-Methoden geben etwas zurück
    int getID(){
        return this.ID;
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
    String asString(Kfz kfz){
        return "Das Kennzeichen ist: "+kfz.getKennzeichen() +", das Modell ist: "+kfz.getModell()+", der Kilometerstand ist: "+kfz.getKmStand();
    }

}
