import game.Hero;
import game.HeroStrength;

public class App {
    public static void main(String[] args) throws Exception {
        //Nomor 5
        Hero hero1 = new Hero("Aether",8000.0,700.0);
        HeroStrength hero2 = new HeroStrength("Rover", 5000.0, 500.0);
        System.out.println("Hero1 Status");//display pertama
        hero1.display();
        System.out.println("Hero2 Status");
        hero2.display();

        hero1.berlatih();
        hero2.berlatih();

        hero1.terimaSerangan(50.0);
        hero2.terimaSerangan(50.0);

        System.out.println("Hero1 Status");//display kedua
        hero1.display();
        System.out.println("Hero2 Status");
        hero2.display();
    }
}
