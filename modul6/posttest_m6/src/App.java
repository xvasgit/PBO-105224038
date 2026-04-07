import rental.*;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Kendaraan> daftarSewa = new ArrayList<Kendaraan>();

        Mobil mobil1 = new Mobil("B 1011 A", "Toyota Fortuner", 2014, 300000.0, 7);
        Mobil mobil2 = new Mobil("F 2002 B", "Bugatti Bolide", 2020, 250000.0, 2);
        Motor motor1 = new Motor("F 1827 F", "Honda Vario Moge", 2026, 200000.0, 300);
        Motor motor2 = new Motor("A 1990 ABC", "Honda Beat karbuu", 2019, 100000.0, 110);

        //buat ngeadd tiap objek ke arraylist daftarSewa
        daftarSewa.add(mobil1);
        daftarSewa.add(mobil2);
        daftarSewa.add(motor1);
        daftarSewa.add(motor2);

        for (int i=0; i<daftarSewa.size();i++){
            Kendaraan KENDARAAN = daftarSewa.get(i);//tiap objek mobil/motor di upcasting ke KENDARAAN
            System.out.println("======================");
            System.out.println("Data Kendaraan " + (i+1)); 
            KENDARAAN.displayInfo();//polimorfisme setelah upcasting tiap objek
            double totalBiaya = KENDARAAN.hitungHargaSewa(5);
            System.out.println("Total Biaya Sewa selama 5 Hari : Rp" + totalBiaya);
        }
    }
}
