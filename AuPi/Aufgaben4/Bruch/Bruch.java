package Bruch;

public class Bruch {

    //Klassenattribute
    int zaehler;
    int nenner = 1;
    //------------------------------------------------------------------------------
    //Kontruktor
    Bruch(){}
    Bruch(int zaehler){
        this.zaehler=zaehler;
    }
    Bruch(int zaehler,int nenner){
        this.zaehler=zaehler;
        this.nenner=nenner;
    }
    //------------------------------------------------------------------------------------
    //Klassenmethoden
    Bruch plus(Bruch summand)
    {
        Bruch n = new Bruch();
        return n;
    }
    Bruch minus(Bruch subtrahend)
    {
       Bruch m = new Bruch();
       return m;
    }
    Bruch mult(Bruch faktor)
    {
        Bruch r = new Bruch();
        return r;
    }
    Bruch div(Bruch divisor)
    {
        Bruch z = new Bruch();
        return z;
    }
    Bruch kehrwert()
    {
        Bruch h = new Bruch();
        return h;
    }
    String asString()
    {
        return "";
    }
}
