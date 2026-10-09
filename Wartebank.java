public class Wartebank {
    //private int länge;
    private Held[] wartebank;
    
    public Wartebank(){

    }
    
    public int getLänge(){
        int länge = wartebank.length;
        return länge;
    }
    public void heldAufnehmen(Held h){
        
    }

    public void heldVorlassen(){
        
    }

    public boolean istBankLeer(){
        boolean iBL = true;
        if(getLänge() == 0){
            iBL = true;
        } else {
            iBL = false;
        }
        return iBL;
    }
}
