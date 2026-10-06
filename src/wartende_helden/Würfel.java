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
public class Würfel {
    private int anzahlSeiten;
    
    public Würfel(int pAnzahlSeiten){
        anzahlSeiten = pAnzahlSeiten;
    }
    
    public int würfeln(){
        int ergebnis;
        ergebnis = (int) (Math.random()*anzahlSeiten + 1);
        System.out.println(ergebnis);
        return ergebnis;
    }
}
