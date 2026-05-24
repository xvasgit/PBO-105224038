public class Nasabah {
    private String nama;
    private Rekening[] rekening;
    private int jumlahRek;

    public Nasabah(String nama, Rekening[] rekening){
        this.nama = nama;
        this.rekening = new Rekening[3];
        this.jumlahRek = 0;
    }

    public void tambahRekening(Rekening rek){
        if(jumlahRek > 3){
            System.out.println("Rekening penuh");
        }else{
            this.rekening[jumlahRek] = rek;
            System.out.println("Rekening berhasil ditambahkan");
            jumlahRek++;
        }
    }

    public void tampilkanRekening() {
    if (jumlahRek == 0) {
        System.out.println("Nasabah belum memiliki rekening.");
        return;
    }

    for (int i = 0; i < jumlahRek; i++) {
        System.out.println((i + 1) + ". No Rekening: " + rekening[i].getRek()
                + " | Nama: " + rekening[i].getNama()
                + " | Saldo: Rp" + rekening[i].getsaldo());
    }
}

    public Rekening getRekening(int index){//untuk pemilihan rekening di main
        if (index < 0 || index >= jumlahRek) {
            return null;
        }else{
            return rekening[index];
        }   
    }

    public void lapor(CustomerService CS){
        CS.laporKeluhan(this); //asosiasi dengan CS
    }

    public String getNama(){return nama;}
    public int getJumlahRek(){return jumlahRek;}
}
