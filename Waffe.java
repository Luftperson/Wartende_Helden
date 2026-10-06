public class Waffe {
    protected int material; // 1 = Holz, 2 = Stein, 3 = Metall, 4 = Kristall
    protected int magie;
    
    public Waffe(int pMaterial, int pMagie){
        material = pMaterial;
        magie = pMagie;
    }
    
    public double bonusBerechnen(){
        double bonus;
        switch(material){
                case 1:
                    bonus = 1.2 * (magie/2);
                    break;
                case 2:
                    bonus = 1.5 * (magie/2);
                    break;
                case 3:
                    bonus = 2.0 * (magie/2);
                    break;
                case 4:
                    bonus = 3.0 * (magie/2);
                    break;
                default:
                    System.out.println("Fehler");
                    bonus = 0.0;
        }
        return bonus;
        
    }
}