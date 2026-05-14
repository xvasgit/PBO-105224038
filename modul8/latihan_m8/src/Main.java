import java.util.ArrayList;
public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Pembayaran> list = new ArrayList<Pembayaran>();

        KartuKredit kartukredit = new KartuKredit("Budi", 10000, "123");
        EWallet ewallet = new EWallet("Bidu", 50000, "345");

        list.add(kartukredit);
        list.add(ewallet);

        for(Pembayaran telusur : list){
            telusur.tampilkanDetail();
            boolean bayar = false;
            if(telusur instanceof KartuKredit){
                KartuKredit kredit = (KartuKredit)telusur;
                bayar = kredit.autentikasi();
            }else if(telusur instanceof EWallet){
                EWallet wallet = (EWallet)telusur;
                bayar = wallet.autentikasi();
            }
            if(bayar){ telusur.prosesPembayaran();}
        }

    }
}
