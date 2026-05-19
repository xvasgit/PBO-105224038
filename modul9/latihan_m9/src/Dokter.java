public class Dokter {
    public String nama;
    public String spesialisasi;
    
    private Pasien pasien;

    public Dokter(String nama,String spesialisasi){
        this.nama = nama;
        this.spesialisasi = spesialisasi;
    }
    public void periksaPasien(Pasien p){
        this.pasien = p;
        System.out.println("Dokter " + this.nama + " dengan spesialisasi " + this.spesialisasi + " sedang memeriksa " + " pasien " + p.nama + " umur " + p.umur);
    }
}
