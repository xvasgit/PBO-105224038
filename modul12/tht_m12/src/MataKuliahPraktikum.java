public class MataKuliahPraktikum implements MataKuliahDasar, OperasiPraktikum {
    @Override
    public void infoMataKuliah() {
        System.out.println("Memproses mata kuliah Praktikum...");
    }

    @Override
    public void alokasiAsistenLab() {
        System.out.println("Sedang mengalokasikan asisten lab...");
    }

    @Override
    public void cekPeralatanPraktikum() {
        System.out.println("Sedang mengecek peralatan praktikum...");
    }
}
