package Konto;

public class Konto {
        int ktoNr;
        double ktoStandM = 0.0;
        double dispoLimit = 1000.0;
        public Konto(int ktoNr){
            this.ktoNr=ktoNr;
        }
        public Konto(int kotoNr, double ktoStand, double dispoLimit){
           this.ktoNr=kotoNr;
           this.ktoStandM=ktoStand;
           this.dispoLimit=dispoLimit;
        }
        int getKtoNr(){
            return this.ktoNr;
        }
        double getDispoLimit(){
            return this.dispoLimit;
        }
        double getKtoStandM(){
            return this.ktoStandM;
        }
        boolean sicheresAuszahlen(double betrag){

            double betragErg = this.ktoStandM-betrag;

            if(betragErg>=-this.getDispoLimit()){
                this.auszahlen(betrag);
                return true;
            }
                return false;

        }
        boolean sicheresUeberweisen(Konto ktoNr, double betrag){

            if(sicheresAuszahlen(betrag)){
                ktoNr.einzahlen(betrag);
                return true;
            }
            return false;
        }
        void einzahlen(double betrag){
            this.ktoStandM+=betrag;
        }
        void auszahlen(double betrag){
            this.ktoStandM-=betrag;
        }
        void setDispoLimit(double dispoLimit){
            this.dispoLimit=dispoLimit;
        }
        String asString(){
            return "Das Konto mit der Kontonr.: "+this.getKtoNr()+" hat einen Kontostand von: "+ this.getKtoStandM()+ " und einen Dispolimit von: "+this.getDispoLimit();
        }

}
