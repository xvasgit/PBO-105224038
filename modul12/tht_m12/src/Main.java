public class Main {
    public static void main(String[] args) {
        DatabaseStorage databaseMasaDepan = new NoSQLCloudConnection();
        SistemKRSManager krsManager = new SistemKRSManager(databaseMasaDepan);
        
        SkemaKalkulasiUKT mahasiswaMBKM = new KalkulasiMBKM();
        
        krsManager.prosesPengisianKRS(mahasiswaMBKM);
        
        System.out.println("--- Simulasi Mata Kuliah ---");
        MataKuliahDasar mkTeori = new MataKuliahTeori();
        mkTeori.infoMataKuliah();
        
        MataKuliahPraktikum mkPraktikum = new MataKuliahPraktikum();
        mkPraktikum.infoMataKuliah();
        mkPraktikum.cekPeralatanPraktikum();
    }
}
