package com.rpg.entitas;

import com.rpg.arena.*;

public class Monster extends Karakter {
    protected String jenisMonster;

    public Monster(String nama, int hp, int baseDamage, String jenisMonster){
        super(nama, hp, baseDamage);
        this.jenisMonster = jenisMonster;
    }

    @Override
    public int serang(){
        return this.baseDamage;
    }
    @Override
    public void bertahan(){
        this.hp += 3;//monster mulihin sedikit HP
    }
    @Override
    public void gunakanItem() {
        this.hp += 30;
    }
    @Override
    public void tampilkanStatus(){
        System.out.println("\t\tStatus Monster "+this.nama);
        System.out.println("HP : "+this.hp);
        System.out.println("jenisMonster : "+this.jenisMonster);
    }
}
