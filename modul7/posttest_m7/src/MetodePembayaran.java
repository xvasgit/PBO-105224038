public class MetodePembayaran {
    public void bayar(double nominal){
        System.out.println("Memproses pembayaran umum sebesar Rp" + nominal);
    }

}

class EWallet extends MetodePembayaran{
    @Override
    public void bayar(double nominal){
        System.out.println("Memotong saldo E-Wallet sebesar Rp" + nominal);
    }
    public void bayar(double nominal,String nomorHp){
        System.out.println("Memotong saldo E-Wallet sebesar Rp" + nominal + " dari nomor " + nomorHp);
    }
}
class KartuKredit extends MetodePembayaran{
    @Override
    public void bayar(double nominal){
        System.out.println("Mencetak tagihan Kartu Kredit sebesar Rp" + nominal);
    }
    public void verifikasiPIN(){
        System.out.println("Memverifikasi PIN Kartu Kredit.. BERHASIL!");
    }
}

