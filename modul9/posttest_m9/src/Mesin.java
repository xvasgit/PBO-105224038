public class Mesin{
    public String nomorSeri;
    public double kapasitasCC;

    public Mesin(String nomorSeri,double kapasitasCC){
        this.nomorSeri = nomorSeri;
        this.kapasitasCC = kapasitasCC;
    }
    public void tampilkanInfo() {
        System.out.println("Nomor seri mesin : " + nomorSeri + "\nKapasitas\t: " + kapasitasCC + " CC");
    }
}