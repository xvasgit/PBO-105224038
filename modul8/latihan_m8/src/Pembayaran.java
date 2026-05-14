public abstract class Pembayaran {
    protected String namaPembayar;
    protected double nominal;

    public Pembayaran(String nama, double nom){
        namaPembayar = nama;
        nominal = nom;
    }

    public void tampilkanDetail(){
        System.out.println("Nama pembayar : " + namaPembayar);
        System.out.println("Nominal transaksi : " + nominal);
    }

    public abstract void prosesPembayaran();//abstract method
}

class KartuKredit extends Pembayaran implements Keamanan{//inherit abstract parent class dan implementasi interface
    private String nomorKartu;
    public KartuKredit(String nama, double nom, String kartu){
        super(nama,nom);//panggil constructor induk dulu
        nomorKartu = kartu;
    }
    @Override
    public void prosesPembayaran(){
        double tagihan = nominal * 0.02 + nominal;//tambahan biaya admin 2%
        System.out.println("Biaya admin : Rp" + nominal * 0.02);
        System.out.println("Total tagihan : Rp" + tagihan);
    }

    public boolean autentikasi(){
        System.out.println("Autentikasi PIN berhasil.");
        return true;
    }
}

class EWallet extends Pembayaran implements Keamanan{//juga inherit abstract parent class dan implementasi interface
    private String nomorHP;
    public EWallet(String nama, double nom, String hp){//panggil constructor induk dulu
        super(nama,nom);
        nomorHP = hp;
    }

    @Override
    public void prosesPembayaran(){
        System.out.println("Total tagihan : Rp" + nominal);
    }

    public boolean autentikasi(){
        System.out.println("Autentikasi PIN berhasil.");
        return true;
    }
}
