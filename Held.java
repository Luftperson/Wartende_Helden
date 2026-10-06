public class Held {
    private String name;
    private int stärke;
    private int lebenspunkte;
    private Waffe wa1;
    
    public Held(String pName, int pStärke, int pLebenspunkte, Waffe pWa1){
        name = pName;
        stärke = pStärke;
        lebenspunkte = pLebenspunkte;
        wa1 = pWa1;
    }
    
    public String getName(){
        return name;
    }
    
    public int getLebenspunkte(){
        return lebenspunkte;
    }
    
    public double getAngriffswert(){
        double angriffswert = stärke + wa1.bonusBerechnen();
        return angriffswert;
    }
    
    public void setLebenspunkte(int hHP){
        lebenspunkte = hHP;
    }
    
    //public void angreifen(Monster g, Kampfregel r){
        
    //}
}