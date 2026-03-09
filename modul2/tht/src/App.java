import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("=== SISTEM LOGICALC FASTSEND ===");
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama Klien : ");
        String klien = input.nextLine();
        System.out.print("Masukkan Berat (Kg) : ");
        double berat = input.nextDouble();
        System.out.print("Masukkan Jarak (Km) : ");
        int jarak = input.nextInt();
        System.out.print("Masukkan Jumlah Box : ");
        int box = input.nextInt();

        System.out.println("=== RESI PENGIRIMAN ===");
        System.out.println("Klien : " + klien);
        System.out.println("Total Box : " + box + " box");
        System.out.println("Kebutuhan Armada : [" + (int)(box/150) + "] Truk Penuh dan sisa [" + box%150 + "] box via Pikap");
        System.out.println("Estimasi Waktu : [" + (int)(jarak/60) + "] jam [" + jarak%60 + "] menit (Asumsi 60km/jam)");

        System.out.println("=== RINCIAN BIAYA ===");
        double dasarBiaya = jarak*15000 + berat*5500;
        System.out.println("Dasar Biaya : Rp" + dasarBiaya);
        double asuransiWajib = 3.5 / 100 * dasarBiaya;
        System.out.println("Asuransi (3.5%) : Rp" + asuransiWajib);
        System.out.println("-----------------------------------");
        System.out.println("Total Bayar : Rp" + (dasarBiaya + asuransiWajib));
        System.out.println("===================================");

        input.close();


    }
}
