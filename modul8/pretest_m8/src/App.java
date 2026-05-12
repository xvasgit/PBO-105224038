abstract class Karyawan{
    protected String nama;
    Karyawan(String name){
        nama = name;
    }

    abstract double hitungGaji();
}

class Programmer extends Karyawan{
    private double gajiPokok;
    Programmer(String name, double gaji){
        super(name);
        gajiPokok = gaji;
    }

    double hitungGaji(){
        return gajiPokok;
    }
}




public class App {
    public static void main(String[] args) throws Exception {
        Programmer dev = new Programmer("Orang", 100);
        System.out.println("Nama : " + dev.nama + "\nGaji : USD" + dev.hitungGaji());
    }
}
