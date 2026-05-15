public class App {
    public static void main(String[] args) throws Exception {
        PengirimanDarat kirimdarat = new PengirimanDarat("DRT-001", 50.0, 100.0, "Tronton");
        PengirimanUdara kirimudara = new PengirimanUdara("UDR-999", 10.0, 800.0, "GA-123", 5000000);

        kirimdarat.updateStatus("Sedang di jalan tol Cipali");
        kirimudara.updateStatus("Transit di Bandara Soekarno-Hatta");

        LayananPengiriman[] layanan = {kirimdarat, kirimudara};

        for(LayananPengiriman daftar : layanan){
            System.out.println("");
            daftar.cetakResi();
            double ongkos = daftar.hitungOngkosKirim();
            System.out.println("Ongkos kirim saat ini : Rp" + ongkos);
            if(daftar instanceof LacakKargo){//cek apabila objek dalam array daftar ada berasal dari interface LacakKargo
                LacakKargo lacak = (LacakKargo)daftar;//downcasting ke LacakKargo
                System.out.println("Lokasi terkahir : " + lacak.cekLokasiTerakhir());//polimorphism 
            }
            double premi = 0.0;
            if(daftar instanceof Asuransi){
                Asuransi asuransi = (Asuransi) daftar;
                asuransi.cetakPolis();

                if(asuransi instanceof PengirimanUdara){
                    PengirimanUdara udara = (PengirimanUdara)asuransi;
                    premi = udara.hitungPremi(udara.getnilaiBarang());
                }
                ongkos+=premi;
            }

            System.out.println("TOTAL TAGIHAN : Rp" + ongkos);
            System.out.println("=================================\n");
        }
    }
}
