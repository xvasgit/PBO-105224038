import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {
        Dokter dokter1 = new Dokter("Adit","Organ dalam");
        Dokter dokter2 = new Dokter("Budi","Mata");
        Pasien pasien1 = new Pasien("Nate",20);
        Pasien pasien2 = new Pasien("Nadeline",35);

        dokter1.periksaPasien(pasien1);

        RumahSakit rumahsakit1 = new RumahSakit("RS Sehat Selalu");
        rumahsakit1.tambahDokter(dokter1);
        rumahsakit1.tambahDokter(dokter2);

        rumahsakit1.cetakDokter();
        rumahsakit1.cetakDokter();

        rumahsakit1 = null;
        rumahsakit1.tambahDokter(dokter1);
        rumahsakit1.tambahDokter(dokter2);
        //Entitas yang tetap dalam memori adalah dokter1, dokter2, pasien1,pasien2
        //Entitas yang dipastikan dihapus adalah rumahsakit1 dan isinya (objek-objek Ruangan)
    }
}
