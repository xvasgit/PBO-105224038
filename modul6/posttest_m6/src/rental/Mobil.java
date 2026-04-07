package rental;

public class Mobil extends Kendaraan{
    int kapasitasPenumpang;
    public Mobil(String no, String merek, int tahun, double harga,int kapasitas){
        super(no,merek,tahun,harga);
        this.kapasitasPenumpang = kapasitas;
    }

    @Override
    public double hitungHargaSewa(int hari){
        double sewaAwal = super.hitungHargaSewa(hari);
        double asuransi = 50000.0 * (double)hari;
        if(this.kapasitasPenumpang > 5){
            double flat = 50000.0;
            return asuransi + sewaAwal + flat;
        }else{
            return asuransi + sewaAwal;
        }
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Kapasitas Penumpang\t : " + this.kapasitasPenumpang);
    }
}
