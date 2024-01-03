package KontoGirokontoSparkonto;

public class Girokonto extends Konto{
    private double kreditRahmen;
    public Girokonto(double ktoStand, double KreditRahmen){
        super(ktoStand);
        this.kreditRahmen=kreditRahmen;
    }
    @Override
    public void buche(double betrag){
        double kontostand= this.getKontostand();
        if (betrag < 0) {
            double kontostandNew = getKontostand()+this.kreditRahmen-betrag;
            if(kontostandNew>0) {
                kontostand-=betrag;
                this.setKtoStandM(kontostand);
            }else{
                System.out.println("Der Kontostand wird bei der Auszahlung überzogen\n daher kann der Auftrag nicht ausgeführt werden!");
            }
        }else if(betrag==0){
            System.out.println("Der Betrag ist null Euro, es gibt keine Veränderung!");
        }else{
            kontostand += betrag;
            this.setKtoStandM(kontostand);
        }
    }
    @Override
    public String asString(){
        return "";
    }
}
