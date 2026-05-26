import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        //Nomor 1
        Map<String,Film> daftarFilm = new HashMap<>();

        Film film1 = new Film("AADC", 50000);
        Film film2 = new Film("Pesta Babi", 100000);
        Film film3 = new Film("G30SPKI", 40000);
        daftarFilm.put("F01",film1);
        daftarFilm.put("F02",film2);
        daftarFilm.put("F03",film3);


        //Nomor 2
        Map<String, Set<String>> kursiTerpesanPerFilm = new HashMap<>();//Kode film, set kursi (kode-kode kursi)

        //Nomor 3
        ArrayList<RiwayatTransaksi> daftarRiwayat = new ArrayList<>();
        
        String[] namaPemesan = {"Adit", "Bima", "Citra", "Dewi"};
        String[] kodeFilmPesanan = {"F01", "F03", "F02", "F01"};
        String[] kodeKursiPesanan = {"A1", "A2", "B2", "A1"};
        
        for (int i = 0; i < namaPemesan.length; i++) {
            String nama = namaPemesan[i];
            String kodeFilm = kodeFilmPesanan[i];
            String kodeKursi = kodeKursiPesanan[i];

            //ambil kode film yang udah ada
            Film film = daftarFilm.get(kodeFilm);
            //lanjut ke perulangan berikutnya jika film tidak tersedia
            if (film == null){
                System.out.println("(GAGAL) Kode film " + kodeFilm + " tidak ditemukan.");
                continue;
            }

            //Jika kode film tidak ada di Map kursi, maka buat hashSet baru di key (map) tersebut yang isinya deretan kode kursi
            if (!kursiTerpesanPerFilm.containsKey(kodeFilm)) {
            kursiTerpesanPerFilm.put(kodeFilm, new HashSet<>());
            }
            //Ambil hashSet dari deretan kode kursi pada kode film (key) tertentu
            Set<String> kursiTerpesan = kursiTerpesanPerFilm.get(kodeFilm);

            // add pada Set bernilai false jika kursi sudah pernah masuk sebelumnya
            if (!kursiTerpesan.add(kodeKursi)) {
                System.out.println("(GAGAL) Kursi " + kodeKursi + " untuk film " + film.judul + " sudah dipesan.");
                continue;
            }

            daftarRiwayat.add(new RiwayatTransaksi(nama, kodeKursi, film));
            System.out.println("(SUKSES): " + nama + " memesan " + film.judul + " kursi " + kodeKursi + ".");

            System.out.println("");
        }

        System.out.println();
        System.out.println("\t\tRIWAYAT TRANSAKSI");

        for (int i = 0; i < daftarRiwayat.size(); i++) {
            RiwayatTransaksi transaksi = daftarRiwayat.get(i);
            System.out.println("Nama Pemesan : " + transaksi.namaPemesan);
            System.out.println("Judul Film : " + transaksi.film.judul);
            System.out.println("Nomor Kursi : " + transaksi.noKursi);
            System.out.println("Harga Tiket : Rp" + transaksi.film.hargaTiket);
        }
    }
}
