public class CustomerService {
    private String namaCS;
    public Nasabah nasabah;

    public void laporKeluhan(Nasabah nasabah){//asosiasi dengan nasabah
        this.nasabah = nasabah;
        System.out.println("Nasabah atas nama " + this.nasabah.getNama() + " mengeluhkan..");
    }
}
