package Aufgabe5Bruch;
public class Bruch {

    //Klassenattribute
    private int zaehler;
    private int nenner = 1;
    //------------------------------------------------------------------------------
    //Kontruktor
    Bruch(){this(1,1);}
    Bruch(int zaehler){
        this(zaehler,1);
    }
    private Bruch(int zaehler,int nenner){
        this.zaehler=zaehler;
        this.nenner=nenner;
    }
    //Generatormethode
    static Bruch neuerbruch(int zaehler, int nenner){
        if(nenner!=0){
            return new Bruch(zaehler,nenner);
        }else return null;
    }
    //Hilfsmethode
    static int ggT(int zaehler,int nenner){
        int teiler=0;
        for(int i = 1;i <=nenner;i++){
            if(zaehler%i==0){
                if(nenner%i==0){
                    teiler=i;
                }
            }
        }
        return teiler;
    }
    private Bruch kuerzen(){
        int teiler1 = ggT(this.zaehler,this.nenner);
        int zaehler = this.zaehler/teiler1;
        int nenner = this.nenner/teiler1;
        return new Bruch(zaehler,nenner);
    }
    //------------------------------------------------------------------------------------
    //Klassenmethoden
    Bruch plus(Bruch summand)
    {
        int zaehler = (this.zaehler* summand.nenner)+(summand.zaehler*this.nenner);
        int nenner = (this.nenner* summand.nenner);
        Bruch bruch = new Bruch(zaehler,nenner);
        bruch=bruch.kuerzen();
        return bruch;
    }
    Bruch minus(Bruch subtrahend)
    {
        int zaehler = (this.zaehler* subtrahend.nenner)-(subtrahend.zaehler*this.nenner);
        int nenner = (this.nenner* subtrahend.nenner);
        Bruch bruch = new Bruch(zaehler,nenner);
        return bruch;
    }
    Bruch mult(Bruch faktor)
    {
        int zaehler = this.zaehler * faktor.zaehler;
        int nenner = this.nenner * faktor.nenner;
        Bruch bruch = new Bruch(zaehler,nenner);
        return bruch;
    }
    Bruch div(Bruch divisor)
    {
        divisor= divisor.kehrwert();
        int zaehler = this.zaehler * divisor.zaehler;
        int nenner = this.nenner * divisor.nenner;
        Bruch bruch = new Bruch(zaehler,nenner);
        return bruch;
    }
    Bruch kehrwert()
    {
        Bruch h = new Bruch();
        int temp= this.zaehler;
        h.zaehler=this.nenner;
        h.nenner=temp;
        return h;
    }
    String asString()
    {
        return this.zaehler+"\n-\n"+this.nenner;
    }
}
