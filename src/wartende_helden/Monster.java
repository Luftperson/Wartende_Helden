/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wartende_helden;

/**
 *
 * @author MBuergel1
 */
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
