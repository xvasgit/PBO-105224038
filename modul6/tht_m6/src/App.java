import perusahaan.*;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Karyawan> daftarKayawan = new ArrayList<Karyawan>();

        Karyawan objek1 = new Karyawan("381", "Budi Buda", 2020, 1000000, 2.0);
        Developer objek2 = new Developer("382","King Sawit",2018,2000000,4.0,"Senior",20);
        Developer objek3 = new Developer("383", "Hengker Handal", 2024, 1500000, 2.8, "Mid", 15);
        Manajer objek4 = new Manajer("380", "Bos MBG", 2015, 5000000, 4.8, "IT", 10);
        Manajer objek5 = new Manajer("379", "Pria Solo", 2025, 4000000, 3.5, "HR", 3);

        //tiap objek masuk ke ArrayList dengan .add secara berurutan
        daftarKayawan.add(objek1);
        daftarKayawan.add(objek2);
        daftarKayawan.add(objek3);
        daftarKayawan.add(objek4);
        daftarKayawan.add(objek5);

        double anggaranGaji = 0;//inisialisasi total anggaran gaji yang harus disiapkan perusahaan
        double jumlahRata = 0;//inisialisasi rata-rata rating kinerja

        //inisialisasi gaji terbesar
        double gajiTerbesar = 0;
        String namaTerbesar = "";

        //.size untuk batas size dari ArrayList ini
        for (int i=0; i<daftarKayawan.size();i++){
            Karyawan KARYAWAN = daftarKayawan.get(i);//tiap objek developer/manajer di upcasting ke KARYAWAN
            System.out.println("======================");
            System.out.println("Data Karyawan " + (i+1)); 
            KARYAWAN.displayInfo();//polimorfisme setelah upcasting tiap objek
            double totalGaji = KARYAWAN.hitungGajiTotal();
            System.out.println("Total Gaji Bulan Ini : Rp" + totalGaji);

            anggaranGaji = anggaranGaji + totalGaji;//menghitung anggaran gaji tiap iterasi
            jumlahRata = jumlahRata + KARYAWAN.getRatingKinerja();//menghitung jumlah rating kinerja
            
            if(totalGaji > gajiTerbesar){//update karyawan dengan gaji terbesar tiap iterasi
                namaTerbesar = KARYAWAN.getNama();
                gajiTerbesar = totalGaji;
            }
        }

        System.out.println("\n======================");
        System.out.println("Karyawan Dengan Gaji Bersih Terbesar : " + namaTerbesar);
        System.out.println("Total Anggaran Gaji : Rp" + anggaranGaji);
        System.out.println("Rata-rata Rating Kinerja : " + jumlahRata / daftarKayawan.size());
    }
}
