public class UKTCalculator {
    private SkemaKalkulasiUKT skemaKalkulasi;

    public UKTCalculator(SkemaKalkulasiUKT skemaKalkulasi) {
        this.skemaKalkulasi = skemaKalkulasi;
    }

    public void jalankanKalkulasi() {
        skemaKalkulasi.hitungUKT();
    }
}
