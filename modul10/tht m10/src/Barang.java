public class Barang {
    String idBarang;
    String namaBarang;
    String kategori;
    int stok;
    public Barang(String idBarang,String namaBarang,String kategori,int stok){
        this.idBarang = idBarang;
        this.namaBarang = namaBarang;
        this.kategori = kategori;
        this.stok = stok;
    }

    //Untuk kebutuhan method "tambahStok" di SistemGudang
    public void tambahStok(int jumlah){
        this.stok += jumlah;
    }
    //Untuk kebutuhan method "kurangiStok" di SistemGudang, exception handler di caller saja (SistemGudang)
    public void kurangStok(int jumlah){
        this.stok -= jumlah;
    }
}
