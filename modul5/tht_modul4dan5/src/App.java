public class App {
    public static void main(String[] args) throws Exception {
        KamarHotel kamar1 = new KamarHotel("101", "Reguler", 3);
        KamarHotel kamar2 = new KamarHotel("202", "Suite", 3, 500000.0);

        //setter input tidak valid
        kamar1.setTipeKamar("Presidential");//hasil jadi reguler
        kamar1.setHargaPerMalam(-10000);//hasil jadi 50000

        //pesan kamar
        kamar2.setKapasitasMaksimal(2);//buat kapasitas maks 2
        kamar2.pesanKamar(4);//kapasitas lebih
        kamar2.pesanKamar(2);//kapasitas cukup
        kamar2.pesanKamar();//hasil peringatan

        //tagihan
        double tagihan1 = kamar1.hitungTotalBayar(2, "PROMO");//promo gagal karena < 3 malam
        System.out.println("Total Tagihan Kamar 1: Rp" + tagihan1);
        double tagihan2 = kamar2.hitungTotalBayar(4, "PROMO");//promo berhasil
        System.out.println("Total Tagihan Kamar 2: Rp" + tagihan2);

        //cetak profil
        System.out.println("===== STRUK INFORMASI AKHIR =====");
        System.out.println("-- Kamar 1 --");
        kamar1.cetakProfil();
        System.out.println("-- Kamar 2 --");
        kamar2.cetakProfil();
    }
}
