public class Montir{
    public String idMontir;
    public String nama;

    public Montir(String idMontir, String nama) {
        this.idMontir = idMontir;
        this.nama = nama;
    }

    public void lakukanQualityControl(Mobil m){//asosiasi
        System.out.println("\n(Quality Control)");
        System.out.println("Montir " + nama + " dengan ID " + idMontir + " sedang memeriksa mobil...");
        m.tampilkanSpesifikasi();
    }
}