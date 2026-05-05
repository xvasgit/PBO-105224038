import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<MetodePembayaran> metode = new ArrayList<MetodePembayaran>();

        EWallet objek1 = new EWallet();
        KartuKredit objek2 = new KartuKredit();

        metode.add(objek1);
        metode.add(objek2);

        for(int i=0;i<2;i++){
            MetodePembayaran metopem = metode.get(i);//upcasting ke superclass
            metopem.bayar(100000);//polymorphism

            if(metopem instanceof EWallet){//instanceof cek EWallet
                EWallet ewalet = (EWallet)metopem;//downcasting ewallet
                ewalet.bayar(100000,"08139563111");
            }else if(metopem instanceof KartuKredit){//instanceof cek KartuKredit
                KartuKredit kartukred = (KartuKredit)metopem;//downcasting ke KartuKredit
                kartukred.verifikasiPIN();
            }
        }
    }
}
