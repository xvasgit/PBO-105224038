import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<LayananEkspedisi> layanan = new ArrayList<LayananEkspedisi>();

        LayananReguler Reguler = new LayananReguler("REG-11", 2, 50, 50, 50);
        LayananExpress Express = new LayananExpress("EXP-22", 5, 10, 10, 10);
        LayananInternasional Internasional = new LayananInternasional("INT-33", 3, 20, 20, 20, "Korea", 100.0);

        layanan.add(Reguler);
        layanan.add(Express);
        layanan.add(Internasional);

        double totalPendapatanPerusahaan = 0.0;
        for(LayananEkspedisi listLayanan : layanan){//foreach loop, upcasting tiap objek dalam ArrayList
            listLayanan.cetakResi();
            totalPendapatanPerusahaan += listLayanan.hitungOngkir();

            //pengecekan instanceof dan downcasting ke tiap subclass
            if(listLayanan instanceof LayananReguler){
                LayananReguler reg = (LayananReguler)listLayanan;
                System.out.println("Harga : Rp" + reg.hitungOngkir(true,25));
            }else if(listLayanan instanceof LayananExpress){
                LayananExpress exp = (LayananExpress)listLayanan;
                exp.klaimAsuransi(1500000);
            }else if(listLayanan instanceof LayananInternasional){
                LayananInternasional inter = (LayananInternasional)listLayanan;
                inter.cetakManifest();
            }

            System.out.println("\n");
        }

        System.out.println("Ongkir dasar : Rp" + totalPendapatanPerusahaan);
    }
}
