public class App {
    public static void main(String[] args) throws Exception {
        Ban ban1 = new Ban("Lightyear", 15);
        Ban ban2 = new Ban("Lightyear", 15);
        Ban ban3 = new Ban("Lightyear", 15);
        Ban ban4 = new Ban("Lightyear", 15);
        Ban[] kumpulanBan ={ban1, ban2, ban3, ban4};

        Mobil mobil = new Mobil("Toyota", "Hitam", "MSN-293", 2000);
        mobil.pasangSetBan(kumpulanBan);

        Montir montir = new Montir("123", "Budi");
        montir.lakukanQualityControl(mobil);

        //Skenario saat uji kelayakan gagal, mobil di null
        System.out.println("Gagal uji kelayakan (mobil dihancurkan");
        mobil = null;

        ban1.tampilkanInfo();//di sini, ban yang bersifat independen masih bisa digunakan method nya
        ban4.tampilkanInfo();

        mobil.tampilkanSpesifikasi();//mencoba memanggil method objek mesin, hasilnya null
        //Sedangkan, objek mesin ikut hancur bersama mobil karena hubungannya bersifat composition.
        //Mesin tidak bisa dipanggil lagi karena tidak ada akses menuju objek itu dari luar objek mobil

    }
}
