package rental;

public class Kendaraan {
    String nomorPolisi,merk;
    int tahunProduksi;
    double hargaSewaDasar;
    public Kendaraan(String no, String merek, int tahun, double harga){
        this.nomorPolisi = no;
        this.merk = merek;
        this.tahunProduksi = tahun;
        this.hargaSewaDasar = harga;
    }

    public void displayInfo(){
        System.out.println("Nomor Polisi\t : " + this.nomorPolisi);
        System.out.println("Merk\t\t : " + this.merk);
        System.out.println("Tahun Produks\t : " + this.tahunProduksi);
        System.out.println("Harga Sewa\t : " + this.hargaSewaDasar);
    }

    public double hitungHargaSewa(int hari){
        if(this.tahunProduksi < 2015){
            double diskon = 0.10 * (double)hari * this.hargaSewaDasar;
            return (double)hari * this.hargaSewaDasar - (diskon);
        }else{
            return (double)hari * this.hargaSewaDasar;
        }
        
    }

}
