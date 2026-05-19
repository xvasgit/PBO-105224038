public class Ban{
    public String merk;
    public double ukuranRing;
    public Ban(String merk,double ukuranRing){
        this.merk = merk;
        this.ukuranRing = ukuranRing;
    }
    public void tampilkanInfo(){System.out.println("Ban " + merk + ", ukuran ring " + ukuranRing);}
}