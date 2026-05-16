package com.rpg.arena; //untuk file path com/rpg/arena

public abstract class Karakter implements AksiBertarung{
    protected String nama;
    protected int hp;
    protected int baseDamage;
    protected boolean isDefending;

    public Karakter(String nama,int hp,int baseDamage){
        this.nama = nama;
        this.hp = hp;
        this.baseDamage = baseDamage;
        this.isDefending = false;
    }

    //setter dan getter dari semua field
    public String getNama(){return nama;}
    public void setNama(String nama){this.nama = nama;}
    public int getHp() {return hp;}
    public void setHp(int hp){this.hp = hp;}
    public int getBaseDamage(){return this.baseDamage;}
    public void setBaseDamage(int baseDamage){this.baseDamage = baseDamage;}
    public boolean isDefending() {return isDefending;}
    public void setDefending(boolean defending){isDefending = defending;}

    public void terimaDamage(int damage){
        if(this.isDefending){
            this.hp -= (int)(damage / 2);//logika pengurangan hp dari damage, casting ke int
            this.isDefending = false;
        }else{
            this.hp -= damage;
            if(this.hp <= 0){this.hp = 0;}//jika pas terkena damage sampai menghabiskan hp (sama dengan atau kurang dari 0), maka pastikan hp nya adalah 0
        }
    }

    public abstract void tampilkanStatus();
}
