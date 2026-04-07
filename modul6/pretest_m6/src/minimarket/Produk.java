package minimarket;//ini dalem folder(directory)

class Produk {
    String namaProduk;
    double harga;

    Produk(String nama,double price){
        this.namaProduk = nama;
        this.harga = price;
    }
    public void tampilkanDetail(){
        System.out.println("Nama Produk\t : " + this.namaProduk);
        System.out.println("Harga\t\t : Rp" + this.harga);
    }
    
}

class MakananRingan extends Produk{
    String rasa;
    MakananRingan(String nama, double price, String rasa) {
        super(nama, price);//super memanggil Produk(....)
        this.rasa = rasa;
    }

    @Override
    public void tampilkanDetail(){
        super.tampilkanDetail();//ini manggil tampilkanDetail()
        System.out.println("Rasa\t\t : " + rasa);
    }
}