package com.rpg.main;

import com.rpg.entitas.*;
import java.util.Scanner;
public class GameEngine {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama Pahlawan : ");
        String namaHero = scanner.nextLine();
        Pahlawan pahlawan = new Pahlawan(namaHero, 150, 15, 50, 1);//di set new objek sesai nama hero

        Monster[] kumpulanMonster = new Monster[3];//array 3 elemen
        kumpulanMonster[0] = new Monster("Wei", 40, 10, "Hilichurl");
        kumpulanMonster[1] = new Monster("Mitachurl", 70, 15, "Mitachurl");
        kumpulanMonster[2] = new Monster("Pyro", 120, 25, "Slime");

        pahlawan.tampilkanStatus();
        boolean semuaMonsterKalah = true;//untuk cek status semua monster kalah atau belum (diguanakan di tiap dan akhir loop)
        for (Monster monsterSaatIni : kumpulanMonster){
            
            System.out.println("\nEncountering : " + monsterSaatIni.getNama());
            monsterSaatIni.tampilkanStatus();

            while(pahlawan.getHp() > 0 && monsterSaatIni.getHp() > 0){
                System.out.println("\nPilih Aksi Pahlawan:");
                System.out.println("1. Serang Biasa");
                System.out.println("2. Gunakan Skill (Mana Cost: 20)");
                System.out.println("3. Bertahan");
                System.out.print("Pilihan Anda (1-3): ");
                
                int pilihan = scanner.nextInt();
                int damageKeMonster = 0;//untuk diisi angka terimaDamage

                switch(pilihan){//switch case pilihan aksi pahlawan
                    case 1:
                        damageKeMonster = pahlawan.serang();
                        System.out.println(pahlawan.getNama() + " menyerang biasa dan menghasilkan " + damageKeMonster + " damage");
                        monsterSaatIni.terimaDamage(damageKeMonster);//ngurangin hp monster sesuai serangan hero
                        break;
                    case 2:
                        damageKeMonster = pahlawan.serang("Elemental Skill", 20);//pakai yang serang() overloading
                        if (damageKeMonster > 0){//hanya berhasil lakukan skill jika mana masih ada
                            System.out.println("Skill menghasilkan " + damageKeMonster + " damage");
                            monsterSaatIni.terimaDamage(damageKeMonster);
                        }
                        break;
                    case 3:
                        pahlawan.bertahan();
                        break;
                    default:
                        System.out.println("Pilihan tidak valid! Giliran saat ini di skip");
                        break;
                }

                if (monsterSaatIni.getHp() <= 0){//cek bila monster sudah mati
                    System.out.println("\nMenang : " + monsterSaatIni.getNama() + " telah dikalahkan.");
                    break;//keluar dari while battle loop
                }

                System.out.println("\nMonster " + monsterSaatIni.getNama() + " sedang beraksi..");
                int damageKePahlawan = monsterSaatIni.serang();
                System.out.println(monsterSaatIni.getNama() + " menyerang balik dan menghasilkan " + damageKePahlawan + " damage.");
                pahlawan.terimaDamage(damageKePahlawan);
                monsterSaatIni.bertahan();

                System.out.println("\nStatus Terkini:");//Tampilkan status terkini di akhir setiap ronde pertarungan
                System.out.println("- " + pahlawan.getNama() + " HP: " + pahlawan.getHp() + " | Mana: " + pahlawan.getMana());
                System.out.println("- " + monsterSaatIni.getNama() + " HP: " + monsterSaatIni.getHp());
            }

            // Jika HP pahlawan habis di tengah jalan, hentikan game (keluar dari loop for)
            if (pahlawan.getHp() <= 0){
                semuaMonsterKalah = false;
                break;
            }
        }

        System.out.println("\n=======================================");
        if (semuaMonsterKalah && pahlawan.getHp() > 0){
            System.out.println(pahlawan.getNama() + " berhasil mengalahkan semua monster.");
            System.out.println("SUCCESS!");
        } else {
            System.out.println("GAME OVER... " + pahlawan.getNama() + " telah gugur di dalam Dungeon.");
        }
        System.out.println("=======================================");

        scanner.close();

    }
}
