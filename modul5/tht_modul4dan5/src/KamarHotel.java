public class KamarHotel {
    private String nomorKamar,tipeKamar;
    private int kapasitasMaksimal;
    private double hargaPerMalam;
    private boolean isTersedia;

    KamarHotel(String no, String tipe, int kapasitasmax) {//konstruktor 1
        this.nomorKamar = no;
        this.tipeKamar = tipe;
        this.kapasitasMaksimal = kapasitasmax;
        this.hargaPerMalam = 0;
        this.isTersedia = true;
    }
    KamarHotel(String no, String tipe, int kapasitasmax, double harga){//konstruktor 2
        this.nomorKamar = no;
        this.tipeKamar = tipe;
        this.kapasitasMaksimal = kapasitasmax;
        this.hargaPerMalam = harga;
        this.isTersedia = true;
    }

    //getter semua atribut
    public String getNomorKamar(){
    return nomorKamar;
    }
    public String getTipeKamar(){
        return tipeKamar;
    }
    public int getKapasitasMaksimal(){
        return kapasitasMaksimal;
    }
    public double getHargaPerMalam(){
        return hargaPerMalam;
    }
    public boolean getIsTersedia(){
        return isTersedia;
    }

    //setter semua atribut
    public void setTipeKamar(String tipe){
        if(tipe.equalsIgnoreCase("Reguler")){
            this.tipeKamar = "Reguler";
        }else if(tipe.equalsIgnoreCase("Premium")){
            this.tipeKamar = "Premium";
        }else if(tipe.equalsIgnoreCase("Suite")){
            this.tipeKamar = "Suite";
        }else{
            System.out.println("Tipe kamar tidak valid, otomatis akan diset sebagai Reguler.");
            this.tipeKamar = "Reguler";
        }
    }
    public void setHargaPerMalam(double harga){
        if(harga < 50000.0){
            System.out.println("Harga per malam tidak boleh kurang dari Rp50.000, otomatis akan diset sebagai Rp50.000.");
            this.hargaPerMalam = 50000.0;
        }else{
            this.hargaPerMalam = harga;
        }
    }
    public void setNomorKamar(String no){
        this.nomorKamar = no;
    }
    public void setKapasitasMaksimal(int kapasitas){
        this.kapasitasMaksimal = kapasitas;
    }
    public void setIsTersedia(boolean tersedia){
        this.isTersedia = tersedia;
    }
    

    public void pesanKamar(){//method overloading buat pesanKamar()
        if(isTersedia == true){
            this.isTersedia = false;
        }else{
            System.out.println("Kamar ini sudah terisi!");
        }
    }
    public void pesanKamar(int jumlahTamu){
        if(isTersedia == true){
            if(jumlahTamu > this.kapasitasMaksimal){
                System.out.println("Tamu yang memesan melebihi kapasitas kamar!");
            }else{
                this.isTersedia = false;
            }
        }else{
            System.out.println("Kamar ini sudah terisi!");
        }
    }
    public void batalPesan(){
        this.isTersedia = true;
    }

    public double hitungTotalBayar(int jumlahMalam) {
        return jumlahMalam * this.hargaPerMalam;
    }
    public double hitungTotalBayar(int jumlahMalam, String kodeVoucher){
        if(kodeVoucher.equalsIgnoreCase("PROMO") && jumlahMalam >= 3){
            double diskon = 0.20 * jumlahMalam * this.hargaPerMalam;
            return jumlahMalam * this.hargaPerMalam - diskon;
        }else{
            System.out.println("Penggunaan Voucher tidak berlaku.");
            return jumlahMalam * this.hargaPerMalam;
        }
    }

    public void cetakProfil(){//method cetak profil kamar
        System.out.println("=============================");
        System.out.println("\t\tPROFIL KAMAR HOTEL");
        System.out.println("Nomor Kamar\t\t: " + this.nomorKamar);
        System.out.println("Tipe Kamar\t\t: " + this.tipeKamar);
        System.out.println("Kapasitas Maks\t\t: " + this.kapasitasMaksimal + " orang");
        System.out.println("Harga Per Malam\t\t: Rp" + hargaPerMalam);
        if(isTersedia == true){
            System.out.println("Status\t\t\t: Tersedia");
        }else{
            System.out.println("Status\t\t\t: Tidak Tersedia");
        }
        System.out.println("=============================");
    }
}
