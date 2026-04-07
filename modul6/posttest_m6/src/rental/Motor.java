package rental;

public class Motor extends Kendaraan{
    int kapasitasMesin;
    public Motor(String no, String merek, int tahun, double harga,int kapasitas){
        super(no,merek,tahun,harga);
        this.kapasitasMesin = kapasitas;
    }

    @Override
    public double hitungHargaSewa(int hari){
        double sewaAwal = super.hitungHargaSewa(hari);
        if(this.kapasitasMesin >= 250){
            double pajakMewah = 25000.0 * (double)hari;
            return sewaAwal + pajakMewah;
        }else{
            return sewaAwal;
        }
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Kapasitas Mesin\t : " + this.kapasitasMesin + " CC");
    }
}
