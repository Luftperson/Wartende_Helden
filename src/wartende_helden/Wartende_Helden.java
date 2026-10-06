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
public class Wartende_Helden {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Würfel w6 = new Würfel(6);
        Würfel w10 = new Würfel(10);
        Waffe wa1 = new Waffe(4, 1);
        Held h1 = new Held("Markus", 2, 15, wa1);
        Monster m1 = new Monster(3, 10);
        Kampfregel k1 = new Kampfregel(w6, w10);
        k1.kampf(h1, m1);
    }
}
    

