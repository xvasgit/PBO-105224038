public class TiketHabisException extends Exception{
    String namaKereta;
    int sisaKursi;
    public TiketHabisException(String namaKereta, int sisaKursi){
        super("Pemesanan gagal! Tiket untuk kereta " + namaKereta + " tidak mencukupi sisa kursi.");
        this.namaKereta = namaKereta;
        this.sisaKursi = sisaKursi;
    }
}
