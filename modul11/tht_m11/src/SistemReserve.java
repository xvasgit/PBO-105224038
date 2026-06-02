import java.util.ArrayList;
import java.util.List;

public class SistemReserve{
    List<KeretaApi> daftarKereta = new ArrayList<>();//simpan data berisi informasi kereta api dalam collection ArrayList

    public SistemReserve() {
        //tersimpan di memori sistem reservasi
        daftarKereta.add(new KeretaApi("K01", "Argo Bromo", "JKT - SBY", 50));
        daftarKereta.add(new KeretaApi("K02", "Parahyangan", "JKT - BDG", 15));
    }

    public void pesan(String kodeKereta, String NIK, String namaPenumpang, int jumlahtiket) throws RuteTidakDitemukanException, TiketHabisException{
        //1. cek NIK
        //pakai java stream (chars untuk memecah menjadi karakter-karakter, allMatch untuk mengecek apakah semua karakter itu sesuai dengan kondisi isDigit)
        if(NIK.length() != 16 || !NIK.chars().allMatch(Character::isDigit)){//kondisi jika tidak terpenuhi
            throw new DataPenumpangTidakValidException("NIK tidak valid!");
        }

        //2. cek kode kereta (cari dulu keretanya)
        KeretaApi targetKereta = null;
        for (KeretaApi k : daftarKereta) {
            if (k.kodeKereta.equalsIgnoreCase(kodeKereta)) {
                targetKereta = k;
                break;
            }
        }
        if (targetKereta == null){//baru cek kode
            throw new RuteTidakDitemukanException("Kode kereta '" + kodeKereta + "' atau rute tidak ditemukan!");
        }

        //3. cek sisa kursi
        if (jumlahtiket > targetKereta.sisaKursi) {
            throw new TiketHabisException(targetKereta.namaKereta, targetKereta.sisaKursi);
        }

        //jika semua kondisi terpenuhi dan pemesanan tiket berhasil
        targetKereta.sisaKursi -= jumlahtiket;
        System.out.println("Reservasi berhasil.");
    }

    public void tampilJadwal(){
        for(KeretaApi k : daftarKereta){
            System.out.println("\n");
            System.out.println("Kode kereta : " + k.kodeKereta);
            System.out.println("Nama kereta : " + k.namaKereta);
            System.out.println("Rute kereta : " + k.rutePerjalanan);
            System.out.println("Sisa kursi : " + k.sisaKursi);
            System.out.println("");
        }
    }
}
