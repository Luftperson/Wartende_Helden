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
public class Kampfregel {
    private Würfel w6;
    private Würfel w10;
    public Kampfregel(Würfel pW6, Würfel pW10){
        w6 = pW6;
        w10 = pW10;
    }
    
    public void kampf(Held k1, Monster k2){
        String hName = k1.getName();
        int hHP = k1.getLebenspunkte();
        double hDMG = k1.getAngriffswert();
        int mHP = k2.getLebenspunkte();
        double mDMG = k2.getAngriffswert();
        
        boolean kampfGewonnen = false;
        
        while(hHP > 0 && mHP > 0){
            mHP -= hDMG;
            System.out.println("Monster verliert " + hDMG + "HP. Noch: " + mHP + "HP!");
            if (mHP > 0){
                hHP -= mDMG;
                System.out.println(hName + " verliert " + mDMG + "HP. Noch: " + hHP + "HP!");
            }else{
                kampfGewonnen = true;
                System.out.println("Kampf gewonnen!");
            }
            if(hHP <= 0){
                kampfGewonnen = false;
                System.out.println("Kampf verloren!");
            }
        }
    }
}
