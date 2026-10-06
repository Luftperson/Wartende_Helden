public class Würfel {
    private int anzahlSeiten;
    
    public Würfel(int pAnzahlSeiten){
        anzahlSeiten = pAnzahlSeiten;
    }
    
    public int würfeln(){
        int ergebnis;
        ergebnis = (int) (Math.random()*anzahlSeiten + 1);
        //System.out.println(ergebnis);
        return ergebnis;
    }
}