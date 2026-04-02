public class App {
    public static void main(String[] args) throws Exception {
        Barang item1 = new Barang("1", "Kursi");
        item1.setHarga(25000);
        item1.setKategori("Barang Kantor");
        // item1.stok = 50; //sengaja error sesuai soal, ini tidak bisa diakses karena "stok" pada class Barang diset sebagai private (hanya dapat diakses di dalam class Barang)
        item1.setStok(50);//ini baru yang bener, aksesnya melewati method setStok
        item1.tambahStok(-1);//stok minus
        item1.kurangiStok(-1);//stok minus
        item1.setHarga(-10000);//harga minus
        item1.kurangiStok(100);//kurangi stok melebihi batas
        item1.tampilkanDetailBarang();//tampilkan
    }
}
