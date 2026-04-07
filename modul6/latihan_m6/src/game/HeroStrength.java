package game;
//Nomor 3
public class HeroStrength extends Hero{
    String tipe;
    public HeroStrength(String nama,double health,double attackPower){
        super(nama,health,attackPower);
        this.tipe = "Strength";
    }
    
    //Nomor 4
    @Override
    public void display(){
        super.display();
        System.out.println("Tipe\t\t : " + tipe);
    }
    @Override
    public void terimaSerangan(double damage){
        double defense = 0.50 * damage;
        System.out.println("HP -" + defense + "!");
        this.health -= defense;
    }
}

