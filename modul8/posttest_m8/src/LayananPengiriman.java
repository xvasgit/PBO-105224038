public abstract class LayananPengiriman {
    protected String noResi;
    protected double beratBarang;
    protected double jarakTempuh;

    public LayananPengiriman(String noResi, double beratBarang, double jarakTempuh){
        this.noResi = noResi;
        this.beratBarang = beratBarang;
        this.jarakTempuh = jarakTempuh;
    }

    public void cetakResi(){
        System.out.println("\t\tResi Pengiriman");
        System.out.println("Nomor Resi : " + this.noResi);
        System.out.println("Berat Barang : " + this.beratBarang + " kg");
        System.out.println("Jarak Tempuh : " + this.jarakTempuh + " km");
    }

    public abstract double hitungOngkosKirim();
}

interface LacakKargo {
    void updateStatus(String status);

    String cekLokasiTerakhir();
}

interface Asuransi {
    double hitungPremi(double nilaiBarang);

    default void cetakPolis() {
        System.out.println("Polis Asuransi aktif: Menanggung kehilangan dan kerusakan fisik sebesar 100% dari nilai barang.");
    }
}

class PengirimanDarat extends LayananPengiriman implements LacakKargo{
    private String jenisTruk;
    private String statusSaatIni;

    public PengirimanDarat(String noResi, double beratBarang, double jarakTempuh, String jenisTruk){
        super(noResi, beratBarang, jarakTempuh);
        this.jenisTruk = jenisTruk;
        this.statusSaatIni = "Menunggu Kurir";
    }

    @Override
    public double hitungOngkosKirim() {
        double ongkos = (beratBarang * 5000) + (jarakTempuh * 2000);
        if (jenisTruk.equalsIgnoreCase("Tronton")){ongkos +=150000;}
        return ongkos;
    }

    @Override
    public void updateStatus(String status) {statusSaatIni = status;}

    @Override
    public String cekLokasiTerakhir() {return statusSaatIni;}
}

class PengirimanUdara extends LayananPengiriman implements LacakKargo, Asuransi{
    private String nomorPenerbangan;
    private String statusSaatIni;
    private double nilaiBarang;

    public PengirimanUdara(String noResi, double beratBarang, double jarakTempuh, String nomorPenerbangan, double nilaiBarang){
        super(noResi, beratBarang, jarakTempuh);
        this.nomorPenerbangan = nomorPenerbangan;
        this.nilaiBarang = nilaiBarang;
        this.statusSaatIni = "Menunggu Jadwal Penerbangan";
    }
    public double getnilaiBarang(){return nilaiBarang;}
    @Override
    public double hitungOngkosKirim() {return (beratBarang * 25000) + (jarakTempuh * 5000);}

    @Override
    public double hitungPremi(double nilaiBarang) {return 0.03 * nilaiBarang;}

    public double hitungPremi(){return hitungPremi(nilaiBarang);}

    @Override
    public void updateStatus(String status) {this.statusSaatIni = status;}

    @Override
    public String cekLokasiTerakhir() {return this.statusSaatIni;}
}
