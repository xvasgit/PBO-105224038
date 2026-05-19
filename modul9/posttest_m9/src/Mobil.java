public class Mobil{
    public String merkMobil;
    public String warna;
    public Mesin mesin;
    public Ban[] ban = new Ban[4];

    public Mobil(String merkMobil,String warna,String nomorSeriMesin,int kapasitasCC){
        this.merkMobil = merkMobil;
        this.warna = warna;

        this.mesin = new Mesin(nomorSeriMesin, kapasitasCC);//letak composition
    }

    public void pasangSetBan(Ban[] setBan){//aggregation
        for (int i=0;i<4;i++) {
            this.ban[i] = setBan[i];
        }
    }

    public void tampilkanSpesifikasi(){
        System.out.println("\n(Spesifikasi Mobil)");
        System.out.println("Merk Mobil : " + merkMobil);
        System.out.println("Warna\t: " + warna);

        System.out.println("\n(Detail Mesin)");
        mesin.tampilkanInfo();

        System.out.println("\n(Detail Ban)");
        for (int i=0;i<ban.length;i++) {
            ban[i].tampilkanInfo();
        }
    }
}