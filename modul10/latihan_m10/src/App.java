import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        //Soal 1
        Buku buku1 = new Buku("1234567890", "Buku terlarang");
        Buku buku2 = new Buku("931373103", "Kamus Inggris");
        Buku buku3 = new Buku("0987654321", "Kamus Indonesia");
        Map<String, Buku> katalogBuku = new HashMap<>();
        katalogBuku.put("1234567890",buku1);
        katalogBuku.put("931373103",buku2);
        katalogBuku.put("0987654321",buku3);
        System.out.println("Katalog buku : " + katalogBuku);

        //Soal 2
        Anggota anggota1 = new Anggota("012", "Rafly", "Dosen");
        Anggota anggota2 = new Anggota("023","Adit","Mahasiswa");
        Anggota anggota3 = new Anggota("021","Danu","Mahasiswa");
        Anggota anggota4 = new Anggota("023","Newton","Mahasiswa");//Ditolak, id sama
        Set<Anggota> daftarAnggota = new HashSet<>();
        daftarAnggota.add(anggota1);
        daftarAnggota.add(anggota2);
        daftarAnggota.add(anggota3);
        daftarAnggota.add(anggota4);
        System.out.println("Anggota : " + daftarAnggota.size());

        //Soal 3
        LinkedList<String> antrean = new LinkedList<>();
        //Objek baru tambahan untuk linked list
        daftarAnggota.add(new Anggota("091","Dimas","Mahasiswa"));
        daftarAnggota.add(new Anggota("091","Ubaid","Dosen"));
        for(Anggota cari : daftarAnggota){
            if(cari.tipe.equalsIgnoreCase("Dosen")){
                antrean.addFirst(cari.idAnggota + "#" + katalogBuku.get("1234567890").isbn);
            }else{
                antrean.addLast(cari.idAnggota + "#" + katalogBuku.get("931373103").isbn);
            }
        }
        System.out.println("Antrean : " + antrean);

        //Soal 4
        Set<String> bukuDipinjam = new HashSet<>();
        while(!antrean.isEmpty()){
            String peminjaman = antrean.removeFirst();
            String[] ngesplit = peminjaman.split("#");
            System.out.println("ID : "+ ngesplit[0]);
            System.out.println("ISBN : "+ ngesplit[1]);

            //Cek apakah id anggota saat ini terdaftar dalam sistem
            boolean anggotaTerdaftar = false;
            for (Anggota anggota : daftarAnggota) {
                if (anggota.idAnggota.equals(ngesplit[0])) {
                    anggotaTerdaftar = true;
                    break;
                }
            }
            //constains di sini untuk cek apakah ada elemen tertentu (dalam parameter) di container (List,Set,Map)
            if(!anggotaTerdaftar){
                System.out.println("Tidak berhasil! ID anggota tidak terdaftar.");
            }else if(!katalogBuku.containsKey(ngesplit[1])){
                System.out.println("Tidak berhasil! ISBN tidak terdaftar.");
            }else if(bukuDipinjam.contains(ngesplit[1])){
                System.out.println("Tidak berhasil! Buku sedang dipinjam orang lain.");
            }else{
                bukuDipinjam.add(ngesplit[1]);
                System.out.println("Buku berhasil dipinjam!");
            }
            System.out.println("");
        }






    }
}