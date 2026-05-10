public class LayananEkspedisi {
    protected String nomorResi;
    protected double beratAktualKg;
    protected double panjang;
    protected double lebar;
    protected double tinggi;

    public LayananEkspedisi(String no, double berat, double pan, double leb, double ting){
        this.nomorResi = no;
        this.beratAktualKg = berat;
        this.panjang = pan;
        this.lebar = leb;
        this.tinggi = ting;
    }

    public double hitungBeratEfektif(){
        double beratVolum = (panjang * lebar * tinggi) / 6000.0;
        if(beratVolum > beratAktualKg){
            return beratVolum;
        }else {
            return beratAktualKg;
        }
    }

    public void cetakResi(){
        System.out.println("====== Informasi Barang ======");
        System.out.println("Nomor Resi : " + nomorResi);
        System.out.println("Berat Efektif : " + this.hitungBeratEfektif());
    }

    public double hitungOngkir(){
        return 0.0;
    }
}


class LayananReguler extends LayananEkspedisi{
    public LayananReguler(String no, double berat, double pan, double leb, double ting){
        super(no, berat, pan, leb, ting);
    }

    @Override
    public double hitungOngkir(){
        return 15000.0 * super.hitungBeratEfektif();
    }

    public double hitungOngkir(boolean isMember, int jarakKm){
        double tarifDasar = this.hitungOngkir();
        if(isMember){
            tarifDasar = tarifDasar - (tarifDasar * 0.1);
        }
        return tarifDasar + (double)(500 * jarakKm);//casting ke double biar sama kek tarifDasar
    }
}

class LayananExpress extends LayananEkspedisi{
    public LayananExpress(String no, double berat, double pan, double leb, double ting){
        super(no, berat, pan, leb, ting);
    }

    @Override
    public double hitungOngkir(){
        return 30000.0 * super.hitungBeratEfektif();
    }

    public void klaimAsuransi(double nilaiBarang){
        if(nilaiBarang > 1000000.0){
            System.out.println("Klaim Asuransi VIP Rp" + nilaiBarang + " untuk resi [" + nomorResi + "] sedang diproses prioritas");
        }else{
            System.out.println("Klaim Asuransi Standar diproses dalam 7 hari kerja.");
        }
    }
}

class LayananInternasional extends LayananEkspedisi{
    String negaraTujuan;
    double nilaiBarangUSD;
    public LayananInternasional(String no, double berat, double pan, double leb, double ting, String negara, double USD){
        super(no, berat, pan, leb, ting);
        negaraTujuan = negara;
        nilaiBarangUSD = USD;
    }

    @Override
    public double hitungOngkir(){
        double ongkir = 200000.0 * super.hitungBeratEfektif();
        if(nilaiBarangUSD > 50.0){
            ongkir = ongkir + (ongkir * 0.2);//pajak
        }
        return ongkir;
    }

    public void cetakManifest(){
        System.out.println("Manifest Internasional ke " + negaraTujuan + " - Deklarasi Nilai: $" + nilaiBarangUSD);
    }



}