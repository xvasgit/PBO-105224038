package perusahaan;

public class Karyawan {
    private String idKaryawan, nama;
    private int tahunMasuk;
    private double gajiPokok, ratingKinerja;

    public Karyawan(String id,String nama,int tahun,double gaji,double rating){
        this.idKaryawan = id;
        this.nama = nama;
        this.tahunMasuk = tahun;
        this.gajiPokok = gaji;
        if(rating >= 1.0 && rating <= 5.0){
            this.ratingKinerja = rating;
        }else{
            System.out.println("Rating tidak valid, otomatis diset menjadi 3.0");
            this.ratingKinerja = 3.0;
        }
    }

    //semua getter
    public String getIdKaryawan(){
        return idKaryawan;
    }
    public String getNama(){
        return nama;
    }
    public int getTahunMasuk(){
        return tahunMasuk;
    }
    public double getGajiPokok(){
        return gajiPokok;
    }
    public double getRatingKinerja(){
        return ratingKinerja;
    }

    //semua setter
    public void setIdKaryawan(String id){
        this.idKaryawan = id;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setTahunMasuk(int tahun){
        this.tahunMasuk = tahun;
    }

    public void setGajiPokok(double gaji){
        this.gajiPokok = gaji;
    }
    //untuk setter ratingKinerja saya asumsikan tidak pakai fitur otomatis set nilai jadi 3.0
    //ketika input tidak valid
    public void setRatingKinerja(double rating){
        if (rating >= 1.0 && rating <= 5.0) {
            this.ratingKinerja = rating;
        } else {
            System.out.println("Rating tidak valid (harus 1.0-5.0)");
        }
    }

    public double hitungGajiTotal(){
        int MasaKerja = 2026 - this.tahunMasuk;//asumsi tahun ini 2026
        double bonusLoyalitas = 0.05 * this.gajiPokok * MasaKerja;//perhitungan bonus loyalitas
        if(this.ratingKinerja<2.5){
            //jika rating<2.5 maka gaji dan bonus dipotong 10%
            double pemotongan = (this.gajiPokok + bonusLoyalitas) *  0.1;
            return this.gajiPokok + bonusLoyalitas - pemotongan;
        }else{
            //jika rating diatas 2.5 maka total gaji normal
            return this.gajiPokok + bonusLoyalitas;
        }
    }

    public void displayInfo(){
        //saya pakai \t bagaikan menggunakan "tab" agar output di terminal rapih
        System.out.println("ID Karyawan : " + idKaryawan);
        System.out.println("Nama\t: " + nama);
        System.out.println("Tahun Masuk : " + tahunMasuk);
        System.out.println("Rating\t: " + ratingKinerja);
        System.out.println("Gaji Pokok : Rp" + gajiPokok);
    }
}
