public class Monster {
    private double angriffswert;
    private int lebenspunkte;
    
    public Monster(double pAngriffswert, int pLebenspunkte){
        angriffswert = pAngriffswert;
        lebenspunkte = pLebenspunkte;
    }
    
    public int getLebenspunkte(){
        return lebenspunkte;
    }
    
    public double getAngriffswert(){
        return angriffswert;
    }
}