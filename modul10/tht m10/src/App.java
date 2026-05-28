public class App {
    public static void main(String[] args) throws Exception {
        SistemGudang gudang = new SistemGudang();

        gudang.tambahBarangBaru("01","Kursi Kayu","Perabotan",5);
        gudang.tambahBarangBaru("02", "Meja", "Perabotan", 10);
        gudang.tambahBarangBaru("03", "Tas", "Aksesoris", 15);

        gudang.tambahStok("04",10);//gagal
        gudang.tambahStok("02",10);
        gudang.kurangiStok("03", 10);
        gudang.kurangiStok("03", 7);//gagal

        System.out.println("");
        gudang.cetakLaporan();
    }
}
