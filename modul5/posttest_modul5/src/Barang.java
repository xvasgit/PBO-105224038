public class Barang {
    private String idBarang, namaBarang;
    private int stok, hargaSatuan;
    Barang(String ID, String nama){//konstruktor inisiasi
        this.idBarang = ID;
        this.namaBarang = nama;
        this.stok = this.hargaSatuan = 0;
    }

    //semua getter
    public String getID(){
        return idBarang;
    }
    public String getNama(){
        return namaBarang;
    }
    public int getStok(){
        return stok;
    }
    public int getHarga(){
        return hargaSatuan;
    }

    //semua setter
    public void setID(String ID){
        this.idBarang = ID;
        System.out.println("Berhasil diset");
    }
    public void setNama(String nama){
        this.namaBarang = nama;
        System.out.println("Berhasil diset");
    }
    public void setStok(int stokk){
        if(stokk < 0){
            System.out.println("Stok barang tidak boleh negatif!");
        }else{
            this.stok = stokk;
            System.out.println("Berhasil diset");
        }
    }
    public void setHarga(int harga){
        if(harga <= 0){
            System.out.println("Harga barang tidak boleh 0 atau negatif!");
        }else{
            this.hargaSatuan = harga;
            System.out.println("Berhasil diset");
        }
    }

    //fitur tambahStok dan kurangiStok
    public void tambahStok(int stoktambahan){
        if(stoktambahan <= 0){
            System.out.println("Angka harus lebih dari nol!");
        }else{
            this.stok += stoktambahan;
            System.out.println("Stok berhasil ditambah");
        }
    }
    public void kurangiStok(int stokkurang){
        if(stokkurang <= 0){
            System.out.println("Angka harus lebih dari nol!");
        }else if(this.stok - stokkurang < 0){
            System.out.println("Jumlah di gudang tidak mencukupi");
        }else{
            this.stok -= stokkurang;
            System.out.println("Stok berhasil dikurang");
        }
    }

    //atribut kategori
    private String kategori;
    public void setKategori(String kategoriBaru){
        this.kategori = kategoriBaru;
    }
    public void tampilkanDetailBarang(){
        System.out.println("Detail Barang\nID\t: " + idBarang + "\nNama\t: " + namaBarang + "\nKategori: " + kategori + "\nStok\t: " + stok + "\nHarga\t: Rp" + hargaSatuan);
    }
}
