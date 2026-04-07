package game;
//Nomor 1 ngebuat superclass Hero dan konstruktor
public class Hero {
    String nama;
    double health,attackPower;
    
    public Hero(String nama,double health,double attackPower){
        this.nama = nama;
        this.health = health;
        this.attackPower = attackPower;
    }

    //Nomor 2
    public void display(){
        System.out.println("Nama\t\t : " + this.nama);
        System.out.println("Health\t\t : " + this.health);
        System.out.println("Attack Power\t : " + this.attackPower);
    }
    public void berlatih(){
        this.attackPower += 10.0;
        System.out.println("Karakter sedang berlatih.");
    }
    public void terimaSerangan(double damage){
        System.out.println("HP -" + damage + "!");
        health -= damage;
    }

}
