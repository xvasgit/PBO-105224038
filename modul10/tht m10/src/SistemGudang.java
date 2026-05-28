import java.util.*;
public class SistemGudang {
    Map<String,Barang> database = new HashMap<>();
    Set<String> kategoriBarang = new HashSet<>();
    List<String> riwayatAktivitas = new ArrayList<>();
    
    public void tambahBarangBaru(String id,String nama,String kategori,int stok){
        //tambahin barang ke collections
        Barang barang = new Barang(id, nama, kategori, stok);
        database.put(id,barang);
        kategoriBarang.add(kategori);

        //inisiasi dicatat
        riwayatAktivitas.add("(Baru) Barang masuk: " + nama + " kategori " + kategori + " sebanyak " + stok);
    }

    public void tambahStok(String id,int jumlah){
        //Mengecek id ke key Map database
        if (database.containsKey(id)){
            System.out.println("Stok ditambahkan ke barang " + database.get(id).namaBarang);
            // Mengambil objek Produk dari Map, lalu mengeksekusi metodenya
            database.get(id).tambahStok(jumlah);
            String nama = database.get(id).namaBarang;
            //penambahan dicatat
            riwayatAktivitas.add("(Tambah) Barang " + nama + ": +" + jumlah);
        } else {
            System.out.println("ERROR: Id barang " + id + " tidak valid!");
        }
    }

    public void kurangiStok(String id,int jumlah){
        if (database.containsKey(id)){
            if(database.get(id).stok < jumlah){
                System.out.println("ERROR: Stok tidak mencukupi!");
                return;//keluar
            }
            database.get(id).kurangStok(jumlah);
            System.out.println("Stok dikurangi dari barang " + database.get(id).namaBarang);
            String nama = database.get(id).namaBarang;
            //pengurangan dicatat
            riwayatAktivitas.add("(Kurang) Barang " + nama + ": -" + jumlah);
        } else {
            System.out.println("ERROR: Id barang " + id + " tidak valid!");
        }
    }

    public void cetakLaporan(){
        System.out.println("\t\tStatus Gudang");
        System.out.println("Kategori yang ada : " + kategoriBarang); //dari set
        System.out.println("Sisa stok : ");
        for(Barang barang : database.values()) {//dari map
            System.out.println("- " + barang.namaBarang + ": " + barang.stok);
        }
        System.out.println("Log aktivitas : ");//dari list
        for(String aktivitas : riwayatAktivitas){
            System.out.println("- " + aktivitas);
        }
    }
}
